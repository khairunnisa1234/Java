package day05;

public class AssignmentPattern {

	public static void main(String[] args) {
		
		int n = 5;
		for(int i = 0 ; i < n ; i++){
			for(int j =0 ; j<(2*n)-1 ; j++){
				if( ((i+j)<n) || (i-1+n)<=j){
					System.out.print("* ");
					
				}
				else{ 
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		
		for(int i = 0; i<n-1 ;i++){
			for(int j = 0 ; j<(2*n)-1 ; j++){
				if((i>=j-1) || i>((2*(n-1)-1)-j-1)){
					System.out.print("* ");
				}
				else{
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}

}
