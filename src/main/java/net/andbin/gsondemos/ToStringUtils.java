/*
 * Copyright (C) 2017 Andrea Binello ("andbin")
 *
 * This file is part of the "Java Gson Demos" project and is licensed
 * under the MIT License. See one of the license files included in the root
 * of the project for the full text of the license.
 */

package net.andbin.gsondemos;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

public class ToStringUtils {
    private static final ToStringStyle STD_TO_STRING_STYLE = new StdToStringStyle();

    private ToStringUtils() {}

    public static ToStringBuilder stdToStringBuilder(Object object) {
        return new ToStringBuilder(object, STD_TO_STRING_STYLE);
    }


    private static final class StdToStringStyle extends ToStringStyle {
        private static final long serialVersionUID = 1L;

        StdToStringStyle() {
            setUseShortClassName(true);
        }
    }
}
