package 实验七;

import java.io.File;

public class MD {
    private String s;
    private String path;
    MD(){
        s="";
    }
    MD(String cmd){
        s=cmd;
    }
    public void excute(){
        try{
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
                        System.out.println("目录无效");
                        return;
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
        catch (NullPointerException e){
            System.out.println("找不到目录");
        }
    }
}
