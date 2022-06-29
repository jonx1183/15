public class Square implements Shape {
  private double width;
  private double square;

  Square(){
    width = getWidth();
    square = getArea();
  }

  @Override
  public double getArea() {
    square = width * width;

    return square;
  }

  public double getWidth(){
    return width;
  }

  public double getSquare(){
    return square;
  }

  public void setWidth(double w){
    this.width = w;
  }

  @Override
  public String toString() {
    return "Square{" +
        "width=" + width +
        ", square=" + square +
        '}';
  }
}
