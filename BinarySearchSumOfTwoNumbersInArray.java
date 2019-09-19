public class Main
{
    public static boolean SumOfNumbers(int arr[],int left,int right,int sum){
        int sumNo = arr[left] + arr[right];
        if(left == right || left>right)
            return false;
        if(sumNo < sum)
            return SumOfNumbers(arr,left+1,right,sum);
        else if(sumNo > sum)
            return SumOfNumbers(arr,left,right-1,sum);
        else
            return true;
    }
	public static void main(String[] args) {
	    int arr[] ={1,2,4,6,8,9,11,23}; 
	    System.out.println(SumOfNumbers(arr,0,arr.length-1,15));
	    System.out.println(SumOfNumbers(arr,0,arr.length-1,16));
	}
}
