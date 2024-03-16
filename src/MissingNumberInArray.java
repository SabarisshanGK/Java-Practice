

public class MissingNumberInArray {
    // Function to find missing number
    static int MissingValue( int[] arr ){
        int n = arr.length +1;
        int missingNumber = 0;
        int sum1 = 0;
        int sum2 = 0;
        sum2 = n * (n+1)/2;
        for(int i = 0; i < arr.length;i++){
            sum1 +=arr[i];}
        missingNumber = sum2 - sum1;
        return missingNumber;
    }

    // Main Function
    public static void main(String[] args) {
        int[] arr ={1,2,4,3};
        int missing= MissingValue(arr);
        System.out.println("The missing Value is "+missing);
    }
}
