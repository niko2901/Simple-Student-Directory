public class form2{

	int choice;

	public void forms2(){
		StudentDirectoryMenu sDirectory = new StudentDirectoryMenu();
		form2 forms = new form2();

		System.out.println("======= PERMANENT ADDRESS ======");

		System.out.print("Street No. : ");
		sDirectory.arrSno.add(sDirectory.in.nextInt());
		System.out.print("Subdivision/ Village/ Building : ");
		sDirectory.arrSub.add(sDirectory.in.nextLine());
		sDirectory.in.nextLine();
		System.out.print("Barangay : ");
		sDirectory.arrBrgy.add(sDirectory.in.next());
		sDirectory.in.nextLine();
		System.out.print("City/Municipality : ");
		sDirectory.arrCity.add(sDirectory.in.nextLine());
		System.out.print("Province : ");
		sDirectory.arrProv.add(sDirectory.in.nextLine());
		System.out.print("Telephone No:");
		sDirectory.arrTelNo.add(sDirectory.in.nextLine());
		System.out.print("Cellphone No:");
		sDirectory.arrCnum.add(sDirectory.in.nextLine());
		do{
			System.out.println("[1] Married [2] Not Married");

			System.out.print("Parent`s Marital Status :");
			forms.choice = sDirectory.in.nextInt();
		}while(forms.choice < 1 || forms.choice > 2);
		

		if(forms.choice == 1){
			sDirectory.arrPMS.add("Married"); 
		}else if (forms.choice == 2){
			sDirectory.arrPMS.add("Not Married");
		}
	}
}