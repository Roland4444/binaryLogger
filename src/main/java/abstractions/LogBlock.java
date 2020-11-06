package abstractions;

import abstractions.ActivityEvent;

import java.io.Serializable;
import java.util.ArrayList;

public abstract class LogBlock implements Serializable {
    public ArrayList<ActivityEvent> logblock=new ArrayList();
    public void put(ActivityEvent input){
        this.logblock.add(input);
    }
  /*  public void sort(){
        HashMap<Integer, Event> map = new HashMap<Integer, Event>();
        for (int i =0; i<logblock.size();i++){
            map.put(logblock.get(i).id, logblock.get(i));
            TreeMap<Integer, Event>=new
        }


    }*/
    public abstract void writeBlock();
    public abstract void restoreBlock();
    public abstract void appendBlock();


}
