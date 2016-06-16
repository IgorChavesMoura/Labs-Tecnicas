abstract class Expression implements Observable{
	Expression esq;
	Expression dir;

	Observer observadores[] = new Observer[2];
	int cont = 0;

	abstract float operation();

	public int getEstado(){
		if(this.operation() > 0){
			return 1;
		} else if(this.operation() == 0){
			return 0;
		} else {
			return -1;
		}
		

	}
	public void registro(Observer observer){
		this.observadores[cont++] = observer;
	}
	
	void notificarTodos(){
		for(int i = 0; i<2; i++){
			this.observadores[i].notificar(this);
		}
	}

	void add(Expression e){
		if(this.esq == null){
			this.esq = e;

		}
		else {
			this.dir = e;
		}
	}

	Expression remove(){
		if(this.dir == null){
			Expression aux = this.esq;
			this.esq = null;
			return aux;
		} else {
			Expression aux = this.dir;
			this.dir = null;
			return aux;
		}
	}

	Expression getChild(int index){
		if(index == 0){
			return this.esq;
		} else if(index == 1){
			return this.dir;
		}
		return null;
	}
}