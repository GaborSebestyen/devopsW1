public class HelloWorld {

    public String greeting = "Hello World";
    public String greet;

    public HelloWorld() {
    System.out.println(greeting);
    }

    public HelloWorld(String greet) {
        this.greet = greet;
        System.out.println(greet);
    }

    public static void main(String[] args) {
        HelloWorld first = new HelloWorld();
        HelloWorld second = new HelloWorld("Hello from me again");
    }
}


