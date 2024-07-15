import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayBT {
    //Bài 1
    public int SumEvenNumberArrays(int[] array){
        int sum = 0;
        for (int num : array) {
            if(num % 2 == 0){
                sum += num;
            }
        }
        return sum;
    }
    //Bài 2
    public int maxInArray(int[] array){
        int max = array[0];
        for (int num : array) {
            if(num > max){
                max = num;
            }
        }
        return max;
    }
    //Bài 3
    public int CountOccurrences(int[] array, int elementToFind) {
        int count = 0;
        for (int num : array) {
            if (num == elementToFind) {
                count++;
            }
        }
        return count;
    }
    //Bài 4
    public int SumOfSquaresElements(ArrayList<Integer> arrayList) {
        int sumOfSquares = 0;
        for (int num : arrayList) {
            sumOfSquares += num * num;
        }
        return sumOfSquares;
    }

}
