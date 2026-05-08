package view;

import javax.swing.*;

/**
 * 学習中の画面のプレビューを行うクラス
 */
public class StudyScreenPreview {
    public static void main(String[] args){
        JFrame frame = new JFrame("StudyScreenPreview");
        
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        StudyScreen studyScreen = new StudyScreen(frame);
        studyScreen.setEnLabelText("<html><span style='color: red;'>Pre</span>view</html>");
        studyScreen.setJpLabelText("<html>プレビュー</html>");
        frame.add(studyScreen);

        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
