
public class Solution {

	public static void main(String[] args) {
			int m = 0;
			int n = 0;
			int [] A = {2,3,4,5,6};
			int [] B = {3,5,6,8};
			
			merge(m,A,n,B);
			
	}
			public static void merge(int m, int A[], int n , int [] B) {
			
				int i = m - 1;
				int j = n - 1;
				int k = m + n -1;
				
				
				while(k >=0) {
					System.out.println(i);
					if (j < 0 || (i >= 0 && A[i] > B[i])) 
								
								A[k--] = A[i--];
					
							else
								A[k--] = B[j--];
					}
					for (int h : B) {
						System.out.println(h);
					}
					
				}
				
	
}
