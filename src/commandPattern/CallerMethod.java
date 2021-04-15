package commandPattern;

public class CallerMethod {

    public static void main(String args[]){

        Light light = new Light();
        Fan fan = new Fan();
        LightCommandStart lightCommandStart = new LightCommandStart(light);
        FanCommandStart fanCommandStart = new FanCommandStart(fan);
        //Switch switch = new Switch(lightCommandStart,fanCommandStart);
        lightCommandStart.execute();

    }
}
