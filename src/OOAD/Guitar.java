package OOAD;

public class Guitar {

    private String serialNumber;
    private GuitarSize size;
    private GuitarSpecs specs;

    Guitar(String serialNumber,GuitarSize size, GuitarSpecs specs){

        this.serialNumber= serialNumber;
        this.size=size;
        this.specs = specs;
    }

}
