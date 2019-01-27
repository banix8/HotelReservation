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
      	   JLabel RPreview, RPreviewOverlay, RBooking, RunningTotal, GrandTotal, Cash, TWarning, lblx, lblBG,lchkIN,lchkOut,lName,lPhone,YouBooked,lblAvlRoom,lblCustNum;
           JTextField LRunningTotal, LGrandTotal, LCash, LWarn, RStatus, txtchkIN,txtchkOut,txtName,txtPhone;
           JTextArea RTypeStudio,RTypeDeLuxe,RTypePremier,RTypeSuperior; 
           JTextArea RDetail1, RRate, Binfo, LStatus, OReminders,BookingGuide;
           JLabel lR1,lR2,lR3,lR4,lR5,lR6,lR7,lR8,lR9,lR10,lR11,lR12,lR13,lR14,lR15,lR16,lR17,lR18,lR19,lR20;

           JButton Rm1,Rm2,Rm3,Rm4,Rm5,Rm6,Rm7,Rm8,Rm9,Rm10,Rm11,Rm12,Rm13,Rm14,Rm15,Rm16,Rm17,Rm18,Rm19,Rm20;
      	   JButton bPay, bClear, bNewC, Reserve,UnReserve,CheckOutbtn;
      	   
      	   String imgLink = "C:/Users/Cres Pogi/Desktop/HotelRoomReservation/img/";
      	   String previewImg = imgLink + "Preview.jpg";
      	   String previewOverlayImg = imgLink + "Overlay.png";
      	   ImageIcon pic1 = new ImageIcon(imgLink + "bg4.jpg");
      	 //  Image image1 = pic1.getImage();
      	  // Image scaled1 = image1.getScaledInstance(1366,710,java.awt.Image.SCALE_SMOOTH);
      	  // ImageIcon bg1 = new ImageIcon(scaled1);
           int RoomNum,avlRooms = 20,CustCount=0,CustomerNumber=1,DaysOfStay;
    	   String RoomName,RInfo="",RoomState = "",CustomerName,PhoneNumber,CheckInDate;
    	   Double RoomCost = 0.00;
    	   Double RTotal = 0.00; 
    	   int[][] rmList2 = new int[2][22];
      	   int[] rmList = new int[22];
      	   String[] rmReserved = new String[22];
	   	   Double[] rmReservedCost = new Double[22];
	   	   String[] bking_list = new String[22];
	   	   Double Grand_Total = 0.00;
      	   
       //    Icon logo = new ImageIcon(imgLink + "logo.png");
      	   Icon PPreview = new ImageIcon(previewImg);
      	//   Icon PPreviewOverlay = new ImageIcon(previewOverlayImg);
      		boolean Stepone = false;
  	 
   public HotelRoomReservation() {
     
      	 	///Contruction/Instantiate
       	 	setSize(1366,750);
       	 	setLocation(0,0);
      	 	setVisible(true);
      	 	setTitle("Hotel HotelRoomReservation");
      	 	setResizable(false);
      	 	
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
      	 	
      	 	//set background for JFrame
      	 	Container C = getContentPane();
      	 	C.setBackground(new Color(226,226,226));
      	 	
      	 	lblAvlRoom = new JLabel("      "+avlRooms);
      	 	lblCustNum = new JLabel("      "+CustCount);
      	 	RPreview = new JLabel(PPreview);
      	 	RPreviewOverlay = new JLabel();
       	 	RDetail1 = new JTextArea("Hotel Amenities:\n"+
       	 		"* Comfortable & Luxuries Rooms\n"+
       	 			"* Air Condition with 42 Cable TV\n"+
       	 				"* 24/7 Active Security\n"+
       	 					"* Clean BathRoom & Sink");
       	 	RDetail1.setEditable(false);
      	 	RRate = new JTextArea("Room Rates:\nP500.00 to P5000.00");
      	 	RRate.setEditable(false);
      	 	LStatus = new JTextArea("Room Status:\nVACANT rooms = "+ avlRooms);
      	 	LStatus.setEditable(false);
      	 	
      	 	Reserve = new JButton("Reserve");
      	 	UnReserve = new JButton("Unreserve");
      	 	
      	 	YouBooked = new JLabel("Choose now your favorite room/s...");
      	 	Binfo = new JTextArea();
      	 	Binfo.setEditable(false);
      	 	BookingGuide = new JTextArea("Customer no.:\n\n\nAvailable Rooms:");
      	 	BookingGuide.setEditable(false);
      	 	OReminders = new JTextArea("How to Book a room:\n"+
      	 		"* Click the room you liked at the left\n"+
      	 			"* Click RESERVE to reserve.\n"+
      	 				"* Click CANCEL to cancel.\n"+
      	 					"* Please fill your details at booking form\n"+
      	 						"* You can click CLEAR if you need change\n"+
      	 							"* You can CHECKOUT anytime\n"+
      	 								"* Just click the CHECKOUT button\n"+
      	 									"* We only accept exact amount\n"+
      	 										"* We are glad to you as our Guest\n\n"+
      	 											"* Have a Pleasant Stay @ Mint Hotel");
      	 	OReminders.setEditable(false);     	 	
      	 	RBooking = new JLabel("BOOKING FORM");
      	 	RunningTotal = new JLabel("SUBTOTAL");
      	 	GrandTotal = new JLabel("GRAND TOTAL");
      	 	Cash = new JLabel("CASH");
      	 	lchkIN = new JLabel("CHECK IN:");
      	 	txtchkIN = new JTextField(20);
      	 	txtchkIN.setToolTipText("What day you will check-in?");
      	 	lchkOut = new JLabel("DAYS of STAY");
      	 	txtchkOut = new JTextField(20);
      	 	txtchkOut.setToolTipText("How many days are you going to stay?");
      	 	lName = new JLabel("NAME");
      	 	txtName = new JTextField(20);
      	 	txtName.setToolTipText("Please enter complete name.");
      	 	lPhone = new JLabel("CONTACT#");
      	 	txtPhone = new JTextField(20);
      	 	txtPhone.setToolTipText("Please enter valid phone#");
      	 	//TWarning = new JLabel("Change");
      	 	LWarn = new JTextField(20);
      	 	LWarn.setEditable(false);
      	 	
      	 	bPay = new JButton("PAY | CHECK-IN");
      	 	bClear = new JButton("CLEAR BOOKING FORM");
      	 	CheckOutbtn = new JButton("CHECK OUT");
      	 	bNewC = new JButton("NEW CUSTOMER");
      	 	LGrandTotal = new JTextField(20);
      	 	LGrandTotal.setToolTipText("Grand Total to pay");
      	 	LGrandTotal.setEditable(false);
      	 	LRunningTotal = new JTextField(20);
      	 	LRunningTotal.setToolTipText("This is the Running Total");
      	 	LRunningTotal.setEditable(false);
      	 	LCash = new JTextField(20);
      	 	LCash.setToolTipText("Please pay only exact cash");

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
      	 	RPreviewOverlay.setBounds(182,96,484,254);
      	 	
      	 	add(RPreview);
      	 	RPreview.setBounds(182,96,484,254);
      	 	
      	 	add(RDetail1);
      	 	RDetail1.setBounds(184,358,180,88);
      	 	RDetail1.setBackground(Color.black);
      	 	RDetail1.setFont(new Font("Serif", Font.PLAIN, 12));
      	 	RDetail1.setForeground(Color.white);
                
      	  	add(LStatus);
      	 	LStatus.setBounds(384,358,150,44);
      	 	LStatus.setBackground(Color.black);
      	 	LStatus.setFont(new Font("Serif", Font.PLAIN, 14));
      	 	LStatus.setForeground(Color.white);
                
      	 	add(RRate);
      	 	RRate.setBounds(384,402,150,44);
      	 	RRate.setBackground(Color.black);
      	 	RRate.setFont(new Font("Serif", Font.PLAIN, 14));
      	 	RRate.setForeground(Color.white);
      	 	        	 	
      	 	add(Reserve);
      	 	Reserve.setBounds(555,365,100,30);
      	 	
      	 	add(UnReserve);
      	 	UnReserve.setBounds(555,405,100,30);
      	 	
      	 	
      	 	
      	 	add(YouBooked);
      	 	YouBooked.setBounds(690,100,220,20);
      	 	YouBooked.setBackground(Color.black);
      	 	YouBooked.setFont(new Font("Serif", Font.PLAIN, 18));
      	 	YouBooked.setForeground(Color.white);

      	 	add(Binfo);
      	 	Binfo.setBounds(690,120,220,280);
      	 	Binfo.setBackground(Color.black);
      	 	Binfo.setFont(new Font("Serif", Font.PLAIN, 16));
      	 	Binfo.setForeground(Color.white);
      	 	
      	 	add(RunningTotal);
      	 	RunningTotal.setBounds(690,415,85,30);
      	 	RunningTotal.setBackground(Color.black);
      	 	RunningTotal.setFont(new Font("Serif", Font.PLAIN, 12));
      	 	RunningTotal.setForeground(Color.white);
            RunningTotal.setOpaque(true);
            
      	 	add(LRunningTotal);
      	 	LRunningTotal.setBounds(775,415,140,30);
      	 	LRunningTotal.setFont(new Font("Serif", Font.PLAIN, 20));

      	 	add(OReminders);
      	 	OReminders.setBounds(690,468,220,225);
      	 	OReminders.setBackground(Color.black);
      	 	OReminders.setFont(new Font("Serif", Font.PLAIN, 12));
      	 	OReminders.setForeground(Color.white);
            OReminders.setOpaque(true);
            
            add(lblCustNum);
      	 	lblCustNum.setBounds(935,120,180,60);
      	 	lblCustNum.setFont(new Font("Serif", Font.PLAIN, 60));
      	 	lblCustNum.setForeground(Color.white);
         
      	 	add(lblAvlRoom);
      	 	lblAvlRoom.setBounds(935,200,180,60);
      	 	lblAvlRoom.setFont(new Font("Serif", Font.PLAIN, 60));
      	 	lblAvlRoom.setForeground(Color.white);

			add(BookingGuide);
			BookingGuide.setBounds(935,100,220,155);
			BookingGuide.setBackground(Color.black);
      	 	BookingGuide.setFont(new Font("Serif", Font.PLAIN, 18));
      	 	BookingGuide.setForeground(Color.white);
            BookingGuide.setOpaque(true);

      	 	add(RBooking);
      	 	RBooking.setBounds(935,260,220,30);
      	 	RBooking.setBackground(Color.black);
      	 	RBooking.setFont(new Font("Serif", Font.PLAIN, 18));
      	 	RBooking.setForeground(Color.white);
            RBooking.setOpaque(true);
                             	 	
      	 	add(lName);
      	 	lName.setBounds(935,290,85,30);
      	 	lName.setBackground(Color.black);
      	 	lName.setFont(new Font("Serif", Font.PLAIN, 12));
      	 	lName.setForeground(Color.white);
            lName.setOpaque(true);
      	    
      	 	add(txtName);
      	 	txtName.setBounds(1020,290,140,30);
      	    txtName.setFont(new Font("Serif", Font.PLAIN, 20));
      	    
      	 	add(lPhone);
      	 	lPhone.setBounds(935,330,85,30);
      	 	lPhone.setBackground(Color.black);
      	 	lPhone.setFont(new Font("Serif", Font.PLAIN, 12));
      	 	lPhone.setForeground(Color.white);
            lPhone.setOpaque(true);
      	    
      	 	add(txtPhone);
      	 	txtPhone.setBounds(1020,330,140,30);
      	 	txtPhone.setFont(new Font("Serif", Font.PLAIN, 20));
            
     	 	add(lchkIN);
      	 	lchkIN.setBounds(935,370,85,30);
      	 	lchkIN.setBackground(Color.black);
      	 	lchkIN.setFont(new Font("Serif", Font.PLAIN, 12));
      	 	lchkIN.setForeground(Color.white);
            lchkIN.setOpaque(true);
      	    
      	 	add(txtchkIN);
      	 	txtchkIN.setBounds(1020,370,140,30);
      	 	txtchkIN.setFont(new Font("Serif", Font.PLAIN, 20));
      	 	
      	 	add(lchkOut);
      	 	lchkOut.setBounds(935,410,85,30);
      	 	lchkOut.setBackground(Color.black);
      	 	lchkOut.setFont(new Font("Serif", Font.PLAIN, 12));
      	 	lchkOut.setForeground(Color.white);
            lchkOut.setOpaque(true);
      	    
      	 	add(txtchkOut);
      	 	txtchkOut.setBounds(1020,410,140,30);
      	 	txtchkOut.setFont(new Font("Serif", Font.PLAIN, 20));
      	 	    	 	
      	 	add(GrandTotal);
      	 	GrandTotal.setBounds(935,450,85,30);
      	 	GrandTotal.setBackground(Color.black);
      	 	GrandTotal.setFont(new Font("Serif", Font.PLAIN, 12));
      	 	GrandTotal.setForeground(Color.white);
            GrandTotal.setOpaque(true);
            
      	 	add(LGrandTotal);
      	 	LGrandTotal.setBounds(1020,450,140,30);
      	 	LGrandTotal.setFont(new Font("Serif", Font.PLAIN, 20));
     
      	 	add(Cash);
      	 	Cash.setBounds(935,490,85,30);
      	 	Cash.setBackground(Color.black);
      	 	Cash.setFont(new Font("Serif", Font.PLAIN, 12));
      	 	Cash.setForeground(Color.white);
            Cash.setOpaque(true);
            
      	 	add(LCash);
      	 	LCash.setBounds(1020,490,140,30);
      	 	LCash.setFont(new Font("Serif", Font.PLAIN, 20));
      	 	
      	 	add(bPay);
      	 	bPay.setBounds(940,530,220, 30);
      	 	bPay.setFont(new Font("Serif", Font.PLAIN, 16));
      	 	
      	 	add(bClear);
      	 	bClear.setBounds(940,570,220,30);
      	 	bClear.setFont(new Font("Serif", Font.PLAIN, 16));
      	 	
      	 	add(CheckOutbtn);
            CheckOutbtn.setBounds(940,610,220,30);
            CheckOutbtn.setFont(new Font("Serif", Font.PLAIN, 16));
      	 	
      	 	add(bNewC);
      	 	bNewC.setBounds(940,650,220,30);
      	 	bNewC.setFont(new Font("Serif", Font.PLAIN, 16));

      	 	add(RTypeStudio);
      	 	RTypeStudio.setBounds(563,462,100,50);
      	 	RTypeStudio.setBackground(Color.black);
      	 	RTypeStudio.setFont(new Font("Serif", Font.PLAIN, 14));
      	 	RTypeStudio.setForeground(Color.white);
            RTypeStudio.setOpaque(true);
      	    
      	 	add(Rm1);      	 	 
        	Rm1.setBounds(185,455,70,37); //(177,455,70,37)
      	 	Rm1.setBackground(Color.white);
            add(lR1);      	 	 
      	 	lR1.setBounds(185,491,70,20);
            lR1.setBackground(Color.black);
      	 	lR1.setFont(new Font("Serif", Font.PLAIN, 12));
      	 	lR1.setForeground(Color.white);
            lR1.setOpaque(true);
      	 	
      	 	add(Rm2);
      	 	Rm2.setBounds(260,455,70,37);
      	 	Rm2.setBackground(Color.white);
            add(lR2);      	 	 
      	 	lR2.setBounds(260,491,70,20);
            lR2.setBackground(Color.black);
      	 	lR2.setFont(new Font("Serif", Font.PLAIN, 12));
      	 	lR2.setForeground(Color.white);
            lR2.setOpaque(true);
                
      	 	add(Rm3);
      	 	Rm3.setBounds(335,455,70,37);
      	 	Rm3.setBackground(Color.white);
            add(lR3);      	 	 
      	 	lR3.setBounds(335,491,70,20);
            lR3.setBackground(Color.black);
      	 	lR3.setFont(new Font("Serif", Font.PLAIN, 12));
      	 	lR3.setForeground(Color.white);
            lR3.setOpaque(true);
                
      	 	add(Rm4);
      	 	Rm4.setBounds(410,455,70,37);
      	 	Rm4.setBackground(Color.white);
            add(lR4);      	 	 
      	 	lR4.setBounds(410,491,70,20);
            lR4.setBackground(Color.black);
      	 	lR4.setFont(new Font("Serif", Font.PLAIN, 12));
      	 	lR4.setForeground(Color.white);
            lR4.setOpaque(true);
                
            add(Rm5);
      	 	Rm5.setBounds(485,455,70,37);
      	 	Rm5.setBackground(Color.white);
            add(lR5);      	 	 
      	 	lR5.setBounds(485,491,70,20);
            lR5.setBackground(Color.black);
      	 	lR5.setFont(new Font("Serif", Font.PLAIN, 12));
      	 	lR5.setForeground(Color.white);
            lR5.setOpaque(true);
                
            add(RTypeDeLuxe);
      	 	RTypeDeLuxe.setBounds(563,522,100,50);
      	 	RTypeDeLuxe.setBackground(Color.black);
      	 	RTypeDeLuxe.setFont(new Font("Serif", Font.PLAIN, 14));
      	 	RTypeDeLuxe.setForeground(Color.white);
            RTypeDeLuxe.setOpaque(true);
             
            add(Rm6);
      	 	Rm6.setBounds(185,515,70,37);
      	 	Rm6.setBackground(Color.white);
            add(lR6);      	 	 
      	 	lR6.setBounds(185,553,70,20);
            lR6.setBackground(Color.black);
      	 	lR6.setFont(new Font("Serif", Font.PLAIN, 12));
      	 	lR6.setForeground(Color.white);
            lR6.setOpaque(true);
                
      	 	add(Rm7);
      	 	Rm7.setBounds(260,515,70,37);
      	 	Rm7.setBackground(Color.white);
            add(lR7);      	 	 
      	 	lR7.setBounds(260,551,70,20);
            lR7.setBackground(Color.black);
      	 	lR7.setFont(new Font("Serif", Font.PLAIN, 12));
      	 	lR7.setForeground(Color.white);
            lR7.setOpaque(true);
                
      	 	add(Rm8);
      	 	Rm8.setBounds(335,515,70,37);
      	 	Rm8.setBackground(Color.white);
            add(lR8);      	 	 
      	 	lR8.setBounds(335,551,70,20);
            lR8.setBackground(Color.black);
      	 	lR8.setFont(new Font("Serif", Font.PLAIN, 12));
      	 	lR8.setForeground(Color.white);
            lR8.setOpaque(true);
                
      	 	add(Rm9);
      	 	Rm9.setBounds(410,515,70,37);
      	 	Rm9.setBackground(Color.white);
            add(lR9);      	 	 
      	 	lR9.setBounds(410,551,70,20);
            lR9.setBackground(Color.black);
      	 	lR9.setFont(new Font("Serif", Font.PLAIN, 12));
      	 	lR9.setForeground(Color.white);
            lR9.setOpaque(true);
                
      	 	add(Rm10);
      	 	Rm10.setBounds(485,515,70,37);
      	 	Rm10.setBackground(Color.white);
                add(lR10);      	 	 
      	 	lR10.setBounds(485,551,70,20);
                lR10.setBackground(Color.black);
      	 	lR10.setFont(new Font("Serif", Font.PLAIN, 12));
      	 	lR10.setForeground(Color.white);
                lR10.setOpaque(true);
            
            
            add(RTypePremier);
      	 	RTypePremier.setBounds(563,582,100,50);
      	 	RTypePremier.setBackground(Color.black);
      	 	RTypePremier.setFont(new Font("Serif", Font.PLAIN, 14));
      	 	RTypePremier.setForeground(Color.white);
            RTypePremier.setOpaque(true);
                
      	 	add(Rm11);
      	 	Rm11.setBounds(185,575,70,37);
      	 	Rm11.setBackground(Color.white);
            add(lR11);      	 	 
      	 	lR11.setBounds(185,611,70,20);
            lR11.setBackground(Color.black);
      	 	lR11.setFont(new Font("Serif", Font.PLAIN, 12));
      	 	lR11.setForeground(Color.white);
            lR11.setOpaque(true);
                
      	 	add(Rm12);
      	 	Rm12.setBounds(260,575,70,37);
      	 	Rm12.setBackground(Color.white);
            add(lR12);      	 	 
      	 	lR12.setBounds(260,611,70,20);
            lR12.setBackground(Color.black);
      	 	lR12.setFont(new Font("Serif", Font.PLAIN, 12));
      	 	lR12.setForeground(Color.white);
            lR12.setOpaque(true);
                
      	 	add(Rm13);
      	 	Rm13.setBounds(335,575,70,37);
      	 	Rm13.setBackground(Color.white);
            add(lR13);      	 	 
      	 	lR13.setBounds(335,611,70,20);
            lR13.setBackground(Color.black);
      	 	lR13.setFont(new Font("Serif", Font.PLAIN, 12));
      	 	lR13.setForeground(Color.white);
            lR13.setOpaque(true);
                
      	 	add(Rm14);
      	 	Rm14.setBounds(410,575,70,37);
      	 	Rm14.setBackground(Color.white);
            add(lR14);      	 	 
      	 	lR14.setBounds(410,611,70,20);
            lR14.setBackground(Color.black);
      	 	lR14.setFont(new Font("Serif", Font.PLAIN, 12));
      	 	lR14.setForeground(Color.white);
            lR14.setOpaque(true);
                
            add(Rm15);
      	 	Rm15.setBounds(485,575,70,37);
      	 	Rm15.setBackground(Color.white);
            add(lR15);      	 	 
      	 	lR15.setBounds(485,611,70,20);
            lR15.setBackground(Color.black);
      	 	lR15.setFont(new Font("Serif", Font.PLAIN, 12));
      	 	lR15.setForeground(Color.white);
            lR15.setOpaque(true);
            
            add(RTypeSuperior);
      	 	RTypeSuperior.setBounds(563,642,100,50);
      	 	RTypeSuperior.setBackground(Color.black);
      	 	RTypeSuperior.setFont(new Font("Serif", Font.PLAIN, 14));
      	 	RTypeSuperior.setForeground(Color.white);
            RTypeSuperior.setOpaque(true);
                
            add(Rm16);
      	 	Rm16.setBounds(185,635,70,37);
      	 	Rm16.setBackground(Color.white);
            add(lR16);      	 	 
      	 	lR16.setBounds(185,671,70,20);
            lR16.setBackground(Color.black);
      	 	lR16.setFont(new Font("Serif", Font.PLAIN, 12));
      	 	lR16.setForeground(Color.white);
            lR16.setOpaque(true);
                
      	 	add(Rm17);
      	 	Rm17.setBounds(260,635,70,37);
      	 	Rm17.setBackground(Color.white);
            add(lR17);      	 	 
      	 	lR17.setBounds(260,671,70,20);
            lR17.setBackground(Color.black);
      	 	lR17.setFont(new Font("Serif", Font.PLAIN, 12));
      	 	lR17.setForeground(Color.white);
            lR17.setOpaque(true);
                
      	 	add(Rm18);
      	 	Rm18.setBounds(335,635,70,37);
      	 	Rm18.setBackground(Color.white);
            add(lR18);      	 	 
      	 	lR18.setBounds(335,671,70,20);
            lR18.setBackground(Color.black);
      	 	lR18.setFont(new Font("Serif", Font.PLAIN, 12));
      	 	lR18.setForeground(Color.white);
            lR18.setOpaque(true);
                
      	 	add(Rm19);
      	 	Rm19.setBounds(410,635,70,37);
      	 	Rm19.setBackground(Color.white);
            add(lR19);      	 	 
      	 	lR19.setBounds(410,671,70,20);
            lR19.setBackground(Color.black);
      	 	lR19.setFont(new Font("Serif", Font.PLAIN, 12));
      	 	lR19.setForeground(Color.white);
            lR19.setOpaque(true);
                
      	 	add(Rm20);
      	 	Rm20.setBounds(485,635,70,37);
      	 	Rm20.setBackground(Color.white);
            add(lR20);      	 	 
      	 	lR20.setBounds(485,671,70,20);
            lR20.setBackground(Color.black);
      	 	lR20.setFont(new Font("Serif", Font.PLAIN, 12));
      	 	lR20.setForeground(Color.white);
            lR20.setOpaque(true);
            
            lblBG = new JLabel(pic1);
      	 	lblx= new JLabel("");
                
      	 	add(lblBG);
      	 	lblBG.setBounds(0,0,1366,710);
      	 	
      		add(lblx);
      		
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
      	    
       	    bPay.addActionListener(this);
      	    bClear.addActionListener(this);
      	    bNewC.addActionListener(this);
      	    Reserve.addActionListener(this);
      	    UnReserve.addActionListener(this);
      	    CheckOutbtn.addActionListener(this);
      	    
      	}//end of contructor
   void RstPaymentEntry(){
   	String Rst = JOptionPane.showInputDialog("Are you sure?\n\n y = Yes / n = No");
   		if(Rst.equals("y")){
   			txtchkIN.setText("");
	  	 	txtName.setText("");
	  	 	txtPhone.setText("");
	   		LCash.setText("0.00");
	   		LWarn.setText("");
   		}
   }
	   
   public void payNow(Double c, Double t, Double e, String n, String ARD){
		
	if(e==0){
	//	JOptionPane.showMessageDialog(null, "Thank you  "+ c);	
		bPay.setEnabled(false);
		CheckOutbtn.setEnabled(true);
		bClear.setEnabled(false);
		Reserve.setEnabled(false);
	 	UnReserve.setEnabled(false);
	 	bNewC.setEnabled(true);
	 	Binfo.setText("Thank you Madam/Sir "+n+"\n\n"+
	 		"You paid "+t+" Pesos..\n"+
	 			"You Success fully Booked\n"+
	 				"We will be expecting you to\n"+
	 					"Arrive at: "+ARD+"\n\n"+
	 						"Thank you once again\n\n"+
	 							"Have a safe Trip. :)");
	 				
	 	LRunningTotal.setText("0.00");
		LGrandTotal.setText("0.00");
		LGrandTotal.setText("0.00");
		LCash.setText("0.00");
		txtchkIN.setText("");
  	 	txtName.setText("");
  	 	txtPhone.setText("");
   		LCash.setText("0.00");
   		LWarn.setText("");
   		txtchkOut.setText("");
   		RTotal = 0.0;
   		RInfo = "";
	}else if(c<t){
			YouBooked.setText("OOPPPSSS...\n\n\n");
   			Binfo.setText("Hi Madam/Sir "+n+
   			"\n\n You entered : "+c+"\n"+
   				"\n It's less than "+(t-c)+" Pesos\n"+
   					"Compare to the total amount\n\n"+
   						"Please pay exatly "+t+" Pesos");
   	}else{
   			YouBooked.setText("OOPPPSSS...\n\n\n");
   			Binfo.setText("Hi Madam/Sir "+n+
   			"\n\n You entered :"+c+"\n\n"+
   				"\n you exceed "+(c-t)+ " Pesos\n"+
   					"Compare to the total amount\n\n"+
   						"Please pay exatly "+t+" Pesos");
   	}
   }
   void CheckOut(int CustNum){
   /*			String a="";
   			String b="";
		for(int i=1;i<21;i++){
			a += " "+rmList2[0][i];
			b += " "+rmList2[1][i];
   			}
   		JOptionPane.showMessageDialog(null, "hello\n"+a+"\n\n"+b);
   			*/
   			int k = 1;
   		
			while(k<22){
				while((rmList2[1][k]==CustNum)&& (rmList2[0][k]==1)){
					rmList2[0][k] = 0;
					rmList2[1][k] = 0;
					avlRooms += 1;
					lblAvlRoom.setText("      "+avlRooms);
				//	break;
					}
				k++;
				}

   	homepage();
   }
  
   private class Transactions {
	        // This class can access everything from its parent...
	      public  void rmStatusNotifaction(int Rnum){
  
			   //	if(rmList[Rnum]==1){
			   	if(rmList2[0][Rnum]==1){
			   		Icon PPreviewOverlay = new ImageIcon(imgLink + "Overlay.png");
				    RPreviewOverlay.setIcon(PPreviewOverlay);
			    	LStatus.setText("Room already Reserved\nPlease choose another");
			    }
			   // if(rmList[Rnum]==0){
			   	if(rmList2[0][Rnum]==0){
			    	Icon PPreviewOverlay = new ImageIcon();
				    RPreviewOverlay.setIcon(PPreviewOverlay);
			    	LStatus.setText("Room Status:\n    AVAILABLE");
			    }
			    
			   }
			        
	      public void NewCustomer(int cstn,String nme,String ctk, String chkn,String d){  //customer number, Name , Contact number, Check in, days of stay, 
	   		CustomerNumber = cstn;
	   		CustomerName = nme;
	   		PhoneNumber = ctk;
	   		CheckInDate = chkn;
	   		DaysOfStay = Integer.parseInt(d);
	   		homepage();
			}
	      public void Reserve_(int CustNumber, int RmNum,String RmName,Double RmCost){ //RoomNum,RoomName,RoomCost
	     // 	JOptionPane.showMessageDialog(null, "CustNumber: "+CustNumber+"\nRoom Num: "+RmNum+"\nRoomCost: "+RmCost);
	      	//	if(rmList[RmNum]==0){
	      		
	      		if(rmList2[0][RmNum]==0){
	      			Icon PPreviewOverlay = new ImageIcon(imgLink + "Overlay.png");
	    			RPreviewOverlay.setIcon(PPreviewOverlay);
	      	  		RInfo += RmName+" P"+RmCost+"\n";
	      	  		Binfo.setText(RInfo);
	      	  		RTotal += RmCost;
	      	  		rmReservedCost[RmNum] = RmCost;
	      	  		String rInfo_ = RmName+" P"+RmCost+"\n";
	      	  		rmReserved[RmNum] = rInfo_;
		      		Double DoS = Double.parseDouble(txtchkOut.getText()); 
		     		LRunningTotal.setText(Double.toString(RTotal));
		     		LGrandTotal.setText(Double.toString(RTotal*DoS)); //LGrandTotal.setText(Double.toString(RTotal*DoS));
		     		Grand_Total = RTotal*DoS;
		     		avlRooms -= 1;
		     		lblAvlRoom.setText("      "+avlRooms);
		     		LStatus.setText("Room Status:\n    RESERVED");
		     		rmList[RoomNum]=1;
		     		rmList2[0][RmNum]= 1;
			     	rmList2[1][RmNum]= CustNumber;
		     		
	      		}else{
	      			LStatus.setText("Room already Reserved\nPlease choose another");
	      		}
	      }
	      public void UnReserve_(int CustNumber,int RmNum,String RmName,Double RmCost){
	      //	JOptionPane.showMessageDialog(null, "CustNumber: "+CustNumber+"\nRoom Num: "+RmNum+"\nRoomCost: "+RmCost);
	          // 	if(rmList[RoomNum]==1){
	        	if(rmList2[0][RmNum]==1){
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
	   				
		      		Double minus=rmReservedCost[RoomNum];
		      		RTotal -= minus;
		      		Double DoS = Double.parseDouble(txtchkOut.getText());
		     		LRunningTotal.setText(Double.toString(RTotal));
		     		LGrandTotal.setText(Double.toString(RTotal/DoS)); //LGrandTotal.setText(Double.toString(RTotal/DoS));
		     		Grand_Total = RTotal/DoS;
		     		avlRooms += 1;
		     		lblAvlRoom.setText("      "+avlRooms);
			     	LStatus.setText("Room Status:\n    AVAILABLE");
			     	
			     	rmList[RoomNum]=0;
			    	rmList2[0][RmNum]= 0;
			     	rmList2[1][RmNum]= 0;
		      	}else{
		      		LStatus.setText("You cannot unreserve a\nroomyou did not reserve!");
		      	}
	      }
	}
	void homepage(){
		Reserve.setEnabled(false);
		bNewC.setEnabled(true);
		UnReserve.setEnabled(false);
		bPay.setEnabled(false);
	    LGrandTotal.setText("0.00");
		bClear.setEnabled(false);
		LRunningTotal.setText("0.00");
		LCash.setText("0.00");
		YouBooked.setText("W   E   L   C   O   M   E");
		String intro = "\nWe are very happy to serve you\n"+
				"Please begin booking by \n"+
					"Filling up the form and\n"+
						"pressing New Customer Button\n"+
							"After that you can then start Booking\n"+
								"Cheers...\nMINT Management\n\n"+
									"Mark Anthony Obioma: Manager\n"+
										"Darwin Delvo: Marketing\n"+
											"Chrestopher Pabalate: Owner";
		Binfo.setText(intro);
     	RDetail1.setText("Hotel Amenities:\n"+
       	 		"* Comfortable & Luxuries Rooms\n"+
       	 			"* Air Condition with 42 Cable TV\n"+
       	 				"* 24/7 Active Security\n"+
       	 					"* Clean BathRoom & Sink");

		Icon PPreview = new ImageIcon(imgLink + "Preview.jpg");
		RPreview.setIcon(PPreview);
		Icon PPreviewOverlay = new ImageIcon();
		RPreviewOverlay.setIcon(PPreviewOverlay);

	}
      //Event Handlers
      @Override
   public void actionPerformed (ActionEvent e){
      	Transactions Txns = new Transactions();
        
    	    if(e.getSource()==CheckOutbtn){

    	    	int ccc = Integer.parseInt(JOptionPane.showInputDialog("Thank you for staying with Us\n\n"+
    	    		"To Checkout,\n\nPlease enter your Customer number: \n"));
    	    	//	JOptionPane.showMessageDialog(null, "CustNumber: "+ccc);
    	   		CheckOut(ccc);
    	   			
    	   	}
    	  
    	   if(e.getSource()== bNewC){
    	  	
    	  	String nme = txtName.getText();
    	  	String phone = txtPhone.getText();
    	  	String chkIn = txtchkIN.getText();
    	  	String DoS = txtchkOut.getText();  //Dos Days of Stay
    	 
    	  	if((DoS.equals(""))&&(nme.equals(""))&&(phone.equals(""))&&(chkIn.equals(""))){
    	  		
    	  		YouBooked.setText("Please Fill up the booking form first");
				String intro = "\n\n"+
					"Name: \nContact #: \nCheck In Date: \nDays of Stay: \n\nEnter only a number in Days of Stay\n\nBefore you can Book Rooms";
				Binfo.setText(intro);
	    	  	
	   	  	}else{
    	  		CustCount += 1;
    	  		CustomerNumber = CustCount;
    	  		Transactions newCust = new Transactions();
    	  	    newCust.NewCustomer(CustomerNumber,nme,phone,chkIn,DoS);  //customer number, Name , Contactnumber, Check in, days of stay, 
 	    	   	lblCustNum.setText("      "+CustCount);
	    	   	bPay.setEnabled(true);
				CheckOutbtn.setEnabled(true);
				bClear.setEnabled(true);
	         	bNewC.setEnabled(false);
    	  		YouBooked.setText("Thank you...");
				String intro = "You are Customer #:\n\n"+CustomerNumber+"\n\nYou entered:\n\n"+
    	  			"Name: "+nme+"\nContact #: "+phone+"\nCheck In Date: "+chkIn+"\nDays of Stay: "+DoS+"\n\nPlease choose your room to reserve...";
				Binfo.setText(intro);
				Reserve.setEnabled(false);
            	UnReserve.setEnabled(false);
    	  	}
     	   }

    	   if (e.getSource() == bPay){
    	   	//	Double DoS = Double.parseDouble(txtchkOut.getText());
    	   	//	LGrandTotal.getText(Double.toString(RTotal*DoS))
				Double T = Grand_Total;
				Double C = Double.parseDouble(LCash.getText());
				Double E = C - T;
				String N = txtName.getText();
				String A = txtchkIN.getText();
    	   		payNow(C,T,E,N,A);
    	   	}//end of bPay event

    	   if (e.getSource()== bClear){
    	   		RstPaymentEntry();
    	   	}	

    	   if(e.getSource()== Reserve){
    	   	//	Transactions Rsrv = new Transactions();
    	   		
	    	 //  YouBooked.setText("You booked the following rooms:...\n");
	    	  Txns.Reserve_(CustomerNumber,RoomNum,RoomName,RoomCost);
	    	   
    	   }
    	   if(e.getSource()== UnReserve){
    	   	//	Transactions UnRsrv = new Transactions();
    	     //	YouBooked.setText("Opppsssss...");
               Txns.UnReserve_(CustomerNumber,RoomNum,RoomName,RoomCost);
    	   }
    	   
    	   if(e.getSource()== Rm1){
	   		RoomNum = 1;
    	   	RoomName = "Studio Room 1:";
    	   	RoomCost = 600.00;
    	   	Icon PPreview = new ImageIcon(imgLink + "Rm1.jpg");
    	   	RDetail1.setText("Room Amenities:\n* Air Condition\n* Comfortable Bed for two\n*BathRoom and sink\n* w/ Internet and Electric fan");
      	 	RRate.setText("Room Rate:\nP"+RoomCost+" for 24 Hours!");
      	 	//LStatus.setText("Vacant");
            RPreview.setIcon(PPreview);
            Reserve.setEnabled(true);
            UnReserve.setEnabled(true);
            Txns.rmStatusNotifaction(RoomNum);
            
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
            UnReserve.setEnabled(true);
			Txns.rmStatusNotifaction(RoomNum);
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
            UnReserve.setEnabled(true);
            Txns.rmStatusNotifaction(RoomNum);
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
            UnReserve.setEnabled(true);
            Txns.rmStatusNotifaction(RoomNum);
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
            UnReserve.setEnabled(true);
            Txns.rmStatusNotifaction(RoomNum);
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
            UnReserve.setEnabled(true);
            Txns.rmStatusNotifaction(RoomNum);
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
            UnReserve.setEnabled(true);
            Txns.rmStatusNotifaction(RoomNum);
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
            UnReserve.setEnabled(true);
            Txns.rmStatusNotifaction(RoomNum);
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
            UnReserve.setEnabled(true);
            Txns.rmStatusNotifaction(RoomNum);
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
            UnReserve.setEnabled(true);
            Txns.rmStatusNotifaction(RoomNum);
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
            UnReserve.setEnabled(true);
            Txns.rmStatusNotifaction(RoomNum);
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
            UnReserve.setEnabled(true);
            Txns.rmStatusNotifaction(RoomNum);
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
            UnReserve.setEnabled(true);
            Txns.rmStatusNotifaction(RoomNum);
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
            UnReserve.setEnabled(true);
            Txns.rmStatusNotifaction(RoomNum);
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
            UnReserve.setEnabled(true);
            Txns.rmStatusNotifaction(RoomNum);
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
            UnReserve.setEnabled(true);
            Txns.rmStatusNotifaction(RoomNum);
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
            UnReserve.setEnabled(true);
            Txns.rmStatusNotifaction(RoomNum);
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
            UnReserve.setEnabled(true);
            Txns.rmStatusNotifaction(RoomNum);
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
            UnReserve.setEnabled(true);
            Txns.rmStatusNotifaction(RoomNum);
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
            UnReserve.setEnabled(true);
            Txns.rmStatusNotifaction(RoomNum);
      	   }
      	   

    	   
    	}//end of Event Handler  	
      
   public static void main(String[] args) {
		HotelRoomReservation  BG = new HotelRoomReservation();
		BG.Reserve.setEnabled(false);
		BG.UnReserve.setEnabled(false);
		BG.bPay.setEnabled(false);
	    BG.LGrandTotal.setText("0.00");
		BG.bClear.setEnabled(false);
		BG.LRunningTotal.setText("0.00");
		BG.LCash.setText("0.00");
		
		BG.YouBooked.setText("W   E   L   C   O   M   E");
		String intro = "\nWe are very happy to serve you\n"+
				"Please begin booking by \n"+
					"Filling up the form and\n"+
						"pressing New Customer Button\n"+
							"After that you can then start Booking\n"+
								"Cheers...\nMINT Management\n\n"+
									"Mark Anthony Obioma: Manager\n"+
										"Darwin Delvo: Marketing\n"+
											"Chrestopher Pabalate: Owner";
		BG.Binfo.setText(intro);
		
	/*	JOptionPane.showMessageDialog(null,"W E L C O M E\n\n"+
			"We are very happy to serve you\n"+
				"Please begin booking by Pressing\n\n"+
					"New Customer Button\n\n"+
						"Cheers... MINT Management");*/
		BG.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	    }
}

