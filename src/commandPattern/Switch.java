package commandPattern;

public class Switch {

     Command upCommand, downCommand;

    public Switch(Command up, Command down){

        this.upCommand=up;
        this.downCommand= down;
    }

    void flipUp(){
        upCommand.execute();
    }

    void flipDown(){
        downCommand.execute();
    }
}
