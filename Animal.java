package inheritance;

public class Animal {

    private int brain;
    private int size;
    private String name;
    private int body;
    private int weight;

    public Animal(String name, int size, int brain, int weight, int body){
        this.name  =  name;
        this.size  = size;
        this.brain = brain;
        this.body = body;
        this.weight = weight;
    }

    public void eat(){
        System.out.println("Animal.eat() method called");
    }

    public void move(int sp){
        System.out.println("Animal.move() method is called");
        System.out.println(this.getName()+" moves at speed "+sp);
    }

    public int getBrain() {
        return brain;
    }

    public int getSize() {
        return size;
    }

    public String getName() {
        return name;
    }

    public int getBody() {
        return body;
    }

    public int getWeight() {
        return weight;
    }

    public void show(){

        String msg="";
        if(brain == 1) msg = "brain,";
        msg += " size of "+size+" and weight "+weight;
        System.out.println(this.name+" is an animal with "+msg);
    }
}
