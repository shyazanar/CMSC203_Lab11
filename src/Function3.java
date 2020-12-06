
public class Function3 extends Function {

	public Function3() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String answerString(double optVal, double x, double y, double z) {
		// TODO Auto-generated method stub
		return "Minimum distance is " + optVal + " with x = " + x;
	}

	@Override
	public double fnValue(double x) {
		// TODO Auto-generated method stub
		return Math.sqrt(Math.pow(x, 4) - Math.pow(x, 2) +1);
	}

	@Override
	public double getXVal(double x) {
		// TODO Auto-generated method stub
		return x;
	}

	@Override
	public double getYVal(double x) {
		// TODO Auto-generated method stub
		return Math.pow(x, 2);
	}

	@Override
	public double getZVal(double x) {
		// TODO Auto-generated method stub
		return -1.0;
	}

	@Override
	public String toString() {
		return "Find the minimum distance between the function f(x)=x^2 and the point(0,1)";
	}

}
