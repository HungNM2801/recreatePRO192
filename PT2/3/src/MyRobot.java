
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author HÙNG
 */
public class MyRobot implements IRobot{

    @Override
    public int f1(List<Robot> list) {
        int sum = 0;
        for(Robot robot : list) {
            String label = robot.getLabel();
            if (!label.contains("A") && (!label.contains("B"))) {
                sum += robot.getStep();
            }
        }
        return sum;
    }

    @Override
    public void f2(List<Robot> list) {
        Robot maxStep = Collections.max(list, Comparator.comparingInt(Robot :: getStep));
        list.remove(maxStep);
    }
    

    @Override
    public void f3(List<Robot> list) {
        Collections.sort(list.subList(1, 4), new Comparator<Robot>() {
            @Override
            public int compare(Robot robot1, Robot robot2) {
                if (robot1.getLabel().compareTo(robot2.getLabel()) != 0) {
                    return (robot1.getLabel().compareTo(robot2.getLabel()));
                }
                return robot1.getStep() - (robot2.getStep());
            }    
        });
    }
    
}
