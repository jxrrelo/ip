package jaryl.duke;

/**
 * DukeException handles duke exceptions
 */
public class DukeException extends Exception {
    public DukeException(String message) {
        super(message);
    }

    @Override
    public String toString() {
        return "☹ OOPS! " + this.getMessage();
    }
}
