package main.java.hello;

import org.joda.time.LocalTime;

public class Helloworld {
  public static void main(String[] args) {
    LocalTime currentTime = new LocalTime();
    System.out.println("The current local time is: " + currentTime);
    Greeter greeter = new Greeter();
    System.out.println(greeter.sayHello());

    // implement the file2img class 
    file2img.converter();
  }
}