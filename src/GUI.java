import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class GUI extends JFrame {
    private JPanel MainPanel;
    private JPanel bottomPanel;
    private JTextField DisplayTime;

    private JButton Button1;
    private JButton Button2;
    private JButton Button3;
    private JButton Button4;
    private JButton Button5;
    private JButton Button6;
    private JButton Button7;
    private JButton Button8;
    private JButton Button9;
    private JButton Button10;
    private JButton Button11;
    private JButton Button12;
    private JButton Button13;
    private JButton Button14;
    private JButton Button15;
    private JButton Button16;

    private List<JButton> buttonsList = new ArrayList<>();

    static int OFFSET_TIME = 3000;

    private int rn;
    private int rz16;
    private int ButtonAmount;
    private long timeStart;
    private long timeEnd;
    private long timeDiff;


    public GUI() {

        this.setTitle("Button Game");
        this.setVisible(true);
        this.setSize(650, 900);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setLayout(new BorderLayout());

        MainPanel = new JPanel(new GridLayout(4, 4));
        bottomPanel = new JPanel();

        Button1 = new JButton("Button1");
        Button2 = new JButton("Button2");
        Button3 = new JButton("Button3");
        Button4 = new JButton("Button4");
        Button5 = new JButton("Button5");
        Button6 = new JButton("Button6");
        Button7 = new JButton("Button7");
        Button8 = new JButton("Button8");
        Button9 = new JButton("Button9");
        Button10 = new JButton("Button10");
        Button11 = new JButton("Button11");
        Button12 = new JButton("Button12");
        Button13 = new JButton("Button13");
        Button14 = new JButton("Button14");
        Button15 = new JButton("Button15");
        Button16 = new JButton("Button16");

        buttonsList.add(Button1);
        buttonsList.add(Button2);
        buttonsList.add(Button3);
        buttonsList.add(Button4);
        buttonsList.add(Button5);
        buttonsList.add(Button6);
        buttonsList.add(Button7);
        buttonsList.add(Button8);
        buttonsList.add(Button9);
        buttonsList.add(Button10);
        buttonsList.add(Button11);
        buttonsList.add(Button12);
        buttonsList.add(Button13);
        buttonsList.add(Button14);
        buttonsList.add(Button15);
        buttonsList.add(Button16);

        this.add(MainPanel, BorderLayout.CENTER);
        this.add(bottomPanel,BorderLayout.SOUTH);
        bottomPanel.add(DisplayTime);
        //DisplayTime.add(timeDiff);

        //set Enabled of Buttons to false
        for (JButton button : buttonsList) {
            button.setEnabled(false);
            MainPanel.add(button);
        }
        Color bgc = Button1.getBackground();

        System.out.println(bgc.getRGB());


        for (JButton buttons : buttonsList) {
            buttons.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent actionEvent) {
                    buttons.setEnabled(false);
                    buttons.setBackground(bgc);
                    ButtonAmount--;

                    if (ButtonAmount == 0) {
                        //ButtonAmount = 0;
                        //clickedButtonsCount = 0;
                        timeEnd = System.currentTimeMillis();
                        timeDiff = timeEnd-timeStart;
                        System.out.println("Zeit:"+timeDiff);
                        randDelay();
                    }
                }
            });
        }


        randDelay();


    }


    public void randDelay() {
        new Thread( ) {
            public void run() {

                rn = new Random().nextInt(OFFSET_TIME);
                System.out.println(rn);


                try {
                    Thread.sleep(OFFSET_TIME + rn);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                timeStart = System.currentTimeMillis();

                ButtonAmount = (new Random().nextInt(3) + 1);
                for (int m = 1; m <= ButtonAmount; m++) {
                    ActivateButtons();
                }
            }
        }.start();
    }

    public void ActivateButtons() {
        rz16 = new Random().nextInt(15) + 1;
        System.out.println(rz16);
        switch (rz16) {
            case 1:
                Button1.setEnabled(true);
                Button1.setBackground(Color.GREEN);
                break;
            case 2:
                Button2.setEnabled(true);
                Button2.setBackground(Color.GREEN);
                break;
            case 3:
                Button3.setEnabled(true);
                Button3.setBackground(Color.GREEN);
                break;
            case 4:
                Button4.setEnabled(true);
                Button4.setBackground(Color.GREEN);
                break;
            case 5:
                Button5.setEnabled(true);
                Button5.setBackground(Color.GREEN);
                break;
            case 6:
                Button6.setEnabled(true);
                Button6.setBackground(Color.GREEN);
                break;
            case 7:
                Button7.setEnabled(true);
                Button7.setBackground(Color.GREEN);
                break;
            case 8:
                Button8.setEnabled(true);
                Button8.setBackground(Color.GREEN);
                break;
            case 9:
                Button9.setEnabled(true);
                Button9.setBackground(Color.GREEN);
                break;
            case 10:
                Button10.setEnabled(true);
                Button10.setBackground(Color.GREEN);
                break;
            case 11:
                Button11.setEnabled(true);
                Button11.setBackground(Color.GREEN);
                break;
            case 12:
                Button12.setEnabled(true);
                Button12.setBackground(Color.GREEN);
                break;
            case 13:
                Button13.setEnabled(true);
                Button13.setBackground(Color.GREEN);
                break;
            case 14:
                Button14.setEnabled(true);
                Button14.setBackground(Color.GREEN);
                break;
            case 15:
                Button15.setEnabled(true);
                Button15.setBackground(Color.GREEN);
                break;
            case 16:
                Button16.setEnabled(true);
                Button16.setBackground(Color.GREEN);
                break;
        }
    }
}


