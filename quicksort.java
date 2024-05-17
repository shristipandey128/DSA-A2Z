class Solution
{
    //Function to sort an array using quick sort algorithm.
    static void quickSort(int arr[], int low, int high)
    {
        // code here
         if(low<high){
            int p = partition(arr,low,high);
            quickSort(arr,low,p-1);
            quickSort(arr,p+1,high);
        }
       
        
        
    }
    static int partition(int arr[], int low, int high)
    {
        // your code here
    int pivot=arr[low];
    int left=low+1,right=high;
 while(right>=left){
  if (left <= right && arr[left] <= pivot)  {
      left++;
  } 
  else if(arr[left]>=pivot && arr[right]<=pivot){
      int temp=arr[left];
      arr[left]=arr[right];
      arr[right]=temp;
  }
  if(left <= right && arr[right] > pivot){
      right--;
  }
 }
 // Swap pivot with arr[right] to place pivot in the correct position
        arr[low] = arr[right];
        arr[right] = pivot;
 return right;
    } 
}