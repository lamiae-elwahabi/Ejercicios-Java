package org.foobarspam.Wrapper;
 //T could be String, Integer,Double,etc
public class Wrapper<T> {
	//Propiedades
	private T obj;
	//Constructor
	public Wrapper(T obj) {
		this.obj = obj;
	}
	//Getters y Setters
	public T getObj() {
		return obj;
	}
	public void setObj(T obj) {
		this.obj = obj;
	}
	
}
