class Solution
 {
//     insertion sort with time complexity O(n^2)
  static void insert(int arr[], int i)
  {
      // Inserting arr[i] into the sorted part of the array
      int key = arr[i];
      int j = i - 1;

      // Move elements of arr[0..i-1], that are greater than key,
      // to one position ahead of their current position
      while (j >= 0 && arr[j] > key) //(i-1>=0 && arr[i-1]>arr[i])
      {
          arr[j + 1] = arr[j];
          j = j - 1;
      }
      arr[j + 1] = key;
  }

  // Function to sort the array using insertion sort algorithm.
  public void insertionSort(int arr[], int n)
  {
      for (int i = 1; i < n; i++) {
          insert(arr, i);
      }
  }
// }
// Best Case Time Complexity: 

// // The best case occurs if the given array is already sorted. And if the given array is already 
// sorted, the outer loop will only run and the inner loop will run for 0 times. So, our overall
// // time complexity in the best case will boil down to O(N), where N = size of the array.

