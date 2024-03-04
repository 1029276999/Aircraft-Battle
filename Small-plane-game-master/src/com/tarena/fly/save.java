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



 
 //1.定义Test类，
public class save extends ShootGame{
	

	public static BufferedImage background;
	public static BufferedImage start;
	static { // 静态代码块，初始化图片资源
		try {
			background = ImageIO.read(ShootGame.class.getResource("b.jpg"));
			start = ImageIO.read(ShootGame.class.getResource("start.png"));

		} catch (Exception e) {//异常处理
			e.printStackTrace();
		}
		
	}
	
	// 1.在类中定义初始化界面的方法；
	JFrame frame = new JFrame();
	public void creatsave(int s) {
		frame.setAlwaysOnTop(true); // 设置其总在最上	
		Test gg=new Test();
		frame.setTitle("Login");// 设置窗体的标题
		frame.setSize(400, 650);// 设置窗体的大小，单位是像素
		frame.setDefaultCloseOperation(3);// 设置窗体的关闭操作；3表示关闭窗体退出程序；2、1、0
		frame.setLocationRelativeTo(null);// 设置窗体相对于另一个组件的居中位置，参数null表示窗体相对于屏幕的中央位置
		frame.setResizable(false);// 设置禁止调整窗体大小
		
		gg.setSize(400, 650);
		JTextArea ta= new JTextArea();
		// 实例化流式布局类的对象
		frame.setLayout(null);
		ta.setBounds(70,200,200,50);
		//实例化JButton组件 
		ta.setText("\n        是否保存？       ");
		ta.setBackground(Color.CYAN);
		final JButton but1 = new JButton();		
		final JButton but2 = new JButton();	
		frame.add(ta);
		but1.setText("是");
		but2.setText("否");
		but1.setBounds(80,375,50,30);
		but2.setBounds(300,375,50,30);
		frame.add(but1);
		frame.add(but2);
		frame.setVisible(true);// 设置窗体为可见
		
		ActionListener	t=new ActionListener() {
      @Override     
      public void actionPerformed(ActionEvent e) {
      	;
          if(e.getSource()==but1){
         
          	frame.dispose();//点击按钮时frame1销毁      
          	opensave1();
    		     	
          }
          if(e.getSource()==but2){
            	
            	frame.dispose();//点击按钮时frame1销毁      
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