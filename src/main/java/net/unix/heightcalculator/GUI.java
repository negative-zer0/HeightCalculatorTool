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
        var button1 = new JButton("Apply height");
        var label1 = new JLabel("Input your height");
        var textField1 = new JTextField(5);
        var label2 = new JLabel("cm");

        var button2 = new JButton("Apply weight");
        var label3 = new JLabel("Input your weight");
        var textField2 = new JTextField(5);
        var label4 = new JLabel("kg");

        setPreferredSize(new Dimension(310, 140));
        setLayout(null);

        button1.addActionListener(btn -> PopupUtil.showPopup(String.format("Your height is %scm!", textField1.getText())));
        button2.addActionListener(btn -> PopupUtil.showPopup(String.format("Your weight is %skg!", textField2.getText())));
        addAll(button1, label1, textField1, label2, button2, label3, textField2, label4);
        button1.setBounds(170, 90, 130, 30);
        label1.setBounds(15, 15, 100, 25);
        textField1.setBounds(115, 15, 135, 30);
        label2.setBounds(255, 15, 25, 20);

        button2.setBounds(10, 90, 130, 30);
        label3.setBounds(15, 55, 100, 25);
        textField2.setBounds(115, 55, 135, 30);
        label4.setBounds(255, 55, 25, 20);

    }

    private void addAll(Component... components) {
        Arrays.stream(components).forEachOrdered(this::add);
    }

}