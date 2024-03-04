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

 
 //1.定义Login类，
public class save1 extends ShootGame{
	public void method1(String c,int s) throws IOException {
		

		
			File file = new File("src/com/tarena/fly/rank.txt");
			File fileParent = file.getParentFile();
			if(!fileParent.exists()){
				try {
					file.createNewFile();	
					
				} catch (IOException e) {
					e.printStackTrace();
				}//创建文件
			}
	        FileWriter fw = new FileWriter("src/com/tarena/fly/rank.txt",true);
	       
	       
	                fw.write(c + "," + s + "," +"\n");
	                fw.close();
	                
		}
	
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

	public void creatsave1(final int s) {	
		frame.setAlwaysOnTop(true);
		save1 gg=new save1();
		frame.setTitle("关于");// 设置窗体的标题
		frame.setSize(400, 650);// 设置窗体的大小，单位是像素
		frame.setDefaultCloseOperation(3);// 设置窗体的关闭操作；3表示关闭窗体退出程序；2、1、0
		frame.setLocationRelativeTo(null);// 设置窗体相对于另一个组件的居中位置，参数null表示窗体相对于屏幕的中央位置
		frame.setResizable(false);// 设置禁止调整窗体大小
		final JTextField text=new JTextField(20);
		text.setBounds(70,270,160,30);
		frame.add(text);

		gg.setSize(400, 650);
		// 实例化流式布局类的对象
		frame.setLayout(null);
		//实例化JButton组件 
		final JButton but1 = new JButton();		
		JTextArea ta= new JTextArea();
		ta.setBounds(70,200,200,50);
		but1.setText("确定");
		but1.setBounds(240,270,60,30);
		
		frame.add(but1);
		frame.add(ta);
		frame.setVisible(true);// 设置窗体为可见
		ta.setText("\n        请在下框输入您的姓名       ");
		ta.setBackground(Color.CYAN);
		ActionListener	t=new ActionListener() {
      @Override     
      public void actionPerformed(ActionEvent e) {
      	
          if(e.getSource()==but1){
         	frame.dispose();//点击按钮时frame1销毁      
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