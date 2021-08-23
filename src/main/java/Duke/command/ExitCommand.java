package Duke.command;

import Duke.exception.DukeException;

import Duke.util.Tasklist;
import Duke.util.Ui;
import Duke.util.Store;

/**
 * CS2103T Individual Project AY 21/22 Sem 1
 * Project Duke
 *
 * Current Progress: A-JUnit. Add JUNit Test
 *
 * Description:
 * Class that encapsulates the bye command inputted by the user
 *
 * @author Keith Tan
 */
public class ExitCommand extends Command {

    public static final String COMMAND_WORD = "exit";

    public ExitCommand() {

    }

    /**
     * Returns a boolean of whether current command is the 'bye' command
     *
     * @return boolean returns boolean of whether current command is 'bye' command
     */
    @Override
    public boolean isExit() {
        return true;
    }

    /**
     * Executes the exit command. Saves current task list to hard disk and prints the goodbye message
     *
     * @param list Tasklist of current tasks
     * @param ui Ui which prints any successful message from the associated methods
     * @param storage Current Storage of DUke
     * @throws DukeException throws an exception if any Duke Error occurs while running
     *                       the associated methods
     */
    @Override
    public void execute(Tasklist list, Ui ui, Store storage) throws DukeException {

        storage.saveTasksToStore(list);
        ui.printGoodByeMessage();

    }
}
