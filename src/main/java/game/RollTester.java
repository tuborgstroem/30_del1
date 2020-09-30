package game;

import java.util.ArrayList;

public class RollTester {
    private int totalThrows;
    private int numDice = 2;
    public RollTester(int numberOfThrows){
        totalThrows = numberOfThrows;
    }

    public RollTester() {
        totalThrows = 1000;
    }

    public void runRollLoop() {
        int a, b;
        DiceCup cup = new DiceCup(2);
        for (int i = 0; i < 1; i++) {
            cup.rollDice();
            a = cup.getDiceinCup().get(0).getValue();
            b = cup.getDiceinCup().get(1).getValue();
            System.out.println(a);
            System.out.println(b);
        }
    }
}
