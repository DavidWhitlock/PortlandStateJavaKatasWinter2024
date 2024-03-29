package edu.pdx.cs410J.mob;

public class Player {
    private int score = 0;

    public static final int CONSTANT_LOVE = 0;

    public Player(int score){
        if (score != 0 && score != 15 && score != 30 && score != 40) {
            throw new IllegalArgumentException("Unrecognized score: " + score);
        }
        this.score = score;
    }

    public Player(){
        score = 0;
    }
    public int getScore() {
       return this.score;
    }

    public void winsAPoint() {
        if(this.score == 30) this.score += 10;
        else this.score += 15;
    }
}
