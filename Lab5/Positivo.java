class Positivo implements Observer{
	public void notificar(Observable observable){
		int estado = observable.getEstado();
		if(estado > 0){
			System.out.println("É positivo");
		}
	}
}