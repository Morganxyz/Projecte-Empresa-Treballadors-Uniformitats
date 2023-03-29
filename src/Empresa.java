import java.util.ArrayList;
import java.util.Scanner;

public class Empresa {
	
	public static Scanner entrada = new Scanner(System.in);
	public static ArrayList<Treballador> llistaTreballadors = new ArrayList<Treballador>();
	public static Uniformitat uni0 = new Uniformitat(1,"Jaqueta",50);
	public static Uniformitat uni1 = new Uniformitat(2,"Pantalons",50);
	public static Uniformitat uni2 = new Uniformitat(3,"Sabates",50);
    public static Uniformitat uni3 = new Uniformitat(4,"Mascareta",50);
	public static Uniformitat uni4 = new Uniformitat(5,"Guants",50);
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Treballador treb0 = new Treballador(15,"Kobie","Bryan");
		llistaTreballadors.add(treb0);
		treb0.setLlistaUniformes(uni0);
		treb0.setLlistaUniformes(uni1);
		uni0.retUnitats();
		uni1.retUnitats();
		
		int opcio;
		
		do {
		
		System.out.println("Introdueix l´opció desitjada: \n1. Registrar Treballador"
				+ "\n2. Veure Treballador"
				+ "\n3. Editar Treballador"
				+ "\n4. Eliminar Treballador"
				+ "\n5. Donar Uniformitat"
				+ "\n6. Retornar Uniformitat"
				+ "\n7. Veure Stock"
				+ "\n0. Sortir");
		opcio = entrada.nextInt();
		
			switch(opcio) {
			
				case 1:registrarTreballador();
					break;
				case 2:veureTreballador();
					break;
				case 3:editarTreballador();
					break;
				case 4:eliminarTreballador();
					break;
				case 5:	donarUni();
					break;
				case 6:	tornarUni();
					break;
				case 7 : veureStock();
					break;
				case 0:
					System.out.println("Adéu");
					break;
				default:
					System.out.println("L´opció desitjada no és vàlida!");
					System.out.println("");			
			}
		}while(opcio != 0);
	}
	
	public static void registrarTreballador() {
		
		int id = (int)Math.round(Math.random()*1000);
		String nom;
		String cognom;
		int posTre = -1;
		boolean endW = false;
		int i = 0;
		
		
		entrada.nextLine();
		System.out.println("Introdueix el nom del treballador: ");
		nom = entrada.nextLine();
		System.out.println("Introdueix el cognom del trebalador: ");
		cognom = entrada.nextLine();
		
		while(i < llistaTreballadors.size() && !endW) {
			Treballador trebTrovat = llistaTreballadors.get(i);
			
			if(nom.equalsIgnoreCase(trebTrovat.getNom()) && cognom.equalsIgnoreCase(trebTrovat.getCognom())) {
				posTre = i;
				endW = true;
			}
		i++;
		}
		if(endW) {
			System.out.println(llistaTreballadors.get(posTre).toString());
			System.out.println("El treballador ja consta al sistema");
			System.out.println("");
			
		}else {
			
			Treballador treballador0 = new Treballador(id,nom,cognom);
			llistaTreballadors.add(treballador0);
			treballador0.setLlistaUniformes(uni0);
			treballador0.setLlistaUniformes(uni1);
			System.out.println("Treballador registrat amb èxit!");
			System.out.println("");
			uni0.retUnitats();
			uni1.retUnitats();

			}
		}
		
	public static void veureTreballador() {
		
		String nom;
		String cognom;
		int posTre = -1;
		boolean endW = false;
		int i = 0;
		
		
		entrada.nextLine();
		System.out.println("Introdueix el nom del treballador a cercar: ");
		nom = entrada.nextLine();
		System.out.println("Introdueix el cognom del trebalador a cercar: ");
		cognom = entrada.nextLine();
		
		while(i < llistaTreballadors.size() && !endW) {
			Treballador trebTrovat = llistaTreballadors.get(i);
			
			if(nom.equalsIgnoreCase(trebTrovat.getNom()) && cognom.equalsIgnoreCase(trebTrovat.getCognom())) {
				posTre = i;
				endW = true;
			}	
		i++;
		}
		if(endW) {
			System.out.println(llistaTreballadors.get(posTre).toString());
			System.out.println("");
		}else {
			System.out.println("El treballador cercat no s´ha trovat");
			System.out.println("");
		}
	}
	
	public static void editarTreballador() {
		
		int nouId;
		String nom;
		String nouNom;
		String cognom;
		String nouCognom;
		int posTre = -1;
		boolean endW = false;
		String res;
		int opcio;
		int i = 0;
		
		entrada.nextLine();
		System.out.println("Introdueix el nom del treballador a cercar: ");
		nom = entrada.nextLine();
		System.out.println("Introdueix el cognom del trebalador a cercar: ");
		cognom = entrada.nextLine();
		
		while(i < llistaTreballadors.size() && !endW) {
			Treballador trebTrovat = llistaTreballadors.get(i);
			
			if(nom.equalsIgnoreCase(trebTrovat.getNom()) && cognom.equalsIgnoreCase(trebTrovat.getCognom())) {
				posTre = i;
				endW = true;
			}	
		i++;
		}
		if(endW) {
			System.out.println(llistaTreballadors.get(posTre).toString());
			System.out.println("");
			System.out.println("Vols editar aquest treballador? S/N: ");
			res = entrada.next();
			
			if(res.equalsIgnoreCase("s")) {
				do {
					System.out.println("Introdueix el camp del treballador a modificar: "
							+ "\n1. Id"
							+ "\n2. Nom"
							+ "\n3. Cognom"
							+ "\n0. Sortir");
					
					opcio = entrada.nextInt();
					
					switch(opcio) {
					
						case 1: 
							System.out.println("Introdueix el nou Id del treballador: ");
							nouId = entrada.nextInt();
							llistaTreballadors.get(posTre).setId(nouId);
							System.out.println("Edició del Id realitzada amb èxit");
							System.out.println(llistaTreballadors.get(posTre).toString());
							System.out.println("");
							break;
						case 2:
							System.out.println("Introdueix el nou nom del treballador: ");
							nouNom = entrada.nextLine();
							llistaTreballadors.get(posTre).setNom(nouNom);
							System.out.println("Edició del nom realitzada amb èxit");
							System.out.println(llistaTreballadors.get(posTre).toString());
							System.out.println("");
							break;
						case 3:
							System.out.println("Introdueix el nou cognom del treballador: ");
							nouCognom = entrada.next();
							llistaTreballadors.get(posTre).setCognom(nouCognom);
							System.out.println("Edició del cognom realitzada amb èxit");
							System.out.println(llistaTreballadors.get(posTre).toString());
							System.out.println("");
							break;
						case 0:
							System.out.println("");
							break;
						default:
							System.out.println("L ópcio desitjada no és vàlida");
							System.out.println("");		
					}		
				}while(opcio != 0);
			}else {
				System.out.println("Edició avortada");
				System.out.println("");
			}
			
		}else {
			System.out.println("El treballador cercat no s´ha trovat");
			System.out.println("");
		}	
	}
	
	public static void eliminarTreballador() {
		
	
		String nom;
		String cognom;
		int posTre = -1;
		boolean endW = false;
		boolean endW2 = false;
		String res;
		int i = 0;
		int j = 0;
		
		entrada.nextLine();
		System.out.println("Introdueix el nom del treballador a cercar: ");
		nom = entrada.nextLine();
		System.out.println("Introdueix el cognom del trebalador a cercar: ");
		cognom = entrada.nextLine();
		
		while(i < llistaTreballadors.size() && !endW) {
			Treballador trebTrovat = llistaTreballadors.get(i);
			
			if(nom.equalsIgnoreCase(trebTrovat.getNom()) && cognom.equalsIgnoreCase(trebTrovat.getCognom())) {
				posTre = i;
				endW = true;
			}	
		i++;	
		}
		if(endW) {
			System.out.println(llistaTreballadors.get(posTre).toString());
			System.out.println("");
			System.out.println("Vols eliminar aquest treballador? S/N: ");
			res = entrada.next();
			
			if(res.equalsIgnoreCase("s")) {
				
				while(j < llistaTreballadors.get(posTre).getLlistaUniformes().size() && !endW2) {
					
					if(llistaTreballadors.get(posTre).getLlistaUniformes().get(j).getNomUni()
							.equalsIgnoreCase("jaqueta")) {
						uni0.tornUnitats();
					}else if(llistaTreballadors.get(posTre).getLlistaUniformes().get(j).getNomUni()
							.equalsIgnoreCase("pantalons")) {
						uni1.tornUnitats(); 
					}else if(llistaTreballadors.get(posTre).getLlistaUniformes().get(j).getNomUni()
							.equalsIgnoreCase("sabates")) {
						uni2.tornUnitats(); 	
					}else if(llistaTreballadors.get(posTre).getLlistaUniformes().get(j).getNomUni()
							.equalsIgnoreCase("mascareta")) {
						uni3.tornUnitats(); 	
					}else if(llistaTreballadors.get(posTre).getLlistaUniformes().get(j).getNomUni()
								.equalsIgnoreCase("guants")) {
							uni4.tornUnitats(); 
					llistaTreballadors.get(posTre).getLlistaUniformes().remove(j);	
				}
				j++;
				}
				
				System.out.println(llistaTreballadors.get(posTre).toString());
				llistaTreballadors.remove(posTre);
				System.out.println("Treballador eliminar amb  èxit!");
				System.out.println("S´ha restaurat tota l´uniformitat al stock del treballador eliminat");
				System.out.println("");
				
			}else {
				System.out.println("Eliminació avortada!");
				System.out.println("");
			}
			
		}else {
			System.out.println("El treballador cercat no s´ha trovat");
			System.out.println("");
		}		
	}
	
	public static void donarUni() {
	
		int opcio;
		
			do {
				System.out.println("Introdueix l´opció desitjada: \n1. Donar jaqueta\n2. Donar pantalons"
						+ "\n3. Donar sabates\n4. Donar mascareta\n5. Donar guants\n0. Sortir");
				opcio = entrada.nextInt();
				
					switch(opcio) {
						
						case 1: donarJaqueta();
							break;
						case 2:	donarPantalons();
							break;
						case 3: donarSabates();
							break;
						case 4: donarMascareta();
							break;
						case 5:	donarGuants();
							break;
						case 0:
							System.out.println("Sortint!");
							System.out.println("");
							break;
						default:
							System.out.println("L´opció escollida no és vàlida");
							System.out.println("");				
					}
				
				
				
			}while(opcio != 0);
		
	}
	
	public static void donarJaqueta() {
		
		String nom;
		String cognom;
		int posTre = -1;
		boolean endW = false;
		boolean esc = false;;
		int i = 0;
		int j = 0;
		
		entrada.nextLine();
		System.out.println("Introdueix el nom del treballador a cercar: ");
		nom = entrada.nextLine();
		System.out.println("Introdueix el cognom del trebalador a cercar: ");
		cognom = entrada.nextLine();
		
		while(i < llistaTreballadors.size() && !endW) {
			Treballador trebTrovat = llistaTreballadors.get(i);
			
			if(nom.equalsIgnoreCase(trebTrovat.getNom()) && cognom.equalsIgnoreCase(trebTrovat.getCognom())) {
				posTre = i;
				endW = true;
			}	
		i++;
		}
		if(endW) {
			
			while(j < llistaTreballadors.get(posTre).getLlistaUniformes().size() && !esc) {
				Uniformitat unifTrovat = llistaTreballadors.get(posTre).getLlistaUniformes().get(j);
				
				if(unifTrovat.getNomUni().equalsIgnoreCase("jaqueta")) {
					esc = true;
				}
			j++;
			}
			
			if(esc) {
				System.out.println("El/La treballador/a ja disposa de jaqueta");
				System.out.println("");
				
			}else {
				llistaTreballadors.get(posTre).setLlistaUniformes(uni0);
				uni0.retUnitats();
				System.out.println(llistaTreballadors.get(posTre).toString());
				System.out.println("");
				
			}
			
		}else {
			System.out.println("El treballador cercat no s´ha trovat");
			System.out.println("");
		}
		
	}
	
	public static void donarPantalons() {
		
		String nom;
		String cognom;
		int posTre = -1;
		boolean endW = false;
		boolean esc = false;
		int i = 0;
		int j = 0;
		
		
		entrada.nextLine();
		System.out.println("Introdueix el nom del treballador a cercar: ");
		nom = entrada.nextLine();
		System.out.println("Introdueix el cognom del trebalador a cercar: ");
		cognom = entrada.nextLine();
		
		while(i < llistaTreballadors.size() && !endW) {
			Treballador trebTrovat = llistaTreballadors.get(i);
			
			if(nom.equalsIgnoreCase(trebTrovat.getNom()) && cognom.equalsIgnoreCase(trebTrovat.getCognom())) {
				posTre = i;
				endW = true;
			}
		i++;	
		}
		if(endW) {
			
			while(j < llistaTreballadors.get(posTre).getLlistaUniformes().size() && !esc) {
				Uniformitat unifTrovat = llistaTreballadors.get(posTre).getLlistaUniformes().get(j);
				
				if(unifTrovat.getNomUni().equalsIgnoreCase("pantalons")) {
					esc = true;
				}
			j++;
			}
			
			if(esc) {
				System.out.println("El/La treballador/a ja disposa de pantalons");
				System.out.println("");
			}else {
				llistaTreballadors.get(posTre).setLlistaUniformes(uni1);
				uni1.retUnitats();
				System.out.println(llistaTreballadors.get(posTre).toString());
				System.out.println("");
			}
			
		}else {
			System.out.println("El treballador cercat no s´ha trovat");
			System.out.println("");
		}
		
	}
	
	public static void donarSabates() {
		
		String nom;
		String cognom;
		int posTre = -1;
		boolean endW = false;
		boolean esc = false;
		int i = 0;
		int j = 0;
		
		entrada.nextLine();
		System.out.println("Introdueix el nom del treballador a cercar: ");
		nom = entrada.nextLine();
		System.out.println("Introdueix el cognom del trebalador a cercar: ");
		cognom = entrada.nextLine();
		
		while(i < llistaTreballadors.size() && !endW) {
			Treballador trebTrovat = llistaTreballadors.get(i);
			
			if(nom.equalsIgnoreCase(trebTrovat.getNom()) && cognom.equalsIgnoreCase(trebTrovat.getCognom())) {
				posTre = i;
				endW = true;
			}
		i++;
		}
		if(endW) {
			
			while(j < llistaTreballadors.get(posTre).getLlistaUniformes().size() && !esc) {
				Uniformitat unifTrovat = llistaTreballadors.get(posTre).getLlistaUniformes().get(j);
				
				if(unifTrovat.getNomUni().equalsIgnoreCase("sabates")) {
					esc = true;
				}
			j++;
			}
			
			if(esc) {
				System.out.println("El/La treballador/a ja disposa de sabates");
				System.out.println("");
			}else {
				llistaTreballadors.get(posTre).setLlistaUniformes(uni2);
				uni2.retUnitats();
				System.out.println(llistaTreballadors.get(posTre).toString());
				System.out.println("");
			}
			
		}else {
			System.out.println("El treballador cercat no s´ha trovat");
			System.out.println("");
		}
		
	}
	public static void donarMascareta() {
		
		String nom;
		String cognom;
		int posTre = -1;
		boolean endW = false;
		boolean esc = false;
		int i = 0;
		int j = 0;
		
		
		entrada.nextLine();
		System.out.println("Introdueix el nom del treballador a cercar: ");
		nom = entrada.nextLine();
		System.out.println("Introdueix el cognom del trebalador a cercar: ");
		cognom = entrada.nextLine();
		
		while(i < llistaTreballadors.size() && !endW) {
			Treballador trebTrovat = llistaTreballadors.get(i);
			
			if(nom.equalsIgnoreCase(trebTrovat.getNom()) && cognom.equalsIgnoreCase(trebTrovat.getCognom())) {
				posTre = i;
				endW = true;
			}	
		i++;
		}
		if(endW) {
			
			while(j < llistaTreballadors.get(posTre).getLlistaUniformes().size() && !esc) {
				Uniformitat unifTrovat = llistaTreballadors.get(posTre).getLlistaUniformes().get(j);
				
				if(unifTrovat.getNomUni().equalsIgnoreCase("mascareta")) {
					esc = true;
				
				}
			j++;
			}
			
			if(esc) {
				System.out.println("El/La treballador/a ja disposa de mascareta");
				System.out.println("");
			}else {
				llistaTreballadors.get(posTre).setLlistaUniformes(uni3);
				uni3.retUnitats();
				System.out.println(llistaTreballadors.get(posTre).toString());
				System.out.println("");
			}
			
		}else {
			System.out.println("El treballador cercat no s´ha trovat");
			System.out.println("");
		}
		
	}
	
	public static void donarGuants() {
		
		String nom;
		String cognom;
		int posTre = -1;
		boolean endW = false;
		boolean esc = false;
		int i = 0;
		int j = 0;
		
		
		entrada.nextLine();
		System.out.println("Introdueix el nom del treballador a cercar: ");
		nom = entrada.nextLine();
		System.out.println("Introdueix el cognom del trebalador a cercar: ");
		cognom = entrada.nextLine();
		
		while(i < llistaTreballadors.size() && !endW) {
			Treballador trebTrovat = llistaTreballadors.get(i);
			
			if(nom.equalsIgnoreCase(trebTrovat.getNom()) && cognom.equalsIgnoreCase(trebTrovat.getCognom())) {
				posTre = i;
				endW = true;
			}	
		}
		if(endW) {
			
			while(j < llistaTreballadors.get(posTre).getLlistaUniformes().size() && !esc) {
				Uniformitat unifTrovat = llistaTreballadors.get(posTre).getLlistaUniformes().get(j);
				
				if(unifTrovat.getNomUni().equalsIgnoreCase("guants")) {
					esc = true;
				}
			j++;
			}
			
			if(esc) {
				System.out.println("El/La treballador/a ja disposa de guants");
				System.out.println("");
			}else {
				llistaTreballadors.get(posTre).setLlistaUniformes(uni4);
				uni4.retUnitats();
				System.out.println(llistaTreballadors.get(posTre).toString());
				System.out.println("");
				
			}
			
		}else {
			System.out.println("El treballador cercat no s´ha trovat");
			System.out.println("");
		}
		
	}
	
		public static void tornarUni() {
	
			
			int opcio;
		
			
			do {
				System.out.println("Introdueix l´opció desitjada: \n1. Tornar jaqueta\n2. Tornar pantalons"
						+ "\n3. Tornar sabates\n4. Tornar mascareta\n5. Tornar guants\n0. Sortir");
				opcio = entrada.nextInt();
				
					switch(opcio) {
						
						case 1: tornarJaqueta();
							break;
						case 2:	tornarPantalons();
							break;
						case 3: tornarSabates();
							break;
						case 4: tornarMascareta();
							break;
						case 5:	tornarGuants();
							break;
						case 0:
							System.out.println("Sortint!");
							System.out.println("");
							break;
						default:
							System.out.println("L´opció escollida no és vàlida");
							System.out.println("");				
					}	
				
			}while(opcio != 0);
	}
	
	public static void tornarJaqueta() {
		
		String nom;
		String cognom;
		int posTre = -1;
		boolean endW = false;
		boolean esc = false;
		int posJac = -1;
		int i = 0;
		int j = 0;
		
		
		entrada.nextLine();
		System.out.println("Introdueix el nom del treballador a cercar: ");
		nom = entrada.nextLine();
		System.out.println("Introdueix el cognom del trebalador a cercar: ");
		cognom = entrada.nextLine();
		
		while(i < llistaTreballadors.size() && !endW) {
			Treballador trebTrovat = llistaTreballadors.get(i);
			
			if(nom.equalsIgnoreCase(trebTrovat.getNom()) && cognom.equalsIgnoreCase(trebTrovat.getCognom())) {
				posTre = i;
				endW = true;
			}	
		i++;
		}
		if(endW) {
			System.out.println(llistaTreballadors.get(posTre).toString());
			System.out.println("");
			
			while(j < llistaTreballadors.get(posTre).getLlistaUniformes().size() && !esc) {
				Uniformitat unifTrovat = llistaTreballadors.get(posTre).getLlistaUniformes().get(j);
				
				if(unifTrovat.getNomUni().equalsIgnoreCase("jaqueta")) {
					esc = true;
					posJac = j;
				}
			j++;
			}
			
			if(esc) {
				llistaTreballadors.get(posTre).getLlistaUniformes().remove(posJac);
				uni0.tornUnitats();
				
			}else {
				System.out.println("El/La treballador/a no disposa de jaqueta");
				System.out.println("");
			}
			
		}else {
			System.out.println("El treballador cercat no s´ha trovat");
			System.out.println("");
		}
		
	}
	
	public static void tornarPantalons() {
		
		String nom;
		String cognom;
		int posTre = -1;
		boolean endW = false;
		boolean esc = false;
		int posJac = -1;
		int i = 0;
		int j = 0;
		
		
		entrada.nextLine();
		System.out.println("Introdueix el nom del treballador a cercar: ");
		nom = entrada.nextLine();
		System.out.println("Introdueix el cognom del trebalador a cercar: ");
		cognom = entrada.nextLine();
		
		while(i < llistaTreballadors.size() && endW) {
			Treballador trebTrovat = llistaTreballadors.get(i);
			
			if(nom.equalsIgnoreCase(trebTrovat.getNom()) && cognom.equalsIgnoreCase(trebTrovat.getCognom())) {
				posTre = i;
				endW = true;
			}	
		}
		if(endW) {
			System.out.println(llistaTreballadors.get(posTre).toString());
			System.out.println("");
			
			while(j < llistaTreballadors.get(posTre).getLlistaUniformes().size() && !esc) {
				Uniformitat unifTrovat = llistaTreballadors.get(posTre).getLlistaUniformes().get(j);
				
				if(unifTrovat.getNomUni().equalsIgnoreCase("pantalons")) {
					esc = true;
					posJac = j;
				}
			j++;
			}
			
			if(esc) {
				llistaTreballadors.get(posTre).getLlistaUniformes().remove(posJac);
				uni1.tornUnitats();
				
			}else {
				System.out.println("El/La treballador/a no disposa de pantalons");
				System.out.println("");
			}
			
		}else {
			System.out.println("El treballador cercat no s´ha trovat");
			System.out.println("");
		}
		
	}
	
	public static void tornarSabates() {
		
		String nom;
		String cognom;
		int posTre = -1;
		boolean endW = false;
		boolean esc = false;
		int posJac = -1;
		int i = 0;
		int j = 0;
		
		
		entrada.nextLine();
		System.out.println("Introdueix el nom del treballador a cercar: ");
		nom = entrada.nextLine();
		System.out.println("Introdueix el cognom del trebalador a cercar: ");
		cognom = entrada.nextLine();
		
		while(i < llistaTreballadors.size() && !endW) {
			Treballador trebTrovat = llistaTreballadors.get(i);
			
			if(nom.equalsIgnoreCase(trebTrovat.getNom()) && cognom.equalsIgnoreCase(trebTrovat.getCognom())) {
				posTre = i;
				endW = true;
			}	
		i++;
		}
		if(endW) {
			System.out.println(llistaTreballadors.get(posTre).toString());
			System.out.println("");
			
			while(j < llistaTreballadors.get(posTre).getLlistaUniformes().size() && !esc) {
				Uniformitat unifTrovat = llistaTreballadors.get(posTre).getLlistaUniformes().get(j);
				
				if(unifTrovat.getNomUni().equalsIgnoreCase("sabates")) {
					esc = true;
					posJac = j;
				}
			j++;
			}
			
			if(esc) {
				llistaTreballadors.get(posTre).getLlistaUniformes().remove(posJac);
				uni2.tornUnitats();
				
			}else {
				System.out.println("El/La treballador/a no disposa de sabates");
				System.out.println("");
			}
			
		}else {
			System.out.println("El treballador cercat no s´ha trovat");
			System.out.println("");
		}
		
	}
	public static void tornarMascareta() {
		
		String nom;
		String cognom;
		int posTre = -1;
		boolean endW = false;
		boolean esc = false;
		int posJac = -1;
		int i = 0;
		int j = 0;
		
		
		entrada.nextLine();
		System.out.println("Introdueix el nom del treballador a cercar: ");
		nom = entrada.nextLine();
		System.out.println("Introdueix el cognom del trebalador a cercar: ");
		cognom = entrada.nextLine();
		
		while(i < llistaTreballadors.size() && !endW) {
			Treballador trebTrovat = llistaTreballadors.get(i);
			
			if(nom.equalsIgnoreCase(trebTrovat.getNom()) && cognom.equalsIgnoreCase(trebTrovat.getCognom())) {
				posTre = i;
				endW = true;
			}
		i++;
		}
		if(endW) {
			System.out.println(llistaTreballadors.get(posTre).toString());
			System.out.println("");
			
			while(j < llistaTreballadors.get(posTre).getLlistaUniformes().size() && !esc) {
				Uniformitat unifTrovat = llistaTreballadors.get(posTre).getLlistaUniformes().get(j);
				
				if(unifTrovat.getNomUni().equalsIgnoreCase("mascareta")) {
					esc = true;
					posJac = j;
				}
			}
			
			if(esc) {
				llistaTreballadors.get(posTre).getLlistaUniformes().remove(posJac);
				uni3.tornUnitats();
				
			}else {
				System.out.println("El/La treballador/a no disposa de mascareta");
				System.out.println("");
			}
			
		}else {
			System.out.println("El treballador cercat no s´ha trovat");
			System.out.println("");
		}
		
	}
	
	public static void tornarGuants() {
		
		String nom;
		String cognom;
		int posTre = -1;
		boolean endW = false;
		boolean esc = false;
		int posJac = -1;
		int i = 0;
		int j = 0;
		
		
		entrada.nextLine();
		System.out.println("Introdueix el nom del treballador a cercar: ");
		nom = entrada.nextLine();
		System.out.println("Introdueix el cognom del trebalador a cercar: ");
		cognom = entrada.nextLine();
		
		while(i < llistaTreballadors.size() && !endW) {
			Treballador trebTrovat = llistaTreballadors.get(i);
			
			if(nom.equalsIgnoreCase(trebTrovat.getNom()) && cognom.equalsIgnoreCase(trebTrovat.getCognom())) {
				posTre = i;
				endW = true;
			}
		i++;
		}
		if(endW) {
			System.out.println(llistaTreballadors.get(posTre).toString());
			System.out.println("");
			
			while(j < llistaTreballadors.get(posTre).getLlistaUniformes().size() && !esc) {
				Uniformitat unifTrovat = llistaTreballadors.get(posTre).getLlistaUniformes().get(j);
				
				if(unifTrovat.getNomUni().equalsIgnoreCase("guants")) {
					esc = true;
					posJac = j;
				}
			j++;
			}
			
			if(esc) {
				llistaTreballadors.get(posTre).getLlistaUniformes().remove(posJac);
				uni4.tornUnitats();
				
			}else {
				System.out.println("El/La treballador/a no disposa de guants");
				System.out.println("");
			}
			
		}else {
			System.out.println("El treballador cercat no s´ha trovat");
			System.out.println("");
		}
	}
	
	public static void veureStock() {
		
		System.out.println(uni0.veureStockatge());
		System.out.println(uni1.veureStockatge());
		System.out.println(uni2.veureStockatge());
		System.out.println(uni3.veureStockatge());
		System.out.println(uni4.veureStockatge());
			}
		
	}
		


