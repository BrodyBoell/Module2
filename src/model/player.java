
/**
 * @author brody - bjboell
 * CIS175 - Fall 2023
 * Sep 6, 2023
 */
package model;

public class player {
	private String name;
	private int level;
	private String classes;
	
	public player() {
		
	}
	public player(String name, int level, String classes) {
		this.setName(name);
		this.setLevel(level);
		this.setClasses(classes);
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	public int getLevel() {
		return level;
	}
	public void setLevel(int level) {
		this.level = level;
	}
	public String getClasses() {
		return classes;
	}
	public void setClasses(String classes) {
		this.classes = classes;
	}
	public boolean isMax() {
        return level == 80;
    }
}
