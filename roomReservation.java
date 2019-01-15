/**
 * @(#)BasicGUI.java
 *
 *
 * @author 
 * @version 1.00 2019/1/10
 */




import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import javax.swing.ImageIcon.*;


public class roomReservation extends JFrame{// implements ActionListener {
private  Image Backgroundimage;
     
      	   //declaring Components
      	   
      	   JLabel hLogo, tagLine, CTime, CDate, RPreview, RDetails, RDetails1, RDetails2, RDetails3, RDetails4, RBooking, lblx;//lblN1,lblN2,lblR; 
      	   JButton Rm1,Rm2,Rm3,Rm4,Rm5,Rm6,Rm7,Rm8,Rm9,Rm10,Rm11,Rm12,Rm13,Rm14,Rm15,Rm16,Rm17,Rm18,Rm19,Rm20,bAdd,bClear,bBooknow,buttonBrowse; //,
      	   JPanel ex;
      	   // JTextField txtN1, txtN2, txtR;
           Icon logo = new ImageIcon("C:/Users/DELVO/Documents/HotelRoomReservation/img/logo1.jpg");
      	   Icon PPreview = new ImageIcon("C:/Users/DELVO/Documents/HotelRoomReservation/img/Room1.jpg");
      	   
      	   Icon Rm01 = new ImageIcon("C:/Users/DELVO/Documents/HotelRoomReservation/img/Room2.jpg");
      	   Icon Rm02 = new ImageIcon("C:/Users/DELVO/Documents/HotelRoomReservation/img/Room1.jpg");
      	   Icon Rm03 = new ImageIcon("C:/Users/DELVO/Documents/HotelRoomReservation/img/Room3.jpg");
      	   Icon Rm04 = new ImageIcon("C:/Users/DELVO/Documents/HotelRoomReservation/img/Room4.jpg");
      	   Icon Rm05 = new ImageIcon("C:/Users/DELVO/Documents/HotelRoomReservation/img/Room5.jpg");
      	   Icon Rm06 = new ImageIcon("C:/Users/DELVO/Documents/HotelRoomReservation/img/Room6.jpg");
      	   Icon Rm07 = new ImageIcon("C:/Users/DELVO/Documents/HotelRoomReservation/img/Room7.jpg");
      	   Icon Rm08 = new ImageIcon("C:/Users/DELVO/Documents/HotelRoomReservation/img/Room8.jpg");
      	   Icon Rm09 = new ImageIcon("C:/Users/DELVO/Documents/HotelRoomReservation/img/Room9.jpg");
      	   Icon Rm010 = new ImageIcon("C:/Users/DELVO/Documents/HotelRoomReservation/img/Room10.jpg");
      	   Icon Rm011 = new ImageIcon("C:/Users/DELVO/Documents/HotelRoomReservation/img/Room11.jpg");
      	   Icon Rm012 = new ImageIcon("C:/Users/DELVO/Documents/HotelRoomReservation/img/Room12.jpg");
      	   Icon Rm013 = new ImageIcon("C:/Users/DELVO/Documents/HotelRoomReservation/img/Room13.jpg");
      	   Icon Rm014 = new ImageIcon("C:/Users/DELVO/Documents/HotelRoomReservation/img/Room14.jpg");
      	   Icon Rm015 = new ImageIcon("C:/Users/DELVO/Documents/HotelRoomReservation/img/Room15.jpg");
      	   Icon Rm016 = new ImageIcon("C:/Users/DELVO/Documents/HotelRoomReservation/img/Room16.jpg");
      	   Icon Rm017 = new ImageIcon("C:/Users/DELVO/Documents/HotelRoomReservation/img/Room17.jpg");
      	   Icon Rm018 = new ImageIcon("C:/Users/DELVO/Documents/HotelRoomReservation/img/Room18.jpg");
      	   Icon Rm019 = new ImageIcon("C:/Users/DELVO/Documents/HotelRoomReservation/img/Room19.jpg");
      	   Icon Rm020 = new ImageIcon("C:/Users/DELVO/Documents/HotelRoomReservation/img/Room20.jpg");
      	   
      	   
      	   /* Image i = Rm01.getImage();
      	   Image new_img = i.getScaledInstance(50,50,Image.SCALE_SMOOTH);
      	   Rm01 = new ImageIcon(new_img);
      	   */
      	   
 
      	 
      	 
      	 public roomReservation() {
      	 	
      	 	///Contruction/Instantiate
      	 	setSize(980,770);
      	 	setLocation(200,0);
      	 	setVisible(true);
      	 	setTitle("Hotel Reservation");
      	 	
      	 	//set background for JFrame
      	 	Container C = getContentPane();
      	 	C.setBackground(new Color(10,0,10));
            hLogo = new JLabel(logo);
            
      	 	tagLine = new JLabel("Home Away From Home");
      	 	CTime = new JLabel("Time: ");
      	 	CDate = new JLabel("Date: ");
      	 	RPreview = new JLabel(PPreview);
      	 	//Details
      	 	RDetails = new JLabel("Room Amenities");
      	 	RDetails1 = new JLabel("Air Condition with 42 Cable TV");
      	 	RDetails2 = new JLabel("Unlimited Wifi");
      	 	RDetails3 = new JLabel("Comfortable Bed");
      	 	RDetails4 = new JLabel("Bathroom and sink");
      	 	
      	 	
      	 	RBooking = new JLabel("Room Booking Form");
      	 	buttonBrowse = new JButton();
      	 	
      	 	bBooknow = new JButton("Book Me");
      	 	
      	 	Rm1 = new JButton(Rm01);
      	 	Rm2 = new JButton(Rm02);
      	 	Rm3 = new JButton(Rm03);
      	 	Rm4 = new JButton(Rm04);
      	 	Rm5 = new JButton(Rm05);
      	 	Rm6 = new JButton(Rm06);
      	 	Rm7 = new JButton(Rm07);
      	 	Rm8 = new JButton(Rm08);
      	 	Rm9 = new JButton(Rm09);
      	 	Rm10 = new JButton(Rm010);
      	 	Rm11 = new JButton(Rm011);
      	 	Rm12 = new JButton(Rm012);
      	 	Rm13 = new JButton(Rm013);
      	 	Rm14 = new JButton(Rm014);
      	 	Rm15 = new JButton(Rm015);
      	 	Rm16 = new JButton(Rm016);
      	 	Rm17 = new JButton(Rm017);
      	 	Rm18 = new JButton(Rm018);
      	 	Rm19 = new JButton(Rm019);
      	 	Rm20 = new JButton(Rm020);
      	 	
      	/* 	lblN1 = new JLabel("NUMBER 1");
      	 	lblN2 = new JLabel("NUMBER 2");
      	 	lblR = new JLabel("RESULT");

      	 	bAdd = new JButton("ADD");
      	 	bClear = new JButton("CLEAR");
      	 	
      	 	txtN1 = new JTextField(20);
      	 	txtN2 = new JTextField(20);
      	 	txtR = new JTextField(20); */
      	 	
      	 	lblx= new JLabel("");
      	 	
      	 	//Placing Component on the Frame
      	 	
      	 	add(hLogo);
      	 	hLogo.setBounds(10,10,210,57);
      	 	
      	 	add(tagLine);
      	 	tagLine.setBounds(230,20,300,60);
      	 	tagLine.setFont(new Font("Serif", Font.PLAIN, 24));
      	 	tagLine.setForeground(Color.white);
      	 	
      	 	add(CTime);
      	 	CTime.setBounds(520,20,220,60);
      	 	CTime.setFont(new Font("Serif", Font.PLAIN, 24));
      	 	CTime.setForeground(Color.white);
      	 	
      	 	add(CDate);
      	 	CDate.setBounds(710,0,220,60);
      	 	CDate.setFont(new Font("Serif", Font.PLAIN, 24));
      	 	CDate.setForeground(Color.white);
      	 	
      	 	add(RPreview);
      	 	RPreview.setBounds(10,80,640,400);
      	 	
      	 	add(RDetails);
      	 	RDetails.setBounds(690,-100,295,400);
      	 	RDetails.setBackground(Color.white);
      	 	RDetails.setFont(new Font("Serif", Font.PLAIN, 24));
      	 	
      	 	add(RDetails1);
      	 	RDetails1.setBounds(690,-40,295,400);
      	 	RDetails1.setBackground(Color.white);
      	 	RDetails1.setFont(new Font("Serif", Font.PLAIN, 15));
      	 	
      	 	
      	 	add(RDetails2);
      	 	RDetails2.setBounds(690,-20,295,400);
      	 	RDetails2.setBackground(Color.white);
      	 	RDetails2.setFont(new Font("Serif", Font.PLAIN, 15));
      	 	
      	 	add(RDetails3);
      	 	RDetails3.setBounds(690,0,295,400);
      	 	RDetails3.setBackground(Color.white);
      	 	RDetails3.setFont(new Font("Serif", Font.PLAIN, 15));
      	 	
      	 	add(RDetails4);
      	 	RDetails4.setBounds(690,20,295,400);
      	 	RDetails4.setBackground(Color.white);
      	 	RDetails4.setFont(new Font("Serif", Font.PLAIN, 15));
      	 	// RDetails.setOpaque(true);
      	 	
      	 	add(RBooking);
      	 	//RBooking.setBounds(700,-80,295,400);
      	 	//RBooking.setBackground(Color.white);
      	    RBooking.setOpaque(true);
      	 	
      	 	add(bBooknow);
      	 	bBooknow.setBounds(750,300,100,30);
      	 	
      	 	
      	 	add(Rm1);      	 	 
      	 	Rm1.setBounds(10,500,90,90);
      	 	Rm1.setBackground(Color.white);
      	 	
      	 	//Rm1.setIcon(new ImageIcon("C:/Users/Darwin Delvo/Documents/HotelRoomReservation/img/Room1.jpg"));
      	 	
      	 	
      	 	
      	 	add(Rm2);
      	 	Rm2.setBounds(105,500,90,90);
      	 	Rm2.setBackground(Color.white);
      	 	add(Rm3);
      	 	Rm3.setBounds(200,500,90,90);
      	 	Rm3.setBackground(Color.white);
      	 	add(Rm4);
      	 	Rm4.setBounds(295,500,90,90);
      	 	Rm4.setBackground(Color.white);
      	    add(Rm5);
      	 	Rm5.setBounds(390,500,90,90);
      	 	Rm5.setBackground(Color.white);
      	    add(Rm6);
      	 	Rm6.setBounds(485,500,90,90);
      	 	Rm6.setBackground(Color.white);
      	 	add(Rm7);
      	 	Rm7.setBounds(580,500,90,90);
      	 	Rm7.setBackground(Color.white);
      	 	add(Rm8);
      	 	Rm8.setBounds(675,500,90,90);
      	 	Rm8.setBackground(Color.white);
      	 	add(Rm9);
      	 	Rm9.setBounds(770,500,90,90);
      	 	Rm9.setBackground(Color.white);
      	 	add(Rm10);
      	 	Rm10.setBounds(865,500,90,90);
      	 	Rm10.setBackground(Color.white);
      	 	
      	 	add(Rm11);
      	 	Rm11.setBounds(10,595,90,90);
      	 	Rm11.setBackground(Color.white);
      	 	add(Rm12);
      	 	Rm12.setBounds(105,595,90,90);
      	 	Rm12.setBackground(Color.white);
      	 	add(Rm13);
      	 	Rm13.setBounds(200,595,90,90);
      	 	Rm13.setBackground(Color.white);
      	 	add(Rm14);
      	 	Rm14.setBounds(295,595,90,90);
      	 	Rm14.setBackground(Color.white);
      	    add(Rm15);
      	 	Rm15.setBounds(390,595,90,90);
      	 	Rm15.setBackground(Color.white);
      	    add(Rm16);
      	 	Rm16.setBounds(485,595,90,90);
      	 	Rm16.setBackground(Color.white);
      	 	add(Rm17);
      	 	Rm17.setBounds(580,595,90,90);
      	 	Rm17.setBackground(Color.white);
      	 	add(Rm18);
      	 	Rm18.setBounds(675,595,90,90);
      	 	Rm18.setBackground(Color.white);
      	 	add(Rm19);
      	 	Rm19.setBounds(770,595,90,90);
      	 	Rm19.setBackground(Color.white);
      	 	add(Rm20);
      	 	Rm20.setBounds(865,595,90,90);
      	 	Rm20.setBackground(Color.white);
 
      	 /*	add(txtN1);
      	 	txtN1.setBounds(170,120,100,30);
      	 	
      	 	add(txtN2);
      	 	txtN2.setBounds(170,150,100,30);
      	 	
      	 	add(lblR);
      	 	lblR.setBounds(50,180,100,30);
      	 	
      	 	add(txtR);
      	 	txtR.setBounds(170,180,100,30);
      	 	
      	 	add(bAdd);
      	 	bAdd.setBounds(50,230,100, 30);
      	 	
      	 	add(bClear);
      	 	bClear.setBounds(170,230,100,30);*/
      	 	
      	 	
                
           
      	 	
      		add(lblx);
      		validate();
      		
      	
      	
      	   //Rm01.addActionListener(this);
      	   //Rm02.addActionListener(this);
      	
      	}//end of contructor
      	
    //Event Handlers
//    @Override
   /* public void actionPerformed (ActionEvent e){
    	
    	   if (e.getSource() == bAdd){
    	   		int a,b,sum;
    	   		
    	   		a = Integer.parseInt(txtN1.getText());
    	   		b = Integer.parseInt(txtN2.getText());
    	   		sum = a+ b;
    	   		txtR.setText(Integer.toString(sum));
    	   	
    	   	}//end of bAdd event

    	   if (e.getSource()== bClear){
    	   		txtN1.setText("");
    	   		txtN2.setText("");
    	   		txtR.setText("");
    	   	}	
    	}//end of Event Handler  	*/
      	
    public static void main(String[] args) {
	roomReservation BG = new roomReservation();
	BG.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
