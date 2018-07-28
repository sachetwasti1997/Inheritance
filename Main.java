package inheritance;

/*While inheriting from class we should have a constructor in the inherited class that passes the value to the base class constructor given that the
* base class also has a constructor*/
/*super() and this() cannot be called in the same method body*/
/*if any particular method is present both in the inherited and base classes then the call to the method without the prefix"super.",
  executes the method present in the verysame class, it goes for the method in the base class if the class callin the method doent
  defines the method*/
public class Main {
    public static void main(String[]ar){
        //String name, String coat, int tail, int teeth, int eyes,int legs,int weight, int size
        Dog dog = new Dog("German Shephard", "short",1, 20, 2, 4, 5, 3);
      /*  dog.getSize();
        dog.getBrain();/*Since the dog class extends from the Animal class, all the public feilds of the Animal class are accessible
                        using the object of dog class*/
        /*dog.getBody();
        dog.getWeight();
        dog.getName();*/
        dog.eat();
        dog.show();/*We can override the methods in the Animal class in the dog class*/
        dog.walk();
        dog.run();
    }
}
