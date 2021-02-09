import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.Image;

public class Kids extends JFrame
{

	JPanel pnl,events;
	JLabel lbl,lbl2,lbl3,lbl4;
	public Kids(){

		super("Kids");
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

			//----------------------------------------Back to Home Button---------------------------------
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

			//-------------------------------------------HEADING-------------------------------------------
			lbl4=new JLabel("KIDS EVENTS");
			Font f4=new Font("Gabriola",Font.BOLD,40);
			lbl4.setFont(f4);
			lbl4.setForeground(Color.black);
			lbl4.setBounds(525,0,400,400);
			pnl.add(lbl4);

			//---------------------------------------EVENTS--------------------------------------------------
			//Baby Shower------------------------------------------------
			ImageIcon babyShowerImage = new ImageIcon("babyShower.jpg");
			JButton babyShowerButton = new JButton(babyShowerImage);
			babyShowerButton.setBounds(337,225,250,180);
			pnl.add(babyShowerButton);
			JLabel babyShowerLabel = new JLabel("Baby Shower");
			babyShowerLabel.setFont(f2);
			babyShowerLabel.setBounds(337,365,200,100);
			pnl.add(babyShowerLabel);

			babyShowerButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
					pnl.setVisible(false);
		     	EventPackages ep = new EventPackages();
					ep.setVisible(true);
      }
    });

			// seminar.addActionListener(new ActionListener(){
			// 	public void actionPerformed(ActionEvent e){
			// 		pnl.setVisible(false);
		  //           EventPackage e = new EventPackage();
			// 		c.setVisible(true);
	    //     	}
	    // 	});

			//Welcome Baby Party---------------------------------------------
			ImageIcon welcomeBabyImage = new ImageIcon("welcomeBaby.jpg");
			JButton welcomeBabyButton = new JButton(welcomeBabyImage);
			welcomeBabyButton.setBounds(662,225,250,180);
			pnl.add(welcomeBabyButton);
			JLabel welcomeBabyLabel = new JLabel("Welcome Baby Party");
			welcomeBabyLabel.setFont(f2);
			welcomeBabyLabel.setBounds(662,365,200,100);
			pnl.add(welcomeBabyLabel);


			welcomeBabyButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
					pnl.setVisible(false);
		     	EventPackages ep = new EventPackages();
					ep.setVisible(true);
      }
    });
			// seminar.addActionListener(new ActionListener(){
			// 	public void actionPerformed(ActionEvent e){
			// 		pnl.setVisible(false);
			//           EventPackage e = new EventPackage();
			// 		c.setVisible(true);
			//     	}
			// 	});

			//Naming Ceremony-----------------------------------------------------
			ImageIcon namingCeremonyImage = new ImageIcon("namingCeremony.jpg");
			JButton namingCeremonyButton = new JButton(namingCeremonyImage);
			namingCeremonyButton.setBounds(100,450,250,180);
			pnl.add(namingCeremonyButton);
			JLabel namingCeremonyLabel = new JLabel("Naming Ceremony");
			namingCeremonyLabel.setFont(f2);
			namingCeremonyLabel.setBounds(100,590,200,100);
			pnl.add(namingCeremonyLabel);


				namingCeremonyButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
					pnl.setVisible(false);
		     	EventPackages ep = new EventPackages();
					ep.setVisible(true);
      }
    });
			// seminar.addActionListener(new ActionListener(){
			// 	public void actionPerformed(ActionEvent e){
			// 		pnl.setVisible(false);
			//           EventPackage e = new EventPackage();
			// 		c.setVisible(true);
			//     	}
			// 	});

			//Themed Birthday Party-------------------------------------------------------
			ImageIcon themedBirthdayPartyImage = new ImageIcon("themedBirthdayParty.jpg");
			JButton themedBirthdayPartyButton = new JButton(themedBirthdayPartyImage);
			themedBirthdayPartyButton.setBounds(920,450,250,180);
			pnl.add(themedBirthdayPartyButton);
			JLabel themedBirthdayPartyLabel = new JLabel("Themed Birthday Party");
			themedBirthdayPartyLabel.setFont(f2);
			themedBirthdayPartyLabel.setBounds(920,590,200,100);
			pnl.add(themedBirthdayPartyLabel);

			themedBirthdayPartyButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
					pnl.setVisible(false);
		     	EventPackages ep = new EventPackages();
					ep.setVisible(true);
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
			// seminar.addActionListener(new ActionListener(){
			// 	public void actionPerformed(ActionEvent e){
			// 		pnl.setVisible(false);
			//           EventPackage e = new EventPackage();
			// 		c.setVisible(true);
			//     	}
			// 	});
	}

	public static void main(String args[])
	{
		new Kids();
	}

}
