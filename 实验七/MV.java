package 实验七;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;
import java.io.File;

public class MV {
    private String s;
    private String Cpath;
    private String Vpath;
    private String temp[];
    private String choose;
    MV(){
        s="";
    }
    MV(String cmd){
        if (cmd==null){
            return;
        }
        else{
            s = cmd;
        }
    }
    public void excute(){
        try{
            s=s.replace("mv","");
            s=s.trim();
            temp=s.split(" ");
            if(temp.length!=2){
                System.out.println("命令格式不正确");
                return;
            }
            Cpath=temp[0];
            Vpath=temp[1];
            //文件本身，用来判断是否存在
            File f = new File(Cpath);
            if(!f.exists()){
                System.out.println(Cpath+"文件不存在");
                return;
            }
            //文件的内容，用来复制粘贴
            FileInputStream fi = new FileInputStream(Cpath);
            FileOutputStream fo = new FileOutputStream(Vpath);
            byte[] buffer = new byte[1024];//建立缓冲区
            int bytesLengths=-1;
            //byteslengths是读取到的字符数
            System.out.println("移动并删除"+Cpath+"吗(Y/N)");
            Scanner scanner = new Scanner(System.in);
            choose = scanner.nextLine();
            choose=choose.toLowerCase();
            if(choose.equals("y"))
            {
                while((bytesLengths=fi.read(buffer))!=-1){
                    fo.write(buffer,0,bytesLengths);
                    fo.flush();
                }
                fi.close();
                fo.close();
                if(!f.canWrite()){
                    System.out.println("文件是只读的");
                }
                else if(f.delete()){
                    System.out.println("移动成功");
                }
                else{
                    System.out.println("移动失败");
                    return;
                }
            }
        }
        catch (FileNotFoundException e){
            System.out.println(Cpath+"不是有效文件");
        }
        catch (IOException e){
            System.out.println(e);
        }
    }
}
