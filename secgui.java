import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.util.*;
public class secgui implements ActionListener{
JButton button;
public static void main(String[] args){
Scanner stdin=new Scanner(System.in);
System.out.println("׼�������");
float money=stdin.nextFloat();
System.out.println("�ַ�������");
float people=stdin.nextFloat();
secgui gui=new secgui();

gui.go(money,people);}


public void go(float money,float people){
int a;




JFrame frame=new JFrame();
button=new JButton("�����ʼ�ֺ��");
button.addActionListener(this);
frame.getContentPane().add(button);
frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
frame.setSize(500,600);
frame.setVisible(true);
hongbao one=new hongbao();
one.distribute(money,people);}

public void actionPerformed(ActionEvent event){
button.setText("�����cmd�в鿴");
}}

class hongbao{
float money;
float people;
void distribute(float money,float people){
//����ÿ�����ٵõ�0.01Ԫ���ó���30%
java.text.DecimalFormat df=new java.text.DecimalFormat("#.##");
float a;

double b=Math.random();
double d=b*0.7;
for(int i=1;i<people;i++){
a=(float)d*money;

System.out.println("��"+i+"��������"+df.format(a)+"Ԫ");
money=money-a;}
System.out.println("��"+(int)people+"��������"+df.format(money)+"Ԫ");
}
}








