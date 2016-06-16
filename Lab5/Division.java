class Division extends OperadorBin{
	

	Division(Expression e1,Expression e2){
		this.esq = e1;
		this.dir = e2;
	}
	@Override
	float operation(){
		
		return this.esq.operation()/this.dir.operation();
		
	}
}