import java.util.*;

class Teste {
	public static void main(String[] args) {
		TreeMap<String,Integer> treeMap = new TreeMap<String,Integer>();
		LinkedHashMap<String,Integer> linkedHashMap = new LinkedHashMap<String,Integer>();
		LinkedList<String> lista = new LinkedList();
		VerificaColecao vC1 = new VerificaColecao(lista);
		vC1.verificar();
	}
}