
public class Iterator<T> implements IteratorInterface<T> {
	private final Iterator<Iterator<T>> link;
    private Iterator<T> current;
    private Iterator<T> last;
    
    public Iterator(Iterable<Iterator<T>> iterable)  {
        this(iterable.iterator());
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
		while(current != null)
		{
			current = last;			
		}
		return current.next();
	}

	@Override
	public void remove() {
		Iterator<T> temp = current;
		while(temp.next() != null)
		{
				temp = null;
				temp = current.next();
		}
	}

}
