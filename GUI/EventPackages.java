import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.Image;

public class EventPackages extends JFrame
{

	JPanel pnl,events;
	JLabel lbl,lbl2,lbl3,lbl4;
	public EventPackages(){

		super("Event Packages");
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
		lbl4=new JLabel("EVENT PACKAGES");
		Font f4=new Font("Gabriola",Font.BOLD,40);
		lbl4.setFont(f4);
		lbl4.setForeground(Color.black);
		lbl4.setBounds(525,0,400,400);
		pnl.add(lbl4);

		//---------------------------------------PACKAGE TYPES--------------------------------------------------
		//Silver Package------------------------------------------------
		JButton silverPackageButton = new JButton("SILVER");
		silverPackageButton.setBounds(236,350,100,50);
		pnl.add(silverPackageButton);

    silverPackageButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
					pnl.setVisible(false);
		     	EventPackages ep = new EventPackages();
					ep.setVisible(true);
      }
    });

    //Gold Package------------------------------------------------
		JButton goldPackageButton = new JButton("GOLD");
		goldPackageButton.setBounds(559,350,100,50);
		pnl.add(goldPackageButton);

    goldPackageButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
					pnl.setVisible(false);
		     	EventPackages ep = new EventPackages();
					ep.setVisible(true);
      }
    });

    //Platinum Package------------------------------------------------
		JButton platinumPackageButton = new JButton("PLATINUM");
		platinumPackageButton.setBounds(882,350,100,50);
		pnl.add(platinumPackageButton);

    platinumPackageButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
					pnl.setVisible(false);
		     	EventPackages ep = new EventPackages();
					ep.setVisible(true);
      }
    });
	}

	public static void main(String args[]){
		new EventPackages();
	}
}
