import java.util.Scanner;

public class Calc {
	public int add (int a, int b) {
		return a + b;
	}
	public static void main(String[] args) {
		int casenum;
		int num1, num2;
		
		Calc cal = new Calc();
		Scanner input = new Scanner(System.in);
		
		System.out.println("[ ID : 1512173]");
		System.out.println("[ Name : ÀÌÁ¤Çö]");
		
		System.out.println();
		System.out.println("1. Add two numbers");
		System.out.println("2. Subtract two numbers");
		System.out.println("3. Multiply two numbers");
		System.out.println("4. Quit");
		
		System.out.println();
		System.out.print(">");
casenum = input.nextInt();
		
		if (casenum != 4) {
			System.out.print("> x:");
			num1 = input.nextInt();
			System.out.print("> y:");
			num2 = input.nextInt();
			
			switch(casenum) {
			case 1:
				System.out.println("> result:" + cal.add(num1, num2));
				break;
			
			}
			
		}
	}

}
