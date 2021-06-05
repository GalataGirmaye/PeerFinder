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
}
