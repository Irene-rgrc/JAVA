// Predecir al azar la fecha en la que se acaba el mundo que debe ser superior a la fecha actual
public class fechas {
    public static void main(String[] args) {

        int dia, mes, anno;
        String diaStr, mesStr; 

        dia = (int)(Math.random()*31+1);
        mes = (int)(Math.random()*12+1);
        anno = (int)2021 + (int)(Math.random()*2021+1);

        if (diaStr.length() < 2){
            diaStr = "0"+dia;
        }
        else {
            diaStr = ""+dia;
        }
        if (mesStr.length() < 2) {
            mesStr = "0"+mes;
        }
        else {
            mesStr = ""+mes;
        }

        System.out.printf("La fecha en la que el mundo se acaba es: ", diaStr, mesStr, anno);

        }

        }
    
    