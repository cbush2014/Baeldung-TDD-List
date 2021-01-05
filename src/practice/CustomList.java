package practice;


import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class CustomList<E> implements List<E> {
    private Object[] internal = {};
//  https://www.baeldung.com/java-test-driven-list 
//3   TDD Cycles
//Developing our implementation with TDD means that we need to create test cases first, thereby defining requirements for our implementation. Only then we'll create or fix the implementation code to make those tests pass.
//In a very simplified manner, the three main steps in each cycle are:
//1 Writing tests – define requirements in the form of tests
//2 Implementing features – make the tests pass without focusing too much on the elegance of the code
//3 Refactoring – improve the code to make it easier to read and maintain while still passing the tests

// 4 The isEmpty Method 
    // empty implementation methods

@Override
public boolean isEmpty() {		
	 return internal.length == 0;
}

//Let's write the first test case which makes sure that the isEmpty method returns true when the list doesn't contain any element:


@Override
public int size() {
//    if (isEmpty()) {
//        return 0;
//    } else {
//        return internal.length;
//    }
	return internal.length;
}

@Override
public boolean contains(Object o) {
	// TODO Auto-generated method stub
	return false;
}

@Override
public Iterator<E> iterator() {
	// TODO Auto-generated method stub
	return null;
}

@Override
public Object[] toArray() {
	// TODO Auto-generated method stub
	return null;
}

@Override
public <T> T[] toArray(T[] a) {
	// TODO Auto-generated method stub
	return null;
}

@Override
public boolean add(E element) {
    Object[] temp = Arrays.copyOf(internal, internal.length + 1);
    temp[internal.length] = element;
    internal = temp;
    return true;	
}

@Override
public boolean remove(Object o) {
	// TODO Auto-generated method stub
	return false;
}

@Override
public boolean containsAll(Collection<?> c) {
	// TODO Auto-generated method stub
	return false;
}

@Override
public boolean addAll(Collection<? extends E> c) {
	// TODO Auto-generated method stub
	return false;
}

@Override
public boolean addAll(int index, Collection<? extends E> c) {
	// TODO Auto-generated method stub
	return false;
}

@Override
public boolean removeAll(Collection<?> c) {
	// TODO Auto-generated method stub
	return false;
}

@Override
public boolean retainAll(Collection<?> c) {
	// TODO Auto-generated method stub
	return false;
}

@Override
public void clear() {
	// TODO Auto-generated method stub
	
}

@SuppressWarnings("unchecked")
@Override
public E get(int index) {
	return (E) internal[index];
}

@Override
public E set(int index, E element) {
	// TODO Auto-generated method stub
	return null;
}

@Override
public void add(int index, E element) {
	// TODO Auto-generated method stub
	
}

@Override
public E remove(int index) {
	// TODO Auto-generated method stub
	return null;
}

@Override
public int indexOf(Object o) {
	// TODO Auto-generated method stub
	return 0;
}

@Override
public int lastIndexOf(Object o) {
	// TODO Auto-generated method stub
	return 0;
}

@Override
public ListIterator<E> listIterator() {
	// TODO Auto-generated method stub
	return null;
}

@Override
public ListIterator<E> listIterator(int index) {
	// TODO Auto-generated method stub
	return null;
}

@Override
public List<E> subList(int fromIndex, int toIndex) {
	// TODO Auto-generated method stub
	return null;
}


}
 