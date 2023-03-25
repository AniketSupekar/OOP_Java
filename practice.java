public class practice {
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
     static class Cricket_player extends Player {
       
        public Cricket_player(String name, int age, String country) {
           super(name, age, country);
        }
     
     }
     
     // Football Player Class
    static class Football_player extends Player {
    
     
        public Football_player(String name, int age, String country) {
           super(name, age, country);
          
        }
     }
     
     // Hockey Player Class
    static class Hockey_player extends Player {
    
     
        public Hockey_player(String name, int age, String country) {
           super(name, age, country);
           
        }
     
     }
     
     // Main Class
     public class Main {
        public static void main(String[] args) {
           // Creating objects of each player class
           Cricket_player cricketPlayer = new Cricket_player("Virat Kohli", 33, "India");
           Football_player footballPlayer = new Football_player("Lionel Messi", 34, "Argentina");
           Hockey_player hockeyPlayer = new Hockey_player("Sidney Crosby", 34, "Canada");
     
           // Printing details of each player
           System.out.println("Details of Cricket Player:");
           System.out.println("Name: " + cricketPlayer.getName());
           System.out.println("Age: " + cricketPlayer.getAge());
           System.out.println("Country: " + cricketPlayer.getCountry());
          
     
           System.out.println("\nDetails of Football Player:");
           System.out.println("Name: " + footballPlayer.getName());
           System.out.println("Age: " + footballPlayer.getAge());
           System.out.println("Country: " + footballPlayer.getCountry());
          
        }
    }
}