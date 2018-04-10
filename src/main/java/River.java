import java.util.ArrayList;

public class River {
    private ArrayList<Salmon> school;

    public River (){
        this.school = new ArrayList<Salmon>();
    }

    public void addFish(Salmon salmon){
        this.school.add(salmon);
    }

    public int fishCount(){
        return this.school.size();
    }

    public Salmon removeFish(){
            return this.school.remove(0);
    }
}
