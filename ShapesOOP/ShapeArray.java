
public class ShapeArray {

	public static void main(String[] args) {
		
		Sphere s = new Sphere(6);
		Cylinder c = new Cylinder(4,5);
		Cone cone = new Cone(3,4);
		
		Shape shapeArray[] = new Shape[] {s,c,cone};
		
		for (Shape shape : shapeArray) {
			System.out.println(shape.toString());
		}
	}
}