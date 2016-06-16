import java.util.*;

class VerificaColecao {
	
	Collection<String> c;


	public VerificaColecao(Collection<String> c){
		this.c = c;
	}

	 void verificar(){
		if (!(this.c instanceof Set)){
			System.out.println("Permite inserção de elementos duplicados");
		}
		if((this.c instanceof TreeSet) || (this.c instanceof TreeMap)){
			System.out.println("Ordena os elementos");
		}	
		if((this.c instanceof LinkedList) || (this.c instanceof LinkedHashSet) || (this.c instanceof LinkedHashMap)){
			System.out.println("Mantem a ordem de entrada");
		}
	}
}