package com.tarena.fly;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;



 
 //1.����Test�࣬
public class save extends ShootGame{
	

	public static BufferedImage background;
	public static BufferedImage start;
	static { // ��̬����飬��ʼ��ͼƬ��Դ
		try {
			background = ImageIO.read(ShootGame.class.getResource("b.jpg"));
			start = ImageIO.read(ShootGame.class.getResource("start.png"));

		} catch (Exception e) {//�쳣����
			e.printStackTrace();
		}
		
	}
	
	// 1.�����ж����ʼ������ķ�����
	JFrame frame = new JFrame();
	public void creatsave(int s) {
		frame.setAlwaysOnTop(true); // ��������������	
		Test gg=new Test();
		frame.setTitle("Login");// ���ô���ı���
		frame.setSize(400, 650);// ���ô���Ĵ�С����λ������
		frame.setDefaultCloseOperation(3);// ���ô���Ĺرղ�����3��ʾ�رմ����˳�����2��1��0
		frame.setLocationRelativeTo(null);// ���ô����������һ������ľ���λ�ã�����null��ʾ�����������Ļ������λ��
		frame.setResizable(false);// ���ý�ֹ���������С
		
		gg.setSize(400, 650);
		JTextArea ta= new JTextArea();
		// ʵ������ʽ������Ķ���
		frame.setLayout(null);
		ta.setBounds(70,200,200,50);
		//ʵ����JButton��� 
		ta.setText("\n        �Ƿ񱣴棿       ");
		ta.setBackground(Color.CYAN);
		final JButton but1 = new JButton();		
		final JButton but2 = new JButton();	
		frame.add(ta);
		but1.setText("��");
		but2.setText("��");
		but1.setBounds(80,375,50,30);
		but2.setBounds(300,375,50,30);
		frame.add(but1);
		frame.add(but2);
		frame.setVisible(true);// ���ô���Ϊ�ɼ�
		
		ActionListener	t=new ActionListener() {
      @Override     
      public void actionPerformed(ActionEvent e) {
      	;
          if(e.getSource()==but1){
         
          	frame.dispose();//�����ťʱframe1����      
          	opensave1();
    		     	
          }
          if(e.getSource()==but2){
            	
            	frame.dispose();//�����ťʱframe1����      
            	openTest();
      		     	
            }
          }

		};
		but1.addActionListener(t);
		but2.addActionListener(t);
		frame.add(gg);
		gg.setVisible(true);
		frame.setVisible(true);
			
	}

}