public class Circle implements Shape{
  private double radius;
  private double circle;

  Circle(){
    radius = getRadius();
    circle =getArea();
  }

  @Override
  public double getArea(){
    circle = Math.PI * radius * radius;

    return circle;
  }

  public double getRadius(){
    return radius;
  }

  public double getCircle(){
    return circle;
  }

  public void setRadius(double r){
    this.radius = r;
  }

  @Override
  public String toString() {
    return "Circle{" +
        "radius=" + radius +
        ", circle=" + circle +
        '}';
  }
}
