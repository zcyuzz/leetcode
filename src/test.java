import java.awt.*;
import java.util.Arrays;

public class test {
    public static void main(String[] args) {
        String s="abcedfg";
        String ss ="s";
        System.out.println(s.substring(0,s.length()));
    }
//    private static final int BASE_ARRAY_SIZE = 10000;
//
//    // A utility function to generate and return an
//    // an array of given size filled with randomly
//    // generated elements.
//    public static double[] generateArray(int size)
//    {
//        if (size <= 0 || size > Integer.MAX_VALUE)
//            return null;
//
//        double[] result = new double[size];
//        for (int i = 0; i < size; i++)
//            result[i] = Math.random();
//
//        return result;
//    }
//
//    // Driver code to compare two sortings
//    public static void main(String[] args)
//    {
//        for (int i = 1; i < 10000; i *= 10)
//        {
//            int size = BASE_ARRAY_SIZE * i;
//            double[] arr1 = generateArray(size);
//
//            // Creating a copy of arr1 so that we can
//            // use same content for both sortings.
//            double[] arr2 = Arrays.copyOf(arr1, arr1.length);
//            System.out.println("Array Size: " + size);
//
//            // Sorting arr1[] using serial sort
//            long startTime = System.currentTimeMillis();
//            Arrays.sort(arr1);
//            long endTime = System.currentTimeMillis();
//            System.out.println("Time take in serial: " +
//                    (endTime - startTime) + "ms.");
//
//            // Sorting arr2[] using serial sort
//            startTime = System.currentTimeMillis();
//            Arrays.parallelSort(arr2);
//            endTime = System.currentTimeMillis();
//            System.out.println("Time take in parallel: "
//                    + (endTime - startTime) + "ms.");
//            System.out.println();
//        }
//    }
}