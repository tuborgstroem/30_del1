package game;

import desktop_resources.GUI;
import java.util.ArrayList;
import java.util.Scanner;

public class Game {
    private int totalNumPlayers;
    private int totalNumDice;
    private ArrayList<Player> playerList;

    public Game(int totalNumPlayers, int totalNumDice) {
        if (totalNumPlayers > 6){
            totalNumPlayers = 6;
        } else if (totalNumPlayers < 1){
            totalNumPlayers = 1;
        }
        addPlayers(totalNumPlayers);
        initGUI();
    }

    public void playGame() {
        int winnerID = -1;
        Scanner input = new Scanner(System.in);
        DiceCup cup = new DiceCup(totalNumDice);

        while (winnerID == -1)
        {
            for (int i = 0; i < playerList.size(); i++) {   //A full round
                //GUI.showMessage("Player "+i+1+"'s turn, press enter to roll dice");
                //String fake = input.nextLine(); //Scuffed way of awaiting user input(enter)..

                cup.rollDice();
                System.out.println(cup.getDiceinCup().get(1).getValue());
                //GUI.setDice(cup.getDiceinCup().get(0).getValue(),cup.getDiceinCup().get(1).getValue());
                //playerList.get(i).setGameScore(cup.getSum());

                if (playerList.get(i).getGameScore() >= 40) {
                    winnerID = i;
                    break;
                }
            }

        }

        input.close();
        GUI.showMessage("Player "+(winnerID+1)+" has won the game, congratulations!");
    }

    private void initGUI() {
        for (int i = 0; i < playerList.size(); i++) {
            GUI.addPlayer(playerList.get(i).getName(),0);
        }
    }

    private void addPlayers(int a) {
        Scanner input = new Scanner(System.in);
        playerList = new ArrayList<Player>();
        for (int i = 1; i <= a; i++) {
            Player p = new Player(i);
            System.out.println("Please enter name of Player "+i+" and press Enter");
            p.setName(input.nextLine());
            playerList.add(p);
        }
        input.close();
    }


}
