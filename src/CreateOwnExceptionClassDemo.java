class CreateOwnExceptionClass extends Throwable {
    public CreateOwnExceptionClass(String message) {  //constructor
        super(message);
    }
}
public class CreateOwnExceptionClassDemo {
    // This method "throw MyMagicException" in its body.
    // MyMagicException is checked and need to be declared in the method's signature
    public static void magic(int number) throws CreateOwnExceptionClass {
        if (number == 8) {
            throw (new CreateOwnExceptionClass("you hit the magic number"));
        }
        System.out.println("hello");  // skip if exception triggered
    }

    public static void main(String[] args) {
        try {
            magic(9);   // does not trigger exception
            magic(8);   // trigger exception
        } catch (CreateOwnExceptionClass ex) {   // exception handler
            ex.printStackTrace();

        }
    }

}
