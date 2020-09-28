package game;

import desktop_resources.GUI;
import java.util.ArrayList;
import java.util.Scanner;

public class Game {
    private int totalNumPlayers;
    private int maxNumPlayers;
    private int totalNumDice;
    private ArrayList<Player> playerList;

    public Game(int totalNumPlayers, int totalNumDice) {
        if (totalNumPlayers > maxNumPlayers){
            totalNumPlayers = maxNumPlayers;
        }
        DiceCup cup = new DiceCup(totalNumDice);
        addPlayers(totalNumPlayers);
        initGUI();
    }

    public void playGame() {
        int winnerID = -1;
        Scanner input = new Scanner(System.in);
        String a;

        while (winnerID == -1)
        {

            for (int i = 0; i < playerList.size(); i++) {   //A full round
                GUI.showMessage("Player "+i+1+"'s turn, press enter to roll dice");
                a = input.next(); //Scuffed way of awaiting user input(enter)..

                //roll goes here
                //roll goes here
                //roll goes here

                if (playerList.get(i).getGameScore() >= 40) {
                    winnerID = i;
                    break;
                }
            }

        }

        input.close();
        GUI.showMessage("Player "+winnerID+1+" has won the game, congratulations!");
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
