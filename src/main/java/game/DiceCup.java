package game;

import java.util.ArrayList;

public class DiceCup {
    private int numberOfDice;
    private ArrayList<Dice> diceIncup;

    public DiceCup(int numOfDice, ArrayList<Integer> sidesOfDice) {
        numberOfDice = numOfDice;
        diceIncup = new ArrayList<Dice>();
        for (int i = 0; i > numOfDice; i++) {
            Dice d;
            if (sidesOfDice.size() >= i) {
                d = new Dice(sidesOfDice.get(i));
                diceIncup.add(d);
            } else {
                d = new Dice();
                diceIncup.add(d);
            }
        }
    }
    public DiceCup(int numOfDice){
        numberOfDice = numOfDice;
        diceIncup = new ArrayList<Dice>();
        for (int i = 0; i>numOfDice; i++){
            Dice d;
            d = new Dice();
            diceIncup.add(d);
        }
    }


}

