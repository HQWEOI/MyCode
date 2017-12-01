package Practice_11_27;

import java.util.Scanner;

public class Practice_1 {	
	

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int row = scan.nextInt();
		int column = scan.nextInt();
		
		int[][] matrix = new int[column][row];
		
		for(int i = 0; i < row; i++) {
			for(int j = 0; j < column; j++) {
				matrix[j][i] = scan.nextInt();
			}
		}
		for(int i = 0; i < row; i++) {
			for(int j = 0; j < column; j++) {
				System.out.print(matrix[j][i]+" ");
			}
			System.out.println();
		}
		
		int[][] matrix2 = new int [row][column];

		for(int i = 0; i < column; i++) {
			for(int j = 0; j < row; j++) {
				matrix2[j][i] = matrix[column - 1 - i][j];
			}
		}
		for(int i = 0; i < column; i++) {
			for(int j = 0; j < row; j++) {
				System.out.print(matrix2[j][i]+" ");
			}
			System.out.println();
		}
		
		
		
	}
}