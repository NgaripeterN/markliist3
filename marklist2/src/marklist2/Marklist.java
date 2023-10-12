package marklist2;

import java.util.Scanner;

public class Marklist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scanner = new Scanner(System.in);
		

        // Create an array to store the student data
        String[][] studentData = new String[4][9];

        // Prompt the user to enter the student data
        for (int i = 0; i < studentData.length; i++) {
            System.out.print("Enter the student roll number: ");
            studentData[i][0] = scanner.next();

            System.out.print("Enter the student name: ");
            studentData[i][1] = scanner.next();

            System.out.print("Enter the three marks: ");
            studentData[i][2] = scanner.next();
            studentData[i][3] = scanner.next();
            studentData[i][4] = scanner.next();
        }

        // Calculate the total and average marks, and the grade for each student
        for (int i = 0; i < studentData.length; i++) {
            int totalMarks = 0;
            float averageMarks = 0.0f;

            for (int j = 2; j <= 4; j++) {
                totalMarks += Integer.parseInt(studentData[i][j]);
            }

            averageMarks = (float) totalMarks / 3;

            String grade = null;
            if (averageMarks >= 70 && averageMarks <= 100) {
                grade = "A";
            } else if (averageMarks >= 50 && averageMarks <=69) {
                grade = "B";           
            } else if (averageMarks <= 49) {
                grade = "C";
            }

            studentData[i][5] = String.valueOf(totalMarks);
            boolean allMarksAbove50 = true;
            for (int j = 2; j <= 4; j++) {
                if (Integer.parseInt(studentData[i][j]) <= 50) {
                    allMarksAbove50 = false;
                    break;
                }
            }

            studentData[i][6] = allMarksAbove50 ? "P" : "F";
            studentData[i][7] = String.format("%.1f", averageMarks);
            studentData[i][8] = grade;
        }

        // Display the student marklist
        System.out.println("***************************************************************************************");
        System.out.println("\t\t\t\t STUDENT MARKLIST   ");
        System.out.println("************************************************************************************** ");
        System.out.println("ROLL\t" + "NAME\t\t" + "MARK1\t" + "MARK2\t" + "MARK3\t" + "TOTAL\t" + "RESULT\t" + "AVERAGE\t" + "GRADE\t");
        for (int i = 0; i < studentData.length; i++) {
            System.out.println(studentData[i][0] + "\t" + "" + studentData[i][1] + "\t\t  " + studentData[i][2] + "\t  " + studentData[i][3] + "\t  " + studentData[i][4] + "\t " + studentData[i][5] + "\t  " + studentData[i][6] + "\t " + studentData[i][7] + "\t  " + studentData[i][8]);
            
        }

	}

}
