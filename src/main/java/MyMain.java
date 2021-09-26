import java.util.Arrays;

public class MyMain {

    // Rotates all values in an array to the left
    // Ex. rotateLeft([1, 2, 3, 4, 5]) => [2, 3, 4, 5, 1]
    public static int[] rotateLeft(int[] arr) {
        int temp;
        for (int i = 0; i < arr.length - 1; i++) {
            temp = arr[i];
            arr[i] = arr[i + 1];
            arr[i + 1] = temp;
        }
        return arr;
    }


    // Rotates all values in an array to the right
    // Ex. rotateRight([1, 2, 3, 4, 5]) => [5, 1, 2, 3, 4]
    public static int[] rotateRight(int[] arr) {
        int temp = arr[arr.length-1];
        for (int i = arr.length-1; i > 0; i--) {
                arr[i]=arr[i-1];
            }
        arr[0] = temp;
        return arr;
    }

    // Replaces all duplicate values with -1
    // Ex. duplicateReplacer([1, 2, 1, 2, 1, 1]) => [1, 2, -1, -1, -1, -1]
    public static int[] duplicateReplacer(int[] arr) {
        for (int x = 0; x < arr.length; x++) {
            for (int y = x+1; y < arr.length; y++) {
                if (arr[x]==arr[y]){
                    arr[y]=-1;
                }
            }
        }
        return arr;
    }


    public static void main(String[] args) {
        int [] test = {0, 1, 1, 2, 3, 4, 1, 5, 6, 5};
        int [] test1 = {0, 1, 1, 2, 3, 4, 1, 5, 6, 5};
        int [] test2 = {0, 1, 1, 2, 3, 4, 1, 5, 6, 5};

        System.out.println("Original Test String: " + test);
        System.out.println();
        System.out.println();
        System.out.println("Rotate Left Test (Expected: [1, 1, 2, 3, 4, 1, 5, 6, 5, 0]): " + java.util.Arrays.toString(rotateLeft(test)));
        System.out.println();
        System.out.println("Rotate Right Test (Expected: [5, 0, 1, 1, 2, 3, 4, 1, 5, 6]): " + java.util.Arrays.toString(rotateRight(test1)));
        System.out.println();
        System.out.println("Replace Duplicates with '-1' (Expected: 0, 1, -1, 2, 3, 4, -1, 5, 6, -1): " + java.util.Arrays.toString(duplicateReplacer(test2)));
    }
}
