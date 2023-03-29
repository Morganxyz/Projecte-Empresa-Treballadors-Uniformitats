import java.util.ArrayList;

public class Treballador {

	private int id;
	private String nom;
	private String cognom;
	ArrayList <Uniformitat> llistaUniformes;
	
	public Treballador(int id,String nom,String cognom) {
		
		this.id = id;
		this.nom = nom;
		this.cognom = cognom;	
		this.llistaUniformes = new ArrayList <Uniformitat>();
		
	}
	
	public int getId() {
		return this.id;
	}
	
	public String getNom() {
		return this.nom;
	}
	public String getCognom() {
		return this.cognom;
	}
	
	public ArrayList<Uniformitat> getLlistaUniformes(){
		return this.llistaUniformes;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public void setCognom(String cognom) {
		this.cognom = cognom;
	}
	
	public void setLlistaUniformes(Uniformitat llistaUniformes) {
		
		this.llistaUniformes.add(llistaUniformes);
	}
	
	public String unaf() {
		
		
		String unaf = "";
		
		for(Uniformitat c : llistaUniformes) {
			unaf += "/" + c.getNomUni();
	}
		return  unaf;
	}
		
	public String toString() {
		return "En/La " + this.nom + " " +  this.cognom + " és el/la treballador/a núm. "
				+ this.id + " i disposa de : " + unaf();
	}
		
}
