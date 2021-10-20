package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Funcionario;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		System.out.print("How many employees will be registered? ");
		int N = sc.nextInt();
		Funcionario f = new Funcionario ();
		List <Funcionario> lista= new ArrayList <> ();
		for (int i=0; i<N; i++) {
			System.out.println("");
			System.out.println("Employee #"+(i+1)+":");
			System.out.print("Id: ");
			int id = sc.nextInt();
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Salary: ");
			double salario = sc.nextDouble();
			lista.add(new Funcionario (id,name,salario)); 
		}
		
		System.out.println("");
		System.out.print("Enter the employee id that will have salary increase : ");
		int id = sc.nextInt();
		boolean auxiliar = true;
		for (Funcionario aux : lista) {
			if (aux.getId() == id) {
				System.out.print("Enter the percentage: ");
				double porcentagem = sc.nextDouble();
				aux.aumentarSalario(porcentagem);
				auxiliar = false;
			} 
		}
		if (auxiliar){
			System.out.println("This id does not exist!");
		}
		System.out.println("");
		System.out.println("List of employees:");
		
		for (Funcionario aux : lista) {
			System.out.println(aux.getId()+", "+aux.getName()+", "+String.format("%.2f", aux.getSalario()));
		}
	}
	

}
