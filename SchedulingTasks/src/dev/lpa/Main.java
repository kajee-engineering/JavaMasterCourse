package dev.lpa;

import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class Main {

    var dtf = DateTimeFormatter.ofLocalizedDateTime(
            FormatStyle.MEDIUM,
            FormatStyle.LONG,
    )
}
