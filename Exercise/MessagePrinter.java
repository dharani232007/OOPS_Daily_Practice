package Exercise;
// Create a class MessagePrinter with a method printMessage(String name) which prints the message "hello <name>".
public class MessagePrinter {

    void printMessage(String nameString){

        System.out.println(nameString);

    }

    public static void main(String[] args){
        MessagePrinter obj = new MessagePrinter();
        obj.printMessage("Dharani");
}

    
}
