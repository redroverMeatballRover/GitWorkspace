package pack;

import java.util.Scanner;

public class Calculator {

	public static double num1;
	public static double num2;

	public void numbers() {
		System.out.println("enter a number");
		Scanner scan = new Scanner(System.in);
		num1 = scan.nextDouble();

		System.out.println("enter a number");
		Scanner scan2 = new Scanner(System.in);
		num2 = scan2.nextDouble();
	}

	public enum Decide {

		ADD {
			public double computeArea() {
				double a = num1 + num2;
				return a;
			}
		},
		SUBTRACT {
			public double computeArea() {
				double b = num1 - num2;
				return b;
			}
		},
		MULTIPLY {
			public double computeArea() {
				double a = num1 * num2;
				return a;
			}
		},
		DIVIDE {
			public double computeArea() {
				double b = num1 / num2;
				return b;
			}
		};
		

		public abstract double computeArea(); 

	}

	public void Calculate() {
		Decide d = Decide.ADD;
		Decide b = Decide.SUBTRACT;
		Decide e = Decide.MULTIPLY;
		Decide f = Decide.DIVIDE;

		System.out
				.println("Choose what you want to do: press 1 for ADD, 2 for SUBTRACT, 3 for MULTIPLY, 4 for DIVIDE");
		Scanner scan3 = new Scanner(System.in);
		int x = scan3.nextInt();

		if (x == 1) {
			System.out.println(d.computeArea());
		}
		if (x == 2) {
			System.out.println(b.computeArea());
		}
		if (x == 3) {
			System.out.println(e.computeArea());
		}
		if (x == 4) {
			System.out.println(f.computeArea());
		}

	}

}

// package pack;
//
// import java.util.Scanner;
//
// public class Calculator {
//
// static double num1;
// static double num2;
//
// public static void numbers()
// {
// System.out.println("enter a number");
// Scanner scan = new Scanner(System.in);
// num1 = scan.nextDouble();
//
// System.out.println("enter a number");
// Scanner scan2 = new Scanner(System.in);
// num2 = scan2.nextDouble();
// }
//
// public enum Decide
// {
// ADD{
// public double computeArea()
// {
// double a = num1 + num2;
// System.out.println(a);
// return a;
// }
// },
// SUBTRACT
// {
// public double computeArea()
// {
// double b = num1 - num2;
// return b;
// }
// },
// MULTIPLY
// {
// public double computeArea()
// {
// double c = num1 * num2;
// return c;
// }
// },
// DIVIDE
// {
// public double computeArea()
// {
// double d = num1 / num2;
// return d;
// }
// };
//
// public double computeArea()
// {
// System.out.println(num1 + num2);
// return num1 + num2;
// }
//
// }
//
//
// public static void main(String[] args)
// {
//
// numbers();
// System.out.println("Choose what you want to do: press 1 for ADD, 2 for SUBTRACT, 3 for MULTIPLY, 4 for DIVIDE");
// Scanner scan3 = new Scanner(System.in);
// int x = scan3.nextInt();
//
// if (x == 1)
// {
// Decide d = Decide.ADD;
// //System.out.println(d.ordinal());
// //System.out.println(d);
// }
// if (x == 2)
// {
// Decide e = Decide.SUBTRACT;
// }
// if (x == 3){
// Decide f = Decide.MULTIPLY;
// }
// if (x == 4)
// {
// Decide g = Decide.DIVIDE;
// }
// }
//
// }

