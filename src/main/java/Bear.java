import java.util.ArrayList;

public class Bear {
    private String name;
    private ArrayList<Salmon> stomach;

    public Bear(String name){
        this.name = name;
        this.stomach = new ArrayList<Salmon>();
    }

    public int foodCount(){
        return this.stomach.size();
    }

    public int eatFishFromRiver(River river){
        if(river.fishCount() > 0  ){
        this.stomach.add(river.removeFish());
        return this.foodCount();
    }

}