
public interface IteratorInterface<T> {
	// Returns true if the iteration has more elements
	public boolean hasNext();

	// Returns the next element in the iteration
	// It throws NoSuchElementException if no more 
	// element present
	public Object next();

	// Remove the next element in the iteration
	// This method can be called only once per call
	// to next()
	public void remove();

}
