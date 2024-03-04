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


 
 //1.定义Login类，
public class about extends ShootGame{
	
	
	 // 1.在类中定义主函数
	
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

	public void creatabout() {
		// 在creatabout方法中，实例化JFrame类的对象。
		about gg=new about();
		frame.setTitle("关于");// 设置窗体的标题
		frame.setSize(400, 650);// 设置窗体的大小，单位是像素
		frame.setDefaultCloseOperation(3);// 设置窗体的关闭操作；3表示关闭窗体退出程序；2、1、0
		frame.setLocationRelativeTo(null);// 设置窗体相对于另一个组件的居中位置，参数null表示窗体相对于屏幕的中央位置
		frame.setResizable(false);// 设置禁止调整窗体大小
		gg.setSize(400, 650);
		// 实例化流式布局类的对象
		frame.setLayout(null);
		//实例化JButton组件 
		final JButton but1 = new JButton();		
		JTextArea ta= new JTextArea();
		ta.setBounds(130,150,160,160);
		but1.setText("返回");
		but1.setBounds(130,450,160,30);
		frame.add(but1);
		frame.add(ta);
		frame.setVisible(true);// 设置窗体为可见
		ta.setText("              \n     项目名称：飞机大战         "
				+ "\n     完成时间：2022/6/9         \n"
				+ "     姓名：于明皓         \n"
				+ "     学号：5605120011         \n"
				+ "     班级：2004         \n");
		ta.setBackground(Color.CYAN);
		ActionListener	t=new ActionListener() {
      @Override     
      public void actionPerformed(ActionEvent e) {
      	
          if(e.getSource()==but1){
          
         	frame.dispose();//点击按钮时frame1销毁      
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