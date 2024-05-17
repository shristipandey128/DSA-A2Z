
// class Solution{
// {The code is right with logic but dont know why giving TLE in next segment of code i am going to use 
// array instead of arrayList as in array List we are adding element one by one 
// but in simple we just copy the element 
//     void merge(int arr[], int l, int m, int r)
//     {
//          // Your code here
//         //  int n= arr.length;
//         List<Integer> temp= new ArrayList<>();
//         //  int m=left+(right-left)/2;
//         int left=l;
//          int right=m+1;
//          while(left<=m && right<=r){
//              if(arr[left]<=arr[right]){
//                  temp.add(arr[left]);
             
//              left++;
//          }
//          else{
//              temp.add(arr[right]);
//              right++;
//          }
//          }
//          while(left<=m){
//              temp.add(arr[left]);
//              left++;
//          }
//          while(right<=r){
//              temp.add(arr[right]);
//              right++;
//          }
         
//          for(int i=l;i<=r;i++){
//              arr[i]=temp.get(i-l);
//          }
        
         
//     }
//     void mergeSort(int arr[], int l, int r)
//     {
//         //code here
//         while(r>l){
//          int m=l+(r-l)/2;
//          mergeSort(arr, l, m);
//          mergeSort(arr, m+1,r);
//          merge(arr,l, m,r);
         
//     }
// }

// }

// optimal solution 

// class Solution {
//     void merge(int arr[], int l, int m, int r) {
//         // Calculate lengths of two subarrays to be merged
//         int n1 = m - l + 1;
//         int n2 = r - m;

//         // Create temporary arrays
//         int left[] = new int[n1];
//         int right[] = new int[n2];

//         // Copy data to temporary arrays
//         for (int i = 0; i < n1; ++i)
//             left[i] = arr[l + i];
//         for (int j = 0; j < n2; ++j)
//             right[j] = arr[m + 1 + j];

//         // Merge the temporary arrays back into arr[l..r]
//         int i = 0, j = 0;

//         // Initial index of merged subarray array
//         int k = l;
//         while (i < n1 && j < n2) {
//             if (left[i] <= right[j]) {
//                 arr[k] = left[i];
//                 i++;
//             } else {
//                 arr[k] = right[j];
//                 j++;
//             }
//             k++;
//         }

//         // Copy the remaining elements of left[], if any
//         while (i < n1) {
//             arr[k] = left[i];
//             i++;
//             k++;
//         }

//         // Copy the remaining elements of right[], if any
//         while (j < n2) {
//             arr[k] = right[j];
//             j++;
//             k++;
//         }
//     }

//     void mergeSort(int arr[], int l, int r) {
//         if (l < r) {
//             // Find the middle point
//             int m = l + (r - l) / 2;

//             // Sort first and second halves
//             mergeSort(arr, l, m);
//             mergeSort(arr, m + 1, r);

//             // Merge the sorted halves
//             merge(arr, l, m, r);
//         }
//     }

  
// }
