package 实验七;
import java.util.Scanner;
import java.io.File;

public class RD {
    private String s;
    private String path;
    private String temp[];
    private String choose;
    RD(){
        s="";
    }
    RD(String cmd){
        if (cmd==null){
            return;
        }
        else{
            s = cmd;
        }
    }
    public void excute(){
        try{
            s=s.replace("rd","");
            temp=s.split(" ");
            if(temp.length!=2){
                System.out.println("命令格式不正确");
                return;
            }
            path=temp[1];
            //文件本身，用来判断是否存在
            File f = new File(path);
            if(!f.exists()){
                System.out.println(path+"文件不存在");
                return;
            }
            if(f.isDirectory()){
                File[] lists=f.listFiles();
                if(lists.length>0){
                    System.out.println("目录不为空");
                    return;
                }
            }
            else{
                System.out.println("不是有效文件");
                return;
            }
            //byteslengths是读取到的字符数
            System.out.println("删除"+path+"吗(Y/N)");
            Scanner scanner = new Scanner(System.in);
            choose = scanner.nextLine();
            choose=choose.toLowerCase();
            if(choose.equals("y"))
            {
                if(!f.canWrite()){
                    System.out.println("文件是只读的");
                }
                else if(f.delete()){
                    System.out.println("删除成功");
                }
                else{
                    System.out.println("删除失败");
                    return;
                }
            }
        }
        catch (NullPointerException e){
            System.out.println("找不到文件");
        }
    }
}
