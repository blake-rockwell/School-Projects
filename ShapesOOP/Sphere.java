class Sphere extends Shape {
	private double radius;
	public Sphere(double r) {
		radius = r;
	}
	public String toString() {
		return "Sphere:\nSurface Area: " + this.surface_area() + "\nVolume: " + this.volume()+"\n";
	}
	public double surface_area() {
		return Math.PI*4*radius*radius;
	}
	public double volume() {
		return (Math.PI*Math.pow(radius, 3)*4/3);
	}
}
