package com.custome;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Spliterator;
import java.util.function.Consumer;
import java.util.function.IntFunction;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;
import java.util.stream.Stream;

public class CustomeArrayListOperation {

	public static void main(String[] args) {
		
		CustomeArrayList<Integer> list = new CustomeArrayList();
		list.add(12);
		list.add(10);
		System.out.println(list);
		Integer integer = list.get(0);
		System.out.println(integer);
		CustomeArrayList<String> list1 = new CustomeArrayList();
		
		//System.out.println(list1);

	}

}

class CustomeArrayList<T> extends ArrayList<T>{

	protected T element;
	
	
	@Override
	public <T> T[] toArray(IntFunction<T[]> generator) {
		// TODO Auto-generated method stub
		return super.toArray(generator);
	}

	@Override
	public Stream<T> stream() {
		// TODO Auto-generated method stub
		return super.stream();
	}

	@Override
	public Stream<T> parallelStream() {
		// TODO Auto-generated method stub
		return super.parallelStream();
	}

	@Override
	public void trimToSize() {
		// TODO Auto-generated method stub
		super.trimToSize();
	}

	@Override
	public void ensureCapacity(int minCapacity) {
		// TODO Auto-generated method stub
		super.ensureCapacity(minCapacity);
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return super.size();
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return super.isEmpty();
	}

	@Override
	public boolean contains(Object o) {
		// TODO Auto-generated method stub
		return super.contains(o);
	}

	@Override
	public int indexOf(Object o) {
		// TODO Auto-generated method stub
		return super.indexOf(o);
	}

	@Override
	public int lastIndexOf(Object o) {
		// TODO Auto-generated method stub
		return super.lastIndexOf(o);
	}

	@Override
	public Object clone() {
		// TODO Auto-generated method stub
		return super.clone();
	}

	@Override
	public Object[] toArray() {
		// TODO Auto-generated method stub
		return super.toArray();
	}

	@Override
	public <T> T[] toArray(T[] a) {
		// TODO Auto-generated method stub
		return super.toArray(a);
	}

	@Override
	public T get(int index) {
		// TODO Auto-generated method stub
		return super.get(index);
	}

	@Override
	public T set(int index, T element) {
		// TODO Auto-generated method stub
		return super.set(index, element);
	}

	@Override
	public boolean add(T e) {
		// TODO Auto-generated method stub
		return super.add(e);
	}

	@Override
	public void add(int index, T element) {
		// TODO Auto-generated method stub
		super.add(index, element);
	}

	@Override
	public T remove(int index) {
		// TODO Auto-generated method stub
		return super.remove(index);
	}

	@Override
	public boolean equals(Object o) {
		// TODO Auto-generated method stub
		return super.equals(o);
	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return super.hashCode();
	}

	@Override
	public boolean remove(Object o) {
		// TODO Auto-generated method stub
		return super.remove(o);
	}

	@Override
	public void clear() {
		// TODO Auto-generated method stub
		super.clear();
	}

	@Override
	public boolean addAll(Collection<? extends T> c) {
		// TODO Auto-generated method stub
		return super.addAll(c);
	}

	@Override
	public boolean addAll(int index, Collection<? extends T> c) {
		// TODO Auto-generated method stub
		return super.addAll(index, c);
	}

	@Override
	protected void removeRange(int fromIndex, int toIndex) {
		// TODO Auto-generated method stub
		super.removeRange(fromIndex, toIndex);
	}

	@Override
	public boolean removeAll(Collection<?> c) {
		// TODO Auto-generated method stub
		return super.removeAll(c);
	}

	@Override
	public boolean retainAll(Collection<?> c) {
		// TODO Auto-generated method stub
		return super.retainAll(c);
	}

	@Override
	public ListIterator<T> listIterator(int index) {
		// TODO Auto-generated method stub
		return super.listIterator(index);
	}

	@Override
	public ListIterator<T> listIterator() {
		// TODO Auto-generated method stub
		return super.listIterator();
	}

	@Override
	public Iterator<T> iterator() {
		// TODO Auto-generated method stub
		return super.iterator();
	}

	@Override
	public List<T> subList(int fromIndex, int toIndex) {
		// TODO Auto-generated method stub
		return super.subList(fromIndex, toIndex);
	}

	@Override
	public void forEach(Consumer<? super T> action) {
		// TODO Auto-generated method stub
		super.forEach(action);
	}

	@Override
	public Spliterator<T> spliterator() {
		// TODO Auto-generated method stub
		return super.spliterator();
	}

	@Override
	public boolean removeIf(Predicate<? super T> filter) {
		// TODO Auto-generated method stub
		return super.removeIf(filter);
	}

	@Override
	public void replaceAll(UnaryOperator<T> operator) {
		// TODO Auto-generated method stub
		super.replaceAll(operator);
	}

	@Override
	public void sort(Comparator<? super T> c) {
		// TODO Auto-generated method stub
		super.sort(c);
	}

	@Override
	public boolean containsAll(Collection<?> c) {
		// TODO Auto-generated method stub
		return super.containsAll(c);
	}



}
