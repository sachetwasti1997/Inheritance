package inheritance;

public class Dog extends Animal {

    private int legs;
    private int eyes;
    private int tail;
    private int teeth;
    private String coat;

    public Dog(String name, String coat, int tail, int teeth, int eyes,int legs,int weight, int size){
        super(name, size, 1, weight, 1);
        this.coat = coat;
        this.teeth = teeth;
        this.tail = tail;
        this.eyes = eyes;
        this.legs = legs;
    }

    public void eat(){
        System.out.println("Dog.eat() method is called");
        super.eat();
    }

    public void walk(){
        System.out.println("Dog.walk() method called"+this.getName()+" walks now ");
        move(5);
    }

    public void run(){
        System.out.println("Dog.run() method called"+this.getName()+" runs now ");
        move(10);
    }

    public void move(int sp){
        System.out.println("Dog.move() method is called");
        System.out.println("Here "+this.getName()+" is at speed "+sp);
        super.move(sp);
    }
}
