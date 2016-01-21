package testJava.javatest.robot;

import testJava.javatest.interfaces.Hand;
import testJava.javatest.interfaces.Head;
import testJava.javatest.interfaces.Leg;

/**
 * Created by vitaliWork on 21.01.16.
 */
public class Robot {
    private Hand hand;
    private Head head;
    private Leg leg;

    public Robot(Hand hand, Leg leg, Head head){
        super();
        this.hand = hand;
        this.head = head;
        this.leg = leg;
    }

    public void action() {
        head.think();
        hand.catchSomething();
        leg.go();
    }
}
