import java.util.Scanner;

public class Main2{

	public static void main(String[] args){
		System.out.println("Please type your name:");
		Scanner scanner = new Scanner(System.in);
		String name = scanner.nextLine();
		System.out.println("Hello " + name +  " . Please type your age: ");
		int age = scanner.nextInt();
		int yearsUntilRetirement = 67 - age;
		System.out.println("You are " + age + " years old. You have " + yearsUntilRetirement + " years of work left before you can retire.");

	}

}