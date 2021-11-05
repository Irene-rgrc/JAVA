public class Prac7_3 {
    
    public static int mult (int m, int n){
        if (n>0){
            return m + mult(m,n-1);
        }//fin si
        return m;
    }
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int suma = mult(3,4);
        System.out.println("La multiplicacion es " + suma);
    }
    
}
