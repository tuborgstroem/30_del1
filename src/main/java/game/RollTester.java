package game;

public class RollTester {
    private int totalThrows;
    private int numDice = 2;
    private int sum;
    private int pairs;
    public RollTester(int numberOfThrows){
        totalThrows = numberOfThrows;
    }

    public RollTester() {
        totalThrows = 1000;
    }

    public void runRollLoop() {
        int diceA, diceB;
        pairs = 0;
        DiceCup cup = new DiceCup(2);
        for (int i = 0; i < totalThrows; i++) {
            cup.rollDice();
            diceA = cup.getDiceinCup().get(0).getValue();
            diceB = cup.getDiceinCup().get(1).getValue();
            sum += diceA + diceB;
            if (diceA == diceB) {
                pairs++;
            }
        }
    }

    public void showResults(){
        System.out.println("Total number of throws with two dice: "+totalThrows);
        System.out.println("Total sum of dice throws: "+sum);
        System.out.println("Total number of pairs: "+pairs);
    }

    public int getSum(){
        return sum;
    }

    public int getPairs(){
        return pairs;
    }
}
