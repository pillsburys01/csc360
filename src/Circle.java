public class Circle extends GeometricObject {
  private double radius;

  public Circle() {
  }

  public Circle(double radius) {
    this.radius = radius;
  }

  /** Return radius */
  public double getRadius() {
    return radius;
  }

  /** Set a new radius */
  public void setRadius(double radius) {
    this.radius = radius;
  }

  @Override /** Return area */
  public double getArea() {
    return radius * radius * Math.PI;
  }

  /** Return diameter */
  public double getDiameter() {
    return 2 * radius;
  }

  @Override /** Return perimeter */
  public double getPerimeter() {
    return 2 * radius * Math.PI;
  }

  /* Print the circle info */
  public void printCircle() {
    System.out.println("The circle is created " + getDateCreated() +
      " and the radius is " + radius);
  }
  
  public static void main(String[] args ) {
	    Rectangle rectangle = new Rectangle(2, 2);
	    Circle circle = new Circle (2);
	    System.out.println("Same area? " + equalArea(rectangle, circle));
	}

	public static <E extends GeometricObject> boolean     
	       equalArea(E object1, E object2) {
	    return object1.getArea() == object2.getArea();
	}

}
