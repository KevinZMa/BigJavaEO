package ch03;

/**
 * P3.8 Represents a student with a name and quiz score.
 */
public class Student {

    private String name;
    private int numQuizzes;
    private double totalScore;

    public Student(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public double getTotalScore() {
        return totalScore;
    }

    public double getAverageScore() {
        return totalScore / numQuizzes;
    }

    public void addQuiz(double score) {
        totalScore += score;
        numQuizzes++;
    }

    /**
     * Unit Testing
     */
    public static void main(String[] args) {
        Student s = new Student("Bob");

        s.addQuiz(91);
        s.addQuiz(94.7);
        s.addQuiz(100);

        System.out.println(s.getTotalScore());
        System.out.println("Expected: 285.7");

        System.out.println(s.getAverageScore());
        System.out.println("Expected: 95.23333333333333");
    }
}
