import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.Image;

public class Corporate extends JFrame{

	JPanel pnl,pnl2;
	JLabel lbl,lbl2,lbl3,lbl4,footer,footer2;
	JButton seminar,conference,inaug,workshop;
	ImageIcon sem,conf,ina,works;
	JLabel seml,confl,inal,worksl;

	public Corporate(){

		super("Corporate Events");
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
		lbl4=new JLabel("Corporate Events");
		Font f4=new Font("Gabriola",Font.BOLD,40);
		lbl4.setFont(f4);
		lbl4.setForeground(Color.black);
		lbl4.setBounds(520,-55,400,400);
		pnl.add(lbl4);
		
		sem=new ImageIcon("seminar.jpg");
		JButton seminar=new JButton(sem);
		seminar.setBounds(200,195,250,180);
		pnl.add(seminar);
		seml=new JLabel("Seminars");
		seml.setFont(f2);
		seml.setBounds(290,340,200,100);
		pnl.add(seml);

		seminar.addActionListener(new ActionListener(){  
			public void actionPerformed(ActionEvent e){  
				pnl.setVisible(false);
	            Corporate c=new Corporate();
				c.setVisible(true);  
        	}  
    	});
		
		conf=new ImageIcon("conference.jpg");
		JButton conference=new JButton(conf);
		conference.setBounds(580,195,250,180);
		pnl.add(conference);
		confl=new JLabel("Conferences");
		confl.setFont(f2);
		confl.setBounds(640,340,200,100);
		pnl.add(confl);

		conference.addActionListener(new ActionListener(){  
			public void actionPerformed(ActionEvent f){ 
					pnl.setVisible(false);
		            Birthday b=new Birthday();
					b.setVisible(true);  
        	}  
    	});

		ina=new ImageIcon("inaug.jpg");
		JButton inaug=new JButton(ina);
		inaug.setBounds(370,430,250,180);
		pnl.add(inaug);
		inal=new JLabel("Inaugurations");
		inal.setFont(f2);
		inal.setBounds(430,580,200,100);
		pnl.add(inal);

		inaug.addActionListener(new ActionListener(){  
			public void actionPerformed(ActionEvent g){  
				pnl.setVisible(false);
	            Kids k=new Kids();
				k.setVisible(true);  
        	}  
    	});

		works=new ImageIcon("workshop.jpg");
		JButton workshop=new JButton(works);
		workshop.setBounds(830,430,250,180);
		pnl.add(workshop);
		worksl=new JLabel("Workshops");
		worksl.setFont(f2);
		worksl.setBounds(900,580,200,100);
		pnl.add(worksl);

		workshop.addActionListener(new ActionListener(){  
			public void actionPerformed(ActionEvent g){  
				pnl.setVisible(false);
	            Social s=new Social();
				s.setVisible(true);  
        	}  
    	});

		/*weds=new ImageIcon("wedding1.jpg");
		JButton wedding=new JButton(weds);
		wedding.setBounds(730,400,250,180);
		pnl.add(wedding);
		wedl=new JLabel("Wedding Events");
		wedl.setFont(f2);
		wedl.setBounds(780,550,200,100);
		pnl.add(wedl);

		wedding.addActionListener(new ActionListener(){  
			public void actionPerformed(ActionEvent h){  
				pnl.setVisible(false);
	            Wedding w=new Wedding();
				w.setVisible(true);  
        	}  
    	});
    	*/
    	//100 100 150 30

		//----------- Footer -------------
		/*int width=pnl.getWidth();
		int height=50;
		//pnl2.setLayout(null);
		//pnl2.setVisible(true);
		//pnl2.setSize(width,height);
		JLabel foot=new JLabel();
		foot.setBackground(new Color(112,128,144));
		foot.setBounds(0,00,width,height);
		pnl.add(foot);
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


		footer=new JLabel("Address : 'Make Merry Event Managers', Sukhwani Complex, 4th Floor, Chinchwad. Pune 411019");
		footer2=new JLabel("Phone No. : 8900456099 / 020 788190678");
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


	/*public static void main(String args[]){
		new Corporate();
	}*/
}