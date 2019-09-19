public class Main
{
    public static int SquareRoot(int val){
        int i;
        if(val == 0 || val == 1)
            return val;
        for(i=1;i*i<=val;i++);
        return i-1;
    }
	public static void main(String[] args) {
	    int i =0;
	    for(i=0;i<101;i++){
	        System.out.println(i + "  " +SquareRoot(i));
	    }
	}
}
