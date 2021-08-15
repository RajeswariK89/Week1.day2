package week1.day2;

public class FindIntersection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int Arr1[] = {0,1,2,3,4,5,7};
		int Arr2[] = {0,1,3,5,6,7,9};
		System.out.println("Intersection of the Arrays following :");
		for (int i=0;i<Arr1.length;i++)
		{
			for(int j=0;j<Arr2.length;j++)
			{
				if(Arr1[i]==Arr2[j])
				{
					System.out.println(Arr1[i]);
				}
			}
		}
			
		
		
		

	}

}
