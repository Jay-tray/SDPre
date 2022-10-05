public class Objective3Lab2 {
  public static void main(String[] args){
    double side1, side2, hypotenuse;
    side1 = 10;
    side2 = 8;

    side1 = side1 * side1;
    side2 = side2 * side2;

    hypotenuse = side1 + side2;

    double result = Math.sqrt(hypotenuse);

    System.out.println("The hypotenuse of a triangle with sides " + Math.sqrt(side1) + " and " + Math.sqrt(side2) + " is " + result);

  }
}
