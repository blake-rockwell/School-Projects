
public class Cylinder extends Shape {
	
	private double radius;
	private double height;
	
	public Cylinder(double r, double h) {
		radius = r;
		height = h;
	}
	
	public String toString() {
		return "Cylinder:\nSurface Area: " + this.surface_area() + "\nVolume: " + this.volume()+"\n";
	}
	
	public double surface_area() {
		return (Math.PI*radius*height*2)+ (Math.PI * Math.pow(radius, 2)*2);
	}
	
	public double volume() {
		return (Math.PI*Math.pow(radius, 2)*height);
	}
}
