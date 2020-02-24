package CompositePattern;

import java.util.Iterator;
import java.util.Stack;

public class CompositeIterator implements Iterator<MenuComponent> {
	
	Stack<Iterator> stack = new Stack<>();
	
	public CompositeIterator(Iterator iterator) {
		// TODO Auto-generated constructor stub
		stack.push(iterator);
	}
	
	@Override
	public boolean hasNext() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public MenuComponent next() {
		// TODO Auto-generated method stub
		return null;
	}

}
