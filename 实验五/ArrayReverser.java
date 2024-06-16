package 实验五;

public class ArrayReverser {
    private int[] data;

    public ArrayReverser(int[] data){
        if(data==null){
            this.data=new int[0];
        }
        else{
            this.data=data;
        }

    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for(int i:data){
            sb.append(i);
            sb.append(" ");
        }
        return sb.toString();
    }

    public void setData(int[] data){
        if(data!=null){
            this.data=data;
        }
    }
    public int[] getArr(){
        return this.data;
    }

    public void reverse(){
        int len=data.length;
        int[] reverse_data = new int[len];
        for(int i:this.data){
            reverse_data[len-1]=i;
            --len;
        }
        this.data=reverse_data;
    }

}
