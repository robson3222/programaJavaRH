package Produtos;

public class Computador extends Produto implements Autenticacao{

	public Computador() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Computador(double preco, int quantidade, long codigoDeBarras) {
		super(preco, quantidade, codigoDeBarras);
		// TODO Auto-generated constructor stub
	}



	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}

	@Override
	public double getPreco() {
		// TODO Auto-generated method stub
		return super.getPreco();
	}

	@Override
	public void setPreco(double preco) {
		// TODO Auto-generated method stub
		super.setPreco(preco);
	}

	@Override
	public int getQuantidade() {
		// TODO Auto-generated method stub
		return super.getQuantidade();
	}

	@Override
	public void setQuantidade(int quantidade) {
		// TODO Auto-generated method stub
		super.setQuantidade(quantidade);
	}

	@Override
	public long getCodigoDeBarras() {
		// TODO Auto-generated method stub
		return super.getCodigoDeBarras();
	}

	@Override
	public void setCodigoDeBarras(long codigoDeBarras) {
		// TODO Auto-generated method stub
		super.setCodigoDeBarras(codigoDeBarras);
	}

	@Override
	public boolean autenticaCodigo(long codigoDeBarras) {
		// TODO Auto-generated method stub
		return true;
	}

	
	}






	



	

