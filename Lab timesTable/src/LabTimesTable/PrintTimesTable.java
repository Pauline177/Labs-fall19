package LabTimesTable;

import java.io.PrintWriter;

public class PrintTimesTable {
	public static void main(String[] args) {
		
		String filename = "PrintTimesTable.txt";
		
		try (PrintWriter writer = new PrintWriter(filename)){
			writer.println("Times Table: ");
			for (int i =1; i <=10; i+=2) {
				for (int j =1; j <=10; j++) {
					writer.printf("%2d * %2d = %-3d\t", j, i, j*i);
					writer.printf("%2d * %2d = %-3d\n", j, i+1, j*(i+1));
				}
				writer.println();
			}
		} catch(Exception e) {
			
		}
		
	}
}

