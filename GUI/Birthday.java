import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.Image;

public class Birthday extends JFrame
{

	JPanel pnl,events;
	JLabel lbl,lbl2,lbl3,lbl4;
	public Birthday(){

		super("Birthday");
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
		JButton home = new JButton("Back to Home");
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
		lbl4=new JLabel("BIRTHDAY EVENTS");
		Font f4=new Font("Gabriola",Font.BOLD,40);
		lbl4.setFont(f4);
		lbl4.setForeground(Color.black);
		lbl4.setBounds(525,0,400,400);
		pnl.add(lbl4);

		//---------------------------------------EVENTS--------------------------------------------------
		//Themed Party------------------------------------------------
		ImageIcon themedPartyImage = new ImageIcon("themedParty.jpg");
		JButton themedPartyButton = new JButton(themedPartyImage);
		themedPartyButton.setBounds(337,225,250,180);
		pnl.add(themedPartyButton);
		JLabel themedPartyLabel = new JLabel("Themed Birthday Party");
		themedPartyLabel.setFont(f2);
		themedPartyLabel.setBounds(337,365,200,100);
		pnl.add(themedPartyLabel);

		// seminar.addActionListener(new ActionListener(){
		// 	public void actionPerformed(ActionEvent e){
		// 		pnl.setVisible(false);
	  //           EventPackage e = new EventPackage();
		// 		c.setVisible(true);
    //     	}
    // 	});

		//Garden Party---------------------------------------------
		ImageIcon gardenPartyImage = new ImageIcon("gardenParty.jpg");
		JButton gardenPartyButton = new JButton(gardenPartyImage);
		gardenPartyButton.setBounds(662,225,250,180);
		pnl.add(gardenPartyButton);
		JLabel gardenPartyLabel = new JLabel("Garden Party");
		gardenPartyLabel.setFont(f2);
		gardenPartyLabel.setBounds(662,365,200,100);
		pnl.add(gardenPartyLabel);

		// seminar.addActionListener(new ActionListener(){
		// 	public void actionPerformed(ActionEvent e){
		// 		pnl.setVisible(false);
		//           EventPackage e = new EventPackage();
		// 		c.setVisible(true);
		//     	}
		// 	});

		//Surprise Party-----------------------------------------------------
		ImageIcon surprisePartyImage = new ImageIcon("surpriseParty.jpg");
		JButton surprisePartyButton = new JButton(surprisePartyImage);
		surprisePartyButton.setBounds(100,450,250,180);
		pnl.add(surprisePartyButton);
		JLabel surprisePartyLabel = new JLabel("Surprise Party");
		surprisePartyLabel.setFont(f2);
		surprisePartyLabel.setBounds(100,590,200,100);
		pnl.add(surprisePartyLabel);

		// seminar.addActionListener(new ActionListener(){
		// 	public void actionPerformed(ActionEvent e){
		// 		pnl.setVisible(false);
		//           EventPackage e = new EventPackage();
		// 		c.setVisible(true);
		//     	}
		// 	});

		//Dinner Party-------------------------------------------------------
		ImageIcon dinnerPartyImage = new ImageIcon("dinnerParty.jpg");
		JButton dinnerPartyButton = new JButton(dinnerPartyImage);
		dinnerPartyButton.setBounds(920,450,250,180);
		pnl.add(dinnerPartyButton);
		JLabel dinnerPartyLabel = new JLabel("Dinner Party");
		dinnerPartyLabel.setFont(f2);
		dinnerPartyLabel.setBounds(920,590,200,100);
		pnl.add(dinnerPartyLabel);

		// seminar.addActionListener(new ActionListener(){
		// 	public void actionPerformed(ActionEvent e){
		// 		pnl.setVisible(false);
		//           EventPackage e = new EventPackage();
		// 		c.setVisible(true);
		//     	}
		// 	});
	}

	public static void main(String args[]){
		new Birthday();
	}
}
