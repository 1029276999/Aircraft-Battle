package com.tarena.fly;
import java.awt.Font;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Arrays;
import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class menu extends JPanel{

	public static final int WIDTH = 400; // ����
	public static final int HEIGHT = 654; // ����
	/** ��Ϸ�ĵ�ǰ״̬: START RUNNING PAUSE GAME_OVER */
	private int state;
	private static final int START = 0;
	private static final int RUNNING = 1;
	private static final int PAUSE = 2;
	private static final int GAME_OVER = 3;
	
	private int score = 0; // �÷�
	private Timer timer; // ��ʱ��
	private int intervel = 1000 / 100; // ʱ����(����)

	public static BufferedImage background;
	public static BufferedImage start;

	private FlyingObject[] flyings = {}; // �л�����
	private Bullet[] bullets = {}; // �ӵ�����
	
	
	static { // ��̬����飬��ʼ��ͼƬ��Դ
		try {
			background = ImageIO.read(ShootGame.class.getResource("b.jpg"));
			start = ImageIO.read(ShootGame.class.getResource("start.png"));

		} catch (Exception e) {//�쳣����
			e.printStackTrace();
		}
		
	}
	
	/** �� */
	@Override
	public void paint(Graphics g) {
		g.drawImage(background, 1, 0, null); // ������ͼ
		g.drawImage(start, 0, 1, null);
	

	}



	

	
	
}
