package entities;

public class Funcionario {

	private String name;
	private double salario;
	private int id;
	
	public Funcionario () {
		
	}
	public Funcionario (int id, String name, double salario) {
		this.id = id;
		this.name = name;
		this.salario = salario;
	}
	public void setName (String name) {
		this.name = name;
	}
	public String getName () {
		return this.name;
	}
	public void setId (int id) {
		this.id = id ;
	}
	public int getId () {
		return this.id;
	}
	public double getSalario () {
		return this.salario;
	}
	public void aumentarSalario (double porcentagem) {
	 this.salario += (this.salario * (porcentagem)/100); 
	}
	
	
}
