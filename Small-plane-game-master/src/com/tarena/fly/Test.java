package com.tarena.fly;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;




 
 //1.����Test�࣬
public class Test extends ShootGame{
	

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
	
	public void initUI() {
		// 3.��initUI�����У�ʵ����JFrame��Ķ���
		Test gg=new Test();
		frame.setTitle("Login");// ���ô���ı���
		frame.setSize(400, 650);// ���ô���Ĵ�С����λ������
		frame.setDefaultCloseOperation(3);// ���ô���Ĺرղ�����3��ʾ�رմ����˳�����2��1��0
		frame.setLocationRelativeTo(null);// ���ô����������һ������ľ���λ�ã�����null��ʾ�����������Ļ������λ��
		frame.setResizable(false);// ���ý�ֹ���������С	
		gg.setSize(400, 650);
		// ʵ������ʽ������Ķ���
		frame.setLayout(null);
		//ʵ����JButton��� 
		frame.setAlwaysOnTop(true);
		final JButton but1 = new JButton();		
		final JButton but2 = new JButton();	
		final JButton but3 = new JButton();
		but1.setText("��ʼ��Ϸ");
		but2.setText("���а�");
		but3.setText("����");
		but1.setBounds(130,150,160,30);
		but2.setBounds(130,300,160,30);
		but3.setBounds(130,375,160,30);
		frame.add(but3);
		frame.add(but1);
		frame.add(but2);
		frame.setVisible(true);// ���ô���Ϊ�ɼ�
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ActionListener	t=new ActionListener() {
      @Override     
      public void actionPerformed(ActionEvent e) {  
          if(e.getSource()==but1){
          	System.out.print("Enter n: ");
          	frame.setAlwaysOnTop(false);
          	frame.setVisible(false);
          	frame.dispose();//�����ťʱframe1����   
          	
          	gamep();
    		     	
          }
          if(e.getSource()==but3){
            	frame.dispose();//�����ťʱframe1����      
            	openabout();
      		     	
            }
          if(e.getSource()==but2){    
            	frame.dispose();//�����ťʱframe1����      
            	openrank();
      		     	
            }
          }
    
		};
		but1.addActionListener(t);
		but3.addActionListener(t);
		but2.addActionListener(t);
		frame.add(gg);
		gg.setVisible(true);
		frame.setVisible(true);
			
	}

	

}