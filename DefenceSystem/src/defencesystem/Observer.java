
package defencesystem;

public interface Observer {
    
    public void AreaClear(boolean clear);
    
    public void  SendMessage(String text,char name);
    
    public void positionChange(int level);
}
