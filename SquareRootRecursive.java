public class Main
{
    public static int SquareRoot(int val,int low,int high){
        int mid = low + ((high-low)/2);
        if(val == 0 || val == 1)
            return val;
        if(low == mid || high == mid)
            return mid;
        if(mid * mid > val)
            return SquareRoot(val,low,mid);
        else(mid * mid < val)
            return SquareRoot(val,mid,high);
            
    }
	public static void main(String[] args) {
	    int i =0;
	    for(i=0;i<101;i++){
	        System.out.println(i + "  " +SquareRoot(i,0,i));
	    }
	}
}
