import java.util.*;

public class Main {

    public static void main(String args[]) {

        int arr[] = { 12, 11, 40, 12, 5, 6, 5, 12, 11 };

        int[] result = removeDuplicates(arr);
        System.out.println(Arrays.toString(result));
        int[] array = { 3, 9, 2, 3, 1, 7, 2, 3, 5 };
        int key = 3;
        int[] occurencesResult = removeOccurences(array, key);
        System.out.println(Arrays.toString(occurencesResult));
        System.out.println("Enter Number");
        Scanner sc = new Scanner(System.in);
        try {
            int ValidNumber = sc.nextInt();
            sc.nextLine();
            System.out.println("you entered valid number :" + ValidNumber);
        } catch (InputMismatchException e) {
            System.out.println("Invalid Number");
        } catch (Exception e) {
            System.out.println("Something went wrong");
        } finally {
            sc.close();
        }

    }

    public static int[] removeOccurences(int[] arr, int key) {
        List<Integer> list = new ArrayList<>();
        for (int element : arr) { //for each loop directly accessing elemeents instead of array index
            if (element != key) {
                list.add(element); //adding only elements to the list which is not key
            }

        }
        int[] output = list.toArray(new Integer[0]);
        return output;

    }

   

    public static int[] removeDuplicates(int[] arr) {

        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {

            if (list.contains(arr[i]) == false) {
                list.add(arr[i]);
            }
        }
        int[] output = list.toArray(new Integer[0]);
        return output;
        
    }

}
