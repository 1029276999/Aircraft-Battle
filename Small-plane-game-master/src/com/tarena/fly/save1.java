package com.tarena.fly;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import java.awt.Color;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

 
 //1.����Login�࣬
public class save1 extends ShootGame{
	public void method1(String c,int s) throws IOException {
		

		
			File file = new File("src/com/tarena/fly/rank.txt");
			File fileParent = file.getParentFile();
			if(!fileParent.exists()){
				try {
					file.createNewFile();	
					
				} catch (IOException e) {
					e.printStackTrace();
				}//�����ļ�
			}
	        FileWriter fw = new FileWriter("src/com/tarena/fly/rank.txt",true);
	       
	       
	                fw.write(c + "," + s + "," +"\n");
	                fw.close();
	                
		}
	
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

	public void creatsave1(final int s) {	
		frame.setAlwaysOnTop(true);
		save1 gg=new save1();
		frame.setTitle("����");// ���ô���ı���
		frame.setSize(400, 650);// ���ô���Ĵ�С����λ������
		frame.setDefaultCloseOperation(3);// ���ô���Ĺرղ�����3��ʾ�رմ����˳�����2��1��0
		frame.setLocationRelativeTo(null);// ���ô����������һ������ľ���λ�ã�����null��ʾ�����������Ļ������λ��
		frame.setResizable(false);// ���ý�ֹ���������С
		final JTextField text=new JTextField(20);
		text.setBounds(70,270,160,30);
		frame.add(text);

		gg.setSize(400, 650);
		// ʵ������ʽ������Ķ���
		frame.setLayout(null);
		//ʵ����JButton��� 
		final JButton but1 = new JButton();		
		JTextArea ta= new JTextArea();
		ta.setBounds(70,200,200,50);
		but1.setText("ȷ��");
		but1.setBounds(240,270,60,30);
		
		frame.add(but1);
		frame.add(ta);
		frame.setVisible(true);// ���ô���Ϊ�ɼ�
		ta.setText("\n        �����¿�������������       ");
		ta.setBackground(Color.CYAN);
		ActionListener	t=new ActionListener() {
      @Override     
      public void actionPerformed(ActionEvent e) {
      	
          if(e.getSource()==but1){
         	frame.dispose();//�����ťʱframe1����      
         	String c=text.getText();
         	try {
				method1(c,s);
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
         	openTest();
          }
          }

		};
		but1.addActionListener(t);
		frame.add(gg);
		gg.setVisible(true);
	
			
	}

	

}