package IteratorPattern;

import java.util.Hashtable;
import java.util.Iterator;

public class CafeMenu {
	Hashtable<String, Object> menu = new Hashtable<>();

	public Iterator<Object> createIterator() {
		return menu.values().iterator();
	}

}
