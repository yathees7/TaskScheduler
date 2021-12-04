import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Contact{
	
	public Contact(){
		
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
        
        JLabel label = new JLabel("You can contact us here.");
        label.setBounds(100,100,50,50);
        
        frame.add(menuBar);
        frame.add(label);
              
        menuBar.add(homeBar);
        menuBar.add(dashBoard);
        menuBar.add(vesselAgent);
        menuBar.add(vesselAgentUpdation);
        menuBar.add(aboutUs);
        menuBar.add(contact);
        menuBar.add(Box.createRigidArea(new Dimension(100,50)));
        
            
        frame.setTitle("Contact");
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

	}

	public static void main(String[] args){	 
       new Contact();	 
	}


}
