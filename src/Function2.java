
public class Function2 extends Function {

	public Function2() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String answerString(double optVal, double x, double y, double z) {
		// TODO Auto-generated method stub
		return "Minimum time taken is " +optVal + " secs with running distance = " + x + "m";
	}

	@Override
	public double fnValue(double x) {
		// TODO Auto-generated method stub
		return x/3 + 2 * Math.sqrt(x*x - 8*x + 25);
	}

	@Override
	public double getXVal(double x) {
		// TODO Auto-generated method stub
		return x;
	}

	@Override
	public double getYVal(double x) {
		// TODO Auto-generated method stub
		return -1.0;
	}

	@Override
	public double getZVal(double x) {
		// TODO Auto-generated method stub
		return -1.0;
	}

	@Override
	public String toString() {
		return "Minimize the distance a dog will run and swim to retrieve a ball in the ocean";
	}

}
