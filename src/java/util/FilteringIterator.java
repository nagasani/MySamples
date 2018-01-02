package java.util;

public class FilteringIterator implements IObjectTest {
	 //Iterator and an IObjectTest instance: new FilteringIterator(myIterator, myTest).

	Iterator<String> it;
	IObjectTest io;
	
	public FilteringIterator(Iterator<String> it, IObjectTest io) {
		super();
		this.it = it;
		this.io = io;
	}
	
	
	
	@Override
	public boolean contains(Object paramObject) {
		// TODO Auto-generated method stub
		return false;
	}

}
