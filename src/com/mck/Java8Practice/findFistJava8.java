//package com.mck.Java8Practice;
//
//import lombok.Builder;
//import lombok.Data;
//
//import java.util.ArrayList;
//import java.util.List;
//import java.util.Optional;
//
//public class findFistJava8 {
//
//    public static void main(String[] args) {
//        List<User> users = new ArrayList<User>();
//
//        Address address1= new Address();
//        address1.setCity("gurgaon");;
//        address1.setCountry("India");
//
//        Address address2 = new Address();
//        address2.setCity("dwarka");
//        address2.setCountry("India");
//
//        User user = new User();
//        user.setId(1);
//        user.setName("abhishek");
//
//        User user1= new User();
//        user1.setId(2);
//        user1.setName("singal");
//
//        users.add(user);
//        users.add(user1);
//
//        //find the first userName who stay in city dwarka
//
//        Optional<User> us = users.stream().
//                filter(user2 -> user2.getAddresses().stream()
//                        .anyMatch(address -> address.getCity().equals("dwarka")))
//                .findFirst();
//
//
//
//
//
//
//    }
//
//
//
//
//}
//
//@Builder
//@Data
//class User{
//
//    String name;
//    int id;
//    List<Address> addresses;
//
//    public User(){
//
//    }
//}
//
//@Data
//@Builder
// class Address{
//
//    String city;
//    String country;
//
//    public Address() {
//
//    }
//}
