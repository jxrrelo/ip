package jaryl.duke;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class Deadline extends Task {
    private final LocalDateTime date;

    public Deadline(String description, String date) throws InvalidFormatException, DateTimeParseException {
        super(description, "D");

        if(date.equals(""))
            throw new InvalidFormatException("Please specify both task description and date/time using /by");
        this.date = LocalDateTime.parse(date, DateTimeFormatter.ofPattern("dd/MM/yyyy HHmm"));
    }

    public String fileFormat() {
        DateTimeFormatter df = DateTimeFormatter.ofPattern("dd MMM yyyy HHmm");
        return "D | " + (super.isDone ? "1 | " : "0 | ") + this.description + " | " + df.format(this.date);
    }

    @Override
    public String toString() {
        DateTimeFormatter df = DateTimeFormatter.ofPattern("dd MMM yyyy HHmm");
        return "[" + super.getType() + "]" + super.toString() + " (by: " + df.format(this.date) + ")";
    }
}