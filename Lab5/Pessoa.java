class Pessoa implements Observable{
	String nome;
	int idade;
	Observer observadores[] = new Observer[10];
	int cont = 0;
	
	public void registro (Observer o){
		observadores[cont++] = o;

	}
	void setIdade(int idade){
		this.idade = idade;
		notificarTodos();
	}
	void notificarTodos(){
		for(int i = 0;i < cont;i++){
			observadores[i].notificar(this);
		}
	}

	int getIdade(){
		return this.idade;
	}
	public int getEstado(){
		return this.getIdade();
	}

}

