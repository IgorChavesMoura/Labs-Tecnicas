import java.util.*;
class Teste_Hash2{
 
    public void lista(Collection c){
        Iterator itr = c.iterator();

        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
    void listar2(Collection c) {
        System.out.println("*** Listar 2 ****");
        for (Object o : c){
            System.out.println(o);
        }
    }
    
  
  public static void main(String args[]){
    Set<String> mesesHash1 = new HashSet<>();
    Set<String> mesesHash2 = new TreeSet<>();
    Set<String> mesesHash3 = new LinkedHashSet<>();
    List<String> mesesHash4 = new ArrayList<>();
    mesesHash1.add("Janeiro");
    mesesHash1.add("Fevereiro");
    mesesHash1.add("Março");
    mesesHash1.add("Abril");
    mesesHash1.add("Maio");
    mesesHash1.add("Fevereiro");
    mesesHash2.add("Janeiro");
    mesesHash2.add("Fevereiro");
    mesesHash2.add("Março");
    mesesHash2.add("Abril");
    mesesHash2.add("Maio");
    mesesHash2.add("Fevereiro");
    mesesHash3.add("Janeiro");
    mesesHash3.add("Fevereiro");
    mesesHash3.add("Março");
    mesesHash3.add("Abril");
    mesesHash3.add("Maio");
    mesesHash3.add("Fevereiro");
    mesesHash4.add("Janeiro");
    mesesHash4.add("Fevereiro");
    mesesHash4.add("Março");
    mesesHash4.add("Abril");
    mesesHash4.add("Maio");
    mesesHash4.add("Fevereiro");
    System.out.println("HashSet:");
    Teste_Hash2 teste = new Teste_Hash2();
    teste.lista(mesesHash1);
    System.out.println("_______________________________________");
    System.out.println("TreeSet:");
    teste.lista(mesesHash2);
    System.out.println("_______________________________________");
    System.out.println("LinkedHashSet:");
    teste.lista(mesesHash3);
    System.out.println("_______________________________________");
    System.out.println("ArrayList:");
    teste.lista(mesesHash4);
    System.out.println("_______________________________________");
  }
}
	
