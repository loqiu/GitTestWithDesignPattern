package ProxyPattern.RMIproxy;

import java.rmi.Naming;

/**
 * 客户端取得stub类 进行解序列化
 * @author loqiu
 *
 */
public class MyRemoteClient {

	public static void main(String[] args) {
		
	}
	
	public void go() {
		try {
			MyRemote service = (MyRemote)Naming.lookup("rmi://127.0.0.1/Remotehello");
			String s = service.sayHello();
			System.out.println(s);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	
}
