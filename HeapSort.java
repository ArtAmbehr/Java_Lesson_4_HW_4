public class HeapSort {
    public static void main(String args[]){
        int[] arr = {7000, 4, 1, 1874, 11, -18, -1, 159};
        heapSort(arr);
        System.out.println("HeapSort");
        for(int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");
  
}

private static void heapSort(int[] arr){
    int n = arr.length;
    for (int i = n / 2 - 1; i >= 0; i--)
        heapify(arr, i, n);

    for(int i = n - 1; i >= 0; i--){ 
        int temp = arr[i];
        arr[i] = arr[0];
        arr[0] = temp;

        heapify(arr, 0, i);
    } 
}
  