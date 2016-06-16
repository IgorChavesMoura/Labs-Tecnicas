import java.lang.*;

class Seno extends ExpressionDecorator{
	
	Seno(Expression e){
		this.e = e; 
	}
	
	public float decorarExpressao(){
		float rad = (float)Math.toRadians(e.operation());
		
		return (float)Math.sin(rad);
	}
}