
public class Uniformitat {
	
	//Id jaquetes(1), id pantalons(2),id sabates(3), id mascaretes (4),id guants(5)
	
	private int id;
	private String nomUni;
	private int unitats;
	
	
	public Uniformitat(int id,String nomUni,int unitats) {
		this.id = id;
		this.nomUni = nomUni;
		this.unitats = 50;
		
	}
	
	public int getId() {
		return this.id;
	}
	
	public String getNomUni() {
		return this.nomUni;
	}
	
	public int getUnitats() {
		return this.unitats;
	}
	
	//public void setId(int id) {
	//	this.id = id;
	//}
	
//	public void setNom(String nom) {
//		this.nomUni =  nomUni;
//	}
	
	public void retUnitats() {
		
		if(this.getUnitats() >= 1) {
		this.unitats = this.getUnitats() - 1;
		}else {
			System.out.println("No es pot donar aquesta peça per manca de stock");
		}
	}
	
	public void tornUnitats() {
		this.unitats = this.getUnitats() + 1 ;
	}
	
	public String veureStockatge() {
	
		return this.getNomUni() + " : "+ this.getUnitats();
	}
	
	
	
	

	
	}
	