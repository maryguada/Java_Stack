public class Greeter {
    public String greet(String name){
        return "Hello " + name;
    }
    public String greet(){
        return createGreeting("World!");
    }

    public String greet(String firstName, String lastName){
        return createGreeting(firstName +" " + lastName); 
    }

    public String createGreeting(String toBeGreeted){
        return "Greetings" + toBeGreeted + " welcome to CD!";
    }
}

