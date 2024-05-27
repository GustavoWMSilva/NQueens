import java.util.LinkedList;
import java.util.List;

/**
 * Backtracking
 */

public class NQueens {

    private static int[]x;
    private static List<int[]> solutions;
    private static boolean found;
    public static void main(String[] args) {
        int n = 8; // Acima de 30 já começa a ficar lento

        solutions = new LinkedList<>();
        x = new int [n+1];
        found = false;
        
        nQueens(1,n,false);
            
        printSolutions();
        System.out.println("Soluçoes Encontradas = "+solutions.size());
        
    }

    public static boolean place(int k, int i){
        for (int j = 1; j < k; j++){
            if(x[j]==i || 
            (Math.abs(x[j] - i)) == (Math.abs(j - k)) ){
                return false;
            }
        }
        
        return true;
    }
    
    public static void nQueens(int k, int n, boolean first){
    if(found && first) return; // se encontrou uma solucao

        for(int i = 1; i <= n; i++){
            if (place(k,i)){
                x[k] = i;
                if (k == n){
                    solutions.add(x.clone());
                    found = true;
                } else {
                    nQueens(k+1, n, first);
                }
            }
        }
        
    }

    public static void printSolutions() {
        for (int[] solution : solutions) {
            for (int i = 1; i < solution.length; i++) {
                System.out.print(solution[i] + " ");
            }
            System.out.println();
        }
    }

}