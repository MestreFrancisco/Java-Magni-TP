import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class TP3 {
    public static void main(String[] args) {
            Scanner opcion = new Scanner(System.in);
            System.out.println("ingrese que operacion quiere hacer ");
            String selector = opcion.nextLine();
            switch (selector) {
                case "1":
                    int[] vector = new int[5];
                    Scanner numero = new Scanner(System.in);
                    for (int i = 0; i < vector.length; i++) {
                        System.out.println("ingrense numero para llenar el areglo");
                        int num = numero.nextInt();
                        vector[i] = num;
                    }
                    for (int i = 0; i < vector.length; i++) {
                        System.out.print("["+vector[i]+"]");
                    }
                    break;
                case "2":
                    Scanner tamaño = new Scanner(System.in);
                    System.out.println("ingrese el tamaño del vector");
                    int n = tamaño.nextInt();
                    int[] vector2 = new int[n];
                    System.out.println("ingrese el numero para el arreglo");
                    int num = tamaño.nextInt();
                    for (int i = 0; i < vector2.length; i++) {
                        int nume = num * i;
                        vector2[i] = nume;
                    }
                    for (int i = 0; i < vector2.length; i++) {
                        System.out.println("los numero ingresados son " + vector2[i]);
                    }
                    break;
                case "3":
                    double[] vector3 = new double[20];
                    Scanner num1 = new Scanner(System.in);
                    for (int i = 0; i < vector3.length; i++) {
                        System.out.println("ingrese numero para llenar el areglo");
                        double relleno = num1.nextInt();
                        vector3[i] = relleno;
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
                    double rango= max-min;
                    System.out.println("numerr minimo es "+min);
                    System.out.println("numere maximo es "+max);
                    System.out.println("la diferecia que hay es de "+ rango);
                    break;
                case "4":
                    Scanner randon= new Scanner(System.in);
                    int suma=0;
                    int promo=0;
                    int cont1=0;
                    int cont2=0;
                    int cont3=0;
                    int[] vector4=new int[20];
                    for(int i=0; i< vector4.length; i++){
                        int num4 = (int) (Math.random() * 100) + 1;
                        vector4[i]=num4;
                        suma+=vector4[i];
                        promo= suma/vector4.length;
                        if(promo==vector4[i]){
                            cont1++;
                        }
                        if(promo<vector4[i]){
                            cont2++;
                        }
                        if(promo>vector4[i]){
                            cont3++;
                        }
                    }
                    for(int i=0; i< vector4.length; i++){
                        System.out.println("los numero son "+ vector4[i]);
                    }
                    System.out.println("su promedio aritmético es de "+ promo);
                    System.out.println(" la cantidad de números que son iguales al promedio aritmético es de "+cont1);
                    System.out.println("la cantidad de numero menores al promedio es de "+ cont2);
                    System.out.println("la cantidad de numero menores al promedio es de "+ cont3);
                    break;
                case "5":
                    Scanner hola= new Scanner(System.in);
                    int[] vector5=new int[50];
                    for(int i=0; i< vector5.length; i++) {
                        int num4 = (int) (Math.random() * 100) + 1;
                        vector5[i]=num4;
                        System.out.println("los nuemro ramdom son "+vector5[i]);
                    }
                    System.out.println("ingrese un numero a buscar");
                    int busca= hola.nextInt();
                    for(int j=0; j<49; j++){
                        if(vector5[0]==busca){
                            System.out.println("la primera pocision son iguales ");
                        }
                        if(vector5[j]==busca){
                            System.out.println("la pocision "+j+" es igual al de la busqueda "+busca);
                        }else {
                            System.out.println("numero no encontreado en ninguna pocision");
                        }
                    }
                    break;
                case "6":
                    int[] vector6=new int[10];
                    suma = 0;
                    int suma1=0;
                    for(int i=0; i< vector6.length; i++) {
                        int num4 = (int) (Math.random() * 100) + 1;
                        vector6[i]=num4;
                        System.out.println("los nuemro ramdom son "+vector6[i]);
                        if(vector6[i]%2==0){
                            suma+=vector6[i];
                        }else{
                            suma1+=vector6[i];
                        }
                    }
                    System.out.println("la suma de los numeros pares son de "+ suma);
                    System.out.println("la suma de los numeros impares son de "+ suma1);
                    break;
                case "7":
                    Scanner nume= new Scanner(System.in);
                    int[] vector7= new int[10];
                    int[] acendente=new int[10];
                    Integer[] Decendente=new Integer[10];
                    for(int i=0; i<vector7.length; i++){
                        System.out.println("ingrese 10 numero enteros");
                        int nu= nume.nextInt();
                        vector7[i]=nu;
                        acendente[i]=vector7[i];
                        Decendente[i]=vector7[i];
                    }
                    Arrays.sort(acendente);
                    Arrays.sort(Decendente, Collections.reverseOrder());
                    System.out.println("los numero en acenso son "+Arrays.toString(acendente));
                    System.out.println("los numero en decenso son "+Arrays.toString(Decendente));
                    break;
                case "8":
                    Scanner cadena1= new Scanner(System.in);
                    System.out.print("ingrese numeros en cadena ");
                    String cade = cadena1.nextLine();

                    String[] ncadena= cade.split("-");

                    int sum=0;
                    int cantidad=ncadena.length;

                    for (String numStr : ncadena) {
                        int numo = Integer.parseInt(numStr);
                        sum += numo;
                    }
                    double medio=(double) sum/cantidad;
                    System.out.println("la suma total de los numeros es de "+ sum);
                    System.out.println("el promedio de estos numeos es de "+ medio);
                    break;
                case "9":
                    Scanner dn= new Scanner(System.in);
                    String[] abece={"T","R","W","A","G","M","Y","F","P","D","X","B","N","J","Z","S","Q","V","H","L","C","K","E"};
                    System.out.println("ingrese su dni");
                    int dni= dn.nextInt();
                    int cal= dni%23;
                    System.out.println("el resto al dividirlo por 23 es de "+cal+" ya la letra es "+abece[cal]);
                    break;
                case "10":
                    Scanner nue= new Scanner(System.in);
                    int[] vector9= new int[5];
                    int[] vector10= new int[10];
                    int[] vector11= new int[5];
                    System.out.println("rellene el vector 1");
                    for(int i=0; i<vector9.length; i++){
                        int prime = (int) (Math.random() * 10) + 1;
                        vector9[i]=prime;
                        System.out.println(vector9[i]);
                    }
                    System.out.println("rellene el vector 2");
                    for(int i=0; i<vector10.length; i++){
                        int segun = (int) (Math.random() * 10) + 1;
                        vector10[i]=segun;
                        System.out.println(vector10[i]);
                    }
                    int nua= vector9[0]* vector10[0];
                    int nua1= vector9[0]* vector10[1];
                    int su=nua+nua1;
                    int nua2= vector9[1]* vector10[2];
                    int nua3= vector9[1]* vector10[3];
                    int su1=nua2+nua3;
                    int nua4= vector9[2]* vector10[4];
                    int nua5= vector9[2]* vector10[5];
                    int su2=nua4+nua5;
                    int nua6= vector9[3]* vector10[6];
                    int nua7= vector9[3]* vector10[7];
                    int su3=nua6+nua7;
                    int nua8= vector9[4]* vector10[8];
                    int nua9= vector9[4]* vector10[9];
                    int su4=nua8+nua9;
                    vector11[0]=su;
                    vector11[1]=su1;
                    vector11[2]=su2;
                    vector11[3]=su3;
                    vector11[4]=su4;
                    System.out.print("\nvector1\n");
                    for(int i=0; i<vector9.length; i++){
                        System.out.print("["+vector9[i]+"]");
                    }
                    System.out.print("\nvector2\n");
                    for(int i=0; i<vector10.length; i++){
                        System.out.print("["+vector10[i]+"]");
                    }
                    System.out.print("\nvector3\n");
                    for(int i=0; i<vector11.length; i++){
                        System.out.print("["+vector11[i]+"]");
                    }
                    break;
                case "11":
                    Scanner ja= new Scanner(System.in);
                    int[] vector12= new int[10];
                    System.out.println("rellene el vector 1");
                    for(int i=0; i<vector12.length; i++){
                        int prime = (int) (Math.random() * 10) + 1;
                        vector12[i]=prime;
                        System.out.print("["+vector12[i]+"]");
                    }
                    System.out.println("\ningrese el numero a eliminar\n");
                    int eliminar= ja.nextInt();
                    int cont=0;
                    for(int i=0; i<vector12.length; i++){
                        if(vector12[i]==eliminar){
                            cont++;
                        }
                    }
                    if(cont==0){
                        System.out.println("no hay numeros iguales");
                    }else{
                        int[] nuevoArray = new int[vector12.length - cont];
                        int j = 0;
                        for (int i=0; i<vector12.length; i++){
                            if (vector12[i] != eliminar) {
                                nuevoArray[j] = vector12[i];
                                j++;
                            }
                        }
                        System.out.println("El nuevo array sin el número " + eliminar + " es:");
                        for(int a = 0; a <nuevoArray.length; a++) {
                            System.out.print("[" + nuevoArray[a] + "]");
                        }
                    }
                    break;
            }

        }

    }
