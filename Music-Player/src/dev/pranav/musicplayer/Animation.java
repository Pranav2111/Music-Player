package dev.pranav.musicplayer;

import java.awt.Color;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;


public class Animation 
{
	JFrame frmAnimate;
	ImageIcon iconAnimateBaaja, iconBaajaIntro;
	JLabel lblBaajaIntro;
	
	int width = 200;
	int height = 200;
	
	public void animate()
	{
		
		frmAnimate = new JFrame();
		frmAnimate.setSize(width, height);
		frmAnimate.setUndecorated(true);
		frmAnimate.setLayout(null);
		frmAnimate.setLocationRelativeTo(null);
		
		iconAnimateBaaja  = new ImageIcon("src/assets/src/assets/PNGBaaja.png");
		Image imageAnimateBaaja = iconAnimateBaaja.getImage();
		iconAnimateBaaja.setImage(imageAnimateBaaja);
		frmAnimate.setIconImage(imageAnimateBaaja);
		
		iconBaajaIntro = new ImageIcon("src/assets/logo.png");
		Image imgBaajaAnimateIntro = iconBaajaIntro.getImage();
		imgBaajaAnimateIntro = imgBaajaAnimateIntro.getScaledInstance(width, height, Image.SCALE_DEFAULT);
		iconBaajaIntro.setImage(imgBaajaAnimateIntro);
		
		lblBaajaIntro = new JLabel(iconBaajaIntro);
		lblBaajaIntro.setBounds(0, 0, width, height);
		lblBaajaIntro.setLayout(null);
		frmAnimate.getContentPane().add(lblBaajaIntro);
		frmAnimate.setBackground(Color.black);
		
		frmAnimate.setVisible(true);
		
		new Thread()
		{
			public void run()
			{
				try
				{
					MusicPlayer objBaaja = new MusicPlayer();
			
					sleep(1500);
					objBaaja.init();
					frmAnimate.dispose();
				}
				catch (Exception e) {}
			}
		}.start();
	}//function animate() closed here
}
