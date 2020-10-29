package OOAD;

public class DougDoorSimulator {


    public static void main(String ars[]){

        Dog dog = new Dog();
        Door door = new Door();


        String value =dog.barks();

        try {
            if (value.equals("Dog Barks")) {
                door.openDoor();
            }
            Thread.sleep(5000);
            door.closeDoor();
            System.out.println(door.isOpen);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
