
public class Function1 extends Function {

	public Function1() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String answerString(double optVal, double x, double y, double z) {
		
		return "Minimum cost is $" + optVal + " with height = " + y + "cm and radius = " + x + "cm";
	}

	@Override
	public double fnValue(double x) {
		return 0.8 * Math.PI * x*x + 800/x;
	}

	@Override
	public double getXVal(double x) {
		return x;
	}

	@Override
	public double getYVal(double x) {
		return 2000/(Math.PI * x * x);
	}

	@Override
	public double getZVal(double x) {
		return -1.0;
	}

	@Override
	public String toString() {
		return "Minimize the cost of a can that will hold 2 liters of liquid";
	}

}
