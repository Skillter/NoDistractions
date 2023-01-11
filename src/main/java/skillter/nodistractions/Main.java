package skillter.nodistractions;


import javax.swing.*;

import java.awt.*;
import java.awt.event.*;

public class Main {

    public static void main(String[] args) {

        System.out.println("its working");
        buildFrame();

    }

    public static void buildFrame() {
        // Create a new JFrame
        JFrame frame = new JFrame("No Distractions");
        frame.setSize(500, 300);

        // Panels
        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.Y_AXIS));

        JPanel buttonsPanel = new JPanel();
        mainPanel.setLayout(new FlowLayout());

        // Buttons
        JButton toggleOffButton = new JButton("Revert back");
        JButton toggleOnButton = new JButton("No distractions!");
        toggleOffButton.addActionListener(e -> {
            System.exit(0);
        });
        toggleOnButton.addActionListener(e -> {
        });
        buttonsPanel.add(toggleOffButton);
        buttonsPanel.add(toggleOnButton);

        // Checkmarks Panel
        JPanel checkmarksPanel = new JPanel();
        checkmarksPanel.setLayout(new BoxLayout(checkmarksPanel, BoxLayout.Y_AXIS));

        // Create checkboxes
        JCheckBox checkbox1 = new JCheckBox("Discord dnd");
        JCheckBox checkbox2 = new JCheckBox("Windows Focus Assist");
        JCheckBox checkbox3 = new JCheckBox("Block Entertaining Websites");
        JCheckBox checkbox4 = new JCheckBox("Item 4");
        checkmarksPanel.add(checkbox1);
        checkmarksPanel.add(checkbox2);
        checkmarksPanel.add(checkbox3);
        checkmarksPanel.add(checkbox4);

        buttonsPanel.setAlignmentY(Component.TOP_ALIGNMENT);
        checkmarksPanel.setAlignmentY(Component.BOTTOM_ALIGNMENT);

        mainPanel.add(buttonsPanel);
        mainPanel.add(Box.createVerticalGlue());
        mainPanel.add(Box.createHorizontalGlue());
        mainPanel.add(checkmarksPanel);
        frame.add(mainPanel);
        // Show the frame
        frame.setVisible(true);
    }

    public void toggleOff() {

    }
}
