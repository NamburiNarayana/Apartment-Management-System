package House_Estate_management_system;
public class holder_details {
public static final String hello="@myappartment.email";
private String name;
private String flatno;
private String contactno;
public boolean maintanance;
public boolean swimming;
public boolean gym;
public boolean club;
public boolean singlebedroom;
public boolean doublebedroom;
public boolean triplebedroom;
public boolean backuppower;
public int amount;
public boolean x;
public  holder_details() {
	name="";
	flatno="";
	contactno="";
	maintanance=false;
	swimming=false;
	gym=false;
	club=false;
	singlebedroom=false;
	doublebedroom=false;
	triplebedroom=false;
	backuppower=false;
	amount=0;
	x=true;
}
public  holder_details(String name,String flatno,String contactno,boolean maintanance,boolean swimming,boolean gym,boolean club,boolean singlebedroom,boolean doublebedroom,boolean triplebedroom,boolean backuppower) {
	this.name=name;
	this.flatno=flatno;
	this.contactno=contactno;
	this.maintanance=maintanance;
	this.swimming=swimming;
	this.gym=gym;
	this.club=club;
	this.singlebedroom=singlebedroom;
	this.doublebedroom=doublebedroom;
	this.triplebedroom=triplebedroom;
	this.backuppower=backuppower;
	amount=0;
	x=true;
}
public String getname(){
	return name;
}
public String getflatno(){
	return flatno;
}
public String getcontactno(){
	return contactno;
}

public void setName(String name) {
	this.name=name;
}
public void setFlatno(String flatno) {
	this.flatno=flatno;
}
public void setContactno(String contactno) {
	this.contactno=contactno;
}
@Override
public String toString() {
	if(name.length()>8) {
	return name+"\t"+flatno+"\t"+contactno+"\t"+amount+"\t"+flatno+hello;
	}
	else if(name.length()<=8) {
		return name+"\t"+flatno+"\t"+contactno+"\t"+amount+"\t"+flatno+hello;
		}
	else {
		return null;
	}
}


}
