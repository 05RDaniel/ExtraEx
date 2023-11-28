/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package extra1;
import java.util.Scanner;
/**
 *
 * @author alumnot
 */
public class Extra1 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {


// Versión Recursiva
        // Utilizar un Scanner para obtener la entrada del usuario
        Scanner sc = new Scanner(System.in);

        // Solicitar al usuario que ingrese un número
        System.out.print("Introduce un número: ");
        int numero = sc.nextInt();

        // Calcular el factorial del número
        long factorial = calcularFactorial(numero);

        // Imprimir el resultado
        System.out.println("El factorial de " + numero + " es: " + factorial);

        // Cerrar el Scanner
        sc.close();
    }

    // Método para calcular el factorial de un número
    private static long calcularFactorial(int numero) {
        if (numero == 0) {
            return 1;
        } else {
            return numero * calcularFactorial(numero - 1);
        }
    }
}
