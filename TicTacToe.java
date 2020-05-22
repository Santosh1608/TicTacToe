import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
public class TicTacToe
{
	int count;
	JFrame frame = new JFrame("TIC-TAC-TOE");
	ArrayList<JButton> btns;
    Color black = new Color(0, 0, 0);
    Color white = new Color(255, 255, 255);
    ArrayList<Integer> a1 = new ArrayList<Integer>();
    ArrayList<Integer> a2 = new ArrayList<Integer>();
    ArrayList<Integer> a3 = new ArrayList<Integer>();
    ArrayList<Integer> a4 = new ArrayList<Integer>();
    ArrayList<Integer> a5 = new ArrayList<Integer>();
    ArrayList<Integer> a6 = new ArrayList<Integer>();
    ArrayList<Integer> a7 = new ArrayList<Integer>();
    ArrayList<Integer> a8 = new ArrayList<Integer>();
    ArrayList<Integer> a9 = new ArrayList<Integer>();
    ArrayList<Integer> b1 = new ArrayList<Integer>();
    ArrayList<Integer> b2 = new ArrayList<Integer>();
    ArrayList<Integer> b3 = new ArrayList<Integer>();
    ArrayList<Integer> b4 = new ArrayList<Integer>();
    ArrayList<Integer> b5 = new ArrayList<Integer>();
    ArrayList<Integer> b6 = new ArrayList<Integer>();
    ArrayList<Integer> b7 = new ArrayList<Integer>();
    ArrayList<Integer> b8 = new ArrayList<Integer>();
    ArrayList<Integer> b9 = new ArrayList<Integer>();
    boolean[] checks = new boolean[9];      
	boolean flag=true;
	boolean isStart = true;
	JButton btn1 = new JButton();
	JButton btn2 = new JButton();
	JButton btn3 = new JButton();
	JButton btn4 = new JButton();
	JButton btn5 = new JButton();
	JButton btn6 = new JButton();
	JButton btn7 = new JButton();
	JButton btn8 = new JButton();
	JButton btn9 = new JButton();
	JButton restart = new JButton("RESET");
JPanel panel = new JPanel(new FlowLayout(FlowLayout.LEFT, 0, 0));	
	Dimension d = new Dimension(100,100);
	public static void main(String[] args) {
		TicTacToe game = new TicTacToe();
		game.go();
	}
	public void go()
	{
		btns = new ArrayList<JButton>(Arrays.asList(btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9));
           for(JButton btn:btns)
           {
           	btn.setPreferredSize(d);
           	btn.setBackground(new Color(240,220,255));
           }
           restart.setBackground(Color.black);
           restart.setForeground(Color.white);

        restart.addActionListener(new ActionListener(){
        	public void actionPerformed(ActionEvent ex)
        	{
              if(!isStart||count==9)
              {
       	         for(int i=0;i<9;i++)
       	         {
       		      checks[i]=false;
       		      btns.get(i).setBackground(new Color(240,220,255));
       	         }
       	        isStart=true;
       	        count=0;
       	        a1.clear();
       	        a2.clear();
       	        a3.clear();
       	        a4.clear();
       	        a5.clear();
       	        a6.clear();
       	        a7.clear();
       	        a8.clear();
       	        b8.clear();
       	        b1.clear();
       	        b2.clear();
       	        b3.clear();
       	        b4.clear();
       	        b5.clear();
       	        b6.clear();
       	        b7.clear();
              }
        	}
        });
        btn1.addActionListener(new ActionListener(){
             public void actionPerformed(ActionEvent e)
             {
             	if(isStart&&!checks[0])
             	{
                if(flag)
             	{
                   btn1.setBackground(white);
                   a1.add(1);
                   a4.add(1);
                   a8.add(1);
             	}
             	else
             	{
             		btn1.setBackground(black);
             		b1.add(1);
             		b4.add(1);
             		b8.add(1);
             	}
             	flag=!flag;
             	checks[0]=true;
             	check();
             	}
             	
             }  
        });
        btn2.addActionListener(new ActionListener(){
             public void actionPerformed(ActionEvent e)
             {
             	if(isStart&&!checks[1])
             	{
                 if(flag)
             	{
                   btn2.setBackground(white);
                   a1.add(1);
                   a5.add(1);
             	}
             	else
             	{
             		btn2.setBackground(black);
             		b1.add(1);
             		b5.add(1);
             	}
             	flag=!flag;
             	checks[1]=true;
             	check();
             	}
               
             }  
        });
        btn3.addActionListener(new ActionListener(){
             public void actionPerformed(ActionEvent e)
             {
             	if(isStart&&!checks[2])
             	{
                 if(flag)
             	{
                   btn3.setBackground(white);
                   a1.add(1);
                   a6.add(1);
                   a7.add(1);
             	}
             	else
             	{
             		btn3.setBackground(black);
             		b1.add(1);
                    b6.add(1);
                    b7.add(1);
             	}
             	flag=!flag; 
             	checks[2]=true;            	
                check();
             	}
           
             }  
        });
        btn4.addActionListener(new ActionListener(){
             public void actionPerformed(ActionEvent e)
             {
             	if(isStart&&!checks[3])
             	{
                if(flag)
             	{
                   btn4.setBackground(white);
                    a2.add(1);
                    a4.add(1);
             	}
             	else
             	{
             		btn4.setBackground(black);
                    b2.add(1);
                    b4.add(1);
             	}
             	flag=!flag;
             	checks[3]=true;
             	check();
             	}
             
             }  
        });
        btn5.addActionListener(new ActionListener(){
             public void actionPerformed(ActionEvent e)
             {
             	if(isStart&&!checks[4])
             	{
                if(flag)
             	{
                   btn5.setBackground(white);
                   a2.add(1);
                   a5.add(1);
                   a7.add(1);
                   a8.add(1);
             	}
             	else
             	{
             		btn5.setBackground(black);
             	    b2.add(1);
                    b5.add(1);
                    b7.add(1);
                    b8.add(1);
             	}
             	flag=!flag;
             	checks[4]=true;
             	check();
             	}
              
             }  
        });
        btn6.addActionListener(new ActionListener(){
             public void actionPerformed(ActionEvent e)
             {
             	if(isStart&&!checks[5])
             	{
                if(flag)
             	{
                   btn6.setBackground(white);
                   a2.add(1);
                   a6.add(1);
             	}
             	else
             	{
             		btn6.setBackground(black);
             		b2.add(1);
                    b6.add(1);
             	}
             	flag=!flag;
             	checks[5]=true;
             	check();
             	}
              
             }  
        });
        btn7.addActionListener(new ActionListener(){
             public void actionPerformed(ActionEvent e)
             {
             	if(isStart&&!checks[6])
             	{
                if(flag)
             	{
                   btn7.setBackground(white);
                   a3.add(1);
                   a4.add(1);
                   a7.add(1);
             	}
             	else
             	{
             		btn7.setBackground(black);
             	   b3.add(1);
                   b4.add(1);
                   b7.add(1);
             	}
             	flag=!flag;
             	checks[6]=true;
             	check(); 
             	}

                          
             }
          });
        btn8.addActionListener(new ActionListener(){
             public void actionPerformed(ActionEvent e)
             {
             	if(isStart&&!checks[7])
             	{
                if(flag)
             	{
                   btn8.setBackground(white);
                   a3.add(1);
                   a5.add(1);
             	}
             	else
             	{
             		btn8.setBackground(black);
             		b3.add(1);
             		b5.add(1);
             	}
             	flag=!flag;
             	checks[7]=true;
             	check();
             	}
              
             }  
        });
        btn9.addActionListener(new ActionListener(){
             public void actionPerformed(ActionEvent e)
             {
             	if(isStart&&!checks[8])
             	{
                if(flag)
             	{
                   btn9.setBackground(white);
                   a3.add(1);
                   a6.add(1);
                   a8.add(1);
             	}
             	else
             	{
             		btn9.setBackground(black);
             	   b3.add(1);
                   b6.add(1);
                   b8.add(1);
             	}
             	flag=!flag;
             	checks[8]=true;
             	check();
             	}
            
             }          	
        });
    

		for(JButton btn:btns)
			panel.add(btn);
		frame.getContentPane().add(panel);
		frame.getContentPane().add(BorderLayout.SOUTH,restart);
		    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		frame.setSize(300,360);
		frame.setVisible(true);
		frame.setResizable(false);

		
	}
	public void check()
	{
	   count++;
       if(a1.size()==3||a2.size()==3||a3.size()==3||a4.size()==3||a5.size()==3||a6.size()==3||a7.size()==3||a8.size()==3)
       {
       	 for(JButton btn:btns)
       	 	btn.setBackground(white);
       	 isStart=false;
       }
       else if(b1.size()==3||b2.size()==3||b3.size()==3||b4.size()==3||b5.size()==3||b6.size()==3||b7.size()==3||b8.size()==3)
       {
       	 for(JButton btn:btns)
       	 	btn.setBackground(black);
       	 isStart=false;
       }
       if(count==9)
       	isStart=false;
	}

}