import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        	Scanner scan = new Scanner(System.in);
		String firstName = scan.next();
		String lastName = scan.next();
		int id = scan.nextInt();
		int numScores = scan.nextInt();
		int[] testScores = new int[numScores];

		for(int i = 0; i < numScores; i++){
			testScores[i] = scan.nextInt();
		}
		scan.close();
		
		Student s = new Student(firstName, lastName, id, testScores);
		s.printPerson();
		System.out.println("Grade: " + s.calculate());
        
    }
}
class Person{
    protected String firstName;
    protected String lastName;
    protected int idNumber;

   Person(String firstName, String lastName, int idNumber){
        this.firstName = firstName;
        this.lastName = lastName;
        this.idNumber = idNumber;
    }
    public void printPerson(){
         System.out.println(
				"Name: " + lastName + ", " + firstName 
			+ 	"\nID: " + idNumber); 
    }
}
class Student extends Person {
   private int[] testScores;

   Student(String firstName, String lastName, int idNumber,int[] testScores) {
    super(firstName, lastName, idNumber);
    this.testScores = testScores;

   }
   public String calculate() {
    int sum = 0;

        for (int i = 0; i < testScores.length; i++) {
            sum+= testScores[i];   
        }
        int average = sum / testScores.length;
        if (average >= 90 && average <= 100) {
          return "O";
        }else if (average >= 80 && average < 90) {
              return "E";
        }else if (average < 80 && average >= 70) {
               return "A";
        }else if (average < 70 && average >= 55) {
            return "P";
        }else if (average >= 40 && average < 55) {
                return "D";
        }else {
           return "T";
        }
    
   }

}
