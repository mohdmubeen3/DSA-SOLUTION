import java.util.Scanner;
public class HackerRank {
    public static void main(String[] args) {
        // Your code here
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while(t-- > 0) {
            int n = scanner.nextInt();
        long sum = 0;
        for(int i = 1; i < n; i++){
            if(i % 3 == 0 || i % 5 == 0){
                sum = sum + i;
            }
        }
        System.out.println(sum);+
        }
    }
}
