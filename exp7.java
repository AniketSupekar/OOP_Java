// Write a program in Java to create a player class. Inherit the classes Cricket_player, Football_player and 
// Hockey_player from player class. The objective of this assignment is to learn the concepts of inheritance in Java.

public class exp7 {
    // Player Class
class Player {
    private String name;
    private int age;
    private String country;
 
    public Player(String name, int age, String country) {
       this.name = name;
       this.age = age;
       this.country = country;
    }
 
    public String getName() {
       return name;
    }
 
    public int getAge() {
       return age;
    }
 
    public String getCountry() {
       return country;
    }
 }
 
 // Cricket Player Class
 class Cricket_player extends Player {
    private int battingAvg;
    private int wicketsTaken;
 
    public Cricket_player(String name, int age, String country, int battingAvg, int wicketsTaken) {
       super(name, age, country);
       this.battingAvg = battingAvg;
       this.wicketsTaken = wicketsTaken;
    }
 
    public int getBattingAvg() {
       return battingAvg;
    }
 
    public int getWicketsTaken() {
       return wicketsTaken;
    }
 }
 
 // Football Player Class
 class Football_player extends Player {
    private int goalsScored;
    private int assists;
 
    public Football_player(String name, int age, String country, int goalsScored, int assists) {
       super(name, age, country);
       this.goalsScored = goalsScored;
       this.assists = assists;
    }
 
    public int getGoalsScored() {
       return goalsScored;
    }
 
    public int getAssists() {
       return assists;
    }
 }
 
 // Hockey Player Class
 class Hockey_player extends Player {
    private int goalsScored;
    private int assists;
    private int totalPoints;
 
    public Hockey_player(String name, int age, String country, int goalsScored, int assists, int totalPoints) {
       super(name, age, country);
       this.goalsScored = goalsScored;
       this.assists = assists;
       this.totalPoints = totalPoints;
    }
 
    public int getGoalsScored() {
       return goalsScored;
    }
 
    public int getAssists() {
       return assists;
    }
 
    public int getTotalPoints() {
       return totalPoints;
    }
 }
 
 // Main Class
 public class Main {
    public static void main(String[] args) {
       // Creating objects of each player class
       Cricket_player cricketPlayer = new Cricket_player("Virat Kohli", 33, "India", 59, 4);
       Football_player footballPlayer = new Football_player("Lionel Messi", 34, "Argentina", 25, 14);
       Hockey_player hockeyPlayer = new Hockey_player("Sidney Crosby", 34, "Canada", 20, 30, 50);
 
       // Printing details of each player
       System.out.println("Details of Cricket Player:");
       System.out.println("Name: " + cricketPlayer.getName());
       System.out.println("Age: " + cricketPlayer.getAge());
       System.out.println("Country: " + cricketPlayer.getCountry());
       System.out.println("Batting Average: " + cricketPlayer.getBattingAvg());
       System.out.println("Wickets Taken: " + cricketPlayer.getWicketsTaken());
 
       System.out.println("\nDetails of Football Player:");
       System.out.println("Name: " + footballPlayer.getName());
       System.out.println("Age: " + footballPlayer.getAge());
       System.out.println("Country: " + footballPlayer.getCountry());
       System.out.println("Goals Scored: " + footballPlayer.getGoalsScored());
       System.out.println("Assists: " + footballPlayer.getAssists());
    }
}

}