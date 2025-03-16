package ackTracking;

public class Suduko {
	
	public static void main(String[] args) {
		int [][] arr= new int[9][9];
		solver(arr,0,0);
		for(int i=0;i<9;i++) {
			for(int j=0;j<9;j++) {
				System.out.print(arr[i][j]+"  ");
			}
			System.out.println();
		}
	}

	private static boolean solver(int[][] arr, int i, int j) {
		if(i==9) {
			return true;
		}
		if(j==9) {
			i+=1;
			j=0;
			return solver(arr,i,0);
			
		}
		for(int num=1;num<=9;num++) {
			if(isSafe(arr,i,j,num)) {
				arr[i][j]=num;
				if(solver(arr,i,j+1)) return true;
				arr[i][j]=0;
			}
		}
		return false;
		
	}

	private static boolean isSafe(int[][] arr, int i, int j, int num) {
		for(int row=0;row<9;row++) {
			if(arr[row][j]==num) return false;
		}
		for(int col=0;col<9;col++) {
			if(arr[i][col]==num) return false;
		}
		int i1=i-i%3,j1=j-j%3;
		for( int row=0;row<3;row++) {
			for( int col=0;col<3;col++) {
				if(arr[row+i1][col+j1]==num) return false;
			}
		}
		return true;
	}

}
