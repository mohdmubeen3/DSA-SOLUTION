package RECURSION;

public class sumOfN {
    public int sum(int n) {
        if(n == 0){
            return 0;
        }
        return n + sum(n-1);
    }

    public static void main(String args[]){
        int n = 5;
        sumOfN obj = new sumOfN();
        int result = obj.sum(n);
        System.out.println(result);
    }
    
}
