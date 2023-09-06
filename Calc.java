package calc2;

import java.util.Iterator;

public class Calc {

	
	// 필드
	double num1;
	double num2;
	double arr[];

	
	// 생성자
	public Calc() {
		
	}
	
	// + , - , * , /
	public Calc(double num1, double num2) {
		this.num1 = num1;
		this.num2 = num2;
	}
	
	// 누적합, 평균
	public Calc(double ... arr) {
		this.arr = arr;
	}
	
	
	// 메서드
	double add() {
		return this.num1 + this.num2;
	}
	
	double sub() {
		return this.num1 - this.num2;
	}
	
	double mul() {
		return this.num1 * this.num2;
	}
	
	double div() {
		return this.num1 / this.num2;
	}
	
	double acc() {
		double tot = 0;
		for (int i = 0; i < arr.length; i++) {
			tot = tot + this.arr[i];
		}
		return tot;
	}
	
	double arr() {
		double tot=acc();
		return tot / arr.length;
	}

}
