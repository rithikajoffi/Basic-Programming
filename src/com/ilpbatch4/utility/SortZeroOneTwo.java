package com.ilpbatch4.utility;
 
public class SortZeroOneTwo {
 
	public static void main(String[] args) {
		int array[]= {1,2,0,1,1,0,4,5,6,7};
		arraySort(array);
		for(int i=0;i<array.length;i++) 
		{
			if(array[i]==0 || array[i]==1 || array[i]==2)
					System.out.print(array[i]+" ");
		}
 
	}
 
	private static void arraySort(int[] array) {
		int temp=0;
		for (int i = 0; i < array.length; i++) 
		{
			for (int j = i+1; j < array.length; j++) 
			{
				if(array[j]<array[i])
					{
						temp=array[j];
						array[j]=array[i];
						array[i]=temp;
					}
			}
		}
//		int low=0;
//		int mid=0;
//		int high=array.length-1;
//		
//		while(mid<=high)
//		{
//			switch(array[mid])
//			{
//				case 0: int tempi=array[low];
//						array[low]=array[mid];
//						array[mid]=tempi;
//						low++;
//						mid++;
//						break;
//						
//				case 1:	mid++;
//						break;
//						
//				case 2:	int tempf=array[high];
//						array[high]=array[mid];
//						array[mid]=tempf;
//						high--;
//						break;
//			}
//		}
	}
}