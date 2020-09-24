package com.company;

import desktop_resources.GUI;
import game.Player;

public class Main {

    public static void main(String[] args) {
	// write your code here

        System.out.println("Hello World");
        GUI.setDice(3, 4);
        Player player = new Player(1);
        player.setName("Thor");
        System.out.println(player.getName());

    }
}
