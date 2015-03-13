import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.util.*;
public class secgui implements ActionListener{
JButton button;
public static void main(String[] args){
Scanner stdin=new Scanner(System.in);
System.out.println("准备红包金额：");
float money=stdin.nextFloat();
System.out.println("分发人数：");
float people=stdin.nextFloat();
secgui gui=new secgui();

gui.go(money,people);}


public void go(float money,float people){
JFrame frame=new JFrame();
button=new JButton("点击开始分红包");
button.addActionListener(this);
frame.getContentPane().add(button);
frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
frame.setSize(500,600);
frame.setVisible(true);
hongbao one=new hongbao();
one.distribute(money,people);}

public void actionPerformed(ActionEvent event){
button.setText("结果在cmd中查看");
}}

class hongbao{
float money;
float people;
void distribute(float money,float people){
//假设每人最少得到0.01元不得超过30%
java.text.DecimalFormat df=new java.text.DecimalFormat("#.##");
float a;

double b=Math.random();
double d=b*0.7;
for(int i=1;i<people;i++){
a=(float)d*money;

System.out.println("第"+i+"个人抢走"+df.format(a)+"元");
money=money-a;}
System.out.println("第"+(int)people+"个人抢走"+df.format(money)+"元");
}
}








