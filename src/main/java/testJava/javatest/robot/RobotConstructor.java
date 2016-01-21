package testJava.javatest.robot;

import testJava.javatest.impl.SonyHand;
import testJava.javatest.impl.ToshibaHead;
import testJava.javatest.impl.ToyotaLeg;

/**
 * Created by vitaliWork on 21.01.16.
 */
public class RobotConstructor {
    public static void main(String [] args){
        SonyHand sonyHand = new SonyHand();
        ToshibaHead toshibaHead = new ToshibaHead();
        ToyotaLeg toyotaLeg = new ToyotaLeg();

        Robot robot  = new Robot(sonyHand,toyotaLeg,toshibaHead);
        robot.action();
    }
}
