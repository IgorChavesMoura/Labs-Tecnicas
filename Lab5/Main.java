

class Main {
	public static void main(String[] args) {

		Variable x = new Variable(5);
		Variable y = new Variable(6);
		Variable w = new Variable(12);
		Variable z = new Variable(2);

		Positivo pos = new Positivo();
		NuloNegativo nulNeg = new NuloNegativo();

		Expression mult1 = new Mult(x,y);
		Expression div1 = new Division(mult1,z);
		Expression mult2 = new Mult(w,z);
		Expression div2 = new Division(mult2,y);

		Expression e = new Mult(div1,div2);

		e.registro(pos);
		e.registro(nulNeg);
		e.notificarTodos();
		
		ExpressionDecorator sen = new Seno(e);
		ExpressionDecorator cos = new Cosseno(e);

		System.out.println(e.operation());
		System.out.println(sen.decorarExpressao());
		System.out.println(cos.decorarExpressao());

	}
}