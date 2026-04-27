package main.java.view;

import java.awt.*;
import javax.swing.*;

/**
 * ホーム画面のパネルをつくるクラス
 * メインフレームに埋め込んで使う
 */
public class HomeScreen extends JPanel {
    public HomeScreen() {
        /* パネル全体の設定 */
        this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        this.setPreferredSize(new Dimension(1080, 720));

        /* タイトルの設定 */
        JLabel titleLabel = new JLabel("例文で覚える単語帳アプリ");
        titleLabel.setFont(new Font(Font.DIALOG_INPUT, Font.BOLD, 40));
        titleLabel.setBorder(BorderFactory.createEmptyBorder(20, 0, 20, 0));
        titleLabel.setAlignmentX(Component.CENTER_ALIGNMENT);

        /* ボタンを入れるパネル */
        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new GridBagLayout());
        GridBagConstraints btnPnlBagConstraints = new GridBagConstraints();
        btnPnlBagConstraints.gridx = 0;
        btnPnlBagConstraints.gridy = GridBagConstraints.RELATIVE;
        btnPnlBagConstraints.insets = new Insets(10, 0, 10, 0);

        /* 「学習を始める」ボタンの設定 */
        JButton startButton = new JButton("学習を始める");
        startButton.setFont(new Font(Font.DIALOG_INPUT, Font.BOLD, 35));
        startButton.setPreferredSize(new Dimension(360, 120));
        startButton.setAlignmentX(Component.CENTER_ALIGNMENT);

        /* ボタンをパネルに追加 */
        buttonPanel.add(startButton, btnPnlBagConstraints);

        /* パネルに要素を追加 */
        this.add(titleLabel);
        this.add(buttonPanel);
    }
}