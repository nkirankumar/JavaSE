package my.misc;

public class MyBubbleSort {
	// logic to sort the elements
    public static void bubble_srt(int array[]) {
        int n = array.length;        
        for (int j = 0; j < n - 1; j++) {
            for (int i = 0; i < n - 1; i++) {                
                if (array[i] > array[i + 1]) {
                	int temp;
                    temp = array[i];
                    array[i] = array[i+1];
                    array[i+1] = temp;
                }
            }            
        }
        printNumbers(array);
    }
    public static void doSelectionSort(int[] arr){
        
        for (int i = 0; i < arr.length - 1; i++)
        {
            int index = i;
            for (int j = i + 1; j < arr.length; j++)
                if (arr[index]>arr[j] )
                    index = j;
      
            int smallerNumber = arr[index]; 
            arr[index] = arr[i];
            arr[i] = smallerNumber;
        }
        printNumbers(arr);
    }

    
    private static void printNumbers(int[] input) {
          
        for (int i = 0; i < input.length; i++) {
            System.out.print(input[i] + ", ");
        }
        System.out.println("\n");
    }
  
    public static void main(String[] args) {
        int[] input = { 4, 2, 9, 6, 23, 12, 34, 0, 1 };
        //bubble_srt(input);
        doSelectionSort(input);
  
    }

}
