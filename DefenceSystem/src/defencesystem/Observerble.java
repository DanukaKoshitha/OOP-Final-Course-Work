
package defencesystem;
import java.util.ArrayList;

public class Observerble {
    private static Observerble instance ;
    private final ArrayList<Observer> observerList = new ArrayList<>();
    private int levelOfPosition;
    private boolean position;
    private MainController controllerRoom ;
    private String msg;
    private int soldies;
    private int ammo;
    
    private Observerble() {
    }
    
    public void addObserver(Observer obj){
        observerList.add(obj);
    }
    
    public void setControlRoom(MainController controllerRoom) {
        this.controllerRoom = controllerRoom;
    }
     
    public static Observerble getInstance() {
        if(instance==null){
            instance=new Observerble();
        }
        return instance;
    }
    
    public ArrayList<Observer> getObserverList() {
        return observerList;
    }
    
    public boolean hasObserver(Observer observer) {
        return observerList.contains(observer);
    }
    
    public void notifyObserverses(boolean clear){
        for (Observer observer : observerList) {
            observer.AreaClear(clear);
        }
    }
    
    public void sendSMS(String text,char name){
        for (Observer observer : observerList) {
            observer.SendMessage(text,name);
        }
    }
    
    public void setPositionLevel(int levelOfPosition){
	if(this.levelOfPosition!=levelOfPosition){
            this.levelOfPosition=levelOfPosition;
            for(Observer ob : observerList){
            ob.positionChange(levelOfPosition);
	}
	}
    }
    
    //send position to control room when from defences when they positioned
    public void setPosition(boolean position) {
        this.position = position;
        if (controllerRoom != null) {
            controllerRoom.setPositon(position);
        }
    }
    
    
    //sending msg from defences to control room
    public void ReceiveMsgs(String msg){
        this.msg = msg;
        if (controllerRoom != null) {
            controllerRoom.ReceiveMsgs(msg);
        }
    }
    
//    //sending the soldier amout to the control room
//    public void countChangeSoldies(int soldies){
//        this.soldies = soldies;
//        if(controllerRoom != null) {
//            controllerRoom.changeSoldies(soldies);
//        }
//    }
//   
//    
//    //sending the ammo amount to the control room
//     public void countChangeAmmo(int ammo){
//        this.ammo = ammo;
//        if(controllerRoom != null) {
//            controllerRoom.changeAmmo(ammo);
//        }
//    }
}

