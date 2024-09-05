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

        if (confirm == "no") {
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
                        String userName;
                        String cPassword;
                        String login_password;
                        String login_user;

                        userName = JOptionPane.showInputDialog(null, "Crea tu Nombre De Usuario");
                        password = JOptionPane.showInputDialog(null, "Ingrese su contraseña");
                        cPassword = JOptionPane.showInputDialog(null, "Confirma tu contraseña");
                        while (password.equals(password) == false) {
                            if (password.equals(cPassword) == false) {
                                JOptionPane.showMessageDialog(null, "No coinciden");

                                password = JOptionPane.showInputDialog(null, "Ingrese su contraseña");
                                cPassword = JOptionPane.showInputDialog(null, "Confirma tu contraseña");
                            } else {
                                break;
                            }

                        }

                        //Login
                        while (oportunitys > 0) {
                            login_user = JOptionPane.showInputDialog(null, "LOGIN - Ingrese Nombre De usuario");
                            login_password = JOptionPane.showInputDialog(null, "LOGIN - Ingrese contraseña");

                            if (login_user.equals(userName) && login_password.equals(password)) {
                                JOptionPane.showMessageDialog(null, "Bienvenido " + userName);
                                break;
                            } else {
                                oportunitys -= 1;
                                JOptionPane.showMessageDialog(null, "Oportunidades Restantes: " + oportunitys);
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
                            check=true;
                         } catch (NumberFormatException e) {
                            JOptionPane.showMessageDialog(null, "Solo Numeros o Valores Dentro del Rango");
                            weekIntDay=0;
                         }}

                        switch (weekIntDay) {
                            case 7:JOptionPane.showMessageDialog(null,"Dia no Laboral");break;
                            case 8:JOptionPane.showMessageDialog(null,"dia no laboral");break;

                            default:JOptionPane.showMessageDialog(null,"Dia Laboral o Fuera de Rango");
                        }break;

                    case 13:
                        int primo = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su numero y le dire si es primo"));
                        if (primo % primo == 0){JOptionPane.showMessageDialog(null,primo+" es Primo");}
                        else{JOptionPane.showMessageDialog(null,"No lo es");}
                        break;
                    case 14:

                        boolean gameComplete=false;
                        oportunitys = 0;
                        Random random = new  Random();
                        int randomInt = random.nextInt(100);

                        while (!gameComplete){

                        int answer = Integer.parseInt(JOptionPane.showInputDialog(null,"Adivine el numero que se ah generado del 1 al 100"));

                        oportunitys+=1;

                        if (answer == randomInt)
                        {
                            JOptionPane.showMessageDialog(null,"CORRECTO ACERTASTE GENIAL "+answer + "⬅ \uD83D\uDE0E  Era el Numero");
                            break;

                        }else if (answer > randomInt){JOptionPane.showMessageDialog(null,"Quizas el valor sea mas abajo \uD83D\uDD3B");}
                        else if (answer < randomInt) {JOptionPane.showMessageDialog(null,"Quizas el valor sea mas Alto \uD83D\uDD3A");}

                        }

                        switch (oportunitys)
                        {
                            case 1: JOptionPane.showMessageDialog(null,"\uD83C\uDF1F Na increible ,Hoy dia te van a pasar cosas lindas \uD83D");break;
                            case 2: JOptionPane.showMessageDialog(null,"\uD83D\uDE32 A La seguda");break;
                            case 3: JOptionPane.showMessageDialog(null,"\uD83E\uDD28 bro wtf a la tercera, seguí así , con esfuerzo todo se puede ");break;
                            case 4: JOptionPane.showMessageDialog(null,"\uD83E\uDDE0 cuarto intento , Cerebro Maestro ");break;
                            case 5: JOptionPane.showMessageDialog(null,"☠\uFE0F quinto intento Bastante Decente Bro");break;
                            case 6: JOptionPane.showMessageDialog(null,"☠\uFE0F sexto intento Bastante Decente Bro");break;
                            case 7: JOptionPane.showMessageDialog(null,"☠\uFE0F septimo intento Bastante Decente Bro");break;
                            case 8: JOptionPane.showMessageDialog(null,"☠\uFE0F octavo intento Bastante Decente Bro");break;
                            case 9: JOptionPane.showMessageDialog(null,"☠\uFE0F noveno intento Bastante Decente Bro");break;
                            case 10:JOptionPane.showMessageDialog(null,"\uD83E\uDD22 10 intentos , Jugador Promedio , no eres bueno en nada");
                            default:JOptionPane.showMessageDialog(null,"Oportunidades Realizadas: "+oportunitys);break;
                        }
                        break;


                }
            }
        }
    }
}