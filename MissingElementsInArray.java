package week1.day2;

public class MissingElementsInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arrNum[] = {0,1,2,3,4,6,6,7,8,10};
		
		for (int i=0;i < arrNum.length;i++) {
			if(i!=arrNum[i])
			{
				System.out.println("Missing Array Element is : "+ arrNum[i] + " and the Missing value is : "+i);
			
			}
			
		}
		
		
		
		
		
		

	}

}
