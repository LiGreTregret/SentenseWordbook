package main.java.view;

import java.awt.Component;

import javax.swing.*;

/**
 * ホーム画面のパネルをつくるクラス
 * メインフレームに埋め込んで使う
 */
public class HomeScreen extends JPanel {
    public HomeScreen() {
        this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));

        JLabel titleLabel = new JLabel("例文で覚える単語帳アプリ");
        titleLabel.setAlignmentX(Component.CENTER_ALIGNMENT);

        this.add(titleLabel);
    }
}