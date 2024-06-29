package 实验七;

import java.io.File;

public class MD {
    private String s;
    MD(){
        s="";
    }
    MD(String cmd){
        s=cmd;
    }

    String path;
    public void excute() throws NullPointerException{
        s=s.replace("md","");
        s=s.replace(" ","");
        path =s;
        if(path.equals("")){
            System.out.println("命令格式不正确");
            return;
        }
        else{
            File f = new File(path);
            if(f.exists()){
                if(f.isDirectory()){
                    System.out.println("目录已存在");
                    return;
                }
                else{
                    throw new NullPointerException("目录无效");
                }
            }
            else{
                if(f.mkdir()){
                    System.out.println("目录创建成功");
                }
                else{
                    System.out.println("目录创建失败");
                    return;
                }
            }
        }
    }
}
