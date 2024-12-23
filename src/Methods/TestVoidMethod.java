package Methods;

public class TestVoidMethod {
    public static void main(String[] args) {
        System.out.print("The Grade is ");
        printGrade(74);

        System.out.print("The Grade is ");
        printGrade(45);
    }

    public static void printGrade(double score) {
        if (score >= 90) {
            System.out.println("A");
        }else if (score >= 80) {
            System.out.println("B");
        }else if (score >= 70) {
            System.out.println("C");
        }
        else if (score >= 60) {
            System.out.println("D");
        }else if (score >= 50) {
            System.out.println("E");
        }else {
            System.out.println("F");
        }
    }
}
