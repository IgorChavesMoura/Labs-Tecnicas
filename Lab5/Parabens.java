class Parabens implements Observer{
	public void notificar(Observable observable){
		int idade = observable.getEstado();
		if(idade > 21){
			System.out.println("Parabens");
		}
	}
}