package net.unix.heightcalculator.util;

import javax.swing.*;

/**
 * @author Unix
 * @since 25.04.2021
 */

public final class PopupUtil {

    private PopupUtil() {
    }

    public static void showPopup(String message) {
        JOptionPane.showOptionDialog(null, message, "Result", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, null, null);
    }

}