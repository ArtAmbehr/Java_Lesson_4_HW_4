public class HeapSort {
    public static void main(String args[]){
        int[] arr = {7000, 4, 1, 1874, 11, -18, -1, 159};
        heapSort(arr);
        System.out.println("HeapSort");
        for(int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");
  
}
