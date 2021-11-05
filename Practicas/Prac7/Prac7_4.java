public class Prac7_4 {
    
    public static int pot (int b, int e) {
        if (e>0){
            return b + pot(b,e-1);
        }//fin si
        return 1;  
    }
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int potencia = pot(2,4);
        System.out.println("La potencia es " + potencia);
    }
    
}
