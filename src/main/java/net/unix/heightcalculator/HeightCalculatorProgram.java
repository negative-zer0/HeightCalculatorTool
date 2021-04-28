package net.unix.heightcalculator;

import javax.swing.*;

/**
 * @author Unix
 * @since 25.04.2021
 */

public class HeightCalculatorProgram {

    public static void main(String[] args) {
        var frame = new JFrame("Height calculator tool");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.getContentPane().add(new GUI());
        frame.pack();
        frame.setResizable(false);
        frame.setVisible(true);
    }

}