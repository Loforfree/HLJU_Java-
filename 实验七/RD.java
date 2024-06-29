package 实验七;
import java.util.Scanner;
import java.io.File;

public class RD {
    private String s;
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

    String path;
    String temp[];
    String choose;
    public void excute() throws NullPointerException{
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
                throw new NullPointerException("文件不存在");
            }
            if(f.isDirectory()){
                File[] lists=f.listFiles();
                if(lists.length>0){
                    throw new NullPointerException("目录不能为空");
                }
            }
            else{
                throw new NullPointerException("不是有效文件");
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
}
