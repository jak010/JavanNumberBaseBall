package user;


import exception.NumberException;
import utils.DEFINE;

public class Manager {

    public boolean endGameNow = true;

    StringBuffer playerNumber;

    public Manager() {
    }

    public StringBuffer getPlayerNumber() {
        return playerNumber;
    }

    public void setPlayerNumber(StringBuffer playerNumber) {
        this.playerNumber = playerNumber;
    }



}
