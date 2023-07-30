import javax.swing.*;
import java.awt.*;


class Setting extends JFrame {
    public Setting(){
        try {
            UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
        } catch (Exception e) {
            e.printStackTrace();
        }
        setSize(300,500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(null);
        setResizable(false);
        //superPanel
        JPanel superPanel = new JPanel();
        superPanel.setBounds(0,0,300,500);
        superPanel.setLayout(new GridLayout());
        //panel-1
        JPanel panel1 = new JPanel();
        panel1.setSize(300,500);
        panel1.setLayout(null);
        //title of panel-1
        JLabel title1 = new JLabel("<html><h2>Setting</h2></html>");
        title1.setBounds(10,-10,250,50);
        panel1.add(title1);
        //buttons
        String[] bntText = {"General","WI-FI","Bluetooth","Mobile Data","Hotspot","Notification","Quit"};
        JButton[] buttons = new JButton[bntText.length];
        for(int i = 0;i<bntText.length;i++){
            buttons[i] = new JButton((i+1)+". "+bntText[i]);
            buttons[i].setBounds(20,10*(i+1)+30*i+30,250,30);
            buttons[i].setHorizontalAlignment(SwingConstants.LEFT);
            panel1.add(buttons[i]);
        }


        //panel-2
        JPanel panel2 = new JPanel();
        panel2.setSize(300,500);
        panel2.setLayout(null);
        //title panel-2
        JLabel title2 = new JLabel("<html><h2>Setting > General</h2></html>");
        title2.setBounds(10,-10,250,50);
        panel2.add(title2);
        //buttons2
        String[] bntText2 = {"About","Software Update","Storage","Back"};
        JButton[] buttons2 = new JButton[bntText2.length];
        for(int i = 0;i<bntText2.length;i++){
            buttons2[i] = new JButton((i+1)+". "+bntText2[i]);
            buttons2[i].setBounds(20,10*(i+1)+30*i+30,250,30);
            buttons2[i].setHorizontalAlignment(SwingConstants.LEFT);
            panel2.add(buttons2[i]);
        }
        buttons2[0].addActionListener(e->{

        });
        //panel-3
        JPanel panel3 = new JPanel();
        panel3.setSize(300,500);
        panel3.setLayout(null);
        //title panel-3
        JLabel title3 = new JLabel("<html><h2>Setting > General > About</h2></html>");
        title3.setBounds(10,-10,250,50);
        panel3.add(title3);
        //buttons3
        JButton buttons3 = new JButton("Back");
        buttons3.setBounds(20,130,250,30);
        panel3.add(buttons3);
        //click
        JPanel panel3_1 = new JPanel();
        panel3_1.setBounds(50,30,250,100);
        panel3_1.setLayout(new GridLayout(3,2));
        String[] typeText={"Name","iPhone","Model","IXs","Version","18.5"};
        JLabel[] lblType = new JLabel[typeText.length];
        for(int i=0;i<lblType.length;i++){
            lblType[i] = new JLabel(typeText[i]);
            panel3_1.add(lblType[i]);
        }
        panel3.add(panel3_1);
        buttons[0].addActionListener(e->{
            superPanel.removeAll();
            superPanel.add(panel2);
            revalidate();
            repaint();
        });
        buttons2[bntText2.length-1].addActionListener(e->{
            superPanel.removeAll();
            superPanel.add(panel1);
            revalidate();
            repaint();
        });
        buttons[bntText.length-1].addActionListener(e->{
           dispose();
        });
        buttons2[0].addActionListener(e->{
            superPanel.removeAll();
            superPanel.add(panel3);
            revalidate();
            repaint();
        });
        buttons3.addActionListener(e->{
            superPanel.removeAll();
            superPanel.add(panel2);
            revalidate();
            repaint();
        });
        superPanel.add(panel1);
        add(superPanel);
        setVisible(true);

    }

}
public class Lab07_4{
    public static void main(String[] args){
        Setting setting = new Setting();
    }

}
