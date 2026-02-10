public class PrintSumofNIntegers {
    void printSum(int i,int n, int sum){
        if(i==n){
            sum += i;
            System.out.println(sum);
            return ;
        }
        sum = sum +i;
        printSum(i+1,n,sum);
        
    }
    public static void main(String args[]){
        PrintSumofNIntegers obj = new PrintSumofNIntegers();
        obj.printSum(1,5,0);
    }
}
