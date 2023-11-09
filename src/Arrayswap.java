import java.util.Arrays;

public class Arrayswap {
    public static void main(String[] args) {
        int[] arr ={10,9,8,7,6,5,4,3,2,1};
        int counter = 0;

        System.out.println("before:");
        System.out.println(Arrays.toString(arr));

        for (int i =1; i < arr.length ;i++) {
            counter++;

            for (int j = 0; j < arr.length - i ; j++){
                counter++;
                if( arr[j] > arr[j +1]){
                    int greater2 = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = greater2;
                    counter++;
                }
            }
        }
        System.out.println("After: ");
        System.out.println(Arrays.toString(arr));
        System.out.println("the counter is " + counter);
    }
}
