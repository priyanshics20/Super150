package Dynamic_programming;

public class Fibo {
    public static void main(String[] args) {
        int n=45;
        System.out.println(fib(n));
    }
    //recursive solution
    public static int fib(int n){
        if(n==0|| n==1){
            return n;
        }
        int f1=fib(n-1);
        int f2 = fib(n-2);
        return f1+f2;
    }

    //top-down approach - memoaization
    public static int fib_TopDown(int n, int dp[]){
        if(n==0|| n==1){
            return n;
        }
        if(dp[n]!=0){
            return dp[n];
        }
        int f1=fib_TopDown(n-1,dp);
        int f2 = fib_TopDown(n-2,dp);
        return dp[n]=f1+f2;
    }

    //bottom up - tabulation
    public static int fibBu(int n){
        int []dp  =new int[n+1];
        dp[0]=0;
        dp[1]=1;
        for(int i=2;i<dp.length;i++){
            dp[i]=dp[i-1]+dp[i-2];
        }
        return dp[n];
    }

}
