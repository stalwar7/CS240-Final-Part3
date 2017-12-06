import java.util.*;

public class Iterator<T> implements IteratorInterface<T> {
	private final Iterator<Iterator<T>> link;
    private Iterator<T> current;
    private Iterator<T> last;
    
    public Iterator(Iterable<Iterator<T>> iterable)  {
        this((Iterator<Iterator<T>>) iterable.iterator());
    }
    public Iterator(Iterator<Iterator<T>> iterator)  {
        this.link = iterator;
    }
	@Override
	public boolean hasNext() {
		 while (current == null || !current.hasNext()) {
	            if (!link.hasNext()) 
	            	return false;
	            current = link.next();
	        }
	        return true;
	}

	@Override
	public T next() {
		if (!this.hasNext()) {
            this.last = null;         // to disallow remove()
            throw new NoSuchElementException();
        }
        this.last = current;  // to support remove()
        return current.next();
	}

	@Override
	public void remove() {
		if (this.last == null) {
            throw new IllegalStateException();
        }
        this.last.remove();
	}

}
