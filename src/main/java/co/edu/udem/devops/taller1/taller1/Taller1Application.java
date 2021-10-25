package co.edu.udem.devops.taller1.taller1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.util.Scanner;

@SpringBootApplication
public class Taller1Application {

	public static void main(String[] args) {
		SpringApplication.run(Taller1Application.class, args);

		int numero1 = 0,numero2 = 0, resultado = 0;
		Scanner objeto= new Scanner(System.in);

		System.out.println("Introduce el primer número:");
		numero1 = objeto.nextInt();

		System.out.println("Introduce el segundo número:");
		numero2 = objeto.nextInt();

		resultado = numero1 + numero2;

		System.out.println("La suma es " + numero1 + " + " + numero2 + " = " + resultado);
	}



}
