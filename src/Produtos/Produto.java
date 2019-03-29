package Produtos;

public abstract class Produto {

	
	
	double preco;
    int quantidade;
    long codigoDeBarras;
	
    public Produto() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Produto(double preco, int quantidade, long codigoDeBarras) {
		super();
		this.preco = preco;
		this.quantidade = quantidade;
		this.codigoDeBarras = codigoDeBarras;
	}

	@Override
	public String toString() {
		return "Produto [preco=" + preco + ", quantidade=" + quantidade + ", codigoDeBarras=" + codigoDeBarras + "]";
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public long getCodigoDeBarras() {
		return codigoDeBarras;
	}

	public void setCodigoDeBarras(long codigoDeBarras) {
		this.codigoDeBarras = codigoDeBarras;
	}

	public  double calcularPreco() {
		return quantidade + preco;
	
	}
    


    
}
