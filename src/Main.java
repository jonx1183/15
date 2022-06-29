import java.util.ArrayList;

public class Main {
ArrayList<Square> sqList = new ArrayList<Square>();
ArrayList<Circle> cList = new ArrayList <Circle>();
  public static void main(String[] args) {
    Main main = new Main();
    main.go();
  }

  public void go(){
    createSQ();
    crateCircle();
    printLoop();

  }

  public void createSQ(){
    Square sq1 = new Square();
    sq1.setWidth(4);
    sqList.add(sq1);
    Square sq2 = new Square();
    sq2.setWidth(2);
    sqList.add(sq2);

  }

  public void crateCircle(){
    Circle c1 = new Circle();
    c1.setRadius(2);
    cList.add(c1);
    Circle c2 = new Circle();
    c2.setRadius(5);
    cList.add(c2);
  }

  public void printLoop(){
    for (int i =0; i < sqList.size(); i++){
      System.out.println("The area of the square is: " + sqList.get(i).getArea());
    }

    for (int i = 0; i < cList.size(); i++){
      System.out.println("The area of the circle is: " + cList.get(i).getArea());
    }


  }

}
