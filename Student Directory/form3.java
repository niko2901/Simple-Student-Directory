import java.util.Scanner;
import java.util.ArrayList;

public class form3{
	String fsName,fgName,fmName,foccu,msName,mgName,mmName,moccu,sub,brgy,city,prov,gsName,ggName,gmName,goccu,grs,cnum,ccnum;
	int sNo;
	double fmIncome,mmIncome,gmIncome;

	Scanner in = new Scanner(System.in);

	ArrayList<Integer>p_add = new ArrayList<Integer>(); 

	public void formsP3(){
		form3 forms = new form3();
		StudentDirectoryMenu SDM = new StudentDirectoryMenu();

		System.out.println("======= Father`s Name ======");
		
		System.out.print("Surname : ");
		SDM.arrFsurname.add(forms.in.nextLine());
		System.out.print("Given Name : ");
		SDM.arrFgname.add(forms.in.nextLine());
		System.out.print("Middle Name : ");
		SDM.arrFmidname.add(forms.in.nextLine());
		System.out.print("Occupation : ");
		SDM.arrFoccupation.add(forms.in.nextLine());
		System.out.print("Monthly Income : ");
		SDM.arrFincome.add(forms.in.nextDouble());


		System.out.println("======= Mother`s Maiden Name ======");
		
		System.out.print("Surname : ");
		SDM.arrMsurname.add(forms.in.next());
		forms.in.nextLine();
		System.out.print("Given Name : ");
		SDM.arrMgname.add(forms.in.nextLine());
		System.out.print("Middle Name : ");
		SDM.arrMmidname.add(forms.in.nextLine());
		System.out.print("Occupation : ");
		SDM.arrMoccupation.add(forms.in.nextLine());
		System.out.print("Monthly Income : ");
		SDM.arrMincome.add(forms.in.nextDouble());

		System.out.println("======= Address ======");

		System.out.print("Street No. : ");
		SDM.arrPstreetnum.add(forms.in.nextInt());
		System.out.print("Subdivision/ Village/ Building : ");
		SDM.arrPsub.add(forms.in.next());
		forms.in.nextLine();
		System.out.print("Barangay : ");
		SDM.arrPbrgy.add(forms.in.next());
		forms.in.nextLine();	
		System.out.print("City/Municipality : ");
		SDM.arrPcity.add(forms.in.nextLine());
		System.out.print("Province : ");
		SDM.arrPprovince.add(forms.in.nextLine());
		System.out.print("Contact Number:");
		SDM.arrPcontact.add(forms.in.nextLine());

		System.out.println("======= Guardian`s Name ======");
		
		System.out.print("Surname : ");
		SDM.arrGsurname.add(forms.in.nextLine());
		System.out.print("Given Name : ");
		SDM.arrGgivenname.add(forms.in.nextLine());
		System.out.print("Middle Name : ");
		SDM.arrGmidname.add(forms.in.nextLine());
		System.out.print("Occupation : ");
		SDM.arrGoccupation.add(forms.in.nextLine());
		System.out.print("Monthly Income : ");
		SDM.arrGmincome.add(forms.in.nextDouble());
		System.out.print("Guardians Relationship to Student : ");
		SDM.arrGrelation.add(forms.in.next());
		forms.in.nextLine();
		System.out.print("Contact Number:");
		SDM.arrGcontact.add(forms.in.nextLine());
	}
}