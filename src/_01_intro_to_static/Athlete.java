package _01_intro_to_static;

public class Athlete {
 
	static int nextBibNumber;
    static String raceLocation = "New York";
    static String raceStartTime = "9.00am";

    String name;
    int speed;
    int bibNumber;

    Athlete (String name, int speed){
        this.name = name;
        this.speed = speed;
    }

    public static void main(String[] args) {
        //create two athletes
        //print their names, bibNumbers, and the location of their race. 
    	Athlete Jordan = new Athlete("Jordan", 15);
    	Athlete Steve = new Athlete("Steve", 10);
    	System.out.println(Jordan.name);
    	System.out.println(Jordan.speed);
    	System.out.println(Jordan.bibNumber);
    	System.out.println(Steve.name);
    	System.out.println(Steve.speed);
    	System.out.println(Steve.bibNumber + 1);
}
}
