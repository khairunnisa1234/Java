package day09Assignmnet;
public static void reverseArray(int arr[]) {
    int start = 0;
    int end = arr.length - 1;
    while (start < end) {
        // Swap elements at start and end indices
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
        // Move start towards the end of the array
        start++;
        // Move end towards the start of the array
        end--;
    }
}
public static void main(String[] args) {
    int arr[] = new int[] {10,20,30,40,50,60};
    
    reverseArray(arr);
    
    for(int i = 0; i < arr.length; i++){
        System.out.println(arr[i]);
    }
}
}
