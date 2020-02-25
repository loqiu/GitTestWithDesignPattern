package ProxyPattern;
/**
 * 结合RMI让本地与代理对象沟通
 * @author loqiu
 *
 */
public class GumballMonitorTestDrive {

	public static void main(String[] args) {
		
		int count=0;
		
		GumballMachine machine = new GumballMachine("wcj", 10);
		
		GumballMonitor monitor = new GumballMonitor(machine);
		
		monitor.report();
	}
	
}
