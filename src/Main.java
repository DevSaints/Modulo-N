// Nombre: Alisson Ibarguen
// Número de ID: 8-1020-2253
// Facultad: FACULTAD DE INGENIERÍA, ARQUITECTURA Y DISEÑO
// Carrera: Lic. INGENIERÍA EN SISTEMAS COMPUTACIONALES
// Curso: Programación de Computadoras II

/*
Enunciado: Elaborar una aplicación de consola que permita almacenar información sobre
un visitante a un edificio de departamentos utilizando todos los tipos de datos
primitivos en Java. Diseña un programa que declare y asigne valores a variables para
representar diferentes aspectos de la información del estudiante y luego imprima esos
valores en pantalla.
*/


// importamos la clase Scanner del paquete java.util
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar y leer la información del visitante
        System.out.print("Ingrese el nombre: ");
        String nombre = scanner.nextLine();

        System.out.print("Ingrese la edad: ");
        byte edad = scanner.nextByte();

        System.out.print("Ingrese el número de departamento: ");
        short numeroDepartamento = scanner.nextShort();

        System.out.print("Ingrese el teléfono: ");
        long telefono = scanner.nextLong();

        System.out.print("Ingrese la altura (en metros): ");
        float altura = scanner.nextFloat();

        System.out.print("Ingrese el peso (en kg): ");
        double peso = scanner.nextDouble();

        System.out.print("Ingrese el género (M/F): ");
        char genero = scanner.next().charAt(0);

        System.out.print("¿Es residente? (true/false): ");
        boolean esResidente = scanner.nextBoolean();

        // Solicitar y leer las visitas durante una semana
        int totalVisitas = 0;
        int totalTiempoEstadia = 0;
        for (int i = 1; i <= 7; i++) {
            System.out.print("Ingrese el número de visitas del día " + i + ": ");
            int visitasDia = scanner.nextInt();
            totalVisitas += visitasDia;

            System.out.print("Ingrese el tiempo de estadía (en minutos) del día " + i + ": ");
            int tiempoEstadiaDia = scanner.nextInt();
            totalTiempoEstadia += tiempoEstadiaDia;
        }

        // Calcular el tiempo promedio de estadía
        double tiempoPromedioEstadia;
        if (totalVisitas > 0) {
            tiempoPromedioEstadia = (double) totalTiempoEstadia / totalVisitas;
        } else {
            tiempoPromedioEstadia = 0;
        }
        // Determinar si la persona es mayor o menor de edad
        String mayorOMenor;
        if (edad >= 18) {
            mayorOMenor = "mayor de edad";
        } else {
            mayorOMenor = "menor de edad";
        }

        // Imprimir la información del visitante y los cálculos
        System.out.println("\nInformación del visitante:");
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Número de departamento: " + numeroDepartamento);
        System.out.println("Teléfono: " + telefono);
        System.out.println("Altura: " + altura + " metros");
        System.out.println("Peso: " + peso + " kg");
        System.out.println("Género: " + genero);
        System.out.println("Es residente: " + esResidente);
        System.out.println("Total de visitas en la semana: " + totalVisitas);
        System.out.println("Tiempo promedio de estadía: " + tiempoPromedioEstadia + " minutos");
        System.out.println("La persona es " + mayorOMenor);
    }
}