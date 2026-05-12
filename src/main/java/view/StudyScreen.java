package view;

import java.awt.*;
import javax.swing.*;

/**
 * 学習中の画面のパネルをつくるクラス
 * メインフレームに埋め込んで使う
 */
public class StudyScreen extends JPanel {
    private ParentFrame parent;
    private JLabel englishLabel;
    private JLabel japaneseLabel;

    /** ParentFrame埋め込み用 */
    public StudyScreen(ParentFrame parent) {
        this.parent = parent;
        init();
    }

    /** プレビュー用 */
    public StudyScreen() {
        this.parent = null;
        init();
    }

    /** 画面構成 */
    private void init() {
        /* パネル全体の設定 */
        this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        this.setPreferredSize(new Dimension(1080, 720));

        /* ホーム画面に戻るボタンの設定 */
        // ボタンを入れるパネルの設定
        JPanel homeBtnPanel = new JPanel(new FlowLayout(FlowLayout.RIGHT)) {
            @Override
            public Dimension getMaximumSize() {
                Dimension pref = getPreferredSize();
                return new Dimension(Integer.MAX_VALUE, pref.height);
            }
        };

        // ボタンの設定
        JButton homeButton = new JButton("ホームに戻る");
        homeButton.setAlignmentX(Component.RIGHT_ALIGNMENT);
        homeButton.setFont(new Font(Font.DIALOG_INPUT, Font.BOLD, 16));

        // 画面遷移の操作実装
        homeButton.addActionListener(e -> {
            if (parent != null) {
                parent.showScreen("Home");
            } else {
                System.out.println("プレビュー中");
            }
        });

        // パネルにボタンを追加
        homeBtnPanel.add(homeButton);

        /* 文字表示部分の設定 */
        // ラベルを入れるパネルの設定
        JPanel displayPanel = new JPanel() {
            @Override
            public Dimension getMaximumSize() {
                return new Dimension(Integer.MAX_VALUE, Integer.MAX_VALUE);
            }
        };
        displayPanel.setLayout(new GridBagLayout());
        GridBagConstraints dspPnlBagConstraints = new GridBagConstraints();
        dspPnlBagConstraints.gridx = 0;
        dspPnlBagConstraints.gridy = GridBagConstraints.RELATIVE;
        dspPnlBagConstraints.insets = new Insets(10, 0, 10, 0);
        displayPanel.setPreferredSize(new Dimension(Integer.MAX_VALUE, Integer.MAX_VALUE));

        // 英文を表示するラベルの設定
        englishLabel = new JLabel();
        englishLabel.setHorizontalAlignment(SwingConstants.CENTER);
        englishLabel.setFont(new Font(Font.DIALOG_INPUT, Font.BOLD, 44));

        // 日本語訳を表示するラベルの設定
        japaneseLabel = new JLabel();
        japaneseLabel.setHorizontalAlignment(SwingConstants.CENTER);
        japaneseLabel.setFont(new Font(Font.DIALOG_INPUT, Font.BOLD, 32));

        // パネルにラベルを追加
        displayPanel.add(englishLabel, dspPnlBagConstraints);
        displayPanel.add(japaneseLabel, dspPnlBagConstraints);

        /* パネルに要素を追加 */
        this.add(homeBtnPanel);
        this.add(displayPanel);
    }

    public void setEnLabelText(String text) {
        englishLabel.setText(text);
    }

    public void setJpLabelText(String text) {
        japaneseLabel.setText(text);
    }
}
