package com.tarena.fly;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

import javax.imageio.ImageIO;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
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
public class rank extends ShootGame{
	public String[] read() throws IOException {	
		File file = new File("src/com/tarena/fly/rank.txt");
		File fileParent = file.getParentFile();
		if(!fileParent.exists()){
			try {
				file.createNewFile();	
				
			} catch (IOException e) {
				e.printStackTrace();
			}//创建文件
		}
		
		//依次读取一个字符，读到最后没有了就返回-1。有分隔符号	
	int num;
    char[] buf=new char[1024];
		FileReader fr = new FileReader("src/com/tarena/fly/rank.txt");
		while((num=fr.read(buf))!=-1) {
			
			System.out.println(new String(buf,0,num));;
		}
		//对字符串进一步处理
		ArrayList<String>stringlist=new ArrayList();
		String temp="";
		int g=0,j=0;
		
        String[] L =  new String[100];;  
        String[] M =  new String[100];;  
		for(int i=0;i<buf.length;i++) {
			
			if(buf[i]==',') {
				L[j]=temp;
				temp="";
				j++;
				
			}else {
				temp+=buf[i];
			}
		} 
		fr.close();
         	return L;
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

	public void creatrank() throws IOException {
		// 在creatabout方法中，实例化JFrame类的对象。
		Test gg=new Test();
		frame.setAlwaysOnTop(true);
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
		ta.setBounds(130,150,160,200);
		but1.setText("返回");
		but1.setBounds(130,450,160,30);
		frame.add(but1);
//		frame.add(ta);
		frame.setVisible(true);// 设置窗体为可见
		 
		 String[] L =  new String[100];;  
		 L=read();
		 int i=0,j=0,k=0,m=0,o=0;
		 while(L[i]!=null) {
			 i++;
		 }
		  System.out.println(i);
		  String[] F =  new String[100];;  
		  String[] V =  new String[100];;  
		
		  String[] titles ={"姓名","分数"};
	        Object[][] userInfo = {
	        		{"","",""}
	        };
	        JTable table= new JTable(10, 3) ;
	        
	      
	        for(j=0;j<i;j++) {
	        	if(k>m) {
	        		table.setValueAt(L[j],o,2);
	        		
	        		table.setValueAt(o+1,o,0);
	        		o++;
	        		
	        		  m++;
				 }
				 else {
					 table.setValueAt(L[j],o,1);
				
					 k++;
				 }
	        
	        
	        }
	        JScrollPane scr = new JScrollPane(table);

	        frame.add(scr);
	        scr.setBounds(130,150,160,160);
	        frame.setVisible(true);

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
		frame.add(gg);
		gg.setVisible(true);
		frame.setVisible(true);
			
	}

	

}