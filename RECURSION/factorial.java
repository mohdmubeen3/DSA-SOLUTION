package RECURSION;


public class factorial {
    int fact(int n) {
        if(n == 0 || n == 1) {
            return 1;
        } else {

            return n * fact(n-1);
        }
        
    }

    

public static void main(String args[]) {
    int n = 5 ;
    factorial ob = new factorial();
    System.out.println(ob.fact(n));
}
}
 