package com.epam.mjc.stage0;

/**
 * Here are the tasks for working with the arrays.
 * <p>
 * The usage of any additional packages (such as java.util.*) is forbidden.
 */
public class ArrayTasks {

    /**
     * Return a String[] array that will list all the seasons of the year, starting with winter.
     */
    public String[] seasonsArray() {
        return new String[]{"winter", "spring", "summer", "autumn"};
    }

    /**
     * Generate an int[] array of consecutive positive integers
     * starting at 1 of the given length (length parameter > 0).
     * <p>
     * Example:
     * <p>
     * length = 1  -> [1]
     * length = 3  -> [1, 2, 3]
     * length = 5  -> [1, 2, 3, 4, 5]
     */
    public int[] generateNumbers(int length) {
        int[] arr = new int[length];
        for(int i =0; i<length;i++){
            arr[i] = i+1;
        }
        return arr;
    }

    /**
     * Find the sum of all elements of the int[] array.
     * <p>
     * Example:
     * <p>
     * arr = [1, 3, 5]   -> sum = 9
     * arr = [5, -3, -4] -> sum = -2
     */
    public int totalSum(int[] arr) {
        int sum = 0;
        for(int i = 0; i<arr.length; i++){
            sum+= arr[i];
        }
        return sum;
    }

    /**
     * Return the index of the first occurrence of number in the arr array.
     * If there is no such element in the array, return -1.
     * <p>
     * Example:
     * <p>
     * arr = [99, -7, 102], number = -7    ->   2
     * arr = [5, -3, -4],   number = 10    ->  -1
     */
    public int findIndexOfNumber(int[] arr, int number) {
        int index = -1;
        for(int i = 0; i< arr.length;i++){
            if(arr[i] == number){
                index = i;
                break;
            }
        }
        return index;
    }

    /**
     * Return the new String[] array obtained from the arr array
     * by reversing the order of the elements.
     * <p>
     * Example:
     * <p>
     * arr = ["Bob", "Nick"]               -> ["Nick", "Bob"]
     * arr = ["pineapple", "apple", "pen"] -> ["pen", "apple", "pineapple"]
     */
    public String[] reverseArray(String[] arr) {
        int size = arr.length;
        String[] arr1 = new String[size];
        for(int i =0; i<size; i++){
            arr1[size-i-1] = arr[i];
        }
        return arr1;
    }

    /**
     * Return new int[] array obtained from arr int[] array
     * by choosing positive numbers only.
     * P.S. 0 is not a positive number =)
     * <p>
     * Example:
     * <p>
     * arr = [1,-2, 3]      -> [1, 3]
     * arr = [-1, -2, -3]   -> []
     * arr = [1, 2]         -> [1, 2]
     */
    public int[] getOnlyPositiveNumbers(int[] arr) {
        int size = arr.length;
        int [] arr1 = new int[size];
        int j = 0;
        for(int i = 0; i<size; i++){
            if(arr[i] > 0){
                arr1[j] = arr[i];
                j++;
            }
        }
        int [] arr2 = new int[j];
        for(int k = 0; k<j; k++){
            arr2[k] = arr1[k];
        }
        return arr2;

    }

    /**
     * Return a sorted, ragged, two-dimensional int[][] array following these rules:
     * Incoming one-dimensional arrays must be arranged in ascending order of their length;
     * numbers in all one-dimensional arrays must be in ascending order.
     * <p>
     * Example:
     * <p>
     * arr = [[3, 1, 2,], [3,2]] -> [[2, 3], [1, 2, 3]]
     * arr = [[5, 4], [7]]       -> [[7], [4, 5]]
     */
    public int[][] sortRaggedArray(int[][] arr) {
        for(int i = 0; i< arr.length; i++){
            int min = arr[i][0];
            for(int j = 0;j<arr[i].length; j++){
                int min_number = arr[i][j];
                int index = j;
                for(int k = j+1; k<arr[i].length; k++){
                    if(arr[i][k] < min_number){
                        min_number = arr[i][k];
                        index = k;
                    }
                }
                int p = arr[i][j];
                arr[i][j] = min_number;
                arr[i][index] = p;
            }
        }

        for(int i = 0; i< arr.length; i++){
            int min_size = arr[i].length;
            int[] arr_elem = new int[arr[i].length];
            int k = i;
            for(int j = i+1;j<arr.length; j++){
                if(arr[j].length < min_size){
                    min_size = arr[j].length;
                }
            }
            arr_elem = arr[i];
            arr[i] = arr[k];
            arr[k] = arr_elem;
        }

    return arr;
    }
}
