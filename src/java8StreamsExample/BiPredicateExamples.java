package java8StreamsExample;

import java.util.function.BiPredicate;

public class BiPredicateExamples {

    public static void main(String[] args) {

        System.out.println(checkStringEqual.test("abc","ab"));
        User us = new User("abhishek","abhishek");
        //us.setName("abhishek");
        System.out.println(checkIfUserHaveName.test(us,"a"));

        Long l =null;
        System.out.println(us.getValue());


    }

    private static class User{

        String name;
        String id;

        public Long getValue() {
            return value;
        }

        public void setValue(Long value) {
            this.value = value;
        }

        Long value;
        private User(String name, String id){
            this.name= name;
            this.id= id;
            this.value=value;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }



    }

    public static BiPredicate<String, String> checkStringEqual = (s, s1) ->{
            return s.equals(s1);
    };

    public static BiPredicate<User,String> checkIfUserHaveName=( user, name)->{
        System.out.println(user.name);
        return user.getName().equals(name);
    };
}
