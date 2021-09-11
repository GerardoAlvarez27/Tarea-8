package tarea8;
import java.util.Scanner;
/**
 *
 * @author galva
 */

public class PrincipalMain {

    private static void menu() {
        System.out.println("--** INGRESE EL NUMERO DE LA OPCION QUE DESEA REALIZAR **--");
        System.out.println("1: Ingresar un producto");
        System.out.println("2: Ingresar un alumno");
        System.out.println("3: Salir");
    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        String nombreP = "", nombreA = "", carne = "";
        int id = 0, edad = 0, op = 0, edadA = 0;
        double precio = 0, precioC = 0;

        comparador c = new comparador();

        do {

            menu();
            op = in.nextInt();

            switch (op) {
                case 1:

                    System.out.println("Ingrese el identificador del producto");
                    id = in.nextInt();
                    in.nextLine();
                    System.out.println("Ingrese el nombre del producto");
                    nombreP = in.nextLine();
                    System.out.println("Ingrese el precio del producto");
                    precio = in.nextDouble();

                    System.out.println("Ingrese otro precio para hacer la comparacion");
                    precioC = in.nextDouble();

                    producto p = new producto(id, nombreP, precio);

                    c.setPrecio(precioC);

                    if (c.igualQueP(p) == true) {
                        System.out.println("Los precios son iguales");
                    }

                    if (c.menorQueP(p) == true) {
                        System.out.println("El precio del producto UNO es menor al SEGUNDO precio ingresado");
                    }

                    if (c.mayorQueP(p) == true) {
                        System.out.println("El precio del producto UNO es mayor al SEGUNDO precio ingresado");
                    }

                    if (c.mayorIgualQueP(p) == true) {
                        System.out.println("El precio del producto UNO es MAYOR o IGUAL que el SEGUNDO precio ingresado");
                    }

                    if (c.menorIgualQueP(p) == true) {
                        System.out.println("El precio del producto UNO es MENOR o IGUAL al del SEGUNDO precio ingresado");
                    }

                    break;
                case 2:

                    in.nextLine();
                    System.out.println("Ingrese el carne del alumno");
                    carne = in.nextLine();
                    System.out.println("Ingrese nombre del alumno");
                    nombreA = in.nextLine();
                    System.out.println("Ingrese la edad del alumno");
                    edad = in.nextInt();

                    System.out.println("Ingrese una segunda edad para hacer la comparacion");
                    edadA = in.nextInt();

                    alumno a = new alumno(carne, nombreA, edad);

                    c.setEdad(edadA);

                    if (c.igualQueA(a) == true) {
                        System.out.println("Las edades ingresadas son iguales");
                    }

                    if (c.menorQueA(a) == true) {
                        System.out.println("La edad del primer alumno es menor a la del segundo ingresado");
                    }

                    if (c.mayorQueA(a) == true) {
                        System.out.println("La edad del primer alumno es mayor a la del segundo ingresado");
                    }

                    if (c.mayorIgualQueA(a) == true) {
                        System.out.println("La edad del primer alumno es mayor o igual a la del segundo ingresado");
                    }

                    if (c.menorIgualQueA(a) == true) {
                        System.out.println("La edad del primer alumno es menor o igual a la del segundo ingresado");
                    }

                    break;
                case 3:
                    break;
            }

        } while (!(op == 3));
    }
}
