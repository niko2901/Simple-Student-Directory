import java.util.Scanner;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import java.io.IOException;

public class StudentDirectoryMenu{
	private int sNo, choice;

	Scanner in = new Scanner(System.in);
  // LRN
  static ArrayList<String> arrLRN = new ArrayList<String>();
  // School
  static ArrayList<String> arrSchool = new ArrayList<String>();
  // strand
  static ArrayList<String> arrStrand = new ArrayList<String>();
  // Grade Level
  static ArrayList<Integer> arrGlevel = new ArrayList<Integer>();

  // name of student  (Surname)
  static ArrayList<String> arrSname = new ArrayList<String>();
  // Given
  static ArrayList<String> arrGname = new ArrayList<String>();
  // Middle Name
  static ArrayList<String> arrMname = new ArrayList<String>();

  // Gender/sex
  static ArrayList<String> arrGender = new ArrayList<String>();
  // date of Birth
  static ArrayList<String> arrBirth = new ArrayList<String>();
  // place of birth
  static ArrayList<String> arrPbirth = new ArrayList<String>();
  // age
  static ArrayList<Integer> arrAge = new ArrayList<Integer>();
  
  // citizenship
  static ArrayList<String> arrCitizen = new ArrayList<String>();
  // mother touge
  static ArrayList<String> arrMtongue = new ArrayList<String>();
  // indigenous people
  static ArrayList<String> arrIP = new ArrayList<String>();
  // religion
  static ArrayList<String> arrReligion = new ArrayList<String>();
  // number of siblings
  static ArrayList<Integer> arrNsiblings = new ArrayList<Integer>();
  // order in family
  static ArrayList<Integer> arrOfamily = new ArrayList<Integer>();

  // street no.
  static ArrayList<Integer> arrSno = new ArrayList<Integer>();
  // subdivision/village/building
  static ArrayList<String> arrSub = new ArrayList<String>();
  // barangay
  static ArrayList<String> arrBrgy = new ArrayList<String>();
  // city/municipality
  static ArrayList<String> arrCity = new ArrayList<String>();
  // Province
  static ArrayList<String> arrProv = new ArrayList<String>();
  // Telephone No.
  static ArrayList<String> arrTelNo = new ArrayList<String>();
  // Cellphone No.
  static ArrayList<String> arrCnum = new ArrayList<String>();
  // parents Marital Status
  static ArrayList<String> arrPMS = new ArrayList<String>();

  // fathers surname
  static ArrayList<String> arrFsurname = new ArrayList<String>();
  // fathers given name
  static ArrayList<String> arrFgname = new ArrayList<String>();
  // fathers middle name
  static ArrayList<String> arrFmidname = new ArrayList<String>();
  // fathers occupation
  static ArrayList<String> arrFoccupation = new ArrayList<String>();
  // fathers monthly income
  static ArrayList<Double> arrFincome = new ArrayList<Double>();
  // mothers surname
  static ArrayList<String> arrMsurname = new ArrayList<String>();
  // mothers given name
  static ArrayList<String> arrMgname = new ArrayList<String>();
  // mothers middle name
  static ArrayList<String> arrMmidname = new ArrayList<String>();
  // mothers occupation
  static ArrayList<String> arrMoccupation = new ArrayList<String>();
  // mothers monthly Income
  static ArrayList<Double> arrMincome = new ArrayList<Double>();
  // parent street number
  static ArrayList<Integer> arrPstreetnum = new ArrayList<Integer>();
  // parent subdivision
  static ArrayList<String> arrPsub = new ArrayList<String>();
  // parent barangay
  static ArrayList<String> arrPbrgy = new ArrayList<String>();
  // parent city
  static ArrayList<String> arrPcity = new ArrayList<String>();
  // parent province
  static ArrayList<String> arrPprovince = new ArrayList<String>();
  // parent contact
  static ArrayList<String> arrPcontact = new ArrayList<String>();

  // guardian surname
  static ArrayList<String> arrGsurname = new ArrayList<String>();
  // guardian given name
  static ArrayList<String> arrGgivenname = new ArrayList<String>();
  // guardian middle name
  static ArrayList<String> arrGmidname = new ArrayList<String>();
  // guardian occupation
  static ArrayList<String> arrGoccupation = new ArrayList<String>();
  // guardian monthly income
  static ArrayList<Double> arrGmincome = new ArrayList<Double>();
  // guardian relationship to student
  static ArrayList<String> arrGrelation = new ArrayList<String>();
  // guardian contact
  static ArrayList<String> arrGcontact = new ArrayList<String>();

  // elementary school attended
  static ArrayList<String> arrESA = new ArrayList<String>();
  // school Address
  static ArrayList<String> arrSadd = new ArrayList<String>();
  // school last attended
  static ArrayList<String> arrLatt = new ArrayList<String>();
  // school address
  static ArrayList<String> arrSadd2 = new ArrayList<String>();
  // school Year
  static ArrayList<Integer> arrSyear = new ArrayList<Integer>();
  // School Private or Private
  static ArrayList<String> arrPV = new ArrayList<String>();
  // Grade Completed
  static ArrayList<Integer> arrGcomp = new ArrayList<Integer>();
  // General Average
  static ArrayList<Double> arrGave = new ArrayList<Double>();

  static{
    arrLRN.add("198765150721");
    arrSchool.add("Senior High School");
    arrStrand.add("ICT");
    arrGlevel.add(11);
    arrSname.add("Pugay");
    arrGname.add("Normand Nieander");
    arrMname.add("Martos");
    arrGender.add("Male");
    arrBirth.add("12/29/2005");
    arrPbirth.add("Bulacan");
    arrAge.add(17);   
    arrCitizen.add("Filipino");
    arrMtongue.add("Tagalog");
    arrIP.add("");
    arrReligion.add("Catholic");
    arrNsiblings.add(3);
    arrOfamily.add(2);

    arrSno.add(90);
    arrSub.add("");
    arrBrgy.add("Sapa 3");
    arrCity.add("Rosario");
    arrProv.add("Cavite");
    arrTelNo.add("206-782-8410");
    arrCnum.add("0993-904-7838");
    arrPMS.add("Not Married");

    arrFsurname.add("Pugay");
    arrFgname.add("Norvey");
    arrFmidname.add("Martos");
    arrFoccupation.add("supervisor");
    arrFincome.add(30000.00);

    arrMsurname.add("Pugay");
    arrMgname.add("Salvie");
    arrMmidname.add("Martos");
    arrMoccupation.add("House wife");
    arrMincome.add(0.00);

    arrPstreetnum.add(90);
    arrPsub.add("");
    arrPbrgy.add("Sapa 3");
    arrPcity.add("Rosario");
    arrPprovince.add("Cavite");
    arrPcontact.add("0999-999-9999");

    arrGsurname.add("Pugay");
    arrGgivenname.add("Salvie");
    arrGmidname.add("Martos");
    arrGoccupation.add("House wife");
    arrGmincome.add(0.00);
    arrGrelation.add("Mother");
    arrGcontact.add("0999-999-9999");

    arrESA.add("Agustin Abadilla Elementary School");
    arrSadd.add("Abadilla St. Sapa II Rosario, Cavite");
    arrLatt.add("Galilee Academy");
    arrSadd2.add("520 C Abueg St Sapa I Rosario, Cavite");
    arrSyear.add(2020);
    arrPV.add("Private");
    arrGcomp.add(10);
    arrGave.add(89.00);

  }

	public static void main(String[] args) throws InterruptedException{
		StudentDirectoryMenu sDirectory = new StudentDirectoryMenu();
    form1 forms1 = new form1();
    form2 forms2 = new form2();
    form3 forms3 = new form3();
    form4 forms4 = new form4();

    while(true){
  		clrscr();
  		slowPrint("ROSAIO INSTITUTE\n");
  		slowPrint("Rosario, Cavite\n");
  		slowPrint("Founded 1946");
  		Thread.sleep(2000);
  		clrscr();

  		System.out.println("========== ROSARIO INSTITUTE ==========");

      System.out.println("[1] Read Student Data \t [2] Create Data");
      sDirectory.choice = sDirectory.in.nextInt();

      /*if(sDirectory.choice == 1){
        readForms();
      }else if(sDirectory.choice == 2){
        clrscr();
        System.out.println("Please Wait!");
        Thread.sleep(400);
        System.out.println("Loading.....");
        Thread.sleep(2000);
        f.form();*/

      switch(sDirectory.choice){
        case 1:
          clrscr();
          System.out.println("Please Wait!");
          Thread.sleep(400);
          System.out.println("Loading.....");
          Thread.sleep(2000);
          clrscr();
          readForms();
          break;
        case 2:
          clrscr();
          System.out.println("Please Wait!");
          Thread.sleep(400);
          System.out.println("Loading.....");
          Thread.sleep(2000);
          forms1.forms1();
          forms2.forms2();
          forms3.formsP3();
          // last part/ending
          forms4.forms4();
          break;
      }
    }
	}

  public static void readForms()throws InterruptedException{
    StudentDirectoryMenu sDirectory = new StudentDirectoryMenu();
    String ch;
    Integer usr;

    for(int i = 0; i < sDirectory.arrSname.size(); i++){
      System.out.printf("[%d] %s, %s %s\n", i+1, sDirectory.arrSname.get(i),
                                               sDirectory.arrGname.get(i),
                                               sDirectory.arrMname.get(i));

    }
    System.out.print("Enter Choice: ");
    ch = sDirectory.in.nextLine();

    if(ch.matches("[0-9]+")){
      clrscr();
      usr = Integer.valueOf(ch);

      System.out.printf("Learner's Reference Number: %s\tSchool Level: %s\tSHS Strand: %s\n\n", sDirectory.arrLRN.get(usr-1), 
                                                                                              sDirectory.arrSchool.get(usr-1), 
                                                                                              sDirectory.arrStrand.get(usr-1));

      System.out.printf("Name: %s, %s %-15s\tGrade Level: %d\t\tSex: %s\n", sDirectory.arrSname.get(usr-1), sDirectory.arrGname.get(usr-1), sDirectory.arrMname.get(usr-1),
                                                                       sDirectory.arrGlevel.get(usr-1), sDirectory.arrGender.get(usr-1));

      System.out.printf("Date of Birth (m/d/y): %s\t\tPlace of Birth: %-10s\tAge: %d\n", sDirectory.arrBirth.get(usr-1), sDirectory.arrPbirth.get(usr-1), sDirectory.arrAge.get(usr-1));

      System.out.printf("Citizenship: %-15s\t\t\tMotherTounge: %s\t\tIP (specify ethnic group): %s\n", sDirectory.arrCitizen.get(usr-1), sDirectory.arrMtongue.get(usr-1),
                                                                                              sDirectory.arrIP.get(usr-1));

      System.out.printf("Religion: %-15s\t\t\tNo. of Siblings (including you): %d\tOrder in the family: %d\n\n", sDirectory.arrReligion.get(usr-1), 
                                                                                                          sDirectory.arrNsiblings.get(usr-1),
                                                                                                          sDirectory.arrOfamily.get(usr-1));

      System.out.println("=================================================================================================================\n");

      System.out.printf("Permanent Address: %d %s %s %s %s\n", arrSno.get(usr-1), arrSub.get(usr-1), 
                                                             arrBrgy.get(usr-1), arrCity.get(usr-1), arrProv.get(usr-1));

      System.out.printf("Telephone No: %s\t\tCellphone No: %s\tParent's Marital Status: %s\n", arrTelNo.get(usr-1), arrCnum.get(usr-1), arrPMS.get(usr-1));
      
      System.out.println("\n=================================================================================================================\n");

      System.out.printf("Father's Name: %s, %s %-10s\t\t\tOccupation: %s\t\tMonthly Income: %.2f\n", arrFsurname.get(usr-1), arrFgname.get(usr-1), 
                                                                      arrFmidname.get(usr-1), arrFoccupation.get(usr-1), arrFincome.get(usr-1));

      // System.out.printf("Father's Name: %s, %s %s\n", arrFsurname.get(usr-1), arrFgname.get(usr-1), arrFmidname.get(usr-1));

      System.out.printf("Mother's Maiden Name: %s, %s %-10s\t\tOccupation: %s\t\tMonthly Income: %.2f\n", arrMsurname.get(usr-1), arrMgname.get(usr-1), arrMmidname.get(usr-1),
                                                                           arrMoccupation.get(usr-1), arrMincome.get(usr-1));

      System.out.printf("Address: %d %s %s %s %-10s\t\t\tContact Number: %s\n", arrPstreetnum.get(usr-1), arrPsub.get(usr-1), arrPbrgy.get(usr-1), 
                                                                          arrPcity.get(usr-1), arrPprovince.get(usr-1), arrPcontact.get(usr-1));

      System.out.printf("Guardian's Name: %s, %s %-10s\t\tOccupation: %s\t\tMonthly Income: %.2f\n", arrGsurname.get(usr-1), arrGgivenname.get(usr-1),
                                                      arrGmidname.get(usr-1), arrGoccupation.get(usr-1), arrGmincome.get(usr-1));

      System.out.printf("Guardian Relationship to Student: %-10s\t\tContact Number: %s\n", arrGrelation.get(usr-1), arrGcontact.get(usr-1));

      System.out.println("\n=================================================================================================================\n");

      System.out.printf("Element School Attended: %s\t\tSchool Type: %s\n", arrESA.get(usr-1), sDirectory.arrPV.get(usr-1));

      System.out.printf("School Address: %s\n", arrSadd.get(usr-1));

      System.out.printf("School Last Attended: %-45s\tGrade Level Completed: %d\n", arrLatt.get(usr-1), arrGcomp.get(usr-1));

      System.out.printf("School Address: %-30s\tSchool Year: %-5d\tGeneral Average: %.1f\n", arrSadd2.get(usr-1), arrSyear.get(usr-1), arrGave.get(usr-1));

    }
    usr = Integer.valueOf(ch);
    sDirectory.in.nextLine();
    Thread.sleep(500);
  }

	public static void clrscr(){
      //Clears Screen in java
    try {
        if (System.getProperty("os.name").contains("Windows"))
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        else
            Runtime.getRuntime().exec("clear");
    } catch (IOException | InterruptedException ex) {}
  }

	public static void slowPrint(String output){
		for(int i = 0; i<output.length(); i++){
			char c = output.charAt(i);
			System.out.print(c);
			try{
				TimeUnit.MILLISECONDS.sleep(10);
			}catch(Exception e){
			}
		}
	}

  public static void slowPrint(String output, int speed){
    for(int i = 0; i<output.length(); i++){
      char c = output.charAt(i);
      System.out.print(c);
      try{
        TimeUnit.MILLISECONDS.sleep(speed);
      }catch(Exception e){
      }
    }
  }
}

