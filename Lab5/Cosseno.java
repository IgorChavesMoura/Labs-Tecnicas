import java.lang.*;

class Cosseno extends ExpressionDecorator{
	Expression e;

	Cosseno(Expression e){
		this.e = e;
	}

	public float decorarExpressao(){
		float rad = (float)Math.toRadians(e.operation());

		return (float)Math.cos(rad);
	}
}