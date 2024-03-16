public class MissingTwoNumbersFromArray {
    // Function to find missing numbers in array
    static  int[] MissingValues( int[] arr ){
        int size = arr.length+2;
        int sum1 = 0;
        int[] missValue = new int[2];
        int sum2 = size * (size + 1)/2;
        for( int i =0; i< arr.length; i++){
            sum1 += arr[i];
        }
        int miss = sum2 -sum1;
        for(int i = 1; i<=6;i++){
            for(int j = 1;j<=6;j++){
                if(i + j == miss){
                    if(search(i,arr)||search(j,arr)){
                        continue;
                    }
                    else {
                        missValue[0] = i;
                        missValue[1] = j;
                    }
                }
            }

        }
        return  missValue;
    }

    static boolean search(int num,int[] arr){
        for (int i=0;i<arr.length;i++){
            if(arr[i] == num)
                return true;
        }
        return false;
    }

    public static void main(String[] args) {
        int[] arr = {2,5,3,6};
        int[] miss = MissingValues(arr);
        for( int i =0; i< miss.length; i++){
            System.out.println(miss[i]);
        }
    }
}
