package com.tarena.fly;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;

import java.awt.Button;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;


 
 //1.����Login�࣬
public class about extends ShootGame{
	
	
	 // 1.�����ж���������
	
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

	public void creatabout() {
		// ��creatabout�����У�ʵ����JFrame��Ķ���
		about gg=new about();
		frame.setTitle("����");// ���ô���ı���
		frame.setSize(400, 650);// ���ô���Ĵ�С����λ������
		frame.setDefaultCloseOperation(3);// ���ô���Ĺرղ�����3��ʾ�رմ����˳�����2��1��0
		frame.setLocationRelativeTo(null);// ���ô����������һ������ľ���λ�ã�����null��ʾ�����������Ļ������λ��
		frame.setResizable(false);// ���ý�ֹ���������С
		gg.setSize(400, 650);
		// ʵ������ʽ������Ķ���
		frame.setLayout(null);
		//ʵ����JButton��� 
		final JButton but1 = new JButton();		
		JTextArea ta= new JTextArea();
		ta.setBounds(130,150,160,160);
		but1.setText("����");
		but1.setBounds(130,450,160,30);
		frame.add(but1);
		frame.add(ta);
		frame.setVisible(true);// ���ô���Ϊ�ɼ�
		ta.setText("              \n     ��Ŀ���ƣ��ɻ���ս         "
				+ "\n     ���ʱ�䣺2022/6/9         \n"
				+ "     �����������         \n"
				+ "     ѧ�ţ�5605120011         \n"
				+ "     �༶��2004         \n");
		ta.setBackground(Color.CYAN);
		ActionListener	t=new ActionListener() {
      @Override     
      public void actionPerformed(ActionEvent e) {
      	
          if(e.getSource()==but1){
          
         	frame.dispose();//�����ťʱframe1����      
         	openTest();
    		     	
          }
  	
          }

		};
		but1.addActionListener(t);
		but1.addActionListener(t);
		frame.add(gg);
		gg.setVisible(true);
		frame.setVisible(true);
			
	}

	

}