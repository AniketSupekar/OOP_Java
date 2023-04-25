// Write a program in Java to create a player class. Inherit the classes Cricket_player, Football_player and 
// Hockey_player from player class. The objective of this assignment is to learn the concepts of inheritance in Java.

public class exp7 {
   class Player {
      String name;
      int age;
      double salary;
  
      public Player(String name, int age, double salary) {
          this.name = name;
          this.age = age;
          this.salary = salary;
      }
  
      public void display() {
          System.out.println("Name: " + name);
          System.out.println("Age: " + age);
          System.out.println("Salary: $" + salary);
      }
  }
  
  // Define the Cricket_player class that extends Player
  class Cricket_player extends Player {
      String role;
  
      public Cricket_player(String name, int age, double salary, String role) {
          super(name, age, salary);
          this.role = role;
      }
  
      @Override
      public void display() {
          super.display();
          System.out.println("Role: " + role);
      }
  }
  
  // Define the Football_player class that extends Player
  class Football_player extends Player {
      int jerseyNumber;
  
      public Football_player(String name, int age, double salary, int jerseyNumber) {
          super(name, age, salary);
          this.jerseyNumber = jerseyNumber;
      }
  
      @Override
      public void display() {
          super.display();
          System.out.println("Jersey Number: " + jerseyNumber);
      }
  }
  
  // Define the Hockey_player class that extends Player
  class Hockey_player extends Player {
      String position;
  
      public Hockey_player(String name, int age, double salary, String position) {
          super(name, age, salary);
          this.position = position;
      }
  
      @Override
      public void display() {
          super.display();
          System.out.println("Position: " + position);
      }
  }
  
  // Test the program
  public class Main {
      public static void main(String[] args) {
          Cricket_player c = new Cricket_player("Virat Kohli", 33, 2000000, "Batsman");
          Football_player f = new Football_player("Lionel Messi", 34, 3000000, 10);
          Hockey_player h = new Hockey_player("Wayne Gretzky", 61, 1500000, "Center");
  
          c.display();
          f.display();
          h.display();
      }
  }
  

}