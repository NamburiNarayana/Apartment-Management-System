package House_Estate_management_system;

public class membersdetails {
public static void main(String[] args) {
	
	addmember add = new addmember();
	add.appartmentdetails.add(new holder_details("Name", "Flat", "Mobile No", false,false,false,false,false,false,false,false));
	add.appartmentdetails.add(new holder_details("Narayana", "3B1", "6309559251", true,false,true,true,true,false,false,true));
	add.appartmentdetails.add(new holder_details("Jayanth", "3B2", "9734864773", true,false,true,true,true,false,false,true));
	add.appartmentdetails.add(new holder_details("Charan", "3B3", "9364738648", true,false,true,true,true,false,false,true));
	MainPage page = new MainPage();
	editservices edi = new editservices();
	page.setVisible(true);

}
}
