/*
 * This class holds information about one's application for 
 * peer finding form. 
 * 
 * */

package mainPkg;

import personFactory.Person;

public class Application {

	private boolean status;     // true indicates that peer is found.
	private String requestLocation;
	private Person foundPeer;
	
	public Application(boolean  status,String request,Person peer) {
		
		this.status = status;
		this.requestLocation = request;
		this.foundPeer = peer;
	}
	
	
	public String getReqLocation() {
		return requestLocation;
	}
	public boolean getStatus() {
		return status;
	}
	public Person getPeer() {
		return foundPeer;
	}
	
	//Setters
	public void setReqLocation(String location) {
		this.requestLocation = location;
		
	}
	public void setStatus(boolean status) {
		this.status=status;
	}
	public void setPeer(Person peer) {
		this.foundPeer=peer;
	}
}
