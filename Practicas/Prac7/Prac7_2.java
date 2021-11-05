public class Prac7_2 {
    
    static int mcd(int a, int b) {
        if (b == 0) {
            return a;
        } else {
            return mcd(b, a % b);
        }//fin si
    }//fin mcd
    //Imprime un numero digito a digito

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //int traza = mcd(30,42);
        System.out.println(mcd(30,42));
    }
    
}
