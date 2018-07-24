
public class Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector vector1 = new Vector(2.3, 3,5);
		Vector vector2 = new Vector(1.7, 2.5,-0.2);
		System.out.println(vector1.toString());
		System.out.println(vector1.addVector(vector2).toString());
		vector1.scalarMultiplication(vector2);
		System.out.println(vector1.vectorMultiplication(vector2).toString());
	}
}
