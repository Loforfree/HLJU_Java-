package 实验六;

public class LinkedList{
    private Node head;

    LinkedList(){
        head = new Node();
    }

    public void add(Object data){
        Node newNode = new Node(data);
        Node tmp=head;
        while(tmp.getNext()!=null){
            tmp=tmp.getNext();
        }
        tmp.setNext(newNode);

    }
    public Node search(Object data){
        Node tmp=head;
        while(tmp.getNext()!=null){
            tmp=tmp.getNext();
            if(tmp.getData().equals(data)){
                return tmp;
            }
        }
        return null;
    }
    public boolean remove(Object data){
        if(data==null){
            return false;
        }
        Node tmp = head;
        Node preTmp=head;
        while(tmp!=null){
            if(tmp.getData()!=null && tmp.getData().equals(data)){
                preTmp.setNext(tmp.getNext());
                return true;
            }
            preTmp = tmp;
            tmp=tmp.getNext();
        }
        return false;
//        equals 方法是 Object 类的一个方法，因此所有的Java对象都继承了这个方法。当在一个对象上调用 equals 方法时，
//        Java会根据对象的实际类型来调用相应的 equals 方法。这种机制称为动态方法分派（Dynamic Method Dispatch）;
//        意思是子类重写了父类的方法，调用时不能下转可以直接调用重写的，但是如果是子类新写的方法，需要下转才能调用；



    }
    public boolean insertAfter(Node node,Object data){
        Node addNode = new Node(data);
        if(node==null){
            return false;
        }
        if(node.getNext()==null){
            node.setNext(addNode);
            return true;
        }
        else{
            addNode.setNext(node.getNext());
            node.setNext(addNode);
            return true;
        }
    }
    public Node get(int index){
        int count=0;
        Node tmp = head;
        while(tmp.getNext()!=null){
            tmp=tmp.getNext();
            if(count==index){
                return tmp;
            }
            count+=1;
        }
        return null;
    }
    public boolean set(Node node,Object data){
        if(node==null){
            return false;
        }
        node.setData(data);
        return true;
    }
    public int size(){
        int size=0;
        Node tmp=head;
        while(tmp.getNext()!=null){
            tmp=tmp.getNext();
            size=size+1;
        }
        return size;
    }
    @Override
    public boolean equals(Object data) {
        return super.equals(data);
    }
    @Override
    public String toString() {
        String s = new String("");
        Node cur = new Node();
        cur=head;
        while(cur.getNext()!=null){
            cur=cur.getNext();
            s=s+cur.toString()+" ";
        }
        return s;
    }
}
