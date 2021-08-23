package Duke.exception;

/**
 * CS2103T Individual Project AY 21/22 Sem 1
 * Project Duke
 *
 * Current Progress: A-JUnit. Add JUNit Test
 *
 * Description:
 * Class to encapsulates all possible exceptions that will be
 * raised whilst interacting with chatbot, Duke.
 *
 * @author Keith Tan
 */
public class DukeException extends Exception {

    private String message;

    public DukeException(String message) {

        this.message = message;

    }

    @Override
    public String toString() {

        return this.message;

    }

}