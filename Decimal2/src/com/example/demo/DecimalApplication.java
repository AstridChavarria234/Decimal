package com.example.demo;
import java.util.Scanner;

public class DecimalApplication {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un n�mero en el sistema decimal positivo");
        int numero = scanner.nextInt();
        String binario = "";
        if (numero > 0) {
            while (numero > 0) {
                if (numero % 2 == 0) {
                    binario = "0" + binario;
                } else {
                    binario = "1" + binario;
                }
                numero = (int) numero / 2;
            }
        } else if (numero == 0) {
            binario = "0";
        } else {
            binario = "No se pudo convertir el numero. Ingrese solo n�meros positivos";
        }
        System.out.println("El n�mero convertido a binario es: " + binario);

	}

}
