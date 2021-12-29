import java.util.Scanner;
import java.io.*;

//CLASES
class Potion implements Serializable {

    int id;
    String name, description;
    int type;
    int points;
}

class Item implements Serializable {

    int id;
    String name, description;
    int type;
    int experience;
}

public class PracGame {

    public static void main(String[] args) throws FileNotFoundException, ClassNotFoundException, IOException {

        // CONSTANTES
        final int MAXPOTIONS = 10, MAXITEMS = 5;
        final int EXPERIENCE = 10;

        // DEFINICION DE VARIABLES
        Scanner entrada = new Scanner(System.in);
        int option;
        int boundPotions = 0, boundItems = 0;
        int race;
        int puntos = 0;

        // ARRAYS
        Potion[] listPotions = new Potion[MAXPOTIONS];
        for (int i = 0; i < listPotions.length; i++) {
            listPotions[i] = new Potion();
        }

        Item[] listItems = new Item[MAXITEMS];
        for (int i = 0; i < listItems.length; i++) {
            listItems[i] = new Item();
        }

        System.out.println(
                "---------------------------------------------------------------------------------------------------");
        System.out.println(
                "Trabajo realizado por: Irene Rodríguez, Andrea Gil, Ghaudy Bellido, Cristina Valero, Sandra Martín");
        System.out.println(
                "---------------------------------------------------------------------------------------------------");
        System.out.println("Bienvenido a Inhhildur, ¿qué deseas hacer?");

        do {
            System.out.println("Menu : ");
            System.out.println("1. Insertar pócima o ítem.");
            System.out.println("2. Insertar pócima o ítem en posición determinada.");
            System.out.println("3. Usar pócima.");
            System.out.println("4. Tirar un ítem.");
            System.out.println("5. Mostrar pócimas e ítems.");
            System.out.println("6. Mostrar ítems ordenados alfabéticamente por el nombre del primer elemento.");
            System.out.println("7. Buscar pócima e ítem.");
            System.out.println("8. Subida de nivel. ");
            System.out.println("9. Guardar todas las pócimas e ítems a fichero de texto.");
            System.out.println("10. Cargar situación de la última partida desde fichero de texto.");
            System.out.println("11. Guardar estado del PJ a disco.");
            System.out.println("12. Cargar PJ.");
            System.out.println("13. Terminar");
            System.out.println("Elija una opción: ");

            option = entrada.nextInt();

            switch (option) {

                case 1:
                    System.out.println("+++INSERTAR PÓCIMA O ÍTEM+++");
                    int opcion;
                    do {
                        System.out.println("---¿Qué desea introducir?---");
                        System.out.println("1 Para pócimas  2 Para items  3 Para Salir");
                        opcion = entrada.nextInt();
                        switch (opcion) {
                            case 1:
                                System.out.println("---INTRODUCIR PÓCIMA---");
                                boundPotions = crearPociones(listPotions, boundPotions, entrada);
                                break;
                            case 2:
                                System.out.println("---INTRODUCIR ITEM---");
                                boundItems = crearItems(listItems, boundItems, entrada);
                                break;
                            case 3:
                                System.out.println("+++SALIENDO+++");
                                break;
                            default:
                                System.out.println("La opción introducida es incorrecta.");
                        }
                    } while (opcion != 3);

                    break;

                case 2:
                    System.out.println("+++INSERTAR PÓCIMA O ÍTEM EN POSICIÓN DETERMINADA+++");

                    System.out.println("---Cual es la raza de tu personaje?---");
                    System.out.println("1:Humano  2:Orco  3:Elfo  4:Enano");
                    race = entrada.nextInt();
                    switch (race) {
                        case 1:
                            System.out.println("---Humano---");
                            System.out.println(
                                    "No tienes esta ventaja, vuelve al menú principal y selecciona Crear pócima o ítem");

                            break;
                        case 2:
                            System.out.println("---Orco---");
                            System.out.println(
                                    "No tienes esta ventaja, vuelve al menú principal y selecciona Crear pócima o ítem");

                            break;
                        case 3:
                            System.out.println("---Elfo---");
                            System.out.println("Que vas a anadir? 1-Pocima 2-Item");
                            int a = entrada.nextInt();
                            if (a == 1) {
                                insertarPociones(listPotions, boundPotions, entrada);
                            } else if (a == 2) {
                                insertarItems(listItems, boundItems, entrada);
                            } else {
                                System.out.println("Error, no se encuentra dentro del rango permitido");
                            }

                            break;
                        case 4:
                            System.out.println("---Enano---");
                            System.out.println("Que vas a anadir? 1-Pocima 2-Item");
                            int b = entrada.nextInt();
                            if (b == 1) {
                                insertarPociones(listPotions, boundPotions, entrada);
                            } else if (b == 2) {
                                insertarItems(listItems, boundItems, entrada);
                            } else {
                                System.out.println("Error, no se encuentra dentro del rango permitido");
                            }

                            break;
                        default:
                            System.out.println("La opción introducida es incorrecta.");
                    }
                    break;

                case 3:
                    System.out.println("+++USAR PÓCIMA+++");
                    puntos = usarPocion(listPotions, boundPotions);
                    break;

                case 4:
                    System.out.println("+++TIRAR UN ITEM+++");
                    System.out.println("Que vas a tirar? 1-Pocima 2-Item");
                    int a = entrada.nextInt();
                    if (a == 1) {
                        System.out.println("Introduzca el identificador de la pocima: ");
                        int id = entrada.nextInt();
                        boundPotions = eliminarPociones(listPotions, boundPotions, id);
                    } else if (a == 2) {
                        System.out.println("Introduzca el identificador del item: ");
                        int id = entrada.nextInt();
                        boundItems = eliminarItems(listItems, boundItems, id);
                    } else {
                        System.out.println("Error, no se encuentra dentro del rango permitido");
                    }
                    break;

                case 5:
                    System.out.println("+++MONSTRAR PÓCIMAS E ITEMS+++");
                    mostrarPocimas(listPotions, boundPotions);
                    mostrarItems(listItems, boundItems);

                    break;

                case 6:
                    System.out
                            .println("+++MOSTRAR ITEMS ORDENADOS ALFABETICAMENTE POR EL NOMBRE DEL PRIMER ELEMNETO+++");
                    ordenarAlfabaItems(listItems, boundItems);
                    ordenarAlfabaPocima(listPotions, boundPotions);
                    break;

                case 7:
                    System.out.println("+++BUSCAR POCIMA O ITEM+++");
                    buscarPocion(listPotions, boundPotions, entrada);
                    buscarItem(listItems, boundItems, entrada);

                    break;

                case 8:
                    System.out.println("+++SUBIDA DE NIVEL+++");
                    // subirNivel(listPotions, boundPotions, puntos);
                    for (int i = 0; i < boundPotions; i++) {
                        listPotions[i].points = ((listPotions[i].points * puntos / 100) + listPotions[i].points);
                        if (listPotions[i].points < 0) {
                            listPotions[i].points = 0;
                        } else if (listPotions[i].points > 10) {
                            listPotions[i].points = 10;
                        }
                        System.out.println("El DJ  ha subido de nivel " + listPotions[i].points);
                    }
                    break;

                case 9:
                    System.out.println("+++GUARDAR TODAS LAS PÓCIMAS E ÍTEMS A FICHERO DE TEXTO+++");
                    System.out.println("1 Para pócimas  2 Para items  3 Ambos 4 Para Salir");
                    opcion = entrada.nextInt();
                    switch (opcion) {
                        case 1:
                            System.out.println("---Guardar pocima en txt---");
                            ficheroPotion(listPotions, boundPotions);
                            break;
                        case 2:
                            System.out.println("---Guardar item en txt---");
                            ficheroItems(listItems, boundItems);
                            break;
                        case 3:
                            System.out.println("--- GUARDAR POCIMA E ITEM ---");
                            ficheroPotion(listPotions, boundPotions);
                            ficheroItems(listItems, boundItems);
                            break;
                        case 4:
                            System.out.println("+++SALIENDO+++");
                            break;
                        default:
                            System.out.println("La opción introducida es incorrecta.");
                    }
                    break;

                case 10:
                    System.out.println("+++CARGAR SITUACIÓN DE LA ÚLTIMA PARTIDA DESDE FICHERO DE TEXTO+++");
                    leerFicheroPotions();
                    leerFicheroItems();
                    break;

                case 11:
                    System.out.println("+++GUARDAR ESTADO DEL PJ AL DISCO+++");
                    guardarEstado(listPotions, boundPotions, listItems, boundItems);
                    break;

                case 12:
                    System.out.println("+++CARGAR PJ+++");
                    leerEstado();
                    break;

                default:
                    System.out.println("Hasta luego.");
            }

        } while (option != 13);
    }

    // CASE 1

    static int crearPociones(Potion[] listPotions, int boundPotions, Scanner entrada) {
        listPotions[boundPotions].id = boundPotions + 1;
        System.out.println("El identificador de la pocion es: " + listPotions[boundPotions].id);
        entrada.nextLine();
        System.out.println("Introduzca el nombre de la pocima");
        listPotions[boundPotions].name = entrada.nextLine();
        System.out.println("Introduzca la descripción de la pocima");
        listPotions[boundPotions].description = entrada.nextLine();
        System.out.println("Introduzca el tipo de pocima: 1- 2- 3-");
        listPotions[boundPotions].type = entrada.nextInt();
        System.out.println("Introduzca la experiencia del item");
        listPotions[boundPotions].points = entrada.nextInt();
        return boundPotions + 1;
    }

    static int crearItems(Item[] listItems, int boundItems, Scanner entrada) {
        System.out.println("El identificador del item es" + (boundItems + 1));
        listItems[boundItems].id = (boundItems + 1);
        entrada.nextLine();
        System.out.println("Introduzca el nombre del item");
        listItems[boundItems].name = entrada.nextLine();
        System.out.println("Introduzca la descripción del item");
        listItems[boundItems].description = entrada.nextLine();
        System.out.println("Introduzca el tipo del item: 1-Arma 2-Armadura 3-Miscelaneo");
        listItems[boundItems].type = entrada.nextInt();
        System.out.println("Introduzca la experiencia del item");
        listItems[boundItems].experience = entrada.nextInt();
        return boundItems + 1;
    }

    // CASE 2

    static void insertarPociones(Potion[] listPotions, int boundPotions, Scanner entrada) {
        System.out.println("Introduzca el identificador de la pocima: ");
        int id = entrada.nextInt();
        id = id - 1;
        for (int i = boundPotions; i >= id; i--) {
            listPotions[i + 1].id = (boundPotions + 2);
            listPotions[i + 1].name = listPotions[i].name;
            listPotions[i + 1].description = listPotions[i].description;
            listPotions[i + 1].type = listPotions[i].type;
            listPotions[i + 1].points = listPotions[i].points;
        }
        listPotions[id].id = (id + 1);
        entrada.nextLine();
        System.out.println("Introduzca el nombre de la pocima");
        listPotions[id].name = entrada.nextLine();
        System.out.println("Introduzca la descripción de la pocima");
        listPotions[id].description = entrada.nextLine();
        System.out.println("Introduzca el tipo de pocima: 1- 2- 3-");
        listPotions[id].type = entrada.nextInt();
        System.out.println("Introduzca la experiencia del item");
        listPotions[id].points = entrada.nextInt();
        boundPotions++;
    }

    static void insertarItems(Item[] listItems, int boundItems, Scanner entrada) {
        System.out.println("Introduzca el identificador del item: ");
        int id = entrada.nextInt();
        id = id - 1;
        for (int i = boundItems; i >= id; i--) {
            listItems[i + 1].id = (boundItems + 2);
            listItems[i + 1].name = listItems[i].name;
            listItems[i + 1].description = listItems[i].description;
            listItems[i + 1].type = listItems[i].type;
            listItems[i + 1].experience = listItems[i].experience;
        }
        listItems[id].id = (id + 1);
        entrada.nextLine();
        System.out.println("Introduzca el nombre del item");
        listItems[id].name = entrada.nextLine();
        System.out.println("Introduzca la descripción del item");
        listItems[id].description = entrada.nextLine();
        System.out.println("Introduzca el tipo de item: 1- 2- 3-");
        listItems[id].type = entrada.nextInt();
        System.out.println("Introduzca la experiencia del item");
        listItems[id].experience = entrada.nextInt();
        boundItems++;
    }

    // CASE 3
    static int usarPocion(Potion[] listPotions, int boundPotions) {
        int punto = listPotions[0].points;
        System.out.println("Has usado la pócima: " + listPotions[0].name);
        System.out.println("Con una descripcion de: " + listPotions[0].description);
        System.out.println("El tipo de pocima de la pócima es: " + listPotions[0].type);
        System.out.println("Con una puntuacion de: " + listPotions[0].points);
        boundPotions = eliminarPociones(listPotions, boundPotions, 1);
        return punto;
    }

    // CASE 4 -> ARREGLAR LO DE NULL Y 0 AL BORRAR LAS POSICIONES

    static int eliminarPociones(Potion[] listPotions, int boundPotions, int id) {
        for (int i = (id - 1); i <= boundPotions; i++) {
            listPotions[i].name = listPotions[i + 1].name;
            listPotions[i].description = listPotions[i + 1].description;
            listPotions[i].type = listPotions[i + 1].type;
            listPotions[i].points = listPotions[i + 1].points;
        }
        return (boundPotions - 1);
    }

    static int eliminarItems(Item[] listItems, int boundItems, int id) {
        for (int i = (id - 1); i <= boundItems; i++) {
            listItems[i].name = listItems[i + 1].name;
            listItems[i].description = listItems[i + 1].description;
            listItems[i].type = listItems[i + 1].type;
            listItems[i].experience = listItems[i + 1].experience;
        }
        return (boundItems - 1);
    }

    // CASE 5
    static void mostrarPocimas(Potion[] listPotions, int boundPotions) {
        System.out.println("El número de pocimas son:" + (boundPotions));
        System.out.println("La pócima con mayor número de puntos es: " + maxP(listPotions, boundPotions));
        System.out.println("La pócima con mayor número de puntos es: " + minP(listPotions, boundPotions));
        for (int i = 0; i < boundPotions; i++) {
            System.out.println("El nombre de la pócima: " + listPotions[i].name);
            System.out.println("La descripción de la pócima: " + listPotions[i].description);
            System.out.println("El tipo de pocima de la pócima: " + listPotions[i].type);
            System.out.println("La puntuación de la pócima: " + listPotions[i].points);
        }
        System.out.println("");
    }

    static void mostrarItems(Item[] listItems, int boundItems) {
        System.out.println("El número de ítems son:" + (boundItems));
        System.out.println("El ítem con mayor experiencia es: " + maxI(listItems, boundItems));
        System.out.println("El ítem con menor experiencia es: " + minI(listItems, boundItems));
        for (int i = 0; i < boundItems; i++) {
            System.out.println("El nombre de la pócima: " + listItems[i].name);
            System.out.println("La descripción de la pócima: " + listItems[i].description);
            System.out.println("El tipo de pocima de la pócima: " + listItems[i].type);
            System.out.println("La puntuación de la pócima: " + listItems[i].experience);
        }
        System.out.println("");
    }

    static int maxP(Potion[] listPotions, int boundPotions) {
        int max = listPotions[0].points;
        for (int i = 1; i < boundPotions; i++) {
            if (listPotions[i].points > max) {
                max = listPotions[i].points;
            }
        }
        return max;
    }

    static int maxI(Item[] listItems, int boundItems) {
        int max = listItems[0].experience;
        for (int i = 1; i < boundItems; i++) {
            if (listItems[i].experience > max) {
                max = listItems[i].experience;
            }
        }
        return max;
    }

    static double minP(Potion[] listPotions, int boundPotions) {
        double peor = listPotions[0].points;
        for (int i = 1; i < boundPotions; i++) {
            if (listPotions[i].points < peor) {
                peor = listPotions[i].points;
            }
        }
        return peor;
    }

    static double minI(Item[] listItems, int boundItems) {
        double peor = listItems[0].experience;
        for (int i = 1; i < boundItems; i++) {
            if (listItems[i].experience < peor) {
                peor = listItems[i].experience;
            }
        }
        return peor;
    }

    // CASE 6
    static void ordenarAlfabaItems(Item[] listItems, int boundItems) {
        String temp;
        for (int i = 0; i < boundItems; i++) {
            for (int j = i + 1; j < boundItems; j++) {
                // to compare one string with other strings
                if (listItems[i].name.compareToIgnoreCase(listItems[j].name) > 0) {
                    // swapping
                    temp = listItems[i].name;
                    listItems[i].name = listItems[j].name;
                    listItems[j].name = temp;
                }
            }
        }
        // print output array
        System.out.println("Los items alfabeticamente son: ");
        for (int i = 0; i < boundItems; i++) {
            System.out.println(listItems[i].name);
        }
    }

    static void ordenarAlfabaPocima(Potion[] listPotions, int boundPotions) {
        String temp; boolean flag=true;
        for (int i = 0; i < boundPotions && flag==true; i++) {
            flag=false;
            for (int j = i + 1; j < boundPotions; j++) {
                // to compare one string with other strings
                if (listPotions[i].name.compareToIgnoreCase(listPotions[j].name) > 0) {
                    // swapping
                    temp = listPotions[i].name;
                    listPotions[i].name = listPotions[j].name;
                    listPotions[j].name = temp;
                    flag = true;
                }
            }            
        }
        // print output array
        System.out.println("Las pociones alfabeticamente son: ");
        for (int i = 0; i < boundPotions; i++) {
            System.out.println(listPotions[i].name);
        }
    }

    // CASE 7
    static void buscarPocion(Potion[] listPotions, int boundPotions, Scanner entrada) {
        System.out.println("Introduzca el identificador de la pocion: ");
        int id = entrada.nextInt();
        System.out.println("La pócima es: " + listPotions[id - 1].name);
        System.out.println("Con una descripcion de: " + listPotions[id - 1].description);
        System.out.println("El tipo de pocima de la pócima es: " + listPotions[id - 1].type);
        System.out.println("Con una puntuacion de: " + listPotions[id - 1].points);
    }

    static void buscarItem(Item[] listItems, int boundItems, Scanner entrada) {
        System.out.println("Introduzca el identificador del item: ");
        int id = entrada.nextInt();
        System.out.println("La pócima es: " + listItems[id - 1].name);
        System.out.println("Con una descripcion de: " + listItems[id - 1].description);
        System.out.println("El tipo de pocima de la pócima es: " + listItems[id - 1].type);
        System.out.println("Con una puntuacion de: " + listItems[id - 1].experience);
    }

    // CASO 8
    /*
     * public static int subirNivel(Potion[] listPotions, int boundPotions,int
     * puntos) {
     * for (int i = 0; i < boundPotions; i++) {
     * listPotions[i].points = ((listPotions[i].points * puntos / 100) +
     * listPotions[i].points);
     * if (listPotions[i].points < 0) {
     * listPotions[i].points = 0;
     * } else if (listPotions[i].points > 10) {
     * listPotions[i].points = 10;
     * }
     * System.out.println("El DJ  ha subido de nivel " + listPotions[i].points);
     * int puntaco = listPotions[i].points;
     * } return puntaco;
     * }
     */

    // CASO 9
    static void ficheroPotion(Potion[] listPotions, int boundPotions) {
        try {
            ObjectOutputStream out = null;
            out = new ObjectOutputStream(new FileOutputStream("pociones.txt", true));
            for (int i = 0; i < boundPotions; i++) {
                out.writeObject((Potion) listPotions[i]);
            }
            out.close();
        } catch (IOException e1) {
            System.out.println(e1.getMessage());
        }
    }

    static void ficheroItems(Item[] listItems, int boundItems) {
        try {
            ObjectOutputStream out = null;
            out = new ObjectOutputStream(new FileOutputStream("items.txt", true));
            for (int i = 0; i < boundItems; i++) {
                out.writeObject((Item) listItems[i]);
            }
            out.close();
        } catch (IOException e1) {
            System.out.println(e1.getMessage());
        }
    }

    // CASO 10
    static void leerFicheroPotions() throws ClassNotFoundException {
        try {
            Potion potion;
            ObjectInputStream in = new ObjectInputStream(new FileInputStream("pociones.txt"));
            potion = (Potion) in.readObject();
            while (potion != null) {
                System.out.println("Nombre: " + potion.name);
                System.out.println("Descripcion: " + potion.description);
                System.out.println("Puntos: " + potion.points);
                potion = (Potion) in.readObject();
            }
        } catch (IOException e2) {
            System.out.println(" ");
        }
    }

    static void leerFicheroItems() throws ClassNotFoundException {
        try {
            Item items;
            ObjectInputStream in = new ObjectInputStream(new FileInputStream("items.txt"));
            items = (Item) in.readObject();
            while (items != null) {
                System.out.println("Nombre: " + items.name);
                System.out.println("Descripcion: " + items.description);
                System.out.println("Puntos: " + items.experience);
                items = (Item) in.readObject();
            }
        } catch (IOException e2) {
            System.out.println(" ");
        }
    }

    // CASO 11
    static void guardarEstado(Potion[] listPotions, int boundPotions, Item[] listItems, int boundItems)
            throws FileNotFoundException, IOException, ClassNotFoundException {
        try {
            ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("pocimas.dat"));
            for (int i = 0; i < boundPotions; i++) {
                out.writeObject((Potion) listPotions[i]);
            }
            out.close();
            System.out.println("Fichero guardado con éxito");
        } catch (IOException e1) {
            System.out.println(e1.getMessage());
        }
        try {
            ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("items.dat"));
            for (int i = 0; i < boundItems; i++) {
                out.writeObject((Item) listItems[i]);
            }
            out.close();
            System.out.println("Fichero guardado con éxito");
        } catch (IOException e1) {
            System.out.println(e1.getMessage());
        }
    }

    // CASO 12
    static void leerEstado() throws ClassNotFoundException {
        // Pociones
        try {
            Potion potion;
            ObjectInputStream in = new ObjectInputStream(new FileInputStream("pocimas.dat"));
            potion = (Potion) in.readObject();
            while (potion != null) {
                System.out.println("Nombre: " + potion.name);
                System.out.println("Descripcion: " + potion.description);
                System.out.println("Puntos: " + potion.points);
                potion = (Potion) in.readObject();
            }
        } catch (IOException e2) {
            System.out.println(" ");
        }
        // Items
        try {
            Item items;
            ObjectInputStream in = new ObjectInputStream(new FileInputStream("items.dat"));
            items = (Item) in.readObject();
            while (items != null) {
                System.out.println("Nombre: " + items.name);
                System.out.println("Descripcion: " + items.description);
                System.out.println("Experiencia: " + items.experience);
                items = (Item) in.readObject();
            }
        } catch (IOException e2) {
            System.out.println(" ");
        }
    }
}
