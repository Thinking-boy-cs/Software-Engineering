import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.TextField;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
public class theFunc extends JFrame{
	static JTextField  result=new JTextField();
	public static void main(String[] args) {
		//�ȴ���һ�����ڣ�������ʱ�����������صġ�
		JFrame jf=new JFrame();
		jf.setIconImage(Toolkit.getDefaultToolkit().getImage("E://myJar/images/service.png"));
		//�����ô��ڴ�С����λ�����ء�
		jf.setSize(800,600);
		//�ٴ��ڵı���
		jf.setTitle("��һ�����");
		//����ͼ��
		Toolkit  t=Toolkit.getDefaultToolkit();
		//Image image=t.getImage("image\\a.jpg");
		//jf.setIconImage(image);
		//���ô��ھ���
		jf.setLocationRelativeTo(null);
		//���ô��ڵĹر�
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//������,��ǩ���
		JLabel jl=new JLabel();
		jl.setText("��");
		jl.setForeground(Color.black);
		jl.setFont(new Font("�����п�",Font.BOLD,30));
		jl.setSize(100, 30);
		jl.setLocation(160, 50);//��ǩ�Ĵ���λ��
		//�ѱ�ǩjl�����ڴ�������
		//һ�����ڵ�����Ϊ����   �������м���� �Լ�������壬  ���ȫ�����������������
		// ��ȡ���������
		Container con=jf.getContentPane();
		//��������Ĭ�ϲ������齫����  �����ϱ� ��  ����������ʱ�����û��ָ�����������������м䲢�ҰѴ���մ����
		// �������ò���
		con.setLayout(null);
		con.add(jl);
		con.setBackground(Color.WHITE);//���ô�����ɫ
		//���ñ���ͼƬ
		Toolkit t1=Toolkit.getDefaultToolkit();
		Image image1=t1.getImage("E://myJar/images/beauty.jpg");
		Icon  ic=new  ImageIcon(image1);
		JLabel jl3=new JLabel(ic);
		jl3.setSize(800, 600);
		jl3.setLocation(0, 0);
		con.add(jl3);
		//�ٴ���һ�������ǩ
		JLabel jl1=new JLabel();
		jl1.setText("��");
		jl1.setForeground(Color.black);
		jl1.setFont(new Font("�����п�",Font.BOLD,30));
		jl1.setSize(100, 30);
		jl1.setLocation(160, 130);
		jl3.add(jl1);
		//�����ı���
		
		JLabel jl4=new JLabel();
		jl4.setText("��һ������");
		jl4.setForeground(Color.black);
		jl4.setFont(new Font("�����п�",Font.BOLD,20));
		jl4.setSize(100, 30);
		jl4.setLocation(160, 300);
		jl3.add(jl4);
		
		
		result.setSize(300, 100);
		result.setLocation(250, 270);
		jl3.add(result);
		JTextField  year=new JTextField();
		year.setSize(235, 30);
		year.setLocation(250, 50);
		jl3.add(year);
		//JPasswordField  password=new JPasswordField();
		JTextField month = new JTextField();
		month.setSize(235, 30);
		month.setLocation(250, 130);
		jl3.add(month);
		//������֤���ǩ
		JLabel jl2=new JLabel();
		jl2.setText("��");
		jl2.setForeground(Color.black);
		jl2.setFont(new Font("�����п�",Font.BOLD,30));
		jl2.setSize(100,30);
		jl2.setLocation(160, 200);
		jl3.add(jl2);
		JTextField  day=new JTextField();
		day.setSize(235, 30);
		day.setLocation(250, 200);
		jl3.add(day);
		/*
		JTextField  yzm2=new JTextField();
		yzm2.setSize(100, 30);
		yzm2.setLocation(380, 200);
		jl3.add(yzm2);
		JButton huoqu=new JButton();
		huoqu.setText("��ȡ��֤��");
		huoqu.setSize(100, 30);
		huoqu.setLocation(490, 200);
		huoqu.setForeground(Color.GRAY);
		jl3.add(huoqu);
		*/
		//���ð���ȡ��֤�밴ť�ɻ����֤��
		
		JButton ok=new JButton();
		ok.setSize(160, 60);
		ok.setLocation(120, 400);
		ok.setText("������һ��");
		ok.setFont(new Font("�����п�",Font.PLAIN,25));
		ok.setForeground(Color.BLUE);
		jl3.add(ok);
		JButton cancel=new JButton();
		cancel.setSize(160, 60);
		cancel.setLocation(520, 400);
		cancel.setText("��������");
		cancel.setFont(new Font("�����п�",Font.PLAIN,25));
		cancel.setForeground(Color.red);
		jl3.add(cancel);
		
		//���ô�����ʾ����
		jf.setVisible(true);
	
		
		cancel.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
                // TODO Auto-generated method stub
                //System.exit(0);
            	year.setText("");
            	month.setText("");
            	day.setText("");
            	result.setText("");
            }
        }
        );
        //ע�⣺�˴��������ڲ���
        ok.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
                // TODO Auto-generated method stub
                String syear = year.getText();
                String smonth = month.getText();
                String sday = day.getText();
                if(syear.length()>4||smonth.length()>2||sday.length()>2||smonth.equals("0")||sday.equals("0")) {
                	result.setText("���󡪡���Ч���룡");
                	return ;
                }
                String sdate = syear+"-"+smonth+"-"+sday;
                
                SimpleDateFormat sformat = new SimpleDateFormat("yyyy-MM-dd");
             	//��������
                Date date = null;
				try {
					date = sformat.parse(sdate);
				} catch (ParseException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
                Calendar c = Calendar.getInstance();
                c.setTime(date);
                //��Calendar����������ڼ�һ��
                c.add(Calendar.DATE, 1);
                result.setText(sformat.format(c.getTime()));;
            }
        }
        );
	}
}