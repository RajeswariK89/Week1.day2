package week1.day2;

public class MyMobile {

	public void makeCall() {
		System.out.println("Making |Calls");
	}

	public void sendMsg() {
		System.out.println("Sending Msgs");
	}

	private void payBills() {
		System.out.println("Paying Bills");
	}

public static void main (String[] args) {
	
	MyMobile mobObj = new MyMobile();
	mobObj.makeCall();
	mobObj.sendMsg();
	mobObj.payBills();
	
}
}