import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.Image;

public class Social extends JFrame{

	JPanel pnl,pnl2;
	JLabel lbl,lbl2,lbl3,lbl4,footer,footer2;
	JLabel reunionl,freshl,farewel,themel,housel;
	JButton reunion,freshers,farewell,theme,housewarm;
	JButton blogin,bregister;
	ImageIcon reun,fresh,send,the,house;
	JFrame frame;

	public Social(){
		super("Social Events");
		setSize(1450,900);
		setVisible(true);


		//------ heading ----------
		pnl=new JPanel();
		add(pnl);
		pnl.setLayout(null);

		lbl=new JLabel("Make Merry Events");
		lbl2=new JLabel("<html><p><br>We don't just say, we make it happen!!</p></html>");
		lbl3=new JLabel("..........................................");

		Font f1=new Font("Times New Roman",Font.BOLD+Font.ITALIC,40);
		Font f2=new Font("Calibri",Font.BOLD,20);
		Font f3=new Font("Times New Roman",Font.ITALIC,40);

		lbl.setFont(f1);
		lbl2.setFont(f2);
		lbl3.setFont(f3);

		lbl.setForeground(new Color(178,34,34));
		pnl.setBackground(new Color(255,204,204));
		lbl2.setForeground(new Color(205,92,92));
		lbl3.setForeground(new Color(178,34,34));

		lbl.setBounds(370,5,900,70);
		lbl2.setBounds(700,15,900,60);
		lbl3.setBounds(480,60,1000,50);

		pnl.add(lbl);
		pnl.add(lbl2);
		pnl.add(lbl3);		

		//-------- body ---------
		lbl4=new JLabel("Social Events");
		Font f4=new Font("Gabriola",Font.BOLD,40);
		lbl4.setFont(f4);
		lbl4.setForeground(Color.black);
		lbl4.setBounds(560,-55,200,400);
		pnl.add(lbl4);
		
		reun=new ImageIcon("reunion.jpg");
		JButton reunion=new JButton(reun);
		reunion.setBounds(200,175,250,180);
		pnl.add(reunion);
		reunionl=new JLabel("Reunions");
		reunionl.setFont(f2);
		reunionl.setBounds(290,320,200,100);
		pnl.add(reunionl);

		reunion.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
					pnl.setVisible(false);
		     	EventPackages ep = new EventPackages();
					ep.setVisible(true);
      }
    });
		
		fresh=new ImageIcon("freah.jpg");
		JButton freshers=new JButton(fresh);
		freshers.setBounds(550,175,250,180);
		pnl.add(freshers);
		freshl=new JLabel("Freshers Party");
		freshl.setFont(f2);
		freshl.setBounds(610,320,200,100);
		pnl.add(freshl);

		freshers.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
					pnl.setVisible(false);
		     	EventPackages ep = new EventPackages();
					ep.setVisible(true);
      }
    });

		send=new ImageIcon("farewell.jpg");
		JButton farewell=new JButton(send);
		farewell.setBounds(900,175,250,180);
		pnl.add(farewell);
		farewel=new JLabel("Farewell Party");
		farewel.setFont(f2);
		farewel.setBounds(960,320,200,100);
		pnl.add(farewel);

		farewell.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
					pnl.setVisible(false);
		     	EventPackages ep = new EventPackages();
					ep.setVisible(true);
      }
    });

		the=new ImageIcon("theme1.jpg");
		JButton theme=new JButton(the);
		theme.setBounds(390,400,250,180);
		pnl.add(theme);
		themel=new JLabel("Theme Party");
		themel.setFont(f2);
		themel.setBounds(470,550,200,100);
		pnl.add(themel);


    	theme.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
					pnl.setVisible(false);
		     	EventPackages ep = new EventPackages();
					ep.setVisible(true);
      }
    });

		house=new ImageIcon("housewarming.jpg");
		JButton housewarm=new JButton(house);
		housewarm.setBounds(730,400,250,180);
		pnl.add(housewarm);
		housel=new JLabel("House-warming");
		housel.setFont(f2);
		housel.setBounds(780,550,200,100);
		pnl.add(housel);

		
    	housewarm.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
					pnl.setVisible(false);
		     	EventPackages ep = new EventPackages();
					ep.setVisible(true);
      }
    });

		//----------- Footer -------------
		/*pnl2=new JPanel();
		int width=pnl.getWidth();
		int height=130;
		pnl.add(pnl2);
		pnl2.setLayout(null);
		pnl2.setVisible(true);
		pnl2.setSize(width,height);
		pnl2.setBackground(new Color(112,128,144));
		pnl2.setBounds(0,620,width,height);
		footer=new JLabel("Address : 'Make Merry Event Managers',Sukhwani Complex, 4th Floor, Chinchwad. Pune 411019");
		footer2=new JLabel("Phone No. : 8900456099 / 020 788190678");
		Font f5=new Font("Calibri",Font.BOLD,20);
		footer.setFont(f5);
		footer2.setFont(f5);
		footer.setBounds(280,25,850,30);
		footer2.setBounds(490,50,600,30);
		footer.setForeground(Color.white);
		footer2.setForeground(Color.white);
		pnl2.add(footer);
		pnl2.add(footer2);
	*/

		JButton button=new JButton("Back to home");
		button.setBounds(100,100,150,30);
		pnl.add(button);
		button.addActionListener(new ActionListener(){  
			public void actionPerformed(ActionEvent h){  
				pnl.setVisible(false);
	            Home home=new Home();
				home.setVisible(true);  
        	}  
    	});


		JButton next=new JButton("Next Page");
		next.setBounds(1150,100,150,30);
		pnl.add(next);
		next.addActionListener(new ActionListener(){  
			public void actionPerformed(ActionEvent h){  
				pnl.setVisible(false);
	            Social2 s=new Social2();
				s.setVisible(true);  
        	}  
    	});

		JLabel footer=new JLabel("Address : 'Make Merry Event Managers', Sukhwani Complex, 4th Floor, Chinchwad. Pune 411019");
			JLabel footer2=new JLabel("Phone No. : 8900456099 / 020 788190678");
			Font f5=new Font("Calibri",Font.BOLD,20);
			footer.setFont(f5);
			footer2.setFont(f5);
			footer.setBounds(280,660,850,30);
			footer2.setBounds(490,680,600,30);
			footer.setForeground(Color.black);
			footer2.setForeground(Color.black);
			
			pnl.add(footer);
			pnl.add(footer2);
		
	}


	public void actionPerformed(ActionEvent e){

		/*if(e.getSource()==corporate){
			corporate.setText("Clicked");
		}*/

		/*if(e.getSource()==corporate){
			pnl.setVisible(false);
			Corporate c=new Corporate();
			c.setVisible(true);
		}
		if(e.getSource()==wedding){
			Wedding w=new Wedding();
			this.dispose();
		}*/
		/*if(e.getSource()==birthday){
			Birthday b=new Birthday();
			this.dispose();
		}
		if(e.getSource()==kids){
			Kids k=new Kids();
			this.dispose();
		}
		if(e.getSource()==corporate){
			Social s=new Social();
			this.dispose();
		}*/
	}

	public static void main(String[] args){
		Home h=new Home();
	}
}