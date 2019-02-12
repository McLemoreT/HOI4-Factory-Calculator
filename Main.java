import java.util.Scanner;  // Import the Scanner class

class MakeFactory {
    public static void main(String[] args) {
        
    }
	public static void Initial(){
		Scanner scanner = new Scanner(System.in);  // Create a Scanner object
		System.out.println("Enter starting Factory count");

		Factory_Count(scanner.nextInt()); // Read user input
		
		
		System.out.println("What is the cost of a factory?");
		int Cost = scanner.nextInt();
		//Send this to the proper place
		
		System.out.println("What is consumer goods?");
		Nation.SetConsumerGoods(scanner.nextInt());
		
		System.out.println("How many Military Factories are there?");
		Nation.SetMilitaryFactories(scanner.nextInt());
		
		System.out.println("How many Civilian Factories are there?");
		Nation.SetCivilianFactories(scaner.nextInt());
		
		System.out.println("How many Naval Dockyards are there?")
		System.out.println("The total factory count is: " + GetTotalFactories());  // Output user input 
}
}
public class Line {
    public double percent = 0;
    public int factories = 0;
    //constructor
    public Line(double a, int b) {
        percent = a;
        factories = b;
    }
	public double Get_percent(){
		return percent;
	}
	public int Get_Factories(){
		return factories; 	
}
public class Factory_Count{
	public int Factory = 0
	//constructor
	public Factory_Count(int a){
		Factory = a;
	}
	//methods
	public int GetTotalFactories(){
		return Factory;
	}
	public IncreaseTotalFactories(){
		Factory++;
	}
}
