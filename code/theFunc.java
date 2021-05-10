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
		//先创建一个窗口，不过此时创建的是隐藏的。
		JFrame jf=new JFrame();
		jf.setIconImage(Toolkit.getDefaultToolkit().getImage("E://myJar/images/service.png"));
		//再设置窗口大小，单位是像素。
		jf.setSize(800,600);
		//再窗口的标题
		jf.setTitle("下一天程序");
		//设置图标
		Toolkit  t=Toolkit.getDefaultToolkit();
		//Image image=t.getImage("image\\a.jpg");
		//jf.setIconImage(image);
		//设置窗口居中
		jf.setLocationRelativeTo(null);
		//设置窗口的关闭
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//存放组件,标签组件
		JLabel jl=new JLabel();
		jl.setText("年");
		jl.setForeground(Color.black);
		jl.setFont(new Font("华文行楷",Font.BOLD,30));
		jl.setSize(100, 30);
		jl.setLocation(160, 50);//标签的存在位置
		//把标签jl设置在窗口上面
		//一个窗口的面板分为三层   根面板和中间面板 以及内容面板，  组件全部放在内容面板上面
		// 获取到内容面板
		Container con=jf.getContentPane();
		//内容面板的默认布局是麻将布局  东西南北 中  在添加组件的时候如果没有指定放在那里则会放在中间并且把窗口沾满，
		// 重新设置布局
		con.setLayout(null);
		con.add(jl);
		con.setBackground(Color.WHITE);//设置窗口颜色
		//设置背景图片
		Toolkit t1=Toolkit.getDefaultToolkit();
		Image image1=t1.getImage("E://myJar/images/beauty.jpg");
		Icon  ic=new  ImageIcon(image1);
		JLabel jl3=new JLabel(ic);
		jl3.setSize(800, 600);
		jl3.setLocation(0, 0);
		con.add(jl3);
		//再创造一个密码标签
		JLabel jl1=new JLabel();
		jl1.setText("月");
		jl1.setForeground(Color.black);
		jl1.setFont(new Font("华文行楷",Font.BOLD,30));
		jl1.setSize(100, 30);
		jl1.setLocation(160, 130);
		jl3.add(jl1);
		//创建文本框
		
		JLabel jl4=new JLabel();
		jl4.setText("下一天日期");
		jl4.setForeground(Color.black);
		jl4.setFont(new Font("华文行楷",Font.BOLD,20));
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
		//创建验证码标签
		JLabel jl2=new JLabel();
		jl2.setText("日");
		jl2.setForeground(Color.black);
		jl2.setFont(new Font("华文行楷",Font.BOLD,30));
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
		huoqu.setText("获取验证码");
		huoqu.setSize(100, 30);
		huoqu.setLocation(490, 200);
		huoqu.setForeground(Color.GRAY);
		jl3.add(huoqu);
		*/
		//设置按获取验证码按钮可获得验证码
		
		JButton ok=new JButton();
		ok.setSize(160, 60);
		ok.setLocation(120, 400);
		ok.setText("计算下一天");
		ok.setFont(new Font("华文行楷",Font.PLAIN,25));
		ok.setForeground(Color.BLUE);
		jl3.add(ok);
		JButton cancel=new JButton();
		cancel.setSize(160, 60);
		cancel.setLocation(520, 400);
		cancel.setText("重新输入");
		cancel.setFont(new Font("华文行楷",Font.PLAIN,25));
		cancel.setForeground(Color.red);
		jl3.add(cancel);
		
		//设置窗口显示出来
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
        //注意：此处是匿名内部类
        ok.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
                // TODO Auto-generated method stub
                String syear = year.getText();
                String smonth = month.getText();
                String sday = day.getText();
                if(syear.length()>4||smonth.length()>2||sday.length()>2||smonth.equals("0")||sday.equals("0")) {
                	result.setText("错误——无效输入！");
                	return ;
                }
                String sdate = syear+"-"+smonth+"-"+sday;
                
                SimpleDateFormat sformat = new SimpleDateFormat("yyyy-MM-dd");
             	//解析日期
                Date date = null;
				try {
					date = sformat.parse(sdate);
				} catch (ParseException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
                Calendar c = Calendar.getInstance();
                c.setTime(date);
                //用Calendar工具类给日期加一天
                c.add(Calendar.DATE, 1);
                result.setText(sformat.format(c.getTime()));;
            }
        }
        );
	}
}