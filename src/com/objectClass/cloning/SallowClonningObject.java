package com.objectClass.cloning;

public class SallowClonningObject {
    public static void main(String[] args) throws CloneNotSupportedException {
        //creating an object  for player
        Player player1 = new Player("Dhoni", 98);
        System.out.println(player1);//outPut: Player{playerName='Dhoni', playerScore=98}

        //sallow cloning
        Player player2=player1;
        System.out.println(player2);//output:  Player{playerName='Dhoni', playerScore=98}

        player2.playerName="Rohit Sarma";
        player2.playerScore=110;
        //printing player1
        System.out.println(player1);//Player{playerName='Rohit Sarma', playerScore=110}
        //printing player2
        System.out.println(player2);//Player{playerName='Rohit Sarma', playerScore=110}

        //instance player1 can be effected with player2
    }
}
class Player implements Cloneable{
    public  String playerName;
    public Integer playerScore;

    public Player(String playerName, Integer playerScore) {
        this.playerName = playerName;
        this.playerScore = playerScore;
    }

    @Override
    public String toString() {
        return "Player{" +
                "playerName='" + playerName + '\'' +
                ", playerScore=" + playerScore +
                '}';
    }
}
