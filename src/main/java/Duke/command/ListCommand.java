package Duke.command;

import Duke.exception.DukeException;

import Duke.util.Tasklist;
import Duke.util.Ui;
import Duke.util.Store;

/**
 * CS2103T Individual Project AY 21/22 Sem 1
 * Project Duke
 *
 * Current Progress: A-Jar. Create a JAR file
 *
 * Description:
 * Class that encapsulates the list command inputted by the user
 *
 * @author Keith Tan
 */
public class ListCommand extends Command {

    public static final String COMMAND_WORD = "list";

    public ListCommand() {

    }

    /**
     * Executes the list command. Prints the current task list for the user.
     *
     * @param list Tasklist of current tasks
     * @param ui Ui which prints any successful message from the associated methods
     * @param storage Current Storage of DUke
     * @throws DukeException throws an exception if any Duke Error occurs while running
     *                       the associated methods
     */
    @Override
    public void execute(Tasklist list, Ui ui, Store storage) throws DukeException {
        ui.printMessage("Here are the tasks in your list:\n" + list.toString());

    }
}
