package org.exparity.hamcrest.date.core.format;

import static java.util.Locale.getDefault;
import static java.util.stream.Collectors.joining;

import java.time.temporal.ChronoField;
import java.util.stream.Stream;

/**
 * Return a human readable description of a date part
 *
 * @author Stewart Bissett
 */
public class DatePartFormatter {

    private static final String SPLIT_ON_UPPERCASE_REGEX = "(?=[A-Z])";

    /**
     * Return a human readable description of a date field
     * @param field the field to describe
     * @return the human readable description
     */
    public String describe(final ChronoField field) {
        switch (field) {
        default:
            return Stream.of(field.getDisplayName(getDefault()).split(SPLIT_ON_UPPERCASE_REGEX))
                    .map(String::toLowerCase)
                    .collect(joining(" "));
        }
    }

}
