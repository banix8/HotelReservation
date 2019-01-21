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
      	   JLabel RPreview, RPreviewOverlay, RBooking,Totalcost, Cash, TWarning, lblx, lblBG,lchkIN,lchkOut,lName,lPhone,YouBooked,lblAvlRoom,lblCustNum;
           JTextArea RTypeStudio,RTypeDeLuxe,RTypePremier,RTypeSuperior; 
           JLabel lR1,lR2,lR3,lR4,lR5,lR6,lR7,lR8,lR9,lR10,lR11,lR12,lR13,lR14,lR15,lR16,lR17,lR18,lR19,lR20;
      	   JButton bPay, bClear, bNewC, Reserve,RCancel,CheckOutbtn;
           JButton Rm1,Rm2,Rm3,Rm4,Rm5,Rm6,Rm7,Rm8,Rm9,Rm10,Rm11,Rm12,Rm13,Rm14,Rm15,Rm16,Rm17,Rm18,Rm19,Rm20;
      	   JTextField LTotalcost, LCash, LWarn, RStatus, txtchkIN,txtchkOut,txtName,txtPhone;
      	   JTextArea RDetail1, RRate, Binfo, LStatus, OReminders;
      	   String imgLink = "D:/Documents/HotelRoomReservation/img/";
      	   String previewImg = imgLink + "Preview.jpg";
      	   String previewOverlayImg = imgLink + "Overlay.png";
      	   ImageIcon pic1 = new ImageIcon(imgLink + "bg4.jpg");
      	   Image image1 = pic1.getImage();
      	   Image scaled1 = image1.getScaledInstance(1366,710,java.awt.Image.SCALE_SMOOTH);
      	   ImageIcon bg1 = new ImageIcon(scaled1);
           int RoomNum,avlRooms = 20,count = 1,CustCount=1;
    	   String RoomName,RInfo="",RoomState = "";
    	   Double RoomCost = 0.00;
    	   Double RTotal = 0.00;  
      	   int[] rmList = new int[21];
      	   String[] rmReserved = new String[21];
	   	   Double[] rmReservedCost = new Double[21];
	   	   String[] bking_list = new String[21];
      	   
           Icon logo = new ImageIcon(imgLink + "logo.png");
      	   Icon PPreview = new ImageIcon(previewImg);
      	//   Icon PPreviewOverlay = new ImageIcon(previewOverlayImg);

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
      	 	setTitle("Hotel HotelRoomReservation");
      	 	setResizable(false);
      	 	
      	 	
      	 	//set background for JFrame
      	 	Container C = getContentPane();
      	 	C.setBackground(new Color(226,226,226));
      	 	
      	 	lblAvlRoom = new JLabel("Available Rooms = "+avlRooms);
      	 	lblCustNum = new JLabel("Customer #: "+CustCount);
      	 	RPreview = new JLabel(PPreview);
      	 	RPreviewOverlay = new JLabel();
       	 	RDetail1 = new JTextArea("Hotel Amenities:\n* Comfortable & Luxuries Rooms\n* Air Condition with 42 Cable TV\n* 24/7 Active Security\n* Clean BathRoom & Sink");
       	 	RDetail1.setEditable(false);
      	 	RRate = new JTextArea("Room Rates:\nP500.00 to P5000.00");
      	 	RRate.setEditable(false);
      	 	LStatus = new JTextArea("Room Status:\nVACANT rooms = "+ avlRooms);
      	 	LStatus.setEditable(false);
      	 	
      	 	Reserve = new JButton("Reserve");
      	 	RCancel = new JButton("Unreserve");
      	 	
      	 	YouBooked = new JLabel("Choose now your favorite room/s...");
      	 	Binfo = new JTextArea();
      	 	Binfo.setEditable(false);
      	 	OReminders = new JTextArea("How to Book a room:\n* Click the room you liked below.\n* Click Reserve to reserve.\n* Click Cancel to cancel.\n* Please fill your details below.\n* We only accept exact amount");
      	 	OReminders.setEditable(false);
      	 	CheckOutbtn = new JButton("Checkout");
      	 	
      	 	RBooking = new JLabel("Booking Form");
      	 	Totalcost = new JLabel("Total Cost");
      	 	Cash = new JLabel("Cash");
      	 	lchkIN = new JLabel("Check IN:");
      	 	txtchkIN = new JTextField(20);
      	 	txtchkIN.setToolTipText("What day you will check-in?");
      	 	lchkOut = new JLabel("Check OUT:");
      	 	txtchkOut = new JTextField(20);
      	 	txtchkOut.setToolTipText("What day you will check-out?");
      	 	lName = new JLabel("Name:");
      	 	txtName = new JTextField(20);
      	 	txtName.setToolTipText("Please enter complete name.");
      	 	lPhone = new JLabel("Contact#:");
      	 	txtPhone = new JTextField(20);
      	 	txtPhone.setToolTipText("Please enter valid phone#");
      	 	//TWarning = new JLabel("Change");
      	 	LWarn = new JTextField(20);
      	 	LWarn.setEditable(false);
      	 	
      	 	bPay = new JButton("Pay");
      	 	bClear = new JButton("Clear");
      	 	bNewC = new JButton("New Client");
      	 	LTotalcost = new JTextField(20);
      	 	LTotalcost.setToolTipText("Whole Total Cost to pay.");
      	 	LTotalcost.setEditable(false);
      	 	LCash = new JTextField(20);
      	 	LCash.setToolTipText("Please pay only exact cash");
      	 	
      	 	lblBG = new JLabel(bg1);
      	 	lblx= new JLabel("");
                
                
            RTypeStudio= new JTextArea("STUDIO\nROOMS");
            RTypeStudio.setEditable(false);
            lR1= new JLabel("Rm: 1");
  	 		lR2= new JLabel("Rm: 2");
            lR3= new JLabel("Rm: 3");
            lR4= new JLabel("Rm: 4");
            lR5= new JLabel("Rm: 5");
            
            RTypeDeLuxe= new JTextArea("DELUXE\nROOMS");
            RTypeDeLuxe.setEditable(false);
            lR6= new JLabel("Rm: 6");
            lR7= new JLabel("Rm: 7");
            lR8= new JLabel("Rm: 8");
            lR9= new JLabel("Rm: 9");
            lR10= new JLabel("Rm: 10");
            
            RTypePremier= new JTextArea("PREMIER\nROOMS");
            RTypePremier.setEditable(false);
            lR11= new JLabel("Rm: 11");
            lR12= new JLabel("Rm: 12");
            lR13= new JLabel("Rm: 13");
            lR14= new JLabel("Rm: 14");
            lR15= new JLabel("Rm: 15");
            
            RTypeSuperior= new JTextArea("SUPERIOR\nROOMS");
            RTypeSuperior.setEditable(false);
            lR16= new JLabel("Rm: 16");
            lR17= new JLabel("Rm: 17");
            lR18= new JLabel("Rm: 18");
            lR19= new JLabel("Rm: 19");
            lR20= new JLabel("Rm: 20");
                
      	 	Rm1 = new JButton(Rm01);
      	 	//Rm1.setToolTipText("Room 1: Amenities = \n Gtlkdf");
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
      	 	
     	 	
     	 	add(RPreviewOverlay);
      	 	RPreviewOverlay.setBounds(312,96,484,254);
      	 	
      	 	add(RPreview);
      	 	RPreview.setBounds(312,96,484,254);
      	 	
      	 	add(RDetail1);
      	 	RDetail1.setBounds(314,358,180,88);
      	 	RDetail1.setBackground(Color.black);
      	 	RDetail1.setFont(new Font("Serif", Font.PLAIN, 12));
      	 	RDetail1.setForeground(Color.white);
                
      	  	add(LStatus);
      	 	LStatus.setBounds(514,358,150,44);
      	 	LStatus.setBackground(Color.black);
      	 	LStatus.setFont(new Font("Serif", Font.PLAIN, 14));
      	 	LStatus.setForeground(Color.white);
                
      	 	add(RRate);
      	 	RRate.setBounds(514,402,150,44);
      	 	RRate.setBackground(Color.black);
      	 	RRate.setFont(new Font("Serif", Font.PLAIN, 14));
      	 	RRate.setForeground(Color.white);
      	 	        	 	
      	 	add(Reserve);
      	 	Reserve.setBounds(685,365,100,30);
      	 	
      	 	add(RCancel);
      	 	RCancel.setBounds(685,405,100,30);
      	 	
      	 	add(lblCustNum);
      	 	lblCustNum.setBounds(760,20,180,30);
      	 //	lblCustNum.setBackground(Color.black);
      	 	lblCustNum.setFont(new Font("Serif", Font.PLAIN, 20));
      	 	lblCustNum.setForeground(Color.white);
           //lblCustNum.setOpaque(true);
         
      	 	add(lblAvlRoom);
      	 	lblAvlRoom.setBounds(760,50,180,30);
      	 //	lblAvlRoom.setBackground(Color.black);
      	 	lblAvlRoom.setFont(new Font("Serif", Font.PLAIN, 20));
      	 	lblAvlRoom.setForeground(Color.white);
         //   lblAvlRoom.setOpaque(true);
      	 	
      	 	add(YouBooked);
      	 	YouBooked.setBounds(820,100,220,20);
      	 	YouBooked.setBackground(Color.black);
      	 	YouBooked.setFont(new Font("Serif", Font.PLAIN, 12));
      	 	YouBooked.setForeground(Color.white);

      	 	add(Binfo);
      	 	Binfo.setBounds(820,120,220,175);
      	 	Binfo.setBackground(Color.black);
      	 	Binfo.setFont(new Font("Serif", Font.PLAIN, 12));
      	 	Binfo.setForeground(Color.white);
      	 	
      	 	add(OReminders);
      	 	OReminders.setBounds(820,295,220,130);
      	 	OReminders.setBackground(Color.black);
      	 	OReminders.setFont(new Font("Serif", Font.PLAIN, 14));
      	 	OReminders.setForeground(Color.white);
            OReminders.setOpaque(true);
            
            add(CheckOutbtn);
            CheckOutbtn.setBounds(820,410,220,30);
      	    
      	 	add(txtchkIN);
      	 	txtchkIN.setBounds(900,500,140,20);
      	 	
      	 	
      	 	add(lchkIN);
      	 	lchkIN.setBounds(820,500,80,20);
      	 	lchkIN.setBackground(Color.black);
      	 	lchkIN.setFont(new Font("Serif", Font.PLAIN, 14));
      	 	lchkIN.setForeground(Color.white);
            lchkIN.setOpaque(true);
      	    
      	 	add(txtchkIN);
      	 	txtchkIN.setBounds(900,500,140,20);
      	 	
      	 	add(lchkOut);
      	 	lchkOut.setBounds(820,525,80,20);
      	 	lchkOut.setBackground(Color.black);
      	 	lchkOut.setFont(new Font("Serif", Font.PLAIN, 14));
      	 	lchkOut.setForeground(Color.white);
            lchkOut.setOpaque(true);
      	    
      	 	add(txtchkOut);
      	 	txtchkOut.setBounds(900,525,140,20);
      	 	
      	 	add(lName);
      	 	lName.setBounds(820,550,80,20);
      	 	lName.setBackground(Color.black);
      	 	lName.setFont(new Font("Serif", Font.PLAIN, 14));
      	 	lName.setForeground(Color.white);
            lName.setOpaque(true);
            
         
      	 	add(txtName);
      	 	txtName.setBounds(900,550,140,20);
      	 	
      	 	add(lPhone);
      	 	lPhone.setBounds(820,575,80,20);
      	 	lPhone.setBackground(Color.black);
      	 	lPhone.setFont(new Font("Serif", Font.PLAIN, 14));
      	 	lPhone.setForeground(Color.white);
            lPhone.setOpaque(true);
      	    
      	 	add(txtPhone);
      	 	txtPhone.setBounds(900,575,140,20);
      	 	
      	 	add(Totalcost);
      	 	Totalcost.setBounds(820,600,80,20);
      	 	Totalcost.setBackground(Color.black);
      	 	Totalcost.setFont(new Font("Serif", Font.PLAIN, 14));
      	 	Totalcost.setForeground(Color.white);
            Totalcost.setOpaque(true);
      	    
      	 	add(LTotalcost);
      	 	LTotalcost.setBounds(900,600,140,20);
      	    
      	 	add(Cash);
      	 	Cash.setBounds(820,625,80,20);
      	 	Cash.setBackground(Color.black);
      	 	Cash.setFont(new Font("Serif", Font.PLAIN, 14));
      	 	Cash.setForeground(Color.white);
            Cash.setOpaque(true);
      	    
      	 	add(LCash);
      	 	LCash.setBounds(900,625,140,20);
      	    
      	 /*	add(TWarning);
      	 	TWarning.setBounds(820,385,80,20);
      	 	TWarning.setBackground(Color.black);
      	 	TWarning.setFont(new Font("Serif", Font.PLAIN, 14));
      	 	TWarning.setForeground(Color.white);
            TWarning.setOpaque(true);
      	    
      	 	add(LWarn);
      	 	LWarn.setBounds(900,385,140,20);*/
      	 	
      	 	
      	 	
      	 /*	add(RStatus);
      	 	RStatus.setBounds(890,360,130,20);*/
      	 	
      	 	add(bPay);
      	 	bPay.setBounds(820,660,70, 30);
      	 	
      	 	add(bClear);
      	 	bClear.setBounds(895,660,70,30);
      	 	
      	 	add(bNewC);
      	 	bNewC.setBounds(970,660,70,30);
      	 	
      	 	add(RBooking);
      	 	RBooking.setBounds(870,468,160,20);
      	 	RBooking.setBackground(Color.black);
      	 	RBooking.setFont(new Font("Serif", Font.PLAIN, 18));
      	 	RBooking.setForeground(Color.white);
            RBooking.setOpaque(true);
      	 	
      	 	add(RTypeStudio);
      	 	RTypeStudio.setBounds(685,462,100,50);
      	 	RTypeStudio.setBackground(Color.black);
      	 	RTypeStudio.setFont(new Font("Serif", Font.PLAIN, 14));
      	 	RTypeStudio.setForeground(Color.white);
            RTypeStudio.setOpaque(true);
      	    
      	 		
      	 	add(Rm1);      	 	 
        	Rm1.setBounds(307,462,70,37);
      	 	Rm1.setBackground(Color.white);
            add(lR1);      	 	 
      	 	lR1.setBounds(307,498,70,20);
            lR1.setBackground(Color.black);
      	 	lR1.setFont(new Font("Serif", Font.PLAIN, 12));
      	 	lR1.setForeground(Color.white);
            lR1.setOpaque(true);
      	 	
      	 	add(Rm2);
      	 	Rm2.setBounds(382,462,70,37);
      	 	Rm2.setBackground(Color.white);
            add(lR2);      	 	 
      	 	lR2.setBounds(382,498,70,20);
            lR2.setBackground(Color.black);
      	 	lR2.setFont(new Font("Serif", Font.PLAIN, 12));
      	 	lR2.setForeground(Color.white);
            lR2.setOpaque(true);
                
      	 	add(Rm3);
      	 	Rm3.setBounds(457,462,70,37);
      	 	Rm3.setBackground(Color.white);
            add(lR3);      	 	 
      	 	lR3.setBounds(457,498,70,20);
            lR3.setBackground(Color.black);
      	 	lR3.setFont(new Font("Serif", Font.PLAIN, 12));
      	 	lR3.setForeground(Color.white);
            lR3.setOpaque(true);
                
      	 	add(Rm4);
      	 	Rm4.setBounds(532,462,70,37);
      	 	Rm4.setBackground(Color.white);
            add(lR4);      	 	 
      	 	lR4.setBounds(532,498,70,20);
            lR4.setBackground(Color.black);
      	 	lR4.setFont(new Font("Serif", Font.PLAIN, 12));
      	 	lR4.setForeground(Color.white);
            lR4.setOpaque(true);
                
            add(Rm5);
      	 	Rm5.setBounds(607,462,70,37);
      	 	Rm5.setBackground(Color.white);
            add(lR5);      	 	 
      	 	lR5.setBounds(607,498,70,20);
            lR5.setBackground(Color.black);
      	 	lR5.setFont(new Font("Serif", Font.PLAIN, 12));
      	 	lR5.setForeground(Color.white);
            lR5.setOpaque(true);
                
            add(RTypeDeLuxe);
      	 	RTypeDeLuxe.setBounds(685,522,100,50);
      	 	RTypeDeLuxe.setBackground(Color.black);
      	 	RTypeDeLuxe.setFont(new Font("Serif", Font.PLAIN, 14));
      	 	RTypeDeLuxe.setForeground(Color.white);
            RTypeDeLuxe.setOpaque(true);
             
            add(Rm6);
      	 	Rm6.setBounds(307,522,70,37);
      	 	Rm6.setBackground(Color.white);
            add(lR6);      	 	 
      	 	lR6.setBounds(307,558,70,20);
            lR6.setBackground(Color.black);
      	 	lR6.setFont(new Font("Serif", Font.PLAIN, 12));
      	 	lR6.setForeground(Color.white);
            lR6.setOpaque(true);
                
      	 	add(Rm7);
      	 	Rm7.setBounds(382,522,70,37);
      	 	Rm7.setBackground(Color.white);
                add(lR7);      	 	 
      	 	lR7.setBounds(382,558,70,20);
                lR7.setBackground(Color.black);
      	 	lR7.setFont(new Font("Serif", Font.PLAIN, 12));
      	 	lR7.setForeground(Color.white);
                lR7.setOpaque(true);
                
      	 	add(Rm8);
      	 	Rm8.setBounds(457,522,70,37);
      	 	Rm8.setBackground(Color.white);
                add(lR8);      	 	 
      	 	lR8.setBounds(457,558,70,20);
                lR8.setBackground(Color.black);
      	 	lR8.setFont(new Font("Serif", Font.PLAIN, 12));
      	 	lR8.setForeground(Color.white);
                lR8.setOpaque(true);
                
      	 	add(Rm9);
      	 	Rm9.setBounds(532,522,70,37);
      	 	Rm9.setBackground(Color.white);
            add(lR9);      	 	 
      	 	lR9.setBounds(532,558,70,20);
            lR9.setBackground(Color.black);
      	 	lR9.setFont(new Font("Serif", Font.PLAIN, 12));
      	 	lR9.setForeground(Color.white);
                lR9.setOpaque(true);
                
      	 	add(Rm10);
      	 	Rm10.setBounds(607,522,70,37);
      	 	Rm10.setBackground(Color.white);
                add(lR10);      	 	 
      	 	lR10.setBounds(607,558,70,20);
                lR10.setBackground(Color.black);
      	 	lR10.setFont(new Font("Serif", Font.PLAIN, 12));
      	 	lR10.setForeground(Color.white);
                lR10.setOpaque(true);
            
            
            add(RTypePremier);
      	 	RTypePremier.setBounds(685,582,100,50);
      	 	RTypePremier.setBackground(Color.black);
      	 	RTypePremier.setFont(new Font("Serif", Font.PLAIN, 14));
      	 	RTypePremier.setForeground(Color.white);
            RTypePremier.setOpaque(true);
                
      	 	add(Rm11);
      	 	Rm11.setBounds(307,582,70,37);
      	 	Rm11.setBackground(Color.white);
            add(lR11);      	 	 
      	 	lR11.setBounds(307,618,70,20);
            lR11.setBackground(Color.black);
      	 	lR11.setFont(new Font("Serif", Font.PLAIN, 12));
      	 	lR11.setForeground(Color.white);
            lR11.setOpaque(true);
                
      	 	add(Rm12);
      	 	Rm12.setBounds(382,582,70,37);
      	 	Rm12.setBackground(Color.white);
            add(lR12);      	 	 
      	 	lR12.setBounds(382,618,70,20);
            lR12.setBackground(Color.black);
      	 	lR12.setFont(new Font("Serif", Font.PLAIN, 12));
      	 	lR12.setForeground(Color.white);
            lR12.setOpaque(true);
                
      	 	add(Rm13);
      	 	Rm13.setBounds(457,582,70,37);
      	 	Rm13.setBackground(Color.white);
            add(lR13);      	 	 
      	 	lR13.setBounds(457,618,70,20);
            lR13.setBackground(Color.black);
      	 	lR13.setFont(new Font("Serif", Font.PLAIN, 12));
      	 	lR13.setForeground(Color.white);
            lR13.setOpaque(true);
                
      	 	add(Rm14);
      	 	Rm14.setBounds(532,582,70,37);
      	 	Rm14.setBackground(Color.white);
            add(lR14);      	 	 
      	 	lR14.setBounds(532,618,70,20);
            lR14.setBackground(Color.black);
      	 	lR14.setFont(new Font("Serif", Font.PLAIN, 12));
      	 	lR14.setForeground(Color.white);
            lR14.setOpaque(true);
                
            add(Rm15);
      	 	Rm15.setBounds(607,582,70,37);
      	 	Rm15.setBackground(Color.white);
            add(lR15);      	 	 
      	 	lR15.setBounds(607,618,70,20);
            lR15.setBackground(Color.black);
      	 	lR15.setFont(new Font("Serif", Font.PLAIN, 12));
      	 	lR15.setForeground(Color.white);
            lR15.setOpaque(true);
            
            add(RTypeSuperior);
      	 	RTypeSuperior.setBounds(685,642,100,50);
      	 	RTypeSuperior.setBackground(Color.black);
      	 	RTypeSuperior.setFont(new Font("Serif", Font.PLAIN, 14));
      	 	RTypeSuperior.setForeground(Color.white);
            RTypeSuperior.setOpaque(true);
                
            add(Rm16);
      	 	Rm16.setBounds(307,642,70,37);
      	 	Rm16.setBackground(Color.white);
            add(lR16);      	 	 
      	 	lR16.setBounds(307,678,70,20);
            lR16.setBackground(Color.black);
      	 	lR16.setFont(new Font("Serif", Font.PLAIN, 12));
      	 	lR16.setForeground(Color.white);
            lR16.setOpaque(true);
                
      	 	add(Rm17);
      	 	Rm17.setBounds(382,642,70,37);
      	 	Rm17.setBackground(Color.white);
            add(lR17);      	 	 
      	 	lR17.setBounds(382,678,70,20);
            lR17.setBackground(Color.black);
      	 	lR17.setFont(new Font("Serif", Font.PLAIN, 12));
      	 	lR17.setForeground(Color.white);
            lR17.setOpaque(true);
                
      	 	add(Rm18);
      	 	Rm18.setBounds(457,642,70,37);
      	 	Rm18.setBackground(Color.white);
            add(lR18);      	 	 
      	 	lR18.setBounds(457,678,70,20);
            lR18.setBackground(Color.black);
      	 	lR18.setFont(new Font("Serif", Font.PLAIN, 12));
      	 	lR18.setForeground(Color.white);
            lR18.setOpaque(true);
                
      	 	add(Rm19);
      	 	Rm19.setBounds(532,642,70,37);
      	 	Rm19.setBackground(Color.white);
            add(lR19);      	 	 
      	 	lR19.setBounds(532,678,70,20);
            lR19.setBackground(Color.black);
      	 	lR19.setFont(new Font("Serif", Font.PLAIN, 12));
      	 	lR19.setForeground(Color.white);
            lR19.setOpaque(true);
                
      	 	add(Rm20);
      	 	Rm20.setBounds(607,642,70,37);
      	 	Rm20.setBackground(Color.white);
            add(lR20);      	 	 
      	 	lR20.setBounds(607,678,70,20);
            lR20.setBackground(Color.black);
      	 	lR20.setFont(new Font("Serif", Font.PLAIN, 12));
      	 	lR20.setForeground(Color.white);
            lR20.setOpaque(true);
                
      	 	add(lblBG);
      	 	lblBG.setBounds(0,0,1366,710);
      	 	
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
      	    RCancel.addActionListener(this);
      	    
      	}//end of contructor
   void RstPaymentEntry(){
   	String Rst = JOptionPane.showInputDialog("Are you sure you want to reset your booking? y = Yes / n = No");
   		if(Rst.equals("y")){
   			txtchkIN.setText("");
	  	 	txtchkOut.setText("");
	  	 	txtName.setText("");
	  	 	txtPhone.setText("");
	   		LTotalcost.setText("0.00");
	   		LCash.setText("0.00");
	   		LWarn.setText("");
   		}
   }
   void NewCustomer(){
   	
   /*	String Rst = JOptionPane.showInputDialog("Are you sure you want to cater new customer? y = Yes / n = No");
   		if(Rst.equals("y")){
   			Reserve.setEnabled(false);
   			txtchkIN.setText("");
	  	 	txtchkOut.setText("");
	  	 	txtName.setText("");
	  	 	txtPhone.setText("");
	   		LTotalcost.setText("0.00");
	   		LCash.setText("0.00");
	   		LWarn.setText("");
	   		RInfo = "";
	   		RTotal =0.00;
   		}
	      	*/	
	}
   
   void payNow(int t,int c,int x){
  	
   		if(x==0){
   			JOptionPane.showMessageDialog(null,"You Paid: "+ c);
	   		
   		}else if(c<t){
   			JOptionPane.showMessageDialog(null,"Please pay exatly "+t);
   		}else{
   			JOptionPane.showMessageDialog(null,"Please pay exact amount");
   		}
   	 }
   void rmStatusNotifaction(int Rnum){
  
   	if(rmList[Rnum]==1){
   		Icon PPreviewOverlay = new ImageIcon(imgLink + "Overlay.png");
	    RPreviewOverlay.setIcon(PPreviewOverlay);
    	LStatus.setText("Room already Reserved\nPlease choose another");
    	
    	
    }
    if(rmList[Rnum]==0){
    	Icon PPreviewOverlay = new ImageIcon();
	    RPreviewOverlay.setIcon(PPreviewOverlay);
    	LStatus.setText("Room Status:\n    AVAILABLE");
    }
    
    
   }
   private class Transactions {
	        // This class can access everything from its parent...
	      public void Reserve_(int RmNum,String RmName,Double RmCost){ //RoomNum,RoomName,RoomCost
	      		if(rmList[RoomNum]==0){
      				Icon PPreviewOverlay = new ImageIcon(imgLink + "Overlay.png");
	    			RPreviewOverlay.setIcon(PPreviewOverlay);
	      	  		RInfo += RoomName+" P"+RmCost+"\n";
	      	  		String rInfo_ = RoomName+" P"+RmCost+"\n";
		      		rmReserved[RoomNum]= rInfo_;
		       		Binfo.setText(RInfo);
		      		RTotal += RmCost;
		      		rmReservedCost[RoomNum]= RmCost;
		     		LTotalcost.setText(Double.toString(RTotal));
		     		avlRooms -= 1;
		     		lblAvlRoom.setText("Available Rooms = "+avlRooms);
		     		LStatus.setText("Room Status:\n    RESERVED");
		     		rmList[RoomNum]=1;
		     		count+=1;
	      		}else{
	      			LStatus.setText("Room already Reserved\nPlease choose another");
	      		}
	     		
	      }
	      public void UnReserve_(int RmNum,String RmName,Double RmCost){
		      	if(rmList[RoomNum]==1){
		      		
		      		rmReserved[RoomNum] = "";
		      		RInfo ="";
		      		Icon PPreviewOverlay = new ImageIcon();
	   				RPreviewOverlay.setIcon(PPreviewOverlay);
	   				String _info ="";
	   				
	   				int z = 1;
	   				while(z<20){
	     				while(rmList[z]==1){
   						_info += rmReserved[z];
	      			//	rmReserved[z]= RInfo;
	      				break;
	   					}
	   					z++;
	   				}
	   				RInfo = _info;
	   				Binfo.setText(RInfo);
			       rmList[RoomNum]=0;
		      		Double minus=rmReservedCost[RoomNum];
		      		RTotal -= minus;
		     		LTotalcost.setText(Double.toString(RTotal));
		     		avlRooms += 1;
		     		lblAvlRoom.setText("Available Rooms = "+avlRooms);
			     	LStatus.setText("Room Status:\n    AVAILABLE");
		     		
		      	}else{
		      		LStatus.setText("You cannot unreserve a\nroomyou did not reserve!");
		      	}
	      }
	}
      //Event Handlers
      @Override
   public void actionPerformed (ActionEvent e){
      	Transactions Txns = new Transactions();
        
    	   if (e.getSource() == bPay){
    	   		int Csh,Ttl,minus;
    	   		Csh = Integer.parseInt(LTotalcost.getText());
    	   		Ttl = Integer.parseInt(LCash.getText());
    	   		minus = Csh - Ttl;
    	   		payNow(Ttl,Csh,minus);

    	   	}//end of bPay event
    	   	
    	   if (e.getSource()== bClear){
    	   		RstPaymentEntry();
    	   	}	
    	   if(e.getSource()== bNewC){
    	   	CustCount +=1;
    	   	lblCustNum.setText("Customer #: "+CustCount);
    	   	NewCustomer();
    	   }
    	   
    	   if(e.getSource()== Reserve){
	    	   YouBooked.setText("You booked the following rooms:...\n");
	    	   Txns.Reserve_(RoomNum,RoomName,RoomCost);
	    	   
    	   }
    	   if(e.getSource()== RCancel){
    	   	//	YouBooked.setText("Opppsssss...");
               Txns.UnReserve_(RoomNum,RoomName,RoomCost);
             
    	   }
    	   
    	   if(e.getSource()== Rm1){
	   		RoomNum = 1;
    	   	RoomName = "Studio Room 1:";
    	   	RoomCost = 600.00;
    	   	Icon PPreview = new ImageIcon(imgLink + "Rm1.jpg");
    	   	RDetail1.setText("Room Amenities:\n* Air Condition\n* Comfortable Bed for two\n*BathRoom and sink\n* w/ Internet and Electric fan");
      	 	RRate.setText("Room Rate:\nP"+RoomCost+" per night");
      	 	//LStatus.setText("Vacant");
            RPreview.setIcon(PPreview);
            Reserve.setEnabled(true);
            rmStatusNotifaction(RoomNum);
            
      	   }
      	 
      	   if(e.getSource()== Rm2){
      	   	RoomNum = 2;
      	   	RoomName = "Studio Room 2:";
    	   	RoomCost = 500.00;
    	   	Icon PPreview = new ImageIcon(imgLink + "Rm2.jpg");
    	   	RDetail1.setText("Room Amenities:\n* Air Condition\n* Comfortable Bed for one\n* With T.V.\n* w/ Internet and Electric fan");
      	 	RRate.setText("Room Rate:\nP"+RoomCost+" per night");
      	 	//LStatus.setText("Vacant");
            RPreview.setIcon(PPreview);
            Reserve.setEnabled(true);
			rmStatusNotifaction(RoomNum);
      	   }
      	   if(e.getSource()== Rm3){
      	   	RoomNum = 3;
      	   	RoomName = "Studio Room 3:";
    	   	RoomCost = 550.00;
    	   	Icon PPreview = new ImageIcon(imgLink + "Rm3.jpg");
    	   	RDetail1.setText("Room Amenities:\n* Comfortable Bed for two\n* With T.V.\n* Clean and Quite area\n* w/ Internet and Electric fan");
      	 	RRate.setText("Room Rate:\nP"+RoomCost+" per night");
            RPreview.setIcon(PPreview);
            Reserve.setEnabled(true);
            rmStatusNotifaction(RoomNum);
      	   }
      	   if(e.getSource()== Rm4){
      	   	RoomNum = 4;
      	   	RoomName = "Studio Room 4:";
    	   	RoomCost = 500.00;
    	   	Icon PPreview = new ImageIcon(imgLink + "Rm4.jpg");
    	   	RDetail1.setText("Room Amenities:\n* w/ Internet and Electric fan\n* Comfortable Bed for two\n* With T.V.\n* Simple and Clean");
      	 	RRate.setText("Room Rate:\nP"+RoomCost+" night");
            RPreview.setIcon(PPreview);
            Reserve.setEnabled(true);
            rmStatusNotifaction(RoomNum);
      	   }
      	   if(e.getSource()== Rm5){
      	   	RoomNum = 5;
      	   	RoomName = "Studio Room 5:";
    	   	RoomCost = 500.00;
    	   	Icon PPreview = new ImageIcon(imgLink + "Rm5.jpg");
    	   	RDetail1.setText("Room Amenities:\n* Comfortable Bed for two\n* With T.V.\n* w/ Internet and Electric fan");
      	 	RRate.setText("Room Rate:\nP"+RoomCost+" per night");
            RPreview.setIcon(PPreview);
            Reserve.setEnabled(true);
            rmStatusNotifaction(RoomNum);
      	   }
      	   if(e.getSource()== Rm6){
      	   	RoomNum = 6;
      	   	RoomName = "DeLuxed Room 6:";
    	   	RoomCost = 800.00;
    	   	Icon PPreview = new ImageIcon(imgLink + "Rm6.jpg");
    	   	RDetail1.setText("Room Amenities:\n* Air Condition with 42 Cable TV\n* Comfortable Bed\n*  Closet , Telephone\n*BathRoom and sink");
      	 	RRate.setText("Room Rate:\nP"+RoomCost+"per night");
            RPreview.setIcon(PPreview);
            Reserve.setEnabled(true);
            rmStatusNotifaction(RoomNum);
      	   }
      	   if(e.getSource()== Rm7){
      	   	RoomNum = 7;
      	   	RoomName = "DeLuxed Room 7:";
    	   	RoomCost = 1300.00;
    	   	Icon PPreview = new ImageIcon(imgLink + "Rm7.jpg");
    	   	RDetail1.setText("Room Amenities:\n* Air Condition with 42 Cable TV\n* Comfortable Bed with Sofa\n* You pay cheap but luxurius\n* Very Lovely Room");
      	 	RRate.setText("Room Rate:\nP"+RoomCost+" per night");
            RPreview.setIcon(PPreview);
            Reserve.setEnabled(true);
            rmStatusNotifaction(RoomNum);
      	   }
      	   if(e.getSource()== Rm8){
      	   	RoomNum = 8;
      	   	RoomName = "DeLuxed Room 8:";
    	   	RoomCost = 1550.00;
    	   	Icon PPreview = new ImageIcon(imgLink + "Rm8.jpg");
    	   	RDetail1.setText("Room Amenities:\n* 42\" Cable TV\n* Unlimited Wifi\n* Comfortable Bed\n*BathRoom and sink");
      	 	RRate.setText("Room Rate:\nP"+RoomCost+" per night");
            RPreview.setIcon(PPreview);
            Reserve.setEnabled(true);
            rmStatusNotifaction(RoomNum);
      	   }
      	   if(e.getSource()== Rm9){
      	   	RoomNum = 9;
      	   	RoomName = "DeLuxed Room 9:";
    	   	RoomCost = 3000.00;
    	   	Icon PPreview = new ImageIcon(imgLink + "Rm9.jpg");
    	   	RDetail1.setText("Room Amenities:\n* Air Condition with 42 Cable TV\n* Unlimited Wifi\n* BathRoom and sink");
      	 	RRate.setText("Room Rate:\nP"+RoomCost+" per night");
            RPreview.setIcon(PPreview);
            Reserve.setEnabled(true);
            rmStatusNotifaction(RoomNum);
      	   }
      	   if(e.getSource()== Rm10){
      	   	RoomNum = 10;
      	   	RoomName = "DeLuxed Room 10:";
    	   	RoomCost = 4500.00;
    	   	Icon PPreview = new ImageIcon(imgLink + "Rm10.jpg");
    	   	RDetail1.setText("Room Amenities:\n* Air Condition with 42 Cable TV\n* BathRoom and sink");
      	 	RRate.setText("Room Rate:\nP"+RoomCost+" per night");
            RPreview.setIcon(PPreview);
            Reserve.setEnabled(true);
            rmStatusNotifaction(RoomNum);
      	   }
      	   if(e.getSource()== Rm11){
      	   	RoomNum = 11;
      	   	RoomName = "Premier Room 11:";
    	   	RoomCost = 4000.00;
    	   	Icon PPreview = new ImageIcon(imgLink + "Rm11.jpg");
    	   	RDetail1.setText("Room Amenities:\n* Unlimited Wifi\n* Air Condition with 42 Cable TV's\n* Comfortable Bed Feels Like Home\n");
      	 	RRate.setText("Room Rate:\nP"+RoomCost+" per night");
            RPreview.setIcon(PPreview);
            Reserve.setEnabled(true);
            rmStatusNotifaction(RoomNum);
      	   }
      	   if(e.getSource()== Rm12){
      	   	RoomNum = 12;
      	   	RoomName = "Premier Room 12:";
    	   	RoomCost = 4000.00;
    	   	Icon PPreview = new ImageIcon(imgLink + "Rm12.jpg");
    	   	RDetail1.setText("Room Amenities:\n* Lovely Room for Small Family\n *Unlimited Wifi\n* Comfortable Bed\n* Spacious BathRoom and sink");
      	 	RRate.setText("Room Rate:\nP"+RoomCost+" per night");
            RPreview.setIcon(PPreview);
            Reserve.setEnabled(true);
            rmStatusNotifaction(RoomNum);
      	   }
      	   if(e.getSource()== Rm13){
      	   	RoomNum = 13;
      	   	RoomName = "Premier Room 13:";
    	   	RoomCost = 3500.00;
    	   	Icon PPreview = new ImageIcon(imgLink + "Rm13.jpg");
    	   	RDetail1.setText("Room Amenities:\n* Comfortable Bed For two\n*BathRoom and sink\n* Working table for Busy man\n* Feels like home");
      	 	RRate.setText("Room Rate:\nP"+RoomCost+" per night");
            RPreview.setIcon(PPreview);
            Reserve.setEnabled(true);
            rmStatusNotifaction(RoomNum);
      	   }
      	   if(e.getSource()== Rm14){
      	   	RoomNum = 14;
      	   	RoomName = "Premier Room 14:";
    	   	RoomCost = 4050.00;
    	   	Icon PPreview = new ImageIcon(imgLink + "Rm14.jpg");
    	   	RDetail1.setText("Room Amenities:\n* Air Condition Room\n* Unlimited Wifi\n* Very Comfortable Bed for two\n* Clean BathRoom and sink");
      	 	RRate.setText("Room Rate:\nP"+RoomCost+" per night");
            RPreview.setIcon(PPreview);
            Reserve.setEnabled(true);
            rmStatusNotifaction(RoomNum);
      	   }
      	   if(e.getSource()== Rm15){
      	   	RoomNum = 15;
      	   	RoomName = "Premier Room 15:";
    	   	RoomCost = 4000.00;
    	   	Icon PPreview = new ImageIcon(imgLink + "Rm15.jpg");
    	   	RDetail1.setText("Room Amenities:\n* Air Condition with 12 Cable TV\n * Comfortable Bed\n*BathRoom and sink\n* Unlimited Wifi\n");
      	 	RRate.setText("Room Rate:\nP"+RoomCost+" per night");
            RPreview.setIcon(PPreview);
            Reserve.setEnabled(true);
            rmStatusNotifaction(RoomNum);
      	   }
      	   if(e.getSource()== Rm16){
      	   	RoomNum = 16;
      	   	RoomName = "Superior Room 16:";
    	   	RoomCost = 4500.00;
    	   	Icon PPreview = new ImageIcon(imgLink + "Rm16.jpg");
    	   	RDetail1.setText("Room Amenities:\n* Air Condition with 42 Cable TV\n* Unlimited Wifi\n* Very Elegant and Special\n* You can feel you are home.");
      	 	RRate.setText("Room Rate:\nP"+RoomCost+" per night");
            RPreview.setIcon(PPreview);
            Reserve.setEnabled(true);
            rmStatusNotifaction(RoomNum);
      	   }
      	   if(e.getSource()== Rm17){
      	   	RoomNum = 17;
      	   	RoomName = "Superior Room 17:";
    	   	RoomCost = 5000.00;
    	   	Icon PPreview = new ImageIcon(imgLink + "Rm17.jpg");
    	   	RDetail1.setText("Room Amenities:\n* Best we can Offer w/ 24/7 Security\n* Unlimited Wifi\n* Comfortable Bed\n*BathRoom and sink");
      	 	RRate.setText("Room Rate:\nP"+RoomCost+" per night");
            RPreview.setIcon(PPreview);
            Reserve.setEnabled(true);
            rmStatusNotifaction(RoomNum);
      	   }
      	   if(e.getSource()== Rm18){
      	   	RoomNum = 18;
      	   	RoomName = "Superior Room 18:";
    	   	RoomCost = 6050.00;
    	   	Icon PPreview = new ImageIcon(imgLink + "Rm18.jpg");
    	   	RDetail1.setText("Room Amenities:\n*  Air Condition with 42 Cable TV\n* Unlimited Wifi\n* Very Elegant and Special\n* You can feel you are home.");
      	 	RRate.setText("Room Rate:\nP"+RoomCost+" per night");
            RPreview.setIcon(PPreview);
            Reserve.setEnabled(true);
            rmStatusNotifaction(RoomNum);
      	   }
      	   if(e.getSource()== Rm19){
      	   	RoomNum = 19;
      	   	RoomName = "Superior Room 19:";
    	   	RoomCost = 11000.00;
    	   	Icon PPreview = new ImageIcon(imgLink + "Rm19.jpg");
    	   	RDetail1.setText("Room Amenities:\n* Very Elegant and Special\n* Unlimited Wifi\n* Air Condition with 42 Cable TV\n* Very Elegant and Special\n* You can feel you are home.");
      	 	RRate.setText("Room Rate:\nP"+RoomCost+" per night");
            RPreview.setIcon(PPreview);
            Reserve.setEnabled(true);
            rmStatusNotifaction(RoomNum);
      	   }
      	   if(e.getSource()== Rm20){
      	   	RoomNum = 20;
      	   	RoomName = "Superior Room 20:";
    	   	RoomCost = 12000.00;
    	   	Icon PPreview = new ImageIcon(imgLink + "Rm20.jpg");
    	   	RDetail1.setText("Room Amenities:\n* Very Elegant and Special\n* Air Condition with 42 Cable TV\n* Unlimited Wifi\n* Comfortable Bed\n*BathRoom and sink");
      	 	RRate.setText("Room Rate:\nP"+RoomCost+" per night");
      	 	RPreview.setIcon(PPreview);
            Reserve.setEnabled(true);
            rmStatusNotifaction(RoomNum);
      	   }
      	   
 
    	   
    	}//end of Event Handler  	
      
   public static void main(String[] args) {
		HotelRoomReservation  BG = new HotelRoomReservation();
		BG.Reserve.setEnabled(false);
		BG.LTotalcost.setText("0.00");
		BG.LCash.setText("0.00");
		
		BG.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    }
}

