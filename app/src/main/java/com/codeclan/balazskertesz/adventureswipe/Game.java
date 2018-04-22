package com.codeclan.balazskertesz.adventureswipe;

public class Game {

    private Room room;
    private Player player;
    private int turn;
    private int score;

    public Game(){
        Item item = new Item("Dagger",-3,ItemType.WEAPON);
        player = new Player(25,15,item);
        room = new Room(player);
        turn = 0;
        score = 0;
    }

    public void fightTurn(){
        player.attack(room.getEnemy());
        room.getEnemy().attack(player);
        turn ++;
    }


}
