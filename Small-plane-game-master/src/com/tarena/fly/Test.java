package com.tarena.fly;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;




 
 //1.定义Test类，
public class Test extends ShootGame{
	

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
	
	public void initUI() {
		// 3.在initUI方法中，实例化JFrame类的对象。
		Test gg=new Test();
		frame.setTitle("Login");// 设置窗体的标题
		frame.setSize(400, 650);// 设置窗体的大小，单位是像素
		frame.setDefaultCloseOperation(3);// 设置窗体的关闭操作；3表示关闭窗体退出程序；2、1、0
		frame.setLocationRelativeTo(null);// 设置窗体相对于另一个组件的居中位置，参数null表示窗体相对于屏幕的中央位置
		frame.setResizable(false);// 设置禁止调整窗体大小	
		gg.setSize(400, 650);
		// 实例化流式布局类的对象
		frame.setLayout(null);
		//实例化JButton组件 
		frame.setAlwaysOnTop(true);
		final JButton but1 = new JButton();		
		final JButton but2 = new JButton();	
		final JButton but3 = new JButton();
		but1.setText("开始游戏");
		but2.setText("排行榜");
		but3.setText("关于");
		but1.setBounds(130,150,160,30);
		but2.setBounds(130,300,160,30);
		but3.setBounds(130,375,160,30);
		frame.add(but3);
		frame.add(but1);
		frame.add(but2);
		frame.setVisible(true);// 设置窗体为可见
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ActionListener	t=new ActionListener() {
      @Override     
      public void actionPerformed(ActionEvent e) {  
          if(e.getSource()==but1){
          	System.out.print("Enter n: ");
          	frame.setAlwaysOnTop(false);
          	frame.setVisible(false);
          	frame.dispose();//点击按钮时frame1销毁   
          	
          	gamep();
    		     	
          }
          if(e.getSource()==but3){
            	frame.dispose();//点击按钮时frame1销毁      
            	openabout();
      		     	
            }
          if(e.getSource()==but2){    
            	frame.dispose();//点击按钮时frame1销毁      
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