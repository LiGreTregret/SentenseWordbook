package view;

import javax.swing.*;

/**
 * 親フレームの動作を確認するクラス
 */
public class ParentFrameTest {
    public static void main(String[] args) {
        ParentFrame parentFrame = new ParentFrame();
        parentFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        parentFrame.setVisible(true);
    }
}
