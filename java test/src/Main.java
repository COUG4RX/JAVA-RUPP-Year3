public class Main {
    public static void main(String[] args) {
        import java.util.Scanner;

        public class GradeConverter {
            public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);

                // Prompt user for numerical grade input
                System.out.print("Enter the numerical grade: ");
                int numericalGrade = scanner.nextInt();

                // Determine the corresponding letter grade
                char letterGrade = getLetterGrade(numericalGrade);

                // Display the result
                System.out.println("The corresponding letter grade is: " + letterGrade);

                scanner.close();
            }

            // Method to determine the letter grade based on the numerical grade
            private static char getLetterGrade(int numericalGrade) {
                if (numericalGrade >= 90 && numericalGrade <= 100) {
                    return 'A';
                } else if (numericalGrade >= 80 && numericalGrade < 90) {
                    return 'B';
                } else if (numericalGrade >= 70 && numericalGrade < 80) {
                    return 'C';
                } else if (numericalGrade >= 60 && numericalGrade < 70) {
                    return 'D';
                } else if (numericalGrade >= 50 && numericalGrade < 60) {
                    return 'E';
                } else {
                    return 'F';
                }
            }
        }

    }
}