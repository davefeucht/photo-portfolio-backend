package com.throughapinhole.photoportfolio.utils;

/** Contains constant values and utility methods for use in the project */
public final class Utils {
    /** Value for a Category which has no parent */
    public static final int CATEGORY_NO_PARENT = -1;

    public static enum USER_STATUS {
        ACTIVE(0),
        REGISTERED(1),
        DISABLED(2);

        private final int value;

        USER_STATUS (final int newValue) {
            value = newValue;
        }

        public int getValue() {
            return value;
        }
    }
    private Utils() {}
}
