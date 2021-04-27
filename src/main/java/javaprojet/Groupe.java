/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaprojet;

/**
 *
 * @author ABIBOU GUEYE
 */
public class Groupe {
	private int id;
	private String nomGroup;
	private String dateCrea;
	private String moduleGroup;

	public Groupe(){

	}
	public Groupe(int id,String nomGroup, String dateCrea, String moduleGroup){
	this.id=id;
	this.nomGroup=nomGroup;
	this.dateCrea=dateCrea;
	this.moduleGroup=moduleGroup;
	}
	public Groupe( int id,String nomGroup, String dateCrea){
	this.id=id;	
	this.nomGroup=nomGroup;
	this.dateCrea=dateCrea;
	}
	 public int getId() {
	        return id;
	    }
	 public String getNomGroup() {
	        return nomGroup;
	    }
	

	    public String getDateCrea() {
	        return dateCrea;
	    }

	    public String getModuleGroup() {
	        return moduleGroup;
	    }
	    public void setId(int id ) {
	        this.id= id;
	    }
	    
	  public void setNomGroup(String nomGroup ) {
	        this.nomGroup= nomGroup;
	    }
	  public void setDateCrea(String dateCrea ) {
	        this.dateCrea= dateCrea;
	}
	public void setModuleGroup(String moduleGroup) {
	        this.moduleGroup= moduleGroup;
	}
	public String toString(){
	  return"Groupe {" +"id = " +id+ "\n nomGroup = " +nomGroup+ "\n dateCrea= " +dateCrea+ "\n moduleGroup= " +moduleGroup+  "}"; 
	}
}

