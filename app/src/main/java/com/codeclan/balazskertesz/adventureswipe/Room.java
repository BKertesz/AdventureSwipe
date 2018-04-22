package com.codeclan.balazskertesz.adventureswipe;

import java.util.ArrayList;
import java.util.Random;

public class Room {

    private Player player;
    private RoomType roomType;
    private Creature enemy;

    public Room(Player player, RoomType roomType) {
        this.player = player;
        this.roomType = roomType;
        checkTypeOfRoom();
    }

    public Room(Player player){
        this.player = player;
        this.roomType = getRandomType();
        checkTypeOfRoom();
    }

    public static RoomType getRandomType(){
        Random random = new Random();
        int roomNumber = random.nextInt(RoomType.values().length);
        return RoomType.values()[roomNumber];
    }

    public void playerEnter(Player player){
        this.player = player;
    }

    public Player getPlayer() {
        return player;
    }

    public RoomType getRoomType() {
        return roomType;
    }

    public Creature getEnemy() {
        return enemy;
    }

    public void setupEnemy(){
        enemy = new Creature();
    }

    public void checkTypeOfRoom(){
        switch (roomType){
            case MONSTER:
                setupEnemy();
                break;
        }
    }
}
