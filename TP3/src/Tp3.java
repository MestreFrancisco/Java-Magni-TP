import java.util.Scanner;

public class Tp3 {
    public static void main(String[] args) {
        Scanner opcion = new Scanner(System.in);
        System.out.println("Ingrese qué operación quiere hacer (1-11): ");
        String cadena = opcion.nextLine();

        switch (cadena) {
            case "1":
                int[] vector = new int[5];
                for (int i = 0; i < vector.length; i++) {
                    System.out.println("Ingrese número para llenar el arreglo:");
                    vector[i] = opcion.nextInt();
                }
                for (int num : vector) {
                    System.out.println("Los números ingresados en el arreglo son: " + num);
                }
                break; // Añadir break

            case "2":
                System.out.println("Ingrese el tamaño del vector:");
                int n = opcion.nextInt();
                int[] vector2 = new int[n];
                System.out.println("Ingrese el número para el arreglo:");
                int num = opcion.nextInt();
                for (int i = 0; i < vector2.length; i++) {
                    vector2[i] = num * i;
                }
                for (int num2 : vector2) {
                    System.out.println("Los números ingresados son: " + num2);
                }
                break; // Añadir break

            case "3":
                double[] vector3 = new double[20];
                for (int i = 0; i < vector3.length; i++) {
                    System.out.println("Ingrese número para llenar el arreglo:");
                    vector3[i] = opcion.nextDouble();
                }
                double max = vector3[0];
                double min = vector3[0];
                for (int i = 1; i < vector3.length; i++) {
                    if (vector3[i] > max) {
                        max = vector3[i];
                    }
                    if (vector3[i] < min) {
                        min = vector3[i];
                    }
                }
                double rango = max - min;
                System.out.println("Número mínimo: " + min);
                System.out.println("Número máximo: " + max);
                System.out.println("La diferencia es: " + rango);
                break; // Añadir break

            // ... sigue con el resto de los casos ...

            case "11":
                int[] vector12 = new int[10];
                System.out.println("Rellene el vector:");
                for (int i = 0; i < vector12.length; i++) {
                    vector12[i] = (int) (Math.random() * 10) + 1;
                    System.out.print("[" + vector12[i] + "]");
                }
                System.out.println("\nIngrese el número a eliminar:");
                int eliminar = opcion.nextInt();
                int cont = 0;
                for (int i = 0; i < vector12.length; i++) {
                    if (vector12[i] == eliminar) {
                        cont++;
                    }
                }
                if (cont == 0) {
                    System.out.println("No hay números iguales.");
                } else {
                    int[] nuevoArray = new int[vector12.length - cont];
                    int j = 0;
                    for (int i = 0; i < vector12.length; i++) {
                        if (vector12[i] != eliminar) {
                            nuevoArray[j] = vector12[i];
                            j++;
                        }
                    }
                    System.out.println("El nuevo array sin el número " + eliminar + " es:");
                    for (int a : nuevoArray) {
                        System.out.print("[" + a + "]");
                    }
                }
                break; // Añadir break

            default:
                System.out.println("Opción no válida.");
                break;
        }
        opcion.close(); // Cerrar el escáner
    }
}
