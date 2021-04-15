package commandPattern;

public class LightCommandStart implements Command{

    Light light ;

    public LightCommandStart(Light light){

        this.light=light;
    }
    @Override
    public void execute() {
            light.start();
    }
}
