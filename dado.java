public class dado {

    public static void main(String[] args) {
        
        int caras;
        caras = (int)(Math.random()*6+1);
        System.out.printf("La cara del dado es %d", caras);
    }
    
}
// Otra forma de hacerlo seria
/*
public class dado {

    public static void main(String[] args) {

        System.out.println(int)(Math.random(*6+1));
    }
    
}
*/
/*
Me saldran 10 numeros entre el 1 al 6
public class dado {

    public static void main(String[] args) {

        for (int i = 0; i <10; i++){
            System.out.print((int)(Math.random()*6+1)+ " ");

        }
    }
    
}
*/