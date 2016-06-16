class Variable extends Expression{
	float valor;

	
	void setValor(float valor){
		this.valor = valor;
	}
	
	Variable(float valor){
		this.valor = valor;
	}
	
	float operation(){
		return this.valor;
	}
}