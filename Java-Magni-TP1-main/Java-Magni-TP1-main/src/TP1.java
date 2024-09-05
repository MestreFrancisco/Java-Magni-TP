import javax.swing.*;
import java.util.Scanner;
import java.util.Random;

public class TP1 {

    public static <string> void main(String[] args) {

        int selector;
        String strSelector;
        boolean finished = false;
        String confirm = "no";
        String whatSelected;

        if (confirm.equals("no")) {
            //Vamos A crear un menu para la seleccion de Puntos Usando JOptionPane

            JOptionPane.showMessageDialog //Enseñamos las Opciones
                    (null, "Los Puntos Van del 1 al 15 " + "\n" + "Selecciona un valor del 1 al 15 ");

            strSelector = JOptionPane.showInputDialog(null, "Elige Punto");
            selector = Integer.parseInt(strSelector);

            if (selector < 0 || selector > 14) {
                System.out.println(strSelector + " No existe");
            } else {
                System.out.println(strSelector + " fue seleccionado");

                switch (selector) {
                    case 1://Punto 1
                        String nombre = "Francisco";
                        System.out.println(nombre + "");
                        break;

                    case 2:// a (Scanner) punto 2)
                        Scanner Entrada = new Scanner(System.in); //Nota new se escribe en -> "minisculas" !
                        System.out.println("Escribe tu Nombre...");
                        String myName = Entrada.next();
                        System.out.println(myName + " Ingresa tu edad...");
                        int myAge = Entrada.nextInt();
                        System.out.println("Edad: " + myAge + " - " + "Nombre: " + myName + " Salida Exitosa ");

                        //b (JOptionPane)
                        int myJOIntAge;

                        String myJOName = JOptionPane.showInputDialog(null, "Ingrese su Nombre"); //JOption Pane no acepta int
                        String myJOAge = JOptionPane.showInputDialog(null, myJOName + " Ingrese su Edad: ");
                        myJOIntAge = Integer.parseInt(myJOAge);

                        JOptionPane.showMessageDialog(null, "Nombre: " + myJOName + "\n" + "Edad: " + myJOIntAge);
                        break;

                    case 3://Punto 3
                        int a = 2;
                        int b = 10;


                        JOptionPane.showMessageDialog(null
                                , "Suma 2 + 10 = " + (a + b) + "\n" + "Resta 2-10 = " + (a - b) + "\n"
                                        + "Division 10 / 2 =" + (b / a) + "\n" + "Modulo o Resto 10 %2 = " + (b % a));
                        break;
                    case 4:// Punto 4
                        int c;
                        int d;
                        Scanner Escaner = new Scanner(System.in);

                        System.out.println("Ingrese valor 1");
                        c = Escaner.nextInt();
                        System.out.println("Ingrese Valor2");
                        d = Escaner.nextInt();

                        JOptionPane.showMessageDialog(null, c + " menor que " + d + " -> " + (c < d)
                                + "\n" + c + " igual a " + c + " ? -> " + (c == c));
                        break;

                    case 5://Punto 5
                        Scanner scn = new Scanner(System.in);
                        int num;
                        System.out.println("Ingrese Valor Numerico");
                        num = scn.nextInt();
                        if (num % 2 == 0) {
                            JOptionPane.showMessageDialog(null, "Divisble por 2");
                        } else {
                            JOptionPane.showMessageDialog(null, "no Divisible por 2");
                        }
                        break;

                    case 6: //Punto 6
                        int int_a;
                        String str_a;
                        str_a = JOptionPane.showInputDialog(null, "ingrese Numero para calcular Iva");
                        int_a = Integer.parseInt(str_a);
                        JOptionPane.showMessageDialog(null, int_a + " + 21% IVA = " + (int_a * 0.21 + int_a));
                        break;

                    case 7: // Punto 7
                        int counter = 0;
                        while (counter <= 100) {
                            System.out.println(counter);
                            counter += 1;
                        }
                        break;

                    case 8://Punto 8
                        for (int i = 0; i <= 100; i++) {
                            System.out.println(i);
                        }
                        System.out.println("For Loop");
                        break;

                    case 9://Punto 9
                        for (int i = 0; i <= 100; i++) {
                            if (i % 2 == 0) {
                                System.out.println(i + " ✔\uFE0F Divisible por 2");
                            } else if (i % 3 == 0) {
                                System.out.println(i + " ✔\uFE0F Divisible por 3");
                            } else {
                                System.out.println(i + " ❌ No divisible ni por 2 ni por 3");
                            }
                        }
                        break;
                    case 10://Punto 10
                        int i = 0;
                        String i_str; // No se si existira alguna forma para solo usar una variable y no una string y otra Int
                        while (i <= 0) {
                            i_str = JOptionPane.showInputDialog(null, "Digite un numero mayor a 0");
                            //Hice un Try Catch por si se teclea STRINGS O DATOS no numericos
                            try {
                                i = Integer.parseInt(i_str);
                            } catch (NumberFormatException e) {
                                JOptionPane.showMessageDialog(null, "Solo Numeros");
                            }
                        }
                        JOptionPane.showMessageDialog(null, "Correcto " + i + " es tu numero");
                        break;

                    case 11://Aplicacion Login;
                        int oportunitys = 3;
                        String password;
                        String cPassword;

                        password = "PEPITO123";
                        while (true) {
                            cPassword = JOptionPane.showInputDialog(null, "Ingrese tu contraseña");
                            if (!password.equals(cPassword)) {
                                JOptionPane.showMessageDialog(null, "No coinciden");
                            }else{
                                break;
                            }
                            --oportunitys;
                            if(oportunitys == 0){
                                JOptionPane.showMessageDialog(null, "Cantidad de intentos alcanzados. Acceso denegado");
                                break;
                            }
                        }

                        break;

                    case 12://Punto 12)
                        int weekIntDay=0;
                        boolean check=false;
                        while (!check){
                            String weekDay = JOptionPane.showInputDialog(null, "Ingrese un dia de la semana" + "\n"
                                    + "Lunes 1 " + "\n" + "Martes 2" + "\n" + "Miercoles 3" + "\n" + "Jueves 4" + "\n" + "Viernes 5" + "\n" + "Sabado 6" + "\n" + "Domingo 7");

                                 try {
                                     weekIntDay = Integer.parseInt(weekDay);
                                     if(weekIntDay < 1 || weekIntDay > 7){
                                         JOptionPane.showMessageDialog(null,"Dia Laboral o Fuera de Rango");
                                     }else
                                        check=true;
                                 } catch (NumberFormatException e) {
                                     JOptionPane.showMessageDialog(null, "Solo Numeros o Valores Dentro del Rango");
                                 }
                        }

                        switch (weekIntDay) {
                            case 7:JOptionPane.showMessageDialog(null,"Dia no Laboral");break;
                            case 8:JOptionPane.showMessageDialog(null,"dia no laboral");break;

                        }break;

                    case 13:
                                Scanner scanner = new Scanner(System.in);
                                System.out.println("ingrese un numero para saber si es primo o no");
                                int var= scanner.nextInt();
                                if ((var == 2 ) || (var == 3 ) || (var == 5 )  || (var == 7 )) {
                                    System.out.println("el numero es primo");
                                }else if(( var % 2 == 0) || (var % 3 == 0) || (var % 4 == 0) || (var % 5 == 0) || (var % 6 == 0) || (var % 7 == 0) || (var % 8 == 0) || (var % 9 == 0) || (var == 1))  {
                                    System.out.println("el numero no es primo");
                                }else{
                                    System.out.println("el numero es primo");
                                }break;



                    case 14:

                        boolean gameComplete=false;
                        int intentos = 0;
                        Random random = new  Random();
                        int randomInt = random.nextInt(100);

                        while (!gameComplete){

                            int answer = Integer.parseInt(JOptionPane.showInputDialog(null,"Adivine el numero que se ah generado del 1 al 100"));

                            intentos+=1;

                            if (answer == randomInt)
                            {
                                JOptionPane.showMessageDialog(null,"CORRECTO ACERTASTE GENIAL el numero era " + answer + ". Intentos realizados = " + intentos);
                                break;
                            }else if (answer > randomInt){
                                JOptionPane.showMessageDialog(null,"Quizas el valor sea mas abajo \uD83D\uDD3B");
                            }
                            else if (answer < randomInt) {
                                JOptionPane.showMessageDialog(null,"Quizas el valor sea mas Alto \uD83D\uDD3A");
                            }

                        }

                        break;


                }
            }
        }
    }
}