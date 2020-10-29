package com.mckc.LeetCode;


import java.util.Arrays;
import java.util.Optional;
import java.util.stream.Collectors;

class RobotBounded {



    static {
        System.out.println("inside static method");
    }

    private final String field2;
    private final String field1;

    {
        System.out.println("initialization block");
    }

    RobotBounded(String field, String field2) {
        this.field1 = field;
        this.field2 = field2;

    }

    public static void main(String[] args) {

        System.out.println("inside intellij first");

        System.out.println(isRobotBounded("GLGLGGLGL"));

        Optional<String> name = Arrays.asList("Abhsihek",
                "Singhal").stream().filter(i -> i.length() > 5).findAny();

        Arrays.asList("Abhishek Singhal","Meghanshi Agarwal").stream().count();

        System.out.println(name.get());

        //RobotBounded robotBounded = new RobotBounded();
        //robotBounded.functionCall();

    }

    private static void functionCall() {
        System.out.println("Learning some basic tips for intellij");
    }

    //Very bad design of logic
    public static boolean isRobotBounded(String instructions) {

        char finalDirection = 'N';

        char[] directions = instructions.toCharArray();

        for (int i = 0; i < directions.length; i++) {

            if (i == 0) {
                if (directions[0] == 'L') {
                    finalDirection = 'W';
                }
                if (directions[0] == 'R') {
                    finalDirection = 'E';
                }

            } else if (directions[i] == 'L') {
                if (finalDirection == 'N') {
                    finalDirection = 'W';

                }
                if (finalDirection == 'E') {
                    finalDirection = 'N';

                }
                if (finalDirection == 'S') {
                    finalDirection = 'E';

                }
                if (finalDirection == 'W') {
                    finalDirection = 'S';

                }

            }

            if (directions[i] == 'R') {
                if (finalDirection == 'N') {
                    finalDirection = 'W';

                }
                if (finalDirection == 'E') {
                    finalDirection = 'S';

                }
                if (finalDirection == 'S') {
                    finalDirection = 'W';

                }
                if (finalDirection == 'W') {
                    finalDirection = 'N';

                }

            }
        }

        if (finalDirection == 'N') {
            return false;
        }

        return true;


    }

    public int functionCount(int count) {


        return count;
    }

}
