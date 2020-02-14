package ObserverPattern;
/**
 * 观察者模式：定义了对象之间的一对多的依赖，这样一来，当一个对象改变状态时，它的所有依赖者都会收到通知并自动更新。
 * 设计原则：为了交互对象之间的松耦合设计而努力。
 */
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class SwingObserverExample {
	
	JFrame frame;
	
	public static void main(String[] args) {
		SwingObserverExample ex = new SwingObserverExample();
		ex.go();
	}
	/**
	 * 注册监听类也是观察者模式的一种
	 */
	public void go() {
		frame = new JFrame();
		
		JButton button = new JButton("should i do it ?");
		button.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				System.out.println("just do it");
			}
		});
		button.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				System.out.println("don't do it");
			}
		});
		frame.getContentPane().add(BorderLayout.CENTER,button);
		frame.setSize(400,400);
		frame.setVisible(true);
	}
	
}
