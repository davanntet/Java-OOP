import javax.swing.*;
public class Lab06_3 {
    public static void main(String[] args){
        //declare variables
        JFrame frame = new JFrame();
        String numVowel = "count of vowel is : ";
        String numConsonant="count of consonant is : ";
        String numSpace="count of Space is : ";
        JLabel lblHeader = new JLabel(" count number of Vowel, Consonant and Space");
        JLabel lblText = new JLabel("Text");
        JLabel lblVowel = new JLabel(numVowel+0);
        JLabel lblConsonant = new JLabel(numConsonant+0);
        JLabel lblSpace = new JLabel(numSpace+0);
        JTextField jtfText = new JTextField();
        JButton btnFind = new JButton("Find");
        //JFrame
        frame.setSize(400,300);
        frame.setLocationRelativeTo(null);
        frame.setLayout(null);
        frame.setVisible(true);
        //lblHeader
        lblHeader.setBounds(80,10,240,25);
        frame.add(lblHeader);
        //lblText
        lblText.setBounds(20,45,100,25);
        frame.add(lblText);
        //jtfText
        jtfText.setBounds(20,70,360,25);
        frame.add(jtfText);
        //btnFind
        btnFind.setBounds(20,110,100,30);
        frame.add(btnFind);
        btnFind.addActionListener(e->{
            String str=jtfText.getText();
            int countVowel=0;
            int countconsonant=0;
            int countspace=0;
            str=str.toLowerCase();
            for(int i=0;i<str.length();i++) {
                if(str.charAt(i)=='i'||str.charAt(i)=='e'||str.charAt(i)=='u'||str.charAt(i)=='o'||str.charAt(i)=='a') {
                    countVowel+=1;
                }else if(str.charAt(i)==' ') {
                    countspace+=1;
                }else if((str.charAt(i)>'a'&&str.charAt(i)<'e')||(str.charAt(i)>'e'&&str.charAt(i)<'i')||(str.charAt(i)>'i'&&str.charAt(i)<'o')||(str.charAt(i)>'o'&&str.charAt(i)<'u')||(str.charAt(i)>'u'&&str.charAt(i)<='z')) {
                    countconsonant+=1;
                }
            }
            lblVowel.setText(numVowel+countVowel);
            lblConsonant.setText(numConsonant+countconsonant);
            lblSpace.setText(numSpace+countspace);
        });
        //lblVowel
        lblVowel.setBounds(20,150,300,20);
        frame.add(lblVowel);
        //lblConsonant
        lblConsonant.setBounds(20,170,300,20);
        frame.add(lblConsonant);
        //lblSpace
        lblSpace.setBounds(20,190,300,20);
        frame.add(lblSpace);
    }
}
