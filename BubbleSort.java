class Solution
{
    //Function to sort the array using bubble sort algorithm.
	public static void bubbleSort(int arr[], int n)
    {
        
    //Brute force way of Bubble sort time complexity is O(n^2)
        // for(int i=0;i<n-1;++i){
        //     for(int j=0;j<n-i-1;++j){
        //         if(arr[j]>arr[j+1]){
        //             int temp=arr[j];
        //             arr[j]=arr[j+1];
        //             arr[j+1]=temp;
        //         }
        //     }
            
            
        // }
        
        // The optimised algorithm of Bubble sort
        
        // To optimise this let introduce a variable swapped
        int pass, i,temp;
         boolean swapped=true;
       for ( pass = n - 1; pass >= 0 && swapped; pass--) {
            swapped=false;
            for( i=0;i<=pass-1;i++){
                if(arr[i]>arr[i+1]){
                    temp=arr[i];
                    arr[i]=arr[i+1];
                    arr[i+1]=temp;
                    swapped=true;
                }
            }
        }
}}