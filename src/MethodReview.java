/**
 * 
 */


import java.util.Scanner;

/**
 * @author maurice tedder
 *  Methods example:
 * 1. Create main method using shortcut in class body
 * 2. Create another method called test1 returns void, no parameters
 * 3. Create another method called test2 returns void, 1 int parameter
 * 4. Create another method called test3 returns int, no parameters
 * 5. Create another method called test4 returns float, 1 Scanner class parameter
 * 6. Create another method called test5 returns a String, 3 float parameters
 * 7. Create another method called reverseNumber returns a String, 1 int parameter
 * 8. Create another method called reverseNumber returns a String, 1 String parameter
 *
 */
public class MethodReview {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		float avg = test4(scan);
	}
	
	//class body. What goes here?
	//2.
	public static void test1(){		
	}
	
	//3
	public static void test2(int value){
		
	}
	
	//4. Create another method called test3 returns int, no parameters
	public static int test3(){
		return 0;
	}
	
	//5. Create another method called test4 returns float, 1 Scanner class parameter
	
	/**
	 * Create another method called test4 returns float, 1 Scanner class parameter
	 * @param scan
	 * @return
	 */
	public static float test4(Scanner scan){
		return 0f;
	}
	
	//test5 returns a String, 3 float parameters
	public static String test5(float float1, float float2, float float3){
		return "";
	}
	
	//reverseNumber returns a String, 1 int parameter
	public static String reverseNumber(int number){
		return "";
	}
	
	//reverseNumber returns a String, 1 String parameter
	public static String reverseNumber(int number, int number2){
		return "";
	}
}
