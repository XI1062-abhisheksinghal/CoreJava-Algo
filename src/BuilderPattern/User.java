package BuilderPattern;

//make class as immutable and use Builder pattern to create Object of user
public class User {

    private final String firstName;
    private final String lastName;
    private final int age;
    private final int sal;

    private User(UserBuilder builder){
        this.firstName=builder.firstName;
        this.lastName= builder.lastName;
        this.age= builder.age;
        this.sal= builder.sal;
    }


    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public int getSal() {
        return sal;
    }

     private static class UserBuilder{
         private final String firstName;
         private final String lastName;
         private int age;
         private  int sal;

         public UserBuilder(String firstName, String lastName) {
             this.firstName = firstName;
             this.lastName = lastName;
         }

         public UserBuilder age(int age) {
             this.age = age;
             return this;
         }

         public UserBuilder sal(int sal) {
             this.sal = sal;
             return this;
         }

         public User build() {
             User user =  new User(this);
             //validateUserObject(user);
             return user;
         }


     }




}
