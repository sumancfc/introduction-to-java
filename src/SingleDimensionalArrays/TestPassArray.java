package SingleDimensionalArrays;

public class TestPassArray {
    public static void main(String[] args) {
        int[] a = {1,2};

        System.out.println("Before Swap using swap method");
        System.out.println("array is {" + a[0] + ", " + a[1] + "}");
        swap(a[0], a[1]);
        System.out.println("After Swap using swap method");
        System.out.println("array is {" + a[0] + ", " + a[1] + "}");

        System.out.println("Before Swap using swapInArray method");
        System.out.println("array is {" + a[0] + ", " + a[1] + "}");
        swapInArray(a);
        System.out.println("After Swap using swapInArray method");
        System.out.println("array is {" + a[0] + ", " + a[1] + "}");
    }

    public static void swap(int n1, int n2){
        int temp = n1;
        n1 = n2;
        n2 = temp;
    }

    public static void swapInArray(int[] arr){
        int temp = arr[0];
        arr[0] = arr[1];
        arr[1] = temp;
    }
}
