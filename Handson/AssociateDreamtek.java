package Handson;
import java.util.*;

public class AssociateDreamtek {
	private int associateId;
	private String associateName;
	private String workStatus;
	
	public AssociateDreamtek() {
	}
	
	
	public int getAssociateId() {
		return associateId;
	}


	public void setAssociateId(int associateId) {
		this.associateId = associateId;
	}


	public String getAssociateName() {
		return associateName;
	}


	public void setAssociateName(String associateName) {
		this.associateName = associateName;
	}


	public String getWorkStatus() {
		return workStatus;
	}


	public void setWorkStatus(String workStatus) {
		this.workStatus=workStatus;
	}
	
	public void trackAssociateStatus(int days) {
		if(days<=20&&days>=1)   setWorkStatus("Core skills");
		else if(days>20&&days<=40) setWorkStatus("Advanced modules");
		else if(days>40&&days<=60) setWorkStatus("Project phase");
		else  setWorkStatus("invlaid");
	}
	public static void main(String[] args) {
		Scanner sc =  new Scanner(System.in);
		AssociateDreamtek a=new AssociateDreamtek();
		a.setAssociateId(sc.nextInt());
		sc.nextLine();
		a.setAssociateName(sc.nextLine());
		a.trackAssociateStatus(sc.nextInt());
		System.out.println(a.getWorkStatus());
	}

}
