package siri;

/**
 * Represents a to-do task
 */
public class Todo extends Task {

    public Todo(String description, String initialLetter) {
        super(description, initialLetter);
    }

    @Override
    public String toString() {
        return "[T]" + "[" + this.getStatusIcon() + "] "
                + this.description;
    }

}
