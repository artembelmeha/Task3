
public class Vector {
	private double x;
	private double y;
	private double z;
	
	public Vector(double x, double y, double z) {
		super();
		this.x = x;
		this.y = y;
		this.z = z;
	}

	public Vector() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * @return the x
	 */
	public double getX() {
		return x;
	}

	/**
	 * @param x the x to set
	 */
	public void setX(double x) {
		this.x = x;
	}

	/**
	 * @return the y
	 */
	public double getY() {
		return y;
	}

	/**
	 * @param y the y to set
	 */
	public void setY(double y) {
		this.y = y;
	}

	/**
	 * @return the z
	 */
	public double getZ() {
		return z;
	}

	/**
	 * @param z the z to set
	 */
	public void setZ(double z) {
		this.z = z;
	}

	public Vector addVector(Vector vec1) {
		Vector res = new Vector();
		res.setX(this.getX()+vec1.getX());
		res.setY(this.getY()+vec1.getY());
		res.setZ(this.getZ()+vec1.getZ());
		return res;
	}
	public void scalarMultiplication(Vector vec1) {
		double res = this.getX()*vec1.getX()+this.getY()*vec1.getY()+this.getZ()*vec1.getZ();
		System.out.println("("+this.getX()+";"+this.getY()+";"+this.getZ()+")*("+vec1.getX()+";"+vec1.getY()+";"
				+vec1.getZ()+") = "+res);
	}
	public Vector vectorMultiplication(Vector vec1) {
		Vector res = new Vector();
		res.setX(this.getY()*vec1.getZ()-this.getZ()*vec1.getY());
		res.setY(this.getZ()*vec1.getX()-this.getX()*vec1.getZ());
		res.setZ(this.getX()*vec1.getY()-this.getY()*vec1.getX());
		return res;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Vector [x=" + x + ", y=" + y + ", z=" + z + "]";
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	
	
	
}
