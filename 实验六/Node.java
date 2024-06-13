package 实验六;

public class Node{
    private Object data;
    private Node next;
    Node(){
        this.data=null;
        this.next=null;
    }
    Node(Object data){
        this.data=data;
        this.next=null;
    }
    public void setData(Object data){
        this.data=data;
    }
    public Object getData(){
        return data;
    }
    public Node getNext(){
        return next;
    }
    public void setNext(Node next){
        this.next=next;
    }

    @Override
    public String toString() {
        if(data==null){
            return "Data is null!";
        }
        return data.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Node){
            obj=(Node)obj;
            if(data.equals(obj)){
                return true;
            }
        }
        return false;
    }
}
