package calculatetext;

import java.awt.Color;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Calculate extends JFrame implements ActionListener {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	JTextField textfield1 ;//��������༭�ı�����������ˮƽ���뷽ʽ
	JTextField textfield2;
	JTextField textfield3;
	JLabel labe1; //�����б������ʾ�ı�����
	JLabel labe2; 
	JLabel labe3; 
	JButton button1,button2,button3,button4;//�ĸ����Ű�ť
	
	   Calculate(){
		   setTitle("�򵥼�����");
	        setBounds(800,200,380,300);
	        setVisible(true);
	        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	     //  �����û��ڴδ����Ϸ���Ĭ�ϵ�close ִ�еĲ���
	        init();
		   
	}
	   public void init(){
		    Box box0 = Box.createHorizontalBox();//����һ�������ҵ���ʾ��������
	        Box box1 = Box.createVerticalBox();//���ϵ��µ����
	        Box box2 = Box.createVerticalBox();
	        Box box3 = Box.createVerticalBox();
	        
	        box1.add(new JLabel("������a"));//ָ��������һ��ӵ�box1
	        box1.add(Box.createVerticalStrut(8));//����һ�����ɼ��ġ��̶��߶ȵ����
	        box1.add(new JLabel("������b"));
	        box1.add(Box.createVerticalStrut(8));
	        box1.add(new JLabel("���"));
//	        box0.add(box1);
	        textfield1 = new  JTextField(10);//�����µ�ָ���������µĿ�
	        textfield2  = new JTextField(10);
	        textfield3  = new JTextField(10);
	        box2.add(textfield1);
	        box2.add(Box.createVerticalStrut(8));//����һ�����ɼ��ġ��̶��߶ȵ����
	        box2.add(textfield2);
	        box2.add(Box.createVerticalStrut(8));
	        box2.add(textfield3);
	 //       box0.add(box2);
	        Panel pane1 = new Panel();// ��������˫����������ֵ��� JPanel��
	        Panel pane2 = new Panel();
	        pane1.add(box1);
	        pane1.add(box2);
	        pane2.add(box3);
	        box0.add(pane1);
	        box0.add(pane2);
	        pane1.setBackground(Color.GREEN);//���ó��ִ��������� (L&F) ����
	        button1 = new JButton("+");
	        button2 = new JButton("-");
	        button3 = new JButton("*");
	        button4 = new JButton("/");
	        box3.add(button1);
	        box3.add(Box.createVerticalStrut(12));
	        box3.add(button2);
	        box3.add(Box.createVerticalStrut(12));
	        box3.add(button3);
	        box3.add(Box.createVerticalStrut(12));
	        box3.add(button4);
	        box0.add(box3);
	        button1.addActionListener(this);
	        button2.addActionListener(this);
	        button3.addActionListener(this);
	        button4.addActionListener(this);
	        
	        add(box0);
	   }

	   public void actionPerformed(ActionEvent e){
		   String str1=textfield1.getText();
		   String str2 = textfield2.getText();
		 //  String str3 = jfd3.getText();
		    double x1 = Double.parseDouble(str1);//�����a
	        double x2 = Double.parseDouble(str2);//�����b
	     // double x3 = Double.parseDouble(str3);
	        
	        try{
	        	String ch = e.getActionCommand();
	        	switch(ch){
   	        	case"+": 
   	        		 textfield3.setText(""+(x1+x2));
   	            break;   
   	        	case "-":
   	        		 textfield3.setText(""+(x1-x2));
   	            break;   
   	        	case"*":
   	        		 textfield3.setText(""+(x1*x2));
   	            break;   
   	        	case"/":  	        		 
   	        		 textfield3.setText(""+(x1/x2));
   	            break;   
   	     }

	   } 
	   catch(Exception ex){
           System.out.println("eee");
           }
	        
	   }
	public static void main(String[] args) {
		new Calculate();

	}

}
