package recursoshumanos;

public class Vendedor extends Funcionario {

	   double comissao;
	   
	   
	   
	   

	public Vendedor(long cpf, double salario, double desconto, double comissao) {
		super(cpf, salario, desconto);
		this.comissao = comissao;
	}





	public double getComissao() {
		return comissao;
	}





	public void setComissao(double comissao) {
		this.comissao = comissao;
	}

	public double calcularSalario()
	   {
	      return super.calcularSalario() + comissao;
	   }
	   public void exibir() {
	      super.exibir();
	      System.out.println("comissao:" + this.getComissao());



	   }





	public String CodigoDeBarras() {
		// TODO Auto-generated method stub
		return null;
	}

}
