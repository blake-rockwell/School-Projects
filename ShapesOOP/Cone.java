
public class Cone extends Shape {
	
	private double radius;
	private double height;
	
	public Cone(double r, double h) {
		radius = r;
		height = h;
	}
	
	public String toString() {
		return "Cone:\nSurface Area: " + this.surface_area() + "\nVolume: " + this.volume()+"\n";
	}
	
	public double surface_area() {
		double slant = Math.sqrt(radius*radius + height*height);
		double SA = (Math.PI * radius * radius) + (Math.PI * radius * slant);
		return SA;
	}
	
	public double volume() {
		return (Math.PI*Math.pow(radius, 2)*height/3);
	}
}
