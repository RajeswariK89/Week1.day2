package week1.day2;

public class FindDupsInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int Arr[] = {10,20,30,10,40,50,30,60,70,40,80,80,90,50,100};
		System.out.println("Duplicates in the Array :");
		for(int i=0;i<Arr.length;i++)
		{ 
			for(int j=i+1;j<Arr.length;j++)
			{
				if(Arr[i]==Arr[j])
				{
					System.out.println(Arr[i]);
				}
			}
		}
	}

}
