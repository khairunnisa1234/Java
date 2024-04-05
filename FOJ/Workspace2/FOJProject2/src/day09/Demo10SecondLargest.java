package day09;

public class Demo10SecondLargest {
    
    
    public static int findSecondLargest(int arr[]){
        
        int secondlargest = arr[0];
        int largest = arr[0];
        
        for(int i = 1; i < arr.length; i++){
            if(largest < arr[i]){
                secondlargest = largest;
                largest = arr[i];
                
            }
            else if(secondlargest < arr[i] && arr[i] != largest){
                secondlargest = arr[i];
            }
        }
        return secondlargest;
        
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        
        int arr1[] = {10,20,30,40};
        int arr2[] = {43,656,87};
        int arr3[] = {480,350};
        
        System.out.println(findSecondLargest(arr1));
        System.out.println(findSecondLargest(arr2));
        System.out.println(findSecondLargest(arr3));


    }

}
