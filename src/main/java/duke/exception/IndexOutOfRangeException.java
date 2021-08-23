package duke.exception;

/**
 * CS2103T Individual Project AY 21/22 Sem 1
 * Project Duke
 *
 * Current Progress: A-JavaDoc. Add JavaDoc comments to the code
 *
 * Description:
 * Class that encapsulates an index out of range exception that might be
 * raised whilst interacting with chatbot, Duke.
 *
 * @author Keith Tan
 */
public class IndexOutOfRangeException extends DukeException {

    public IndexOutOfRangeException(int enteredIndex, int listSize) {

        super("Hi, " + enteredIndex + " is not a valid index. List has currently " + listSize + " items.");

    }

}