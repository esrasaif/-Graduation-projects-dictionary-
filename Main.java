package graduationprojects;

import java.util.Scanner;
import java.util.*;
import javax.swing.JFrame;

public class Main {

    static Tree t;

    public static void main(String[] args) {
        t = new Tree();

        t.insertYear(2021);
        t.insertYear(2019);
        t.insertYear(2022);
        
       
        //Project pro = new Project();
        
        Project Littlefarmer = new Project ("Little farmer",2019 , "Internet of Things","Arduino , thingspeak","In this research project, "
          + "we focus on the obstacles that encounter farmers in Saudi Arabia. "
          + "\nDue to the desert-based environment of Saudi Arabia, high summer temperatures and limited irrigation resources \nare a key factor that shapes the face of this sector"
          + ". We have designed a robot prototype that will collect the information \nfrom the farmland and reflect them on Thingspeakplatform. The collected data will be air temperature,"
          + " air humidity, and soil humidity. \nThose parameters will be measured and logged by an Arduino microcontroller mounted on the robot. The collected data will be \nanalyzed to be used on the long and short term."
          + " In the short term, this collected data will help to irrigate the areas that need \nto be irrigated, this will increase irrigation efficiency and help saving water.Also, the temperature will help in rectifying our outputs, "
          + "\nbecause irrigation amounts relay on the corps type and which " ) ; 
    
    
    Project ProtectYourChildren = new Project("Protect Your Children",2019,"Information Security","Parental Control, Monitoring, Tracking, PYC, Remotely, Technology Addiction, Internet Safety","There are a lot of children who use their phones for long periods and may use malicious applications and sites because;"
         + " \nit does not have control. And there are some parents who wants to control and monitor their children's devices but finding that it is so difficult \nto use control applications because;"
         + " its available in English language. Therefore, the main objective in the project to develop an application \nfor parental control in an easy and simple way with support for the Arabic language. "
         + "Subsequently, parents can view applications \nused by children and can block applications, and can set intervals for use of applications and monitor child's location.")  ; 
    
    Project YourTour = new Project ("YourTour",2021,"multimedia","     ","Travel invites people to spend their time in different places from their countries, as travel offers tours,"
          + " cultural and \nentertainment places of a new character than what they usually see. However, it is usually limited in what it has to offer,"
          + " so it is not possible to travel \nand wander most of the time. Since a big part has to do with free time and financial budget as well as flight reservation availability. "
          + "\nOne way to substitute traveling to a tourist destination is to have that place with you. An idea, design, programming and testing of such a \nsolution is reported in the following report. "
          + "Our graduation project application is a direct stream of global tourism, cultural, \nhistorical and natural areas. It works by choosing the place by the user and shows him the live stream of the place with the ability to \nadd a comment and view the user's comments as well as comment with seeing the weather and information about the place and nearby places. \nAll these requirements are basic and subsidiary in the project. And we finished it completely and perfectly .") ; 
   
    Project ArabicNaturalLanguage = new Project ("Arabic Natural Language Processing and Voice Recognition Suggestions Application for Restaurants and Café",2021,"Artificial Intelligence","    ","There are many restaurants and cafés in the Middle East. They are growing every day, which makes searching for a place \ndifficult and time-consuming task to find particular food or drink."
           + " To make it easier to search, this project will focus on using Arabic Natural \nLanguage Processing and Machine Learning to build a search software "
           + "that can utilize and analyze the written and spoken Arabic language to \nfind a particular restaurant or café which serve a specific food and drinks. Moreover, it will"
           + " provide \npersonal recommendations and suggestions based on weather and occasions using Machine Learning techniques.") ; 
   
    Project TiryaaqApplication = new Project ("Tiryaaq Application",2022,"Medicine, pharmacist, patient, Tiryaaq, Medical","Artificial Intelligence","This project provides an application that helps patients to get medicines information by several ways and patients also could \nconsult a reliable pharmacist through this app."
            + " On the other hand, the application also helps unemployed pharmacist to volunteer \nby providing consultations to the patients.") ; 
    
    Project Maham = new Project ("Maham",2022,"Maham, Tasks, Rewards, Family app, Educational","Software Engineering","Motivating children to complete chores and homework without rewarding them can make them hate doing tasks. If a kid lacks motivation, "
             + "\nthey may stop doing what is expected of them, resulting in conflicts between the child and their parents. With our app, "
             + "\nwe want to maintain that motivation by rewarding the child with completion points for each task they complete. \nThe child would then be able to redeem these points for a gift determined by the parents."
             + " We hope that by doing so, \nchildren will enjoy their tasks rather than treating them as a") ; 
     
        
        t.getRoot().getCategoryOne().setCategory("multimedia");            //2021
        t.getRoot().getCategoryTwo().setCategory("Artificial Intelligence");
        
        t.getRoot().getLeft().getCategoryOne().setCategory("Internet of Things");   //2019
        t.getRoot().getLeft().getCategoryTwo().setCategory("Information Security");
        
        t.getRoot().getRight().getCategoryOne().setCategory("Artificial Intelligence");
        t.getRoot().getRight().getCategoryTwo().setCategory("software engineering");
        
        
        //the root 2021
        t.getRoot().getCategoryOne().addFirs(YourTour);
        t.getRoot().getCategoryTwo().addlast(ArabicNaturalLanguage);
        //node left  2019
        t.getRoot().getLeft().getCategoryOne().addFirs(Littlefarmer);
        t.getRoot().getLeft().getCategoryTwo().addlast(ProtectYourChildren);
        //node right 2022
        t.getRoot().getRight().getCategoryOne().addFirs(TiryaaqApplication);
        t.getRoot().getRight().getCategoryTwo().addlast(Maham);

        boolean flage = true;
        boolean check = false;
        int c;
        Scanner input = new Scanner(System.in);
        
                    System.out.println("--------------------------------------WELCOMEE---------------------------------------");
       System.out.println("Dictionary of graduation projects for the Department of Computer Science at Umm Al-Qura University");

   outerloop: do {

            System.out.println("States: \n1-Student\n2-Graduate ");
            System.out.println("----------------------------");
            System.out.print("Select your state: ");
            int state = input.nextInt();
            
            
            if (state == 1) {

      studentloop:    do {

                    System.out.println("\nChoose which operation to do:\n1-search about project by category in specific year\n2-display projects in specifice year\n3-Print all projects\n4-Exite");
                    System.out.println("----------------------------");
                    System.out.print("Enter your choice: ");
                     c = input.nextInt();

                    switch (c) {

                        case 1: //search about project by category in specific year

                            try {

                                System.out.print("Existing years: 2019,2021,2022\n Enter the year: ");
                                int year = input.nextInt();

                                if (year == 2019 | year == 2022 | year == 2021) {
                                    System.out.print("All categories: "
                                            + "\n1-multimedia"
                                            + "\n2-Artificial Intelligence"
                                            + "\n3-Internet of Things"
                                            + "\n4-Information Security"
                                            + "\n5-software engineering\n");
                                    
                                    System.out.print("Your select: "); 
                                    int category = input.nextInt();
                                    
                                    System.out.println("-----------------------------------------------------------------------");         
                                    
                                    switch (category) {
                                        case 1:
                                            t.searchN(t.getRoot(), year, "multimedia");
                                            break;
                                        case 2:
                                            t.searchN(t.getRoot(), year, "Artificial Intelligence");
                                            break;
                                        case 3:
                                            t.searchN(t.getRoot(), year, "Internet of Things");
                                            break;
                                        case 4:
                                            t.searchN(t.getRoot(), year, "Information Security");
                                            break;
                                        case 5:
                                            t.searchN(t.getRoot(), year, "software engineering");
                                            break;

                                    }
                                
//                                    input.nextLine();//save next line
//                                    System.out.print("Enter name of category:");
//                                    String category = input.nextLine();
//                                    t.searchN(t.getRoot(), year, category);
                                    
                                } else {
                                    System.out.println("we don't have this year !, try again ");
                                    break;
                                }

                            } catch (InputMismatchException e) {
                                System.out.println(e.getMessage());
                            }


                            break;

                        case 2:  //print specific projects
                            System.out.print("Enter the year: ");
                            int y = input.nextInt();
                            t.printProjectsInYear(t.getRoot(), y);
                            
                          if (y == 2019) {
                              
                                Images im = new Images();
                                
                                im.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
                                im.show1();
                                im.setVisible(true);
                                im.pack();
                                im.setTitle("projects posters: ");
                            } else if (y == 2021) {
                                Images im1 = new Images();
                                im1.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
                                im1.show2();
                                im1.setVisible(true);
                                im1.pack();
                                im1.setTitle("projects posters: ");
                            } else {
                                Images im2 = new Images();
                                im2.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
                                im2.show3();
                                im2.setVisible(true);
                                im2.pack();
                                im2.setTitle("projects posters: ");
                            }
                            break;

                        case 3: //print all
                            
                            Images  imAll = new Images();
                            t.printInOrderYears(t.getRoot());
                            imAll.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
                            imAll.show1();
                            imAll.show2();
                            imAll.show3();
                            imAll.setVisible(true);
                            imAll.pack();
                            imAll.setTitle("projects posters: ");
                            
                            break;
                            
                        case 4:  //exite
                      System.exit(0);

                       // break  studentloop;
                        
                        default:
                            System.out.println("enter correch choice ,Try again ,please");
                            System.out.println("----------------------------");
                            break;

                    }

                } while (true);
               
            } else if (state == 2) {
                System.out.println("----------------------------");
     graduateloop:  do {

                    System.out.println("\nChoose which operation to do:\n1-insert new project\n2-search about project\n3-display projects in specifice year\n4-Print all projects\n5-Exite");
                    System.out.println("----------------------------");
                    System.out.print("Enter your choice: ");
                     c = input.nextInt();

                    switch (c) {
                        case 1:  //method adding
                            NewProject();
                            break;

                        case 2:  //search about project
                                      try {

                                System.out.print("Existing years: 2019,2021,2022\n Enter the year: ");
                                int year = input.nextInt();

                                if (year == 2019 | year == 2022 | year == 2021) {
                                    System.out.print("All categories: "
                                            + "\n1-multimedia"
                                            + "\n2-Artificial Intelligence"
                                            + "\n3-Internet of Things"
                                            + "\n4-Information Security"
                                            + "\n5-software engineering\n");
                                    
                                    System.out.print("Your select: "); 
                                    int category = input.nextInt();
                                    
                                    System.out.println("-----------------------------------------------------------------------");         
                                    
                                    switch (category) {
                                        case 1:
                                            t.searchN(t.getRoot(), year, "multimedia");
                                            break;
                                        case 2:
                                            t.searchN(t.getRoot(), year, "Artificial Intelligence");
                                            break;
                                        case 3:
                                            t.searchN(t.getRoot(), year, "Internet of Things");
                                            break;
                                        case 4:
                                            t.searchN(t.getRoot(), year, "Information Security");
                                            break;
                                        case 5:
                                            t.searchN(t.getRoot(), year, "software engineering");
                                            break;

                                    }
                                
//                                    input.nextLine();//save next line
//                                    System.out.print("Enter name of category:");
//                                    String category = input.nextLine();
//                                    t.searchN(t.getRoot(), year, category);
                                    
                                } else {
                                    System.out.println("we don't have this year !, try again ");
                                    break;
                                }

                            } catch (InputMismatchException e) {
                                System.out.println(e.getMessage());
                            }


                            break;

                        case 3: //print in specific year
                            
                            System.out.print("Enter the year: ");
                            int y1 = input.nextInt();
                            t.printProjectsInYear(t.getRoot(), y1);
                           if (y1 == 2019) {
                              
                                Images im = new Images();
                                
                                im.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
                                im.show1();
                                im.setVisible(true);
                                im.pack();
                                im.setTitle("projects posters: ");
                            } else if (y1 == 2021) {
                                Images im1 = new Images();
                                im1.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
                                im1.show2();
                                im1.setVisible(true);
                                im1.pack();
                                im1.setTitle("projects posters: ");
                            } else {
                                Images im2 = new Images();
                                im2.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
                                im2.show3();
                                im2.setVisible(true);
                                im2.pack();
                                im2.setTitle("projects posters: ");
                            }
                            break;

                        case 4:  //print all projects
                            
                          Images  imAll = new Images();
                            t.printInOrderYears(t.getRoot());
                            imAll.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
                            imAll.show1();
                            imAll.show2();
                            imAll.show3();
                            imAll.setVisible(true);
                            imAll.pack();
                            imAll.setTitle("projects posters: ");
                            
                            break;
                            
                        case 5:   
                            //exite
                       System.exit(0);

                        default:
                            System.out.println("enter correch choice ,Try again ,please");
                            System.out.println("----------------------------");
                            break;

                    }

                } while (flage);

            } else {
                System.out.println("Please enter which your state from which displaied to you ,");
                System.out.println("----------------------------");
                check = true;
            }

        } while (true);

    }//end main
//***************
    public static void NewProject() {

        Scanner input = new Scanner(System.in);

        Project p = new Project();
        String n;
        int year = 0;
        String desc = null;
        int Nocategory = 0;
       
        String key = null;

        TreeNode root = t.getRoot();
        TreeNode left = t.root.getLeft();
        TreeNode right = t.root.getRight();

        boolean test = true;
        do {

            try {
                System.out.print("\nEnter name of project:");
                n = input.next();
                p.setProjectName(n);
                test = false;

            } catch (InputMismatchException e) {
                System.out.println("Error: invalid name project, Please enter correct name with letters only");

            } catch (NumberFormatException e) {
                System.out.println(e.getMessage());
                System.out.println("----------------------------");

            }

        } while (test);

        //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        test = true;
        do {

            try {
                System.out.print("\nEnter the year of project ,it must be within one of this yesrs 2019 ,2021,2022 :");
                year = input.nextInt();
                
                p.setYear(year);
                test = false;

            } catch (NumberFormatException e) {
                System.out.println(e.getMessage());
                System.out.println("----------------------------");
                //Exit(false);//to stop the loop
                //return;  //return to the main method and stop the program for this new member

            }

        } while (test);

        //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        test = true;
        do {

            try {

                input.nextLine();//save new line from previouse input
                String value = "";
                System.out.print("\nEnter describtion of project: ");
                if (input.hasNext("[A-Za-z]*")) {
                    value = input.nextLine();
                    test = false;
                } else {
                    System.out.println("you have to insert correct describtion with only latters,try again");
                    System.out.println("----------------------------");
                    test = true;
                }
                p.setDescribrion(value);

            }//end try block
            catch (InputMismatchException e) {
                System.out.println("Error: invalid input you have to input text , try again with just letters");
                System.out.println("----------------------------");

            }

        } while (test);
///////////////////////////////////////////////////////////////////////////////////////////
        test = true;
        do {
            input.nextLine();

            try {
                System.out.print("\nEnter the category of your project :");
                System.out.println("we have this categories under each year you should insert under only one of them:\n"
                        + " 2019 year : 1-Internet of Things  2-Information Security"
                        + "\n 2021 year : 1-multimedia 2-Artificial Intelligence"
                        + "\n 2022 year : 1-Artificial Intelligence 2-software engineering"
                );
                System.out.println("----------------------------");
                System.out.print("enter the number of  category: ");
                Nocategory = input.nextInt();
              
                switch( Nocategory)
                {
                    case 1:  
                             if (year == root.getYear()) //2021
                             {
                                p.setProjectCategor("multimedia");
                              
                               test = false;
                             }
                             else if (year == right.getYear()) //2022
                             { 
                                   p.setProjectCategor("Artificial Intelligence");
                                test = false;

                             }
                             else//2019
                             {
                              p.setProjectCategor("Internet of Things");
                               
                                test = false;

                             }
                            break;
                    case 2:
                         if (year == root.getYear()) //2020
                             {
                               p.setProjectCategor("Artificial Intelligence");
                                 
                               test = false;
                             }
                             else if (year == right.getYear()) //2022
                             {
                                   p.setProjectCategor("software engineering");
                                test = false;

                             }
                             else//2019
                             {
                              p.setProjectCategor("Information Security");
                                test = false;

                             }
                        
                       break;
                       
                    default:
                         System.out.println("you have to insert one of displayed catigories , Try again please");
                         
                }//end try
              
            } catch (InputMismatchException e) {
               
                System.out.println("Error: invalide input , please try again with just letters");
                System.out.println("----------------------------");

            }
        } while (test);

        /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        test = true;
        do {

            try {
                System.out.print("Enter keyword of your project it is must be distinic and clear and ndicate the project:");
                key = input.next();
                p.setKeywords(key);
                test = false;
            } catch (InputMismatchException e) {
              
                System.out.println("Error: invalid input, please try again ");
                System.out.println("----------------------------");

            }
        } while (test);
        
      

        //adding project to specific node in tree     *********   
       if (year == root.getYear()) //here check if the enterd project in that year same year in root node in tree or not
        {
            if (p.getProjectCategor().equals(root.categoryOne.getCategory()))
            {
                root.categoryOne.addlast(p);
            } else if (p.getProjectCategor().equals(root.categoryTwo.getCategory())) {
                root.categoryTwo.addlast(p);
                }
            else {
                System.out.println("the enterd category we did not have it in this year " + root.getYear());
                System.out.println("----------------------------");
                }

        } //as year is not same in root we here check if the enterd project in that year same year in left node in tree or not
        else if (year == left.getYear())
        {
            if (p.getProjectCategor().equals(left.categoryOne.getCategory())) {
                left.categoryOne.addlast(p);
            } else if (p.getProjectCategor().equals(left.categoryTwo.getCategory()))
                 {
                           left.categoryTwo.addlast(p);
                 } else {
                             System.out.println("the enterd category we did not have it in this year " + left.getYear());
                         System.out.println("----------------------------");
                        }

        } //as year is not same in root or left node here it is means year that enterd it is the same year that in right node
        else
        {
            if (p.getProjectCategor().equals(right.categoryOne.getCategory())) {
                right.categoryOne.addlast(p);
            } else if (p.getProjectCategor().equals(right.categoryTwo.getCategory())) {
                right.categoryTwo.addlast(p);
            } 
            else {
                System.out.println("the enterd category we did not have it in this year " + right.getYear());
                System.out.println("----------------------------");
            }

        }
    }//end adding method
    
    
}//class


