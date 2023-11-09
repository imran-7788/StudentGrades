import java.util.Scanner;
public class GradeCalculator {
    public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);

                System.out.print("Enter the number of students: ");
                int numStudents = scanner.nextInt();

                int[] grades = new int[numStudents];

                // Input grades
                for (int i = 0; i < numStudents; i++) {
                    System.out.print("Enter grade for student " + (i + 1) + ": ");
                    grades[i] = scanner.nextInt();
                }

                // Calculate average
                double average = calculateAverage(grades);
                System.out.println("Average Grade: " + average);

                // Find highest and lowest grades
                int highest = findHighest(grades);
                int lowest = findLowest(grades);

                System.out.println("Highest Grade: " + highest);
                System.out.println("Lowest Grade: " + lowest);

                scanner.close();
            }

            private static double calculateAverage(int[] grades) {
                int sum = 0;
                for (int grade : grades) {
                    sum += grade;
                }
                return (double) sum / grades.length;
            }

            private static int findHighest(int[] grades) {
                int highest = grades[0];
                for (int grade : grades) {
                    if (grade > highest) {
                        highest = grade;
                    }
                }
                return highest;
            }

            private static int findLowest(int[] grades) {
                int lowest = grades[0];
                for (int grade : grades) {
                    if (grade < lowest) {
                        lowest = grade;
                    }
                }
                return lowest;
            }
        }
