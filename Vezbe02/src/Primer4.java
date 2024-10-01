import java.util.Arrays;

public class Primer4 {
    public static void main(String[] args) {
        int []a = {1,2,35,-4,5,66,78,8,-9};

        System.out.println(Arrays.toString(a));

        Arrays.sort(a);

        System.out.println(Arrays.toString(a));

        int index = Arrays.binarySearch(a, 5);

        if (index < 0)
            System.out.println("Element not found");
        else
            System.out.println("Element found at position " + index);

//        Arrays.fill(a, 50);
//        System.out.println(Arrays.toString(a));

        int []b = Arrays.copyOfRange(a, 2, 4); // [2,4)
        System.out.println(Arrays.toString(b));


    }
}
