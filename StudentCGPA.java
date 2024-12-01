import java.util.Scanner;

public class StudentCGPA {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

      
        System.out.print("Enter Student ID: ");
        String studentID = scanner.nextLine();

       
        System.out.print("Enter No. of Courses: ");
        int numCourses = scanner.nextInt();

        int totalCredits = 0;
        int totalCreditsEarned = 0;
        double weightedScore = 0;

        for (int i = 1; i <= numCourses; i++) {
            System.out.println("Enter details for C" + i + ":");
            
            
            System.out.print("  Credit (Max 3): ");
            int credit = scanner.nextInt();
            totalCredits += credit;

           
            System.out.print("  CT (Max 30): ");
            int ct = scanner.nextInt();
            System.out.print("  AT (Max 10): ");
            int at = scanner.nextInt();
            System.out.print("  FE (Max 60): ");
            int fe = scanner.nextInt();

            
            int totalMarks = ct + at + fe;

            
            double gradePoint;
            if (totalMarks >= 80) {
                gradePoint = 4.0;
            } else if (totalMarks >= 75) {
                gradePoint = 3.7;
            } else if (totalMarks >= 70) {
                gradePoint = 3.5;
            } else if (totalMarks >= 60) {
                gradePoint = 3.0;
            } else if (totalMarks >= 50) {
                gradePoint = 2.5;
            } else {
                gradePoint = 0.0;
            }

          
            if (gradePoint > 0) {
                totalCreditsEarned += credit;
            }

           
            weightedScore += gradePoint * credit;
        }

        
        double cgpa = weightedScore / totalCredits;

        
        String grade;
	if(cgpa==4){
		grade="A+";
	}
        else if (cgpa >= 3.7) {
            grade = "A";
        } else if (cgpa >= 3.5) {
            grade = "A-";
        } else if (cgpa >= 3.0) {
            grade = "B+";
        } else if (cgpa >= 2.5) {
            grade = "B";
        } else {
            grade = "F";
        }

        
        System.out.println("\nStudent ID: " + studentID);
        System.out.println("Credit Taken: " + totalCredits);
        System.out.println("Credit Earned: " + totalCreditsEarned);
        System.out.printf("CGPA: %.2f\n", cgpa);
        System.out.println("Grade: " + grade);

        scanner.close();
    }
}
