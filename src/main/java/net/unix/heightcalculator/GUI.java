package net.unix.heightcalculator;

import net.unix.heightcalculator.util.PopupUtil;
import javax.swing.*;
import java.awt.*;
import java.util.Arrays;

/**
 * @author Unix
 * @since 25.04.2021
 */

public class GUI extends JPanel {

    public GUI() {
        var button = new JButton("Apply");
        var label1 = new JLabel("Input your height");
        var label2 = new JLabel("cm");
        var textField = new JTextField(5);

        setPreferredSize(new Dimension(310, 140));
        setLayout(null);

        button.addActionListener(btn -> PopupUtil.showPopup(String.format("Your height is %scm!", textField.getText())));
        addAll(button, label1, label2, textField);
        button.setBounds(205, 90, 90, 30);
        label1.setBounds(15, 40, 100, 25);
        label2.setBounds(255, 40, 25, 20);
        textField.setBounds(115, 40, 135, 30);
    }

    private void addAll(Component... components) {
        Arrays.stream(components).forEachOrdered(this::add);
    }

}