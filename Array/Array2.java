package arrays2;
import java.util.Scanner;
public class Arrays2 {
 public static void main(String[] args) {
 int[] array = new int[15];
 int tope = 0, opcion;
 Scanner entrada = new Scanner(System.in);
 do {
 System.out.println("1. Insertar datos");
 System.out.println("2. Mostrar datos");
 System.out.println("3. Mostrar el valor más alto");
 System.out.println("4. Buscar dato");
 System.out.println("5. Ordenar datos");
 System.out.println("6. Borrar elemento");
 System.out.println("7. Salir");
 opcion = entrada.nextInt();
 switch (opcion) {
 case 1:
 tope = insertarDatos(array, tope, entrada);
 break;
 case 2:
 mostrarDatos(array, tope);
 break;
 case 3:
 System.out.println("El valor mayor es: " + maxArray(array, tope));
 break;
 case 4:
 buscarDato(array, tope, entrada);
 break;
 case 5:
 ordenarAsc(array, tope);
 break;
 case 6:
 tope = borrarElemento(array, tope, entrada);
 break;
 case 7:
 System.out.println("Adiós");
 break;
 default:
 System.out.println("Opción no válida");
 }
 } while (opcion != 7);
 }
 public static int borrarElemento(int[] array, int tope, Scanner entrada) {
 System.out.print("¿Qué posición quieres borrar?: ");
 int posicion = entrada.nextInt();
 if (posicion<tope){
 for (int i = posicion; i < tope - 1; i++) {
 array[i] = array[i + 1];
 }
 mostrarDatos(array, --tope);
 return tope;
 }
 else{
 System.out.println("Esa posición no existe");
 return tope;
 }

 }
 public static void ordenarAsc(int[] array, int tope) {
 int aux;
 for (int i = 1; i < tope; i++) {
 for (int j = 0; j < tope - i; j++) {
 if (array[j] > array[j + 1]) {
 aux = array[j];
 array[j] = array[j + 1];
 array[j + 1] = aux;
 }
 }
 }
 mostrarDatos(array, tope);
 }
 public static void buscarDato(int[] array, int tope, Scanner entrada) {
 System.out.print("¿Cuál es el valor a buscar?: ");
 int dato = entrada.nextInt();
 boolean encontrado = false;
 int i = 0;
 while (i < tope && !encontrado) {
 if (dato == array[i]) {
 encontrado = true;
 } else {
 i++;
 }
 }
 if (encontrado) {
 System.out.println("Encontrado en la posición: " + i);
 } else {
 System.out.println("No encontrado");
 }
 }
 public static int insertarDatos(int[] array, int tope, Scanner entrada) {
 int opcion;
 do {
 System.out.print("Insertar posición [" + tope + "]: ");
 array[tope] = entrada.nextInt();
 tope++;
 System.out.println("1. seguir insertando");
 System.out.println("2. Salir");
 opcion = entrada.nextInt();
 } while (opcion != 2 && tope < array.length);
 return tope;
 }
 public static void mostrarDatos(int[] array, int tope) {
 System.out.println("Los datos son:");
 for (int i = 0; i < tope; i++) {
 System.out.print(array[i] + "\t");
 }
 System.out.println("");
 }
 public static int maxArray(int[] array, int tope) {
 int max = array[0];
 for (int i = 1; i < tope; i++) {
 if (array[i] > max) {
 max = array[i];
 }
 }
 return max;
 }
}
