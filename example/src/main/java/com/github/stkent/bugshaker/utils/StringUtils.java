/**
 * Copyright 2016 Stuart Kent
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License.
 *
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations
 * under the License.
 */
package com.github.stkent.bugshaker.utils;

import android.support.annotation.Nullable;

public final class StringUtils {

    private StringUtils() {

    }

    /**
     * Capitalizes a String changing the first letter to title case
     *
     * @param string the String to capitalize, may be null
     * @return the String with the first letter capitalized or null
     */
    @Nullable
    public static String capitalize(@Nullable final String string) {
        if (isBlank(string)) {
            return string;
        }

        final char firstChar = string.charAt(0);
        final char newChar = Character.toUpperCase(firstChar);
        if (firstChar == newChar) {
            return string;
        }

        int strLen = string.length();

        char[] newChars = new char[strLen];
        newChars[0] = newChar;
        string.getChars(1, strLen, newChars, 1);

        return String.valueOf(newChars);
    }

    /**
     * Checks if a CharSequence is whitespace, empty ("") or null.
     *
     * @param charSequence the CharSequence to check, may be null
     * @return true if the CharSequence is null, empty or whitespace
     */
    public static boolean isBlank(@Nullable final CharSequence charSequence) {
        if (charSequence == null) {
            return true;
        }

        final int sequenceLength = charSequence.length();

        if (sequenceLength == 0) {
            return true;
        }

        for (int i = 0; i < sequenceLength; i++) {
            if (!Character.isWhitespace(charSequence.charAt(i))) {
                return false;
            }
        }

        return true;
    }

}