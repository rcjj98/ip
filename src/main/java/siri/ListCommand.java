package siri;

//ListCommand.java reused from Brigette Santoso E0564307
/**
 * List down all tasks currently inside the list
 */
public class ListCommand extends Command {

    @Override
    public void execute(TaskList tasks, Ui ui, Storage storage) {
        ui.showList(tasks.tasks);
    }
}
