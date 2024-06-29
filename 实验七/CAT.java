package 实验七;
import java.io.*;

public class CAT {
    private String s;
    CAT(){
        s="";
    }
    CAT(String cmd){
        s=cmd;
    }

    String[] temp;
    String path;
    public void excute() throws NullPointerException,FileNotFoundException,IOException{
        s=s.replace("cat","");
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
        BufferedReader br = new BufferedReader(new FileReader(path));
        String line;
        while((line=br.readLine())!=null){
            System.out.println(line);
        }
        br.close();
    }
}
