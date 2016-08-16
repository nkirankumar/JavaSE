package my.misc;

public class DuplicatesInString {
	public static void main(String args[]){
		//String s1="Hi this is kiran",s2="";
		int[] arr={1,5,9,3,4,5,2,5,9,10,2};
		int[] arr1=removeDuplicates(arr);
		for(int i=0;i<arr1.length;i++){
			System.out.print(arr1[i]);
		}
		
		
	}
	
	public static int[] removeDuplicates(int[] arr) { 
        int end = arr.length;

        for (int i = 0; i < end; i++) {
            for (int j = i + 1; j < end; j++) {
                if (arr[i] == arr[j]) {                  
                    int shiftLeft = j;

                    for(int k = j + 1; k < end; k++) {
                        arr[shiftLeft] = arr[k];
                        shiftLeft++;
                    }

                    end--;
                    //j--;
                }
            }
        }

        int[] whitelist = new int[end];

        for (int i = 0; i < end; i++) {
            whitelist[i] = arr[i];
        }

        return whitelist;
    }

}
