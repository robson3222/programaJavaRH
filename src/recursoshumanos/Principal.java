package recursoshumanos;

import Produtos.Computador;


public class Principal {

	public static void main(String[] args) {

		Funcionario funcionario = new Funcionario();
	      funcionario.setCpf(123456);

	      funcionario.setSalario(1209.75);

	      funcionario.setDesconto(102.35);
	   funcionario.calcularSalario();
	      funcionario.exibir();
	      
	      
	      
	      System.out.println("Sal�rio l�quido: " + funcionario.calcularSalario());
	   
	      
	      System.out.println("_______________________________");
	      
	      System.out.println(funcionario.toString());
	      
	      System.out.println("_______________________________");
	      
	      Vendedor vendedor = new Vendedor(1234802, 1620.50, 120.45, 50.55);
	   vendedor.exibir();  
	      System.out.println("Sal�rio l�quido: " + vendedor.calcularSalario());
	     

	      
	      
	      System.out.println("_______________________________");
	      
	      Computador pc = new Computador(10,10,12);
	      System.out.println("pre�o: " + pc.getPreco());
	      System.out.println("quantidade: " + pc.getQuantidade());
	      System.out.println("total dos produtos: " + pc.calcularPreco());
	      System.out.println("codigo de barra: " + pc.getCodigoDeBarras());
	}

}
