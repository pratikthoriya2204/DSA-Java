public class selection_SORT {
    public static void printArray(int arr[]) {
        for (int i = 0; i <= arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[] = {5,8,36,7,78,5,1,3};

        //time complexity = O(n^2)
        // Selection Sort
        for (int i = 0; i<arr.length-1;i++){
            int min=i;
            for (int j=i+1;j<arr.length;j++){
                if(arr[j] < arr[min]){
                    min=j;
                }
            }
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }
        printArray(arr);
    }
}

// output :---   1 3 5 5 7 8 36 78