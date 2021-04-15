package commandPattern;

public class FanCommandStart implements Command{

     Fan fan;

    public FanCommandStart(Fan fan){
        this.fan=fan;
    }
    @Override
    public void execute() {
        fan.start();
    }
}
