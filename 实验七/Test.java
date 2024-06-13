package 实验七;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;

public class Test {
    public static void main(String[] args) {
        try{
            BufferedReader kbin=new BufferedReader(new InputStreamReader(System.in));//FileReader是它的一个子类，只能读取文件，不能读取别的
            while(true){
                //显式命令行提示符
                System.out.print("# ");
                //接收命令行输入
                String cmd=kbin.readLine();
                //命令行内容为"exit"（不区分大小写）
                if(cmd.toLowerCase().equals("exit")){
                    //退出程序
                    System.out.println("已退出程序");
                    kbin.close();
                    System.exit(0);
                }
                //命令行以"ls"开头（不区分大小写）
                else if(cmd.toLowerCase().startsWith("ls")){
                    //调用完成ls命令功能的方法
                    LS ls = new LS(cmd);
                    ls.excute();
                }
                else if(cmd.toLowerCase().startsWith("cp")){
                    CP cp = new CP(cmd);
                    cp.excute();
                }
                else if(cmd.toLowerCase().startsWith("mv")){
                    MV mv = new MV(cmd);
                    mv.excute();
                }
                else if(cmd.toLowerCase().startsWith("rm")){
                    RM rm = new RM(cmd);
                    rm.excute();
                }
                else if(cmd.toLowerCase().startsWith("cat")){
                    CAT cat = new CAT(cmd);
                    cat.excute();
                }
                else if(cmd.toLowerCase().startsWith("rd")){
                    RD rd = new RD(cmd);
                    rd.excute();
                }
                else if(cmd.toLowerCase().startsWith("md")){
                    MD md = new MD(cmd);
                    md.excute();
                }
                else{
                    System.out.println("无法识别所输入命令:"+cmd);
                }
            }
        }
        catch (IOException e){
            System.out.println(e);
        }
    }
}
