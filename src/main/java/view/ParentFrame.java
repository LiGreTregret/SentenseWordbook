package view;

import javax.swing.*;
import java.awt.*;

/**
 * 各画面を登録して画面遷移を行う親フレームをつくるクラス
 * 使用されるパネルを適宜インスタンスメソッドで登録して使う
 */
public class ParentFrame extends JFrame {
    private CardLayout cardLayout;
    private JPanel mainPanel;

    public ParentFrame() {
        /* 基本設定 */
        setTitle("例文で覚える単語帳");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(1080, 720);

        /* 画面遷移を行えるパネルの設定 */
        cardLayout = new CardLayout();
        mainPanel = new JPanel(cardLayout);

        /* 各画面のインスタンス化 */
        // HomeScreen homeScreen = new HomeScreen(this);
        // StudyScreen studyScreen = new StudyScreen(this);

        /* パネルに画面を登録 */
        // mainPanel.add(homeScreen, "Home");
        // mainPanel.add(studyScreen, "Study");
        
        add(mainPanel);
        setVisible(true);
    }

    public void showScreen(String screenName) {
        cardLayout.show(mainPanel, screenName);
    }
}
