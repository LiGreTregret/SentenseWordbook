package view;

import javax.swing.*;

/**
 * ホーム画面のプレビューを行うクラス
 */
public class HomeScreenPreview {
    public static void main(String[] args){
        JFrame frame = new JFrame("HomeScreenPreview");
        
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.add(new HomeScreen());

        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
