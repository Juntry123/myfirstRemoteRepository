package calc2;

import java.util.Scanner;

public class CalcTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		double arr[];
		char OP[];

		
		Calc calc= new Calc(50,2);
		System.out.println(calc.add());
		System.out.println(calc.sub());
		System.out.println(calc.mul());
		System.out.println(calc.div());
		
		Calc calc1= new Calc(100,80,50);
		System.out.println(calc1.acc());
		System.out.println(calc1.arr());
	}

}
