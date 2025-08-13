import java.util.LinkedList;

public class add {
    public static void main(String[] args) {
    LinkedList<String> cars = new LinkedList<String>();
    cars.add("Volvo");
    cars.add("BMW");
    cars.add("Ford");
    cars.add("Mazda");
    cars.addFirst("Mazda");
    cars.addLast("Mazda");
    System.out.println(cars.getFirst());
    System.out.println(cars);
    cars.removeFirst();
    System.out.println(cars);

  }
}
    
