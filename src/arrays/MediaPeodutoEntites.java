package arrays;

public class MediaPeodutoEntites {
	
	String nome;
	double price;
	
	
	public MediaPeodutoEntites() {
	}

	public MediaPeodutoEntites(String nome, double price) {
		this.nome = nome;
		this.price = price;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "MediaPeodutoEntites [nome=" + nome + ", price=" + price + "]";
	}
	

}
