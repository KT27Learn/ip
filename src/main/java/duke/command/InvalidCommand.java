package duke.command;

import duke.exception.DukeException;
import duke.exception.InvalidCommandException;

import duke.util.Tasklist;
import duke.util.Ui;
import duke.util.Store;

/**
 * CS2103T Individual Project AY 21/22 Sem 1
 * Project Duke
 *
 * Current Progress: A-JavaDoc. Add JavaDoc comments to the code
 *
 * Description:
 * Class that encapsulates an invalid command inputted by the user
 *
 * @author Keith Tan
 */
public class InvalidCommand extends Command {

    public static final String COMMAND_WORD = "error";

    public InvalidCommand() {

    }

    /**
     * Alerts the user that an invalid command has been inputted
     *
     * @param list Tasklist of current tasks
     * @param ui Ui which prints any successful message from the associated methods
     * @param storage Current Storage of DUke
     * @throws DukeException throws an exception if any Duke Error occurs while running
     *                       the associated methods
     */
    @Override
    public void execute(Tasklist list, Ui ui, Store storage) throws DukeException {
        throw new InvalidCommandException();

    }

}
