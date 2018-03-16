
public class Modalidades{
	private int id;
	private String nome;
private int ouro;
private int metal;
private int bronze;
public Modalidades(int id, String tipo, int ouro, int metal, int bronze) {
	super();
	this.id = id;
	nome = tipo;
	this.ouro = ouro;
	this.metal = metal;
	this.bronze = bronze;
}

public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getTipo() {
	return nome;
}
public void setTipo(String tipo) {
	nome = tipo;
}
public int getOuro() {
	return ouro;
}
public void setOuro(int ouro) {
	this.ouro = ouro;
}
public int getMetal() {
	return metal;
}
public void setMetal(int metal) {
	this.metal = metal;
}
public int getBronze() {
	return bronze;
}
public void setBronze(int bronze) {
	this.bronze = bronze;
}

}
