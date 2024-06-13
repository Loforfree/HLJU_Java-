package 实验六;

public class PetShop {
    private LinkedList pets;
    PetShop(){
        //pets=new <PetImpl>LinkedList();
        pets=new LinkedList();
    }
    public boolean add(Pet pet){
        if(pets.search(pet)!=null){
            return false;
        }
        pets.add(pet);
        return true;
    }
    public boolean delete(Pet pet){//根据Java的多态性，这里放Pet和PetImpl都可以
        //return pets.remove((PetImpl)pet);
        return pets.remove(pet);
    }
    public Node get(int index){
        return pets.get(index);
    }
    public int size(){
        return pets.size();
    }

    public LinkedList getPets(){
        return this.pets;
    }

}
