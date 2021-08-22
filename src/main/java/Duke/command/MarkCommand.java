package Duke.command;

import Duke.exception.DukeException;

import Duke.util.Tasklist;
import Duke.util.Ui;
import Duke.util.Store;

/**
 * CS2103T Individual Project AY 21/22 Sem 1
 * Project Duke
 *
 * Current Progress: A-MoreOOP. Use More OOP
 *
 * Description:
 * Class that encapsulates the mark task command inputted by the user
 *
 * @author Keith Tan
 */
public class MarkCommand extends Command {

    private final int toMark;
    public static final String COMMAND_WORD = "add";

    public MarkCommand(int toMark) {

        this.toMark = toMark;

    }

    /**
     * Executes the mark task command. Marks a specific task in the task list as completed.
     *
     * @param list Tasklist of current tasks
     * @param ui Ui which prints any successful message from the associated methods
     * @param storage Current Storage of DUke
     * @throws DukeException throws an exception if any Duke Error occurs while running
     *                       the associated methods
     */
    @Override
    public void execute(Tasklist list, Ui ui, Store storage) throws DukeException {
        String successMessage = list.markTask(toMark);
        ui.printMessage(successMessage);

    }

}
