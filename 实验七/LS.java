package 实验七;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.logging.SimpleFormatter;

public class LS {
    private String s;
    private String parentPath;
    private String chilePath;
    private File dir;
    private String[] list;
    LS(){
        s="";
    }
    LS(String cmd){
        if (cmd==null){
            return;
        }
        else{
            s = cmd;
        }
    }
    public void excute(){
        try {
            s = s.replace("ls", "");
            s = s.replace(" ", "");
            File file = new File(".\\src\\实验七");//不放参数默认返回的路径是到Java_shiYan
            String curPath=file.getAbsolutePath();
            if(s.equals("")){
                System.out.println("命令格式不正确");
                return;
            }
            else if (s.equals(".")) {
                dir = new File(curPath);
                System.out.println(curPath);

            }
            else if(s.equals("..")){
                int p = curPath.lastIndexOf("\\");
                parentPath=curPath.substring(0,p);
                dir=new File(parentPath);
            }
            else{
                dir=new File(s);
            }
            File[] files = dir.listFiles();
            for (File f : files) {
                String df="yyyy-MM-dd HH:mm:ss";
                Date d = new Date(f.lastModified());
                String sdf=new SimpleDateFormat(df).format(d);
                System.out.printf("%s\t",sdf);

                if(f.isFile()){//是个文件而不是目录
                    System.out.printf("%16s\t",f.length());
                }
                else{
                    System.out.printf("%-16s\t","<DIR>");
                }

                System.out.println(f.getName());
            }
        }
        catch(NullPointerException e){
                System.out.println("找不到目录");
            }
    }
}
