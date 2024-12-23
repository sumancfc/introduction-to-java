package Methods;

public class Example {
/*    public static int sum(int a, int b) {
        int result = 0;

        for (int i = a; i <=b; i++)
            result += i;

        return result;
    }*/



    public static void main(String[] args) {
/*        System.out.println(sum(1, 10));
        System.out.println(sum(20, 37));
        System.out.println(sum(35, 49));*/
        int i = 5, j = 10;
        int k = max(i, j);
        System.out.println("The maximum of " + i + " and " + j + " is " + k);

        int number = sign(i);
        System.out.println("The sign of " + i + " is " + number);
    }

    public static int max(int num1, int num2) {
        int result;

        if (num1 > num2) {
            result = num1;
        }else {
            result = num2;
        }

        return result;
    }

    public static int sign(int n){
        if (n > 0)
            return 1;
        else if ( n ==0 )
            return 0;
        else
            return -1;
    }
}
