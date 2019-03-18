package com.cs.demo.hib;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity/*(name="alien_table")*/
@Table(name="alien_table")
public class Alien {
	@Id
	private int id;
	/*@Transient*/
	private AlienName aname;
	@Column(name="alien_color")
	private String color;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public AlienName getAname() {
		return aname;
	}
	public void setAname(AlienName aname) {
		this.aname = aname;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	@Override
	public String toString() {
		return "Alien [id=" + id + ", aname=" + aname + ", color=" + color + "]";
	}
	
}
