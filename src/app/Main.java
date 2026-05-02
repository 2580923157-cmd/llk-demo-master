package app;

import model.Cell;
import model.GameBoard;
import model.Position;
import ui.BoardPanel;
import ui.GameFrame;

import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {

        SwingUtilities.invokeLater(() -> {
            GameFrame frame = new GameFrame("连连看", 800, 1000);
            frame.repaint();
            JFrame logIn = new JFrame("登录窗口" );
            logIn.setSize(500,500);
            logIn.setLayout(null);
            JButton press = new JButton("登录");
            press.setSize(50,50);
            press.setLocation(200,200);
            TextField blank = new TextField();
            blank.setSize(50,50);
            blank.setLocation(50,50);
            logIn.add(press);
            logIn.add(blank);
            logIn.setVisible(true);
            press.addActionListener(e->{
                System.out.println(blank.getText());
            });
        });
    }
}
