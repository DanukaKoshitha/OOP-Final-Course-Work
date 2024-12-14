
package defencesystem;

public class DefenceSystem {

    public static void main(String[] args) {
        MainController controllerRoom = new MainController();
        Helecopter helicopter = new Helecopter();
        Submarine submarine = new Submarine();
        Tank tank = new Tank();
        
        controllerRoom.setVisible(true);
        helicopter.setVisible(true);
        submarine.setVisible(true);
        tank.setVisible(true);
    }
    
}
