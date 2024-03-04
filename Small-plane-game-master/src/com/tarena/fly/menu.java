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

	public static final int WIDTH = 400; // 面板宽
	public static final int HEIGHT = 654; // 面板高
	/** 游戏的当前状态: START RUNNING PAUSE GAME_OVER */
	private int state;
	private static final int START = 0;
	private static final int RUNNING = 1;
	private static final int PAUSE = 2;
	private static final int GAME_OVER = 3;
	
	private int score = 0; // 得分
	private Timer timer; // 定时器
	private int intervel = 1000 / 100; // 时间间隔(毫秒)

	public static BufferedImage background;
	public static BufferedImage start;

	private FlyingObject[] flyings = {}; // 敌机数组
	private Bullet[] bullets = {}; // 子弹数组
	
	
	static { // 静态代码块，初始化图片资源
		try {
			background = ImageIO.read(ShootGame.class.getResource("b.jpg"));
			start = ImageIO.read(ShootGame.class.getResource("start.png"));

		} catch (Exception e) {//异常处理
			e.printStackTrace();
		}
		
	}
	
	/** 画 */
	@Override
	public void paint(Graphics g) {
		g.drawImage(background, 1, 0, null); // 画背景图
		g.drawImage(start, 0, 1, null);
	

	}



	

	
	
}
