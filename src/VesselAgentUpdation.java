import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class VesselAgentUpdation{
	
	public VesselAgentUpdation(){
		
		JFrame frame = new JFrame(); 
		 
        JMenuBar menuBar = new JMenuBar();
        menuBar.setBackground(new Color(205,182,93));
        menuBar.setLayout(new GridLayout());
        
        Font big = new Font("Serif", Font.BOLD, 17);
        
        JButton homeBar = new JButton("Home");
        JButton dashBoard = new JButton("Dashboard");
        JButton vesselAgent = new JButton("Vessel Agent");
        JButton vesselAgentUpdation = new JButton("Vessel Agent Updation");
        JButton aboutUs = new JButton("About Us");
        JButton contact = new JButton("Contact");
        
        homeBar.setFont(big);
        dashBoard.setFont(big);       
        vesselAgent.setFont(big);       
        vesselAgentUpdation.setFont(big);
        aboutUs.setFont(big);
        contact.setFont(big);
        
        
        homeBar.setBackground(new Color(205,182,93));
        homeBar.setForeground(new Color(171,49,9));
        dashBoard.setBackground(new Color(205,182,93));
        dashBoard.setForeground(new Color(171,49,9));
        vesselAgent.setBackground(new Color(205,182,93));
        vesselAgent.setForeground(new Color(171,49,9));
        vesselAgentUpdation.setBackground(new Color(205,182,93));
        vesselAgentUpdation.setForeground(new Color(171,49,9));
        aboutUs.setBackground(new Color(205,182,93));
        aboutUs.setForeground(new Color(171,49,9));
        contact.setBackground(new Color(205,182,93));
        contact.setForeground(new Color(171,49,9));
        
        frame.add(menuBar);

              
        menuBar.add(homeBar);
        menuBar.add(dashBoard);
        menuBar.add(vesselAgent);
        menuBar.add(vesselAgentUpdation);
        menuBar.add(aboutUs);
        menuBar.add(contact);
        menuBar.add(Box.createRigidArea(new Dimension(100,50)));
        
        
        
        
        Font titleFont = new Font("Sans-Serif",Font.BOLD,38);
		Font labelFont = new Font("verdana",Font.PLAIN,18);
		frame.setLayout(null); 
	    JLabel title = new JLabel("Vessel Agent Updation");
	    JLabel ship_id = new JLabel("Ship Id *");
	    JLabel eta = new JLabel("Estimated Time of Arrival *"); 
	    
	    JTextField t1=new JTextField ();
	    JTextField t2=new JTextField ();  
	      
	    JButton update = new JButton("Submit");
	    
	    title.setBounds(500,80, 500,48);
	    title.setFont(titleFont);
	    title.setForeground(new Color(222, 13, 194));
	    
	    ship_id.setBounds(560,160, 300,33); 
	    ship_id.setFont(labelFont);
	    
	    t1.setBounds(560,200, 300,33); 
	    t1.setFont(labelFont);
	    t1.setForeground(new Color(125, 128, 125));
	    
	    eta.setBounds(560,233, 300,33); 
	    eta.setFont(labelFont);
	    
	    t2.setBounds(560,270, 300,33); 
	    t2.setFont(labelFont);
	    t2.setForeground(new Color(125, 128, 125));
	    

	    update.setBounds(560,320, 300,33);
	    update.setFont(labelFont);
	    update.setBackground(new Color(147, 136, 104));
	    update.setForeground(Color.WHITE); 
	   
	    frame.add(eta); 
	    frame.add(ship_id);
	    frame.add(t1);  
	    frame.add(t2);   
	    frame.add(title);
	    frame.add(update);
        
            
        frame.setTitle("VesselAgentUpdation");
        frame.setSize(400,400);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        frame.setJMenuBar(menuBar);
        frame.getContentPane().setBackground(new Color(239,228,183));
      
        homeBar.addActionListener(new ActionListener() {
        	@Override
        	public void actionPerformed(ActionEvent e) {
        		new Home();
        		
        	}
        });
        
        dashBoard.addActionListener(new ActionListener() {
        	@Override
        	public void actionPerformed(ActionEvent e) {
        		new DashBoard();
        		
        	}
        });
        
        vesselAgent.addActionListener(new ActionListener() {
        	@Override
        	public void actionPerformed(ActionEvent e) {
        		new VesselAgent();
        		
        	}
        });
        
        vesselAgentUpdation.addActionListener(new ActionListener() {
        	@Override
        	public void actionPerformed(ActionEvent e) {
        		new VesselAgentUpdation();
        		
        	}
        });
        
        aboutUs.addActionListener(new ActionListener() {
        	@Override
        	public void actionPerformed(ActionEvent e) {
        		new AboutUs();
        		
        	}
        });
        
        contact.addActionListener(new ActionListener() {
        	@Override
        	public void actionPerformed(ActionEvent e) {
        		new Contact();
        		
        	}
        });
        
        update.addActionListener(new ActionListener()
		{
		@Override
		public void actionPerformed(ActionEvent e)
		{
			int s = JOptionPane.showConfirmDialog(update, "Do you want to submit the form",null, JOptionPane.YES_NO_OPTION);
			if(s == 0)
				JOptionPane.showMessageDialog(update,"Form submitted successfully");
			String s1 = t1.getText();
			String s2 = t2.getText();   
			System.out.println(s1+" "+s2);
		}
		});

	}

	public static void main(String[] args){	 
       new VesselAgentUpdation();	 
	}


}
