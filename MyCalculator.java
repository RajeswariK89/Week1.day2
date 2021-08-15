package week1.day2;

public class MyCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator myCal = new Calculator();
		int sum,sub;
		double mul;
		float div;
		sum = myCal.add(23, 45, 67);
		sub = myCal.sub(543,234);
		mul = myCal.mul(506,507);
		div = myCal.divide(144f, 12f);
		System.out.println("The added value is :"+sum);
		System.out.println("The subtracted value is :"+sub);
		System.out.println("The multiplied value is :"+mul);
		System.out.println("The divided value is :"+div);
			
	}

}
