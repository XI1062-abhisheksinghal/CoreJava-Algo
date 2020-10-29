package OOAD;

public class GuitarSpecs {

    private int numString;
    private String build;
    private GuitarType type;

    GuitarSpecs(int numString,String build, GuitarType type){
        this.numString= numString;
        this.build=build;
        this.type= type;
    }

    public boolean searchGuitar(GuitarSpecs g){
        boolean result =false;
        if(g.build.equals(this.build)){
            result = true;
        }
         return result;
    }
}
