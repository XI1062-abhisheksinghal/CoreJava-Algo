package OOAD;

public class Door {

    boolean isOpen;

    public void openDoor() {

        if (!this.isOpen) {
            isOpen = true;
            System.out.print("Door Opened");
        } else {
            System.out.println("Door is already open");
        }
    }


    public void closeDoor() {
        if (this.isOpen) {
            isOpen = false;
            System.out.println("Door Closed");
        } else {
            System.out.println("Door is already close");
        }
    }
}
