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


 
 //1.����Login�࣬
public class rank extends ShootGame{
	public String[] read() throws IOException {	
		File file = new File("src/com/tarena/fly/rank.txt");
		File fileParent = file.getParentFile();
		if(!fileParent.exists()){
			try {
				file.createNewFile();	
				
			} catch (IOException e) {
				e.printStackTrace();
			}//�����ļ�
		}
		
		//���ζ�ȡһ���ַ����������û���˾ͷ���-1���зָ�����	
	int num;
    char[] buf=new char[1024];
		FileReader fr = new FileReader("src/com/tarena/fly/rank.txt");
		while((num=fr.read(buf))!=-1) {
			
			System.out.println(new String(buf,0,num));;
		}
		//���ַ�����һ������
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

	public void creatrank() throws IOException {
		// ��creatabout�����У�ʵ����JFrame��Ķ���
		Test gg=new Test();
		frame.setAlwaysOnTop(true);
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
		ta.setBounds(130,150,160,200);
		but1.setText("����");
		but1.setBounds(130,450,160,30);
		frame.add(but1);
//		frame.add(ta);
		frame.setVisible(true);// ���ô���Ϊ�ɼ�
		 
		 String[] L =  new String[100];;  
		 L=read();
		 int i=0,j=0,k=0,m=0,o=0;
		 while(L[i]!=null) {
			 i++;
		 }
		  System.out.println(i);
		  String[] F =  new String[100];;  
		  String[] V =  new String[100];;  
		
		  String[] titles ={"����","����"};
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
          
         	frame.dispose();//�����ťʱframe1����      
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