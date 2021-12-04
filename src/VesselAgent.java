import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class VesselAgent{
	
	public VesselAgent(){
		
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
        
        JLabel title = new JLabel("Vessel Agent Submission Form");
	    JLabel ship_id = new JLabel("Ship Id *");
	    JLabel eta = new JLabel("Estimated Time of Arrival *");
	    
	    JTextField t1=new JTextField ();
	    JTextField t2=new JTextField (); 
	      
	    JButton submit = new JButton("Submit");
	    JButton vesselAgentUpdate = new JButton("Update");
	    
	    title.setBounds(450,80, 700,48);
	    title.setFont(titleFont);
	    title.setForeground(new Color(37, 184, 59));
	    
	    ship_id.setBounds(590,160, 300,33); 
	    ship_id.setFont(labelFont);
	    
	    t1.setBounds(590,200, 300,33); 
	    t1.setFont(labelFont);
	    t1.setForeground(new Color(125, 128, 125));
	    
	    eta.setBounds(590,233, 300,33); 
	    eta.setFont(labelFont);
	    
	    t2.setBounds(590,270, 300,33); 
	    t2.setFont(labelFont);
	    t2.setForeground(new Color(125, 128, 125));
	    
	    
	    submit.setBounds(590,320, 300,33);
	    submit.setFont(labelFont);
	    submit.setBackground(new Color(147, 136, 104));
	    submit.setForeground(Color.WHITE); 
	    
	   
	    frame.add(eta);
	    frame.add(ship_id);
	    frame.add(t1);  
	    frame.add(t2);  
	    frame.add(title);
	    frame.add(submit);
  
	    
	    submit.addActionListener(new ActionListener()
		{
		@Override
		public void actionPerformed(ActionEvent e)
		{
			int s = JOptionPane.showConfirmDialog(eta, "Do you want to submit the form",null, JOptionPane.YES_NO_OPTION);
			if(s == 0)
				JOptionPane.showMessageDialog(eta,"Form submitted successfully");
			String s1 = t1.getText();
			String s2 = t2.getText();  
			System.out.println(s1+" "+s2);
		}
		});
        
            
        frame.setTitle("VesselAgent");
        frame.setSize(400,400);
        frame.setLayout(null);
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

	}

	public static void main(String[] args){	 
       new VesselAgent();	 
	}


}
