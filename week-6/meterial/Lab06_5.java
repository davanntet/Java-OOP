import javax.swing.*;

public class Lab06_5 {
    public static void main(String[] args){
        JFrame frame = new JFrame();
        JLabel lblTitle = new JLabel("Calculator");
        JLabel lblA=new JLabel("A=");
        JLabel lblB=new JLabel("B=");
        JLabel lblSum=new JLabel("= ");
        JLabel lblSub=new JLabel("= ");
        JLabel lblDiv=new JLabel("= ");
        JLabel lblMul=new JLabel("= ");
        JTextField jtfA=new JTextField();
        JTextField jtfB=new JTextField();
        JButton btnSum=new JButton("A+B");
        JButton btnSub=new JButton("A-B");
        JButton btnMul=new JButton("AxB");
        JButton btnDiv=new JButton("A/B");
        //frame
        frame.setSize(300,450);
        frame.setLocationRelativeTo(null);
        frame.setLayout(null);
        frame.setVisible(true);
        //lblTitle
        lblTitle.setBounds(100,20,100,20);
        frame.add(lblTitle);
        //lblA
        lblA.setBounds(20,50,100,20);
        frame.add(lblA);
        //jtfA
        jtfA.setBounds(20,70,250,25);
        frame.add(jtfA);
        //lblB
        lblB.setBounds(20,105,100,20);
        frame.add(lblB);
        //jtfB
        jtfB.setBounds(20,125,250,25);
        frame.add(jtfB);
        //btnSum
        btnSum.setBounds(20,160,100,25);
        frame.add(btnSum);
        btnSum.addActionListener(e->{
            int result = Integer.parseInt(jtfA.getText())+Integer.parseInt(jtfB.getText());
            lblSum.setText("= "+result);
        });
        //lblSum
        lblSum.setBounds(20,190,250,20);
        frame.add(lblSum);
        //btnSub
        btnSub.setBounds(20,220,100,25);
        frame.add(btnSub);
        btnSub.addActionListener(e->{
            int result=Integer.parseInt(jtfA.getText())-Integer.parseInt(jtfB.getText());
            lblSub.setText("= "+result);
        });
        //lblSub
        lblSub.setBounds(20,250,250,20);
        frame.add(lblSub);
        //btnMul
        btnMul.setBounds(20,280,100,25);
        frame.add(btnMul);
        btnMul.addActionListener(e->{
            int result=Integer.parseInt(jtfA.getText())*Integer.parseInt(jtfB.getText());
            lblMul.setText("= "+result);
        });
        //lblMul
        lblMul.setBounds(20,310,250,20);
        frame.add(lblMul);
        //btnDiv
        btnDiv.setBounds(20,340,100,25);
        frame.add(btnDiv);
        btnDiv.addActionListener(e->{
            float result=(float) Integer.parseInt(jtfA.getText())/Integer.parseInt(jtfB.getText());
            lblDiv.setText("= "+result);
        });
        //lblDiv
        lblDiv.setBounds(20,370,250,20);
        frame.add(lblDiv);

    }
}
