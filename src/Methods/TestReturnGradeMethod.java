package Methods;

public class TestReturnGradeMethod {
    public static void main(String[] args) {
        System.out.println("The Grade is " + printGrade(95));
        System.out.println("The Grade is " + printGrade(45));
    }

    public static char printGrade(int grade) {
        if(grade >= 90){
            return 'A';
        }
        else if (grade >= 80) {
            return 'B';
        }else if (grade >= 70) {
            return 'C';
        }else if (grade >= 60) {
            return 'D';
        }
        else {
            return 'F';
        }

    }
}
