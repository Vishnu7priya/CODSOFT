package studentgradecalculator;
import java.util.Scanner;

public class StudentGradeCalculator {
    
    Scanner sc = new Scanner(System.in);
    {
        System.out.println("Enter The Number of Subjects:");
    }
    int numOfSubjects = sc.nextInt();
    String[] subjects = new String[numOfSubjects];
    double[] marks = new double[numOfSubjects];
    char grade;
    double totalMarks = 0.0, percentage;
    
    String[] subjects(){
        System.out.println("\nEnter The Subject Names:");
        for(int i=0; i<numOfSubjects; i++){
           subjects[i] = sc.next();
        }
        return subjects;
    }
    
    double marks(){
        for(int i=0; i<numOfSubjects; i++){
            System.out.println("\nEnter Your Marks Obtained /100 in "+subjects[i]);
            marks[i] = sc.nextDouble();
            totalMarks += marks[i];
        }
        return totalMarks;
    }
    
    double percentage(){
        percentage = totalMarks/numOfSubjects;
        return percentage;
    }
    
    char grade(){
            if(percentage>=90)
                grade = 'S';
            else if(percentage>=80)
                grade = 'A';
            else if(percentage>=70)
                grade = 'B';
            else if(percentage>=60)
                grade = 'C';
            else if(percentage>=50)
                grade = 'D';
            else if(percentage>=40)
                grade = 'E';
            else
                grade = 'F';
        return grade;
    }
    
    public static void main(String[] args) {
        StudentGradeCalculator calculator = new StudentGradeCalculator();
        calculator.subjects();
        double totalMarksObtained = calculator.marks();
        double averagePercentage = calculator.percentage();
        char grade = calculator.grade();
        System.out.println();
        System.out.println("\nTotal Marks Obtained in All Subjects: "+totalMarksObtained);
        System.out.println("Average percentange Obtained: "+averagePercentage);
        System.out.println("Grade Obtained: "+grade);
    }
}
