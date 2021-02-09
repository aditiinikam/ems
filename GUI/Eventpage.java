package GUI;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Eventpage{
	JFrame mainframe;
	JPanel heading,menu;
	ImageIcon img1,img2,img3,img4,img5;

	public Eventpage(){
		mainframe=new JFrame("SPAN Events");
		mainframe.setSize(1366,768);
		mainframe.setVisible(true);
		mainframe.setBackground(new Color(243,100,98));

		//----Heading--------
		heading=new JPanel();
		heading.setBackground(new Color(243,100,98));
		heading.setBounds(283,60,883,100);

		//-----Components------
		Font f=new Font("Times New Roman",Font.BOLD+Font.CENTER_BASELINE,40);
		JLabel title=new JLabel("EVENTS");
		title.setFont(f);
		heading.add(title);

		//----menu-------
		menu=new JPanel();
		img1=new ImageIcon("../images/corporate1.jpg");

	}

}