import java.util.Scanner;
import java.util.Arrays;

public class codeforces {
    public static int max (int[] arr, int idx, int maxIdx){
        if (idx < arr.length){
            if (arr [maxIdx] < arr[idx]){
                maxIdx = idx;
            }
            return max(arr,idx + 1,maxIdx);
        }
        return arr[maxIdx];
    }
    public static void bubble_sort (int arr[], int i,int j){
        if (i < arr.length - 1){
            if (j < arr.length - i - 1){
                if (arr[j] > arr[j + 1]){
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp; 
                }
                bubble_sort(arr,i,j+1);
            }
            else bubble_sort(arr,i+1,0);
        }
    }
    public static void selection_sort (int arr[], int i,int j, int minIdx){
        if (i < arr.length - 1){
            if (j < arr.length){
                if (arr[minIdx] > arr[j]){
                    minIdx = j;
                }
                selection_sort(arr,i,j+1,minIdx);
            } else {
                int temp = arr[i];
                arr[i] = arr[minIdx];
                arr[minIdx] = temp; 
                selection_sort(arr,i+1,i+2,i+1);
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int [] arr = {0, 6, 12, 41, 3};
        bubble_sort(arr,0,0);
        System.out.println(Arrays.toString(arr));
        sc.close();
    }
}

