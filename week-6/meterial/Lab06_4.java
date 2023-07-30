import javax.swing.*;
import java.text.DecimalFormat;
public class Lab06_4 {
    public static void main(String[] args){
        //declare variables
        JFrame frame=new JFrame();
        JLabel lblPurpose=new JLabel("<html>Find roots of quadratic equation ax<sup>2</sup>+ bx +c=0<html>");
        JLabel lblA=new JLabel("a");
        JLabel lblB=new JLabel("b");
        JLabel lblC=new JLabel("c");
        String answer="Answer : ";
        JLabel lblAnswer = new JLabel(answer);
        JTextField jtfA=new JTextField();
        JTextField jtfB=new JTextField();
        JTextField jtfC=new JTextField();
        JButton btnFind=new JButton("Find");
        //frame
        frame.setSize(400,350);
        frame.setLocationRelativeTo(null);
        frame.setLayout(null);
        frame.setVisible(true);
        //lblPurpose
        lblPurpose.setBounds(50,10,300,20);
        frame.add(lblPurpose);
        //lblA
        lblA.setBounds(20,40,100,20);
        frame.add(lblA);
        //jtfA
        jtfA.setBounds(20,60,350,25);
        frame.add(jtfA);
        //lblB
        lblB.setBounds(20,95,100,20);
        frame.add(lblB);
        //jtfB
        jtfB.setBounds(20,115,350,25);
        frame.add(jtfB);
        //lblC
        lblC.setBounds(20,150,100,20);
        frame.add(lblC);
        //jtfC
        jtfC.setBounds(20,170,350,25);
        frame.add(jtfC);
        //btnFind
        btnFind.setBounds(20,205,100,25);
        frame.add(btnFind);


        btnFind.addActionListener(e->{
            DecimalFormat decimalFormat = new DecimalFormat("0.00");
            int a=Integer.parseInt(jtfA.getText());
            int b=Integer.parseInt(jtfB.getText());
            int c=Integer.parseInt(jtfC.getText());
            int belta=b*b-4*a*c;
            double rootBelta;
            double x1,x2,x;
            if(belta>0) {
               rootBelta= java.lang.Math.sqrt(belta);
                x1=(-b+rootBelta)/(2*a);
                x2=(-b-rootBelta)/(2*a);
                String strx1,strx2;
                if((int)x1==x1){
                    strx1=(int)x1+"";
                }else{
                    strx1=decimalFormat.format(x1)+"";
                }
                if((int)x2==x2){
                    strx2=(int)x2+"";
                }else{
                    strx2=decimalFormat.format(x2)+"";
                }
                lblAnswer.setText("<html>"+answer+"x<sub>1</sub>"+" = "+strx1+"   x<sub>2</sub>"+" = "+strx2+"</html>");
            }else if(belta<0) {

                lblAnswer.setText(answer+"Equation roots are complex!");
            }else if(belta==0) {
                x=(-b)/(2*a);
                String strx;
                if((int)x==x){
                    strx=(int)x+"";
                }else{
                    strx=decimalFormat.format(x)+"";
                }
                lblAnswer.setText("<html>"+answer+"x<sub>1</sub> =x<sub>2</sub> = "+strx+"</html>");
            }
        });
        //lblAnswer
        lblAnswer.setBounds(20,240,300,20);
        frame.add(lblAnswer);
    }
}
