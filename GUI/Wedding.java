import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.Image;

public class Wedding extends JFrame{

	JPanel pnl,events;
	JLabel lbl,lbl2,lbl3,lbl4;
	public Wedding(){

		super("Wedding");
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

		lbl.setBounds(370,30,900,70);
		lbl2.setBounds(700,40,900,60);
		lbl3.setBounds(480,100,1000,50);

		pnl.add(lbl);
		pnl.add(lbl2);
		pnl.add(lbl3);

		//-------- body ---------

			JButton home=new JButton("Back to Home");
			home.setBounds(100,100,150,30);
			pnl.add(home);
			home.addActionListener(new ActionListener()
			{
				public void actionPerformed(ActionEvent e)
				{
						pnl.setVisible(false);
			      Home h = new Home();
						h.setVisible(true);
	       }
	    });

			lbl4=new JLabel("WEDDING EVENTS");
			Font f4=new Font("Gabriola",Font.BOLD,40);
			lbl4.setFont(f4);
			lbl4.setForeground(Color.black);
			lbl4.setBounds(525,0,400,400);
			pnl.add(lbl4);

			//Haldi
			ImageIcon haldiImage = new ImageIcon("haldi.jpg");
			JButton haldiButton = new JButton(haldiImage);
			haldiButton.setBounds(100,220,250,180);
			pnl.add(haldiButton);
			JLabel haldiLabel = new JLabel("Haldi");
			haldiLabel.setFont(f2);
			haldiLabel.setBounds(100,360,200,100);
			pnl.add(haldiLabel);

			// seminar.addActionListener(new ActionListener(){
			// 	public void actionPerformed(ActionEvent e){
			// 		pnl.setVisible(false);
		  //           EventPackage e = new EventPackage();
			// 		c.setVisible(true);
	    //     	}
	    // 	});


			//Mehendi
			ImageIcon mehendiImage = new ImageIcon("mehendi.jpg");
			JButton mehendiButton = new JButton(mehendiImage);
			mehendiButton.setBounds(516,220,250,180);
			pnl.add(mehendiButton);
			JLabel mehendiLabel = new JLabel("Mehendi");
			mehendiLabel.setFont(f2);
			mehendiLabel.setBounds(516,360,200,100);
			pnl.add(mehendiLabel);

			// seminar.addActionListener(new ActionListener(){
			// 	public void actionPerformed(ActionEvent e){
			// 		pnl.setVisible(false);
		  //           EventPackage e = new EventPackage();
			// 		c.setVisible(true);
	    //     	}
	    // 	});


			//Sangeet
			ImageIcon sangeetImage = new ImageIcon("sangeet.jpg");
			JButton sangeetButton = new JButton(sangeetImage);
			sangeetButton.setBounds(932,220,250,180);
			pnl.add(sangeetButton);
			JLabel sangeetLabel = new JLabel("Sangeet");
			sangeetLabel.setFont(f2);
			sangeetLabel.setBounds(932,360,200,100);
			pnl.add(sangeetLabel);

			// seminar.addActionListener(new ActionListener(){
			// 	public void actionPerformed(ActionEvent e){
			// 		pnl.setVisible(false);
		  //           EventPackage e = new EventPackage();
			// 		c.setVisible(true);
	    //     	}
	    // 	});

			//Engagement
			ImageIcon engagementImage = new ImageIcon("engagement.jpg");
			JButton engagementButton = new JButton(engagementImage);
			engagementButton.setBounds(100,450,250,180);
			pnl.add(engagementButton);
			JLabel engagementLabel = new JLabel("Engagement");
			engagementLabel.setFont(f2);
			engagementLabel.setBounds(100,590,200,100);
			pnl.add(engagementLabel);

			// seminar.addActionListener(new ActionListener(){
			// 	public void actionPerformed(ActionEvent e){
			// 		pnl.setVisible(false);
		  //           EventPackage e = new EventPackage();
			// 		c.setVisible(true);
	    //     	}
	    // 	});

			//Wedding
			ImageIcon weddingImage = new ImageIcon("wedding.jpg");
			JButton weddingButton = new JButton(weddingImage);
			weddingButton.setBounds(516,450,250,180);
			pnl.add(weddingButton);
			JLabel weddingLabel = new JLabel("Wedding");
			weddingLabel.setFont(f2);
			weddingLabel.setBounds(516,590,200,100);
			pnl.add(weddingLabel);

			// seminar.addActionListener(new ActionListener(){
			// 	public void actionPerformed(ActionEvent e){
			// 		pnl.setVisible(false);
		  //           EventPackage e = new EventPackage();
			// 		c.setVisible(true);
	    //     	}
	    // 	});

			//Reception
			ImageIcon receptionImage = new ImageIcon("reception.jpg");
			JButton receptionButton = new JButton(receptionImage);
			receptionButton.setBounds(932,450,250,180);
			pnl.add(receptionButton);
			JLabel receptionLabel = new JLabel("Reception");
			receptionLabel.setFont(f2);
			receptionLabel.setBounds(932,590,200,100);
			pnl.add(receptionLabel);

			// seminar.addActionListener(new ActionListener(){
			// 	public void actionPerformed(ActionEvent e){
			// 		pnl.setVisible(false);
		  //           EventPackage e = new EventPackage();
			// 		c.setVisible(true);
	    //     	}
	    // 	});
		}

	public static void main(String args[]){
		new Wedding();
	}
}
