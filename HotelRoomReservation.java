/**
 * @(#)BasicGUI.java
 * @author 
 * @version 1.00 2019/1/10
 */

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import javax.swing.ImageIcon;

public class HotelRoomReservation extends JFrame implements ActionListener {
      
      	   //declaring Components
      	   JLabel RPreview, RBooking,Totalcost, Cash, Change_, lblx, lblBG,lchkIN,lchkOut,lName,lPhone;
      	   JButton bPay, bClear, bNewC, Reserve,Rm1,Rm2,Rm3,Rm4,Rm5,Rm6,Rm7,Rm8,Rm9,Rm10,Rm11,Rm12,Rm13,Rm14,Rm15,Rm16,Rm17,Rm18,Rm19,Rm20;
      	   JTextField txtN1, txtN2, txtR, RStatus, txtchkIN,txtchkOut,txtName,txtPhone;
      	   JTextArea RDetail1, RRate, Binfo, LStatus;
      	   ImageIcon pic1 = new ImageIcon("D:/Documents/HotelRoomReservation/img/bg.jpg");
      	   Image image1 = pic1.getImage();
      	   Image scaled1 = image1.getScaledInstance(1366,710,java.awt.Image.SCALE_SMOOTH);
      	   ImageIcon bg1 = new ImageIcon(scaled1);
      	   String imgLink = "D:/Documents/HotelRoomReservation/img/";
      	   String previewImg = imgLink + "Rm21.jpg";
      	   
      	  // Icon PPreview = new ImageIcon("D:/Documents/HotelRmx_Reservation/img/Rm21.jpg");
      	   
           Icon logo = new ImageIcon(imgLink + "logo.png");
      	   Icon PPreview = new ImageIcon(previewImg);
      	   Icon Rm01 = new ImageIcon(imgLink + "Rmx_1.jpg");
      	   Icon Rm02 = new ImageIcon(imgLink + "Rmx_2.jpg");
      	   Icon Rm03 = new ImageIcon(imgLink + "Rmx_3.jpg");
      	   Icon Rm04 = new ImageIcon(imgLink + "Rmx_4.jpg");
      	   Icon Rm05 = new ImageIcon(imgLink + "Rmx_5.jpg");
      	   Icon Rm06 = new ImageIcon(imgLink + "Rmx_6.jpg");
      	   Icon Rm07 = new ImageIcon(imgLink + "Rmx_7.jpg");
      	   Icon Rm08 = new ImageIcon(imgLink + "Rmx_8.jpg");
      	   Icon Rm09 = new ImageIcon(imgLink + "Rmx_9.jpg");
      	   Icon Rm010 = new ImageIcon(imgLink + "Rmx_10.jpg");
      	   Icon Rm011 = new ImageIcon(imgLink + "Rmx_11.jpg");
      	   Icon Rm012 = new ImageIcon(imgLink + "Rmx_12.jpg");
      	   Icon Rm013 = new ImageIcon(imgLink + "Rmx_13.jpg");
      	   Icon Rm014 = new ImageIcon(imgLink + "Rmx_14.jpg");
      	   Icon Rm015 = new ImageIcon(imgLink + "Rmx_15.jpg");
      	   Icon Rm016 = new ImageIcon(imgLink + "Rmx_16.jpg");
      	   Icon Rm017 = new ImageIcon(imgLink + "Rmx_17.jpg");
      	   Icon Rm018 = new ImageIcon(imgLink + "Rmx_18.jpg");
      	   Icon Rm019 = new ImageIcon(imgLink + "Rmx_19.jpg");
      	   Icon Rm020 = new ImageIcon(imgLink + "Rmx_20.jpg");
   	  	
      	 public HotelRoomReservation() {
      	 	
      	 	///Contruction/Instantiate
       	 	setSize(1366,750);
       	 	setLocation(0,0);
      	 	setVisible(true);
      	 	setTitle("Hotel Reservation");
      	 	setResizable(false);
      	 	
      	 	//set background for JFrame
      	 	Container C = getContentPane();
      	 	C.setBackground(new Color(226,226,226));
      	 	
      	 	RPreview = new JLabel(PPreview);
       	 	RDetail1 = new JTextArea("Room Amenities\n* Air Condition with 42 Cable TV\n* Unlimited Wifi\n* Comfortable Bed\n*BathRoom and sink");
      	 	RRate = new JTextArea("Room Rate:\n\nP500.00 per night");
      	 	Binfo = new JTextArea("You booked:\n VIP room = P1000.00");
      	 	LStatus = new JTextArea("VACANT");
      	 //	RStatus = new JTextArea();
      	 	
      	 	RDetail1.setEditable(false);
      	 	RRate.setEditable(false);
      	 	Binfo.setEditable(false);
      	 	Reserve = new JButton("Reserve");
      	 	
      	 	RBooking = new JLabel("Booking Form");
      	 	
      	 	
      	 	Totalcost = new JLabel("Total Cost");
      	 	Cash = new JLabel("Cash");
      	 	lchkIN = new JLabel("Check IN:");
      	 	lchkOut = new JLabel("Check OUT:");
      	 	lName = new JLabel("Name:");
      	 	lPhone = new JLabel("Contact#:");
      	 	Change_ = new JLabel("Change");
      	 	lblBG = new JLabel(bg1);
      	 	bPay = new JButton("Pay");
      	 	bClear = new JButton("Clear");
      	 	bNewC = new JButton("New Client");
      	 	txtN1 = new JTextField(20);
      	 	txtN2 = new JTextField(20);
      	 	txtR = new JTextField(20);
      	 	
      	 	txtchkIN = new JTextField(20);
      	 	txtchkOut = new JTextField(20);
      	 	txtName = new JTextField(20);
      	 	txtPhone = new JTextField(20);
      	 	
      	 	
      	 	lblx= new JLabel("");
      	 	
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
      	 	
      	 	//Placing Component on the Frame
      	 	
      	 	add(RPreview);
      	 	RPreview.setBounds(312,96,484,254);
      	 	
      	 	add(RDetail1);
      	 	RDetail1.setBounds(314,358,200,88);
      	 	RDetail1.setBackground(Color.black);
      	 	RDetail1.setFont(new Font("Serif", Font.PLAIN, 12));
      	 	RDetail1.setForeground(Color.white);
      	 	
      	 	add(RRate);
      	 	RRate.setBounds(514,358,140,88);
      	 	RRate.setBackground(Color.black);
      	 	RRate.setFont(new Font("Serif", Font.PLAIN, 18));
      	 	RRate.setForeground(Color.white);
      	 	
      	 	add(LStatus);
      	 	LStatus.setBounds(680,370,100,40);
      	 	LStatus.setBackground(Color.black);
      	 	LStatus.setFont(new Font("Serif", Font.PLAIN, 20));
      	 	LStatus.setForeground(Color.white);
          	 	
      	 	add(Reserve);
      	 	Reserve.setBounds(680,410,100,30);
      	 	
      	 	
      	 	add(RBooking);
      	 	RBooking.setBounds(870,98,160,20);
      	 	RBooking.setBackground(Color.black);
      	 	RBooking.setFont(new Font("Serif", Font.PLAIN, 18));
      	 	RBooking.setForeground(Color.white);
      	    RBooking.setOpaque(true);
      	 	
      	 	add(Binfo);
      	 	Binfo.setBounds(820,120,220,100);
      	 	Binfo.setBackground(Color.black);
      	 	Binfo.setFont(new Font("Serif", Font.PLAIN, 12));
      	 	Binfo.setForeground(Color.white);
      	 	
      	 	add(lchkIN);
      	 	lchkIN.setBounds(820,235,80,20);
      	 	lchkIN.setBackground(Color.black);
      	 	lchkIN.setFont(new Font("Serif", Font.PLAIN, 14));
      	 	lchkIN.setForeground(Color.white);
      	    lchkIN.setOpaque(true);
      	    
      	 	add(txtchkIN);
      	 	txtchkIN.setBounds(900,235,140,20);
      	 	
      	 	add(lchkOut);
      	 	lchkOut.setBounds(820,260,80,20);
      	 	lchkOut.setBackground(Color.black);
      	 	lchkOut.setFont(new Font("Serif", Font.PLAIN, 14));
      	 	lchkOut.setForeground(Color.white);
      	    lchkOut.setOpaque(true);
      	    
      	 	add(txtchkOut);
      	 	txtchkOut.setBounds(900,260,140,20);
      	 	
      	 	add(lName);
      	 	lName.setBounds(820,285,80,20);
      	 	lName.setBackground(Color.black);
      	 	lName.setFont(new Font("Serif", Font.PLAIN, 14));
      	 	lName.setForeground(Color.white);
      	    lName.setOpaque(true);
      	    
      	 	add(txtName);
      	 	txtName.setBounds(900,285,140,20);
      	 	
      	 	add(lPhone);
      	 	lPhone.setBounds(820,310,80,20);
      	 	lPhone.setBackground(Color.black);
      	 	lPhone.setFont(new Font("Serif", Font.PLAIN, 14));
      	 	lPhone.setForeground(Color.white);
      	    lPhone.setOpaque(true);
      	    
      	 	add(txtPhone);
      	 	txtPhone.setBounds(900,310,140,20);
      	 	
      	 	add(Totalcost);
      	 	Totalcost.setBounds(820,335,80,20);
      	 	Totalcost.setBackground(Color.black);
      	 	Totalcost.setFont(new Font("Serif", Font.PLAIN, 14));
      	 	Totalcost.setForeground(Color.white);
      	    Totalcost.setOpaque(true);
      	    
      	 	add(txtN1);
      	 	txtN1.setBounds(900,335,140,20);
      	    
      	 	add(Cash);
      	 	Cash.setBounds(820,360,80,20);
      	 	Cash.setBackground(Color.black);
      	 	Cash.setFont(new Font("Serif", Font.PLAIN, 14));
      	 	Cash.setForeground(Color.white);
      	    Cash.setOpaque(true);
      	    
      	 	add(txtN2);
      	 	txtN2.setBounds(900,360,140,20);
      	    
      	 	add(Change_);
      	 	Change_.setBounds(820,385,80,20);
      	 	Change_.setBackground(Color.black);
      	 	Change_.setFont(new Font("Serif", Font.PLAIN, 14));
      	 	Change_.setForeground(Color.white);
      	    Change_.setOpaque(true);
      	    
      	 	add(txtR);
      	 	txtR.setBounds(900,385,140,20);
      	 	
      	 /*	add(RStatus);
      	 	RStatus.setBounds(890,360,130,20);*/
      	 	
      	 	add(bPay);
      	 	bPay.setBounds(820,410,70, 30);
      	 	
      	 	add(bClear);
      	 	bClear.setBounds(895,410,70,30);
      	 	
      	 	add(bNewC);
      	 	bNewC.setBounds(970,410,70,30);
      	 	
      	 	add(lblBG);
      	 	lblBG.setBounds(0,0,1366,710);
      	 	
      	 	add(Rm1);      	 	 
      	 	Rm1.setBounds(307,520,70,37);
      	 	Rm1.setBackground(Color.white);
      	 	add(Rm2);
      	 	Rm2.setBounds(382,520,70,37);
      	 	Rm2.setBackground(Color.white);
      	 	add(Rm3);
      	 	Rm3.setBounds(457,520,70,37);
      	 	Rm3.setBackground(Color.white);
      	 	add(Rm4);
      	 	Rm4.setBounds(532,520,70,37);
      	 	Rm4.setBackground(Color.white);
      	 	
      	    add(Rm5);
      	 	Rm5.setBounds(307,562,70,37);
      	 	Rm5.setBackground(Color.white);
      	    add(Rm6);
      	 	Rm6.setBounds(382,562,70,37);
      	 	Rm6.setBackground(Color.white);
      	 	add(Rm7);
      	 	Rm7.setBounds(457,562,70,37);
      	 	Rm7.setBackground(Color.white);
      	 	add(Rm8);
      	 	Rm8.setBounds(532,562,70,37);
      	 	Rm8.setBackground(Color.white);
      	 	
      	 	add(Rm9);
      	 	Rm9.setBounds(609,520,70,37);
      	 	Rm9.setBackground(Color.white);
      	 	add(Rm10);
      	 	Rm10.setBounds(684,520,70,37);
      	 	Rm10.setBackground(Color.white);      	 	
      	 	add(Rm11);
      	 	Rm11.setBounds(759,520,70,37);
      	 	Rm11.setBackground(Color.white);
      	 	add(Rm12);
      	 	Rm12.setBounds(834,520,70,37);
      	 	Rm12.setBackground(Color.white);
      	 	
      	 	add(Rm13);
      	 	Rm13.setBounds(609,562,70,37);
      	 	Rm13.setBackground(Color.white);
      	 	add(Rm14);
      	 	Rm14.setBounds(684,562,70,37);
      	 	Rm14.setBackground(Color.white);
      	    add(Rm15);
      	 	Rm15.setBounds(759,562,70,37);
      	 	Rm15.setBackground(Color.white);
      	    add(Rm16);
      	 	Rm16.setBounds(834,562,70,37);
      	 	Rm16.setBackground(Color.white);
      	 	
      	 	add(Rm17);
      	 	Rm17.setBounds(911,520,70,37);
      	 	Rm17.setBackground(Color.white);
      	 	add(Rm18);
      	 	Rm18.setBounds(986,520,70,37);
      	 	Rm18.setBackground(Color.white);
      	 	
      	 	add(Rm19);
      	 	Rm19.setBounds(911,562,70,37);
      	 	Rm19.setBackground(Color.white);
      	 	add(Rm20);
      	 	Rm20.setBounds(986,562,70,37);
      	 	Rm20.setBackground(Color.white);
      	 	
      		add(lblx);
       	    bPay.addActionListener(this);
      	    bClear.addActionListener(this);
      	    bNewC.addActionListener(this);
      	    Rm1.addActionListener(this);
      	    Rm2.addActionListener(this);
      	    Rm3.addActionListener(this);
      	    Rm4.addActionListener(this);
      	    Rm5.addActionListener(this);
      	    Rm6.addActionListener(this);
      	    Rm7.addActionListener(this);
      	    Rm8.addActionListener(this);
      	    Rm9.addActionListener(this);
      	    Rm10.addActionListener(this);
      	    Rm11.addActionListener(this);
      	    Rm12.addActionListener(this);
      	    Rm13.addActionListener(this);
      	    Rm14.addActionListener(this);
      	    Rm15.addActionListener(this);
      	    Rm16.addActionListener(this);
      	    Rm17.addActionListener(this);
      	    Rm18.addActionListener(this);
      	    Rm19.addActionListener(this);
      	    Rm20.addActionListener(this);
      	    Reserve.addActionListener(this);

      	}//end of contructor
    //Event Handlers
    public void actionPerformed (ActionEvent e){
    	
    	   if (e.getSource() == bPay){
    	   		int Csh,Ttl,minus;
    	   		
    	   		Csh = Integer.parseInt(txtN1.getText());
    	   		Ttl = Integer.parseInt(txtN2.getText());
    	   		if(Csh<Ttl){
    	   			txtR.setText("Please enter exact cassh amount");
    	   		}else{
    	   		minus= Csh - Ttl;
    	   		txtR.setText(Integer.toString(minus));
    	   		}
    	   	}//end of bPay event
    	   	
    	   if (e.getSource()== bClear){
    	   	    txtchkIN.setText("");
		  	 	txtchkOut.setText("");
		  	 	txtName.setText("");
		  	 	txtPhone.setText("");
    	   		txtN1.setText("");
    	   		txtN2.setText("");
    	   		txtR.setText("");
    	   	}	
    	   if(e.getSource()== bNewC){
    	   	
    	   }
    	   
    	   int RoomNum = 0;
    	   String RoomName = "";
    	   Double RoomCost = 0.00;
    	   
    	   
    	   if(e.getSource()== Rm1){
    	   	RoomNum = 1;
    	   	RoomName = "Room 1: Regular Room";
    	   	RoomCost = 1000.00;
    	   	Icon PPreview = new ImageIcon("D:/Documents/HotelRoomReservation/img/Rm1.jpg");
    	   	RDetail1.setText("Room Amenities:\n* Air Condition with 42 Cable TV\n* Unlimited Wifi\n* Comfortable Bed\n*BathRoom and sink");
      	 	RRate.setText("Room Rate:\n\nP1000.00 per night");
            RPreview.setIcon(PPreview);
            	
      	   }
      	 
      	   if(e.getSource()== Rm2){
      	   	RoomNum = 2;
      	   	RoomName = "Room 2: Regular Room";
    	   	RoomCost = 1040.00;
    	   	Icon PPreview = new ImageIcon("D:/Documents/HotelRoomReservation/img/Rm2.jpg");
    	   	RDetail1.setText("Room Amenities:\n* Room 2");
      	 	RRate.setText("Room Rate:\n\nP1040.00 per night");
            RPreview.setIcon(PPreview);
      	   }
      	   if(e.getSource()== Rm3){
      	   	RoomNum = 3;
      	   	RoomName = "Room 3: Regular Room";
    	   	RoomCost = 4000.00;
    	   	Icon PPreview = new ImageIcon("D:/Documents/HotelRoomReservation/img/Rm3.jpg");
    	   	RDetail1.setText("Room Amenities:\n* Room 3");
      	 	RRate.setText("Room Rate:\n\nP4000.00 per night");
            RPreview.setIcon(PPreview);
      	   }
      	   if(e.getSource()== Rm4){
      	   	RoomNum = 3;
      	   	RoomName = "Room 4: Regular Room";
    	   	RoomCost = 1050.00;
    	   	Icon PPreview = new ImageIcon("D:/Documents/HotelRoomReservation/img/Rm4.jpg");
    	   	RDetail1.setText("Room Amenities:\n* Room 4");
      	 	RRate.setText("Room Rate:\n\nP1050.00 per night");
            RPreview.setIcon(PPreview);
      	   }
      	   if(e.getSource()== Rm5){
      	   	RoomNum = 5;
      	   	RoomName = "Room 5: Regular Room";
    	   	RoomCost = 6000.00;
    	   	Icon PPreview = new ImageIcon("D:/Documents/HotelRoomReservation/img/Rm5.jpg");
    	   	RDetail1.setText("Room Amenities:\n* Hello Room 5");
      	 	RRate.setText("Room Rate:\n\nP6000.00 per night");
            RPreview.setIcon(PPreview);
      	   }
      	   if(e.getSource()== Rm6){
      	   	RoomNum = 6;
      	   	RoomName = "Room 6: Regular Room";
    	   	RoomCost = 2000.00;
    	   	Icon PPreview = new ImageIcon("D:/Documents/HotelRoomReservation/img/Rm6.jpg");
    	   	RDetail1.setText("Room Amenities:\n* Room 6");
      	 	RRate.setText("Room Rate:\n\nP2000.00 per night");
            RPreview.setIcon(PPreview);
      	   }
      	   if(e.getSource()== Rm7){
      	   	RoomNum = 7;
      	   	RoomName = "Room 7: Regular Room";
    	   	RoomCost = 1070.00;
    	   	Icon PPreview = new ImageIcon("D:/Documents/HotelRoomReservation/img/Rm7.jpg");
    	   	RDetail1.setText("Room Amenities:\n* Air Condition with 42 Cable TV\n* Comfortable Bed\n*BathRoom and sink");
      	 	RRate.setText("Room Rate:\n\nP1070.00 per night");
            RPreview.setIcon(PPreview);
      	   }
      	   if(e.getSource()== Rm8){
      	   	RoomNum = 8;
      	   	RoomName = "Room 8: Regular Room";
    	   	RoomCost = 1006.00;
    	   	Icon PPreview = new ImageIcon("D:/Documents/HotelRoomReservation/img/Rm8.jpg");
    	   	RDetail1.setText("Room Amenities:\n* 42\" Cable TV\n* Unlimited Wifi\n* Comfortable Bed\n*BathRoom and sink");
      	 	RRate.setText("Room Rate:\n\nP1006.00 per night");
            RPreview.setIcon(PPreview);
      	   }
      	   if(e.getSource()== Rm9){
      	   	RoomNum = 9;
      	   	RoomName = "Room 8: VIP Room";
    	   	RoomCost = 1050.00;
    	   	Icon PPreview = new ImageIcon("D:/Documents/HotelRoomReservation/img/Rm9.jpg");
    	   	RDetail1.setText("Room Amenities:\n* Air Condition with 42 Cable TV\n* Unlimited Wifi\n* BathRoom and sink");
      	 	RRate.setText("Room Rate:\n\nP1050.00 per night");
            RPreview.setIcon(PPreview);
      	   }
      	   if(e.getSource()== Rm10){
      	   	RoomNum = 10;
      	   	RoomName = "Room 10: VIP Room";
    	   	RoomCost = 1500.00;
    	   	Icon PPreview = new ImageIcon("D:/Documents/HotelRoomReservation/img/Rm10.jpg");
    	   	RDetail1.setText("Room Amenities:\n* Air Condition with 42 Cable TV\n* BathRoom and sink");
      	 	RRate.setText("Room Rate:\n\nP1500.00 per night");
            RPreview.setIcon(PPreview);
      	   }
      	   if(e.getSource()== Rm11){
      	   	RoomNum = 11;
      	   	RoomName = "Room 11: VIP Room";
    	   	RoomCost = 3000.00;
    	   	Icon PPreview = new ImageIcon("D:/Documents/HotelRoomReservation/img/Rm11.jpg");
    	   	RDetail1.setText("Room Amenities:\n* Air Condition with 42 Cable TV's\n* Unlimited Wifi\n* Comfortable Bed\n");
      	 	RRate.setText("Room Rate:\n\nP3000.00 per night");
            RPreview.setIcon(PPreview);
      	   }
      	   if(e.getSource()== Rm12){
      	   	RoomNum = 12;
      	   	RoomName = "Room 8: VIP Room";
    	   	RoomCost = 1006.00;
    	   	Icon PPreview = new ImageIcon("D:/Documents/HotelRoomReservation/img/Rm12.jpg");
    	   	RDetail1.setText("Room Amenities:\n* Unlimited Wifi\n* Comfortable Bed\n*BathRoom and sink");
      	 	RRate.setText("Room Rate:\n\nP1400.00 per night");
            RPreview.setIcon(PPreview);
      	   }
      	   if(e.getSource()== Rm13){
      	   	RoomNum = 13;
      	   	RoomName = "Room 13: VIP Room";
    	   	RoomCost = 500.00;
    	   	Icon PPreview = new ImageIcon("D:/Documents/HotelRoomReservation/img/Rm13.jpg");
    	   	RDetail1.setText("Room Amenities:\n* Comfortable Bed\n*BathRoom and sink");
      	 	RRate.setText("Room Rate:\n\nP500.00 per night");
            RPreview.setIcon(PPreview);
      	   }
      	   if(e.getSource()== Rm14){
      	   	RoomNum = 14;
      	   	RoomName = "Room 8: VIP Room";
    	   	RoomCost = 5000.00;
    	   	Icon PPreview = new ImageIcon("D:/Documents/HotelRoomReservation/img/Rm14.jpg");
    	   	RDetail1.setText("Room Amenities:\n* Air Condition\n* Unlimited Wifi\n* Comfortable Bed\n*BathRoom and sink");
      	 	RRate.setText("Room Rate:\n\nP5000.00 per night");
            RPreview.setIcon(PPreview);
      	   }
      	   if(e.getSource()== Rm15){
      	   	RoomNum = 15;
      	   	RoomName = "Room 15: VIP Room";
    	   	RoomCost = 1400.00;
    	   	Icon PPreview = new ImageIcon("D:/Documents/HotelRoomReservation/img/Rm15.jpg");
    	   	RDetail1.setText("Room Amenities:\n* Air Condition with 12 Cable TV\n * Comfortable Bed\n*BathRoom and sink\n* Unlimited Wifi\n");
      	 	RRate.setText("Room Rate:\n\nP1400.00 per night");
            RPreview.setIcon(PPreview);
      	   }
      	   if(e.getSource()== Rm16){
      	   	RoomNum = 16;
      	   	RoomName = "Room 16: VIP Room";
    	   	RoomCost = 400.00;
    	   	Icon PPreview = new ImageIcon("D:/Documents/HotelRoomReservation/img/Rm16.jpg");
    	   	RDetail1.setText("Room Amenities:\n* Air Condition with 42 Cable TV\n* Unlimited Wifi\n");
      	 	RRate.setText("Room Rate:\n\nP400.00 per night");
            RPreview.setIcon(PPreview);
      	   }
      	   if(e.getSource()== Rm17){
      	   	RoomNum = 17;
      	   	RoomName = "Room 17: VIP Room";
    	   	RoomCost = 400.00;
    	   	Icon PPreview = new ImageIcon("D:/Documents/HotelRoomReservation/img/Rm17.jpg");
    	   	RDetail1.setText("Room Amenities:\n* Air Condition with 42 Cable TV\n* Unlimited Wifi\n* Comfortable Bed\n*BathRoom and sink");
      	 	RRate.setText("Room Rate:\n\nP400.00 per night");
            RPreview.setIcon(PPreview);
      	   }
      	   if(e.getSource()== Rm18){
      	   	RoomNum = 18;
      	   	RoomName = "Room 18: VIP Room";
    	   	RoomCost = 100.00;
    	   	Icon PPreview = new ImageIcon("D:/Documents/HotelRoomReservation/img/Rm18.jpg");
    	   	RDetail1.setText("Room Amenities:\n*  Comfortable Bed\n*BathRoom and sink");
      	 	RRate.setText("Room Rate:\n\nP100.00 per night");
            RPreview.setIcon(PPreview);
      	   }
      	   if(e.getSource()== Rm19){
      	   	RoomNum = 19;
      	   	RoomName = "Room 19: VIP Room";
    	   	RoomCost = 10.00;
    	   	Icon PPreview = new ImageIcon("D:/Documents/HotelRoomReservation/img/Rm19.jpg");
    	   	RDetail1.setText("Room Amenities:\n*  Comfortable Bed\n*BathRoom and sink");
      	 	RRate.setText("Room Rate:\n\nP10.00 per night");
            RPreview.setIcon(PPreview);
      	   }
      	   if(e.getSource()== Rm20){
      	   	RoomNum = 20;
      	   	RoomName = "Room 20: VIP Room";
    	   	RoomCost = 23000.00;
    	   	Icon PPreview = new ImageIcon("D:/Documents/HotelRoomReservation/img/Rm20.jpg");
    	   	RDetail1.setText("Room Amenities:\n* Air Condition with 42 Cable TV\n* Unlimited Wifi\n* Comfortable Bed\n*BathRoom and sink");
      	 	RRate.setText("Room Rate:\n\nP23000.00 per night");
            RPreview.setIcon(PPreview);
      	   }
    	   
    	}//end of Event Handler  	
      
    public static void main(String[] args) {
			HotelRoomReservation  BG = new HotelRoomReservation();
			BG.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}


