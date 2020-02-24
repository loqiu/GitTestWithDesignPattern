package IteratorPattern;
/**
 * 封装内部实现，不需要知道使用哪种集合实现的
 * 给不同集合一个共同的指针接口
 * @author loqiu
 *
 */
public interface Iterator {
	
	boolean hasNext();
	Object next();
	
}
