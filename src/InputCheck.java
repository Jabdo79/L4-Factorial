import java.util.Scanner;

public class InputCheck {
	
	public static int getInt(Scanner sc, String msg){//Loops until an integer is entered, returns the integer
		
		System.out.print(msg);
		while (!sc.hasNextInt()){
			System.out.print("Please enter a valid integer: ");
			sc.next();
		}
		return sc.nextInt();
	}
	
	public static int getInt(Scanner sc, String msg, int min, int max){//Loops until a number is entered within+including min and max
		
		int userInt=0;
		do{
			userInt = getInt(sc, msg);
		}while(userInt<min||userInt>max);
		
		return userInt;
	}
	
	public static double getDouble(Scanner sc){//Loops until an double is entered, returns the double
		
		while (!sc.hasNextDouble()){
			System.out.print("Please enter a valid 'double' number: ");
			sc.next();
		}
		return sc.nextDouble();
	}
	

	public static long getLong(Scanner sc){//Loops until a long is entered, returns the long
		
		while (!sc.hasNextLong()){
			System.out.print("Please enter a valid 'long' number: ");
			sc.next();
		}
		return sc.nextLong();
	}
	
	public static boolean cont(Scanner sc, String msg){//Returns TRUE if the user would like to continue
		
		System.out.print(msg);
		String choice = sc.next();
		if(choice.equalsIgnoreCase("y")||choice.equalsIgnoreCase("yes")){
			return true;
		}else{
			System.out.println("\nGoodbye!");
			return false;
		}
	}

}