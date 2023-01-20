
package git;

public class Git {
    static int tabuada (int numero){
        int mult =0;
        for (int i = 1; i <= 10; i++) {
            mult = numero * i;
            
            System.out.println(numero + " * " + i + " = " + mult);
        }
        return mult;
    }
    public static void main(String[] args) {
        int num = 6;
        tabuada(num);
    }
    
}
