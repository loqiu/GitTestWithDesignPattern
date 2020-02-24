package AdapterPattern.SimpleAdapter;
/**
 * 枚举的适配器迭代器
 */
import java.util.Enumeration;
import java.util.Iterator;

public class EnumerationIterator implements Iterator<Object> {

	Enumeration<Object> enumer;

	public EnumerationIterator(Enumeration<Object> enumer) {
		// TODO Auto-generated constructor stub
		this.enumer = enumer;
	}

	@Override
	public boolean hasNext() {
		// TODO Auto-generated method stub
		return enumer.hasMoreElements();
	}

	@Override
	public Object next() {
		// TODO Auto-generated method stub
		return enumer.nextElement();
	}

	public void remove() {
		throw new UnsupportedOperationException();
	}

}
