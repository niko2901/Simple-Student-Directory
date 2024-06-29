public class form4{
	public void forms4(){
		int choice;

		StudentDirectoryMenu sDirectory = new StudentDirectoryMenu();

		System.out.print("Elementary School Attended: ");
		sDirectory.arrESA.add(sDirectory.in.nextLine());
		System.out.print("School Address: ");
		sDirectory.arrSadd.add(sDirectory.in.nextLine());
		System.out.print("School Last Attended: ");
		sDirectory.arrLatt.add(sDirectory.in.nextLine());
		System.out.print("School Address: ");
		sDirectory.arrSadd2.add(sDirectory.in.nextLine());
		System.out.print("School Year: ");
		sDirectory.arrSyear.add(sDirectory.in.nextInt());
		do{
			System.out.println("[1] Public \t [2] Private");
			System.out.print("Enter choice: ");
			choice = sDirectory.in.nextInt();
		}while (choice < 1 || choice > 2);

		if(choice == 1){
			sDirectory.arrPV.add("Public");

		}else if(choice == 2){
			sDirectory.arrPV.add("Private");
		}

		System.out.print("Grade Level Completed: ");
		sDirectory.arrGcomp.add(sDirectory.in.nextInt());
		System.out.print("General Average: ");
		sDirectory.arrGave.add(sDirectory.in.nextDouble());
	}
}