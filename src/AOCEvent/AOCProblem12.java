package AOCEvent;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static AOCEvent.Utils.readStringList;

public class AOCProblem12 {

    static class Ship{

        shipdirection shipDirection;
        shipdirection fromX;
        shipdirection fromY;
        shipdirection shipdirectionY;
        int x;
        int y;

        public shipdirection getFromX() {
            return fromX;
        }

        public void setFromX(shipdirection fromX) {
            this.fromX = fromX;
        }

        public shipdirection getFromY() {
            return fromY;
        }

        public void setFromY(shipdirection fromY) {
            this.fromY = fromY;
        }



        Ship(shipdirection dir ,shipdirection dirY,shipdirection fromX, shipdirection fromY, int x , int y){
            this.shipDirection=dir;
            this.shipdirectionY= dirY;
            this.fromX = fromX;
            this.fromY= fromY;
            this.x=x;
            this.y=y;
        }
        public shipdirection getShipdirectionY() {
            return shipdirectionY;
        }

        public void setShipdirectionY(shipdirection shipdirectionY) {
            this.shipdirectionY = shipdirectionY;
        }

        public shipdirection getShipDirection() {
            return shipDirection;
        }
        public void setShipDirection(shipdirection shipDirection) {
            this.shipDirection = shipDirection;
        }
        public int getX() {
            return x;
        }
        public void setX(int x) {
            this.x = x;
        }
        public int getY() {
            return y;
        }
        public void setY(int y) {
            this.y = y;
        }
        public void result(){
            System.out.println(this.x+this.y);
        }

    }

    static enum movedirection {
        F("forward"),
        R("right"),
        L("left");

        private movedirection(String value){
            this.value= value;
        }

        private String value ;

        private String getValue(){
            return this.value;
        }
    }
    
    static enum shipdirection{

        W("west"),
        N("north"),
        E("east"),
        S("south");

        private shipdirection(String value){
            this.value= value;
        }

        private String value ;

        private String getValue(){
            return this.value;
        }
    }

    public static void main(String[] args) throws IOException {


            List<String> ls = readStringList(new File("./src/AOCEvent/input12.txt"));
            Ship ship = new Ship(shipdirection.E,shipdirection.N,shipdirection.E, shipdirection.N, 0, 0);

        Integer numX=0;
        Integer numY =0;
        Integer num =0;

            for (int i = 0; i < ls.size(); i++) {

                String s = ls.get(i);
                String s1 = s.substring(0,
                        1);
                if(s1.equals("E") || s1.equals("W")) {
                     numX = Integer.valueOf(s.substring(1));
                }



                if(s1.equals("N") || s1.equals("S")) {
                     numY = Integer.valueOf(s.substring(1));
                }

                if(s1.equals("R") || s1.equals("L")) {
                    num = Integer.valueOf(s.substring(1));
                }
               if(i==0){
                if(s1.equals("F")){
                    if(ship.getShipDirection().name().equals(shipdirection.W.name()) || ship.getShipDirection().name().equals(shipdirection.E.name())){
                        numX = Integer.valueOf(s.substring(1));
                    }

                }
               }else {
                   if (s1.equals("F")) {
                       if (ship.getShipDirection().name().equals(shipdirection.W.name()) || ship.getShipDirection().name().equals(shipdirection.E.name())) {
                           numX = Integer.valueOf(s.substring(1));
                       }

                       if (ship.getShipDirection().name().equals(shipdirection.N.name()) || ship.getShipDirection().name().equals(shipdirection.S.name())) {
                           numY = Integer.valueOf(s.substring(1));
                       }
                   }
               }



                if (s1.equals(shipdirection.E) && ship.getShipDirection().name().equals(shipdirection.E)) {
                    ship.setX(ship.x + numX);

                    ship.setShipDirection(shipdirection.E);
                }

                if (s1.equals(shipdirection.E.name()) && ship.getShipDirection().name().equals(shipdirection.W.name())) {
                    ship.setX(ship.x - numX);
                    ship.setShipDirection(shipdirection.E);
                }
                if (s1.equals(shipdirection.W.name()) && ship.getShipDirection().name().equals(shipdirection.E.name())) {
                    ship.setX(ship.x - numX);
                    ship.setShipDirection(shipdirection.W);
                }

                if (s1.equals(shipdirection.W.name()) && ship.getShipDirection().name().equals(shipdirection.W.name())) {
                    ship.setX(ship.x + numX);
                    ship.setShipDirection(shipdirection.W);
                }
                if (s1.equals(shipdirection.N.name()) && ship.getShipdirectionY().name().equals(shipdirection.N.name())) {
                    ship.setY(ship.y + numY);
                    ship.setShipdirectionY(shipdirection.N);
                }
                if (s1.equals(shipdirection.N.name()) && ship.getShipdirectionY().name().equals(shipdirection.S.name())) {
                    ship.setY(ship.y - numY);
                    ship.setShipdirectionY(shipdirection.N);
                }
                if (s1.equals(shipdirection.S.name()) && ship.getShipdirectionY().name().equals(shipdirection.S.name())) {
                    ship.setY(ship.y + numY);
                    ship.setShipdirectionY(shipdirection.S);
                }
                if (s1.equals(shipdirection.S.name()) && ship.getShipdirectionY().name().equals(shipdirection.N.name())) {
                    ship.setY(ship.y - numY);
                    ship.setShipdirectionY(shipdirection.S);
                }

                if (s1.equals(movedirection.F.name())) {
                    if ((ship.getShipDirection().name().equals(shipdirection.E.name())) || (ship.getShipDirection().name().equals(shipdirection.W.name()))) {
                       ship.setX(ship.x + numX);
                    }
                    if ((ship.getShipDirection().name().equals(shipdirection.N.name())) || (ship.getShipDirection().name().equals(shipdirection.S.name()))) {
                        ship.setY(ship.y + numY);
                    }
                }

                if (s1.equals(movedirection.R.name())) {

                    int noOfturns = num / 90;

                    while (noOfturns > 0) {
                        if (ship.getShipDirection().name().equals(shipdirection.E.name())) {
                            ship.setShipdirectionY(shipdirection.S);

                        }
                        else if (ship.getShipDirection().name().equals(shipdirection.S.name())) {
                            ship.setShipDirection(shipdirection.W);
                        }
                        else if (ship.getShipDirection().name().equals(shipdirection.W.name())) {
                            ship.setShipdirectionY(shipdirection.N);
                        }
                        else if (ship.getShipDirection().name().equals(shipdirection.N.name())) {
                            ship.setShipDirection(shipdirection.E);
                        }
                        noOfturns--;

                    }

                    if (s1.equals(movedirection.L.name())) {

                        int noOfturnsleft = num / 90;

                        while (noOfturns > 0) {
                            if (ship.getShipDirection().name().equals(shipdirection.E.name())) {
                                ship.setShipdirectionY( shipdirection.N);

                            }
                            else if (ship.getShipDirection().name().equals(shipdirection.S.name())) {
                                ship.setShipDirection(shipdirection.E);
                            }
                            else if (ship.getShipDirection().name().equals(shipdirection.W.name())) {
                                ship.setShipdirectionY(shipdirection.S);
                            }
                            else if (ship.getShipDirection().name().equals(shipdirection.N.name())) {
                                ship.setShipDirection(shipdirection.W);
                            }
                            noOfturnsleft--;

                        }

                    }

                }

            }

            ship.result();
        }
    }
