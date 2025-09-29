package RECURSION;

public class TowerOfHanaoi {
    static int moves = 0;

    public static void Hanoi(int n, char source, char aux, char dest) {
       
        if (n == 1) {
            System.out.println("Move disk 1 from " + source + " to " + dest);
            moves++;
            return;
        }

         
        Hanoi(n - 1, source, dest, aux);
 
        System.out.println("Move disk " + n + " from " + source + " to " + dest);
        moves++;

         
        Hanoi(n - 1, aux, source, dest);
         
    }

    public static void main(String[] args) {
        int n = 4;  
        Hanoi(n, 'A', 'B', 'C');
        System.out.println(moves);
    }
}
