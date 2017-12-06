import java.util.Iterator;

public class Iterators<T> implements Iterator<T>{
	private Iterator<T> head;
	private Iterator<Iterator<T>> link; //initialize
	
	LinkedList<Integer> list = new LinkedList<Integer>();
	LinkedStack<Integer> stack = new LinkedStack<Integer>();
	LinkedQueue<Integer> queue = new LinkedQueue<Integer>();
	
	public Iterators(Iterable<Iterator<T>> iterators) {
		this.link = iterators.iterator();
	}

	@Override
	public boolean hasNext() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public T next() {
		// TODO Auto-generated method stub
		return null;
	}

}
