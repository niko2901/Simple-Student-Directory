public class form1{
	String strand;
  	int choice, choice2;

	public void forms1(){

		form1 f = new form1();
	    StudentDirectoryMenu SDM = new StudentDirectoryMenu();
	    SDM.clrscr();
	    System.out.println("========== Form1 ==========");
	    System.out.print("Learner's Reference Number: ");
	    SDM.arrLRN.add(SDM.in.nextLine());
	    do{
	      System.out.println("\n[1] Elementary\t[2] Junior High School\t[3] Senior High School");
	      System.out.print("Enter choice: ");
	      f.choice = SDM.in.nextInt();
	    }while(f.choice < 1 || f.choice > 3);
	    
	    
	    if(f.choice == 1){
	      SDM.arrSchool.add("Elementary");
	      SDM.arrStrand.add("N/A");
	    }else if(f.choice == 2){
	      SDM.arrSchool.add("Junior High School");
	      SDM.arrStrand.add("N/A");
	    }else if(f.choice == 3){
	      SDM.arrSchool.add("Senior High School");
	    }

	    if(f.choice == 3){
	      System.out.print("SHS Strand: ");
	      SDM.arrStrand.add(SDM.in.next());
	      SDM.in.nextLine();
	    }else{
	      SDM.arrStrand.add("N/A");
	    }
	    // error start
	    System.out.print("Grade Level: ");
	    SDM.arrGlevel.add(SDM.in.nextInt());

	    // System.out.println("\nNAME");
	    System.out.print("\nSurname: ");
	    SDM.arrSname.add(SDM.in.next());
	    SDM.in.nextLine();
	    System.out.print("Given Name: ");
	    SDM.arrGname.add(SDM.in.nextLine());
	    System.out.print("Middle Name: ");
	    SDM.arrMname.add(SDM.in.nextLine());
	    do{
	      System.out.println("[1] Male\t[2] Female");
	      System.out.print("Sex: ");
	      f.choice2 = SDM.in.nextInt();
	    }while(f.choice2 < 1 || f.choice2 > 2);

	    if(f.choice2 == 1){
	      SDM.arrGender.add("Male");
	    }else if(f.choice2 == 2){
	      SDM.arrGender.add("Female");
	    }

	    System.out.print("Date of Birth(m/d/y) : ");
	    SDM.arrBirth.add(SDM.in.next());
	    SDM.in.nextLine();

	    System.out.print("Place of Birth: ");
	    SDM.arrPbirth.add(SDM.in.nextLine());

	    System.out.print("Age: ");
	    SDM.arrAge.add(SDM.in.nextInt());

	    System.out.print("Citizenship: ");
	    SDM.arrCitizen.add(SDM.in.next());
	    SDM.in.nextLine();

	    System.out.print("Mother Tongue: ");
	    SDM.arrMtongue.add(SDM.in.next());
	    SDM.in.nextLine();

	    System.out.println("\nLeave blank if not");
	    System.out.print("IP (specify ethnic group): ");
	    SDM.arrIP.add(SDM.in.nextLine());

	    System.out.print("Religion: ");
	    SDM.arrReligion.add(SDM.in.nextLine());

	    System.out.print("No. of Siblings (including you): ");
	    SDM.arrNsiblings.add(SDM.in.nextInt());

	    System.out.print("Order in the family: ");
	    SDM.arrOfamily.add(SDM.in.nextInt());
	}
}