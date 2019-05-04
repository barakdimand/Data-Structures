/**
 * 
 */
package lists;

/**
 * @author eitanohana
 *
 */
public interface ListInterface<T> {
	
	public void add(T t);
	
	public void add(int index, T element);
	
	public void clear();
	
	public boolean contains(T element);
	
	public T get(int index);
	
	public int indexOf(T element);
	
	public int isEmpty();
	
	public T remove(int index);
	
	public boolean remove(T element);
	
	public int size();
	
}
