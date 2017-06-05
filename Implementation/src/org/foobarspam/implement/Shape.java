package org.foobarspam.implement;

public abstract class Shape implements Cloneable {
	
	//Propiedades
	private String id;
	protected String type;
	//Metodos
	abstract void draw();
	//Getters y Setters
	public String getType(){
		return type;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	//Metodo
	public Object clone() {
		Object clone = null;
		try {
			clone = super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
			return clone;
		}
	}


