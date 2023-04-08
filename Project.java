package graduationprojects;

import java.util.InputMismatchException;
import java.util.Objects;
import java.util.Scanner;
import java.lang.StackOverflowError;

public class Project {

    public static Scanner input = new Scanner(System.in);

  
    private static String Department="Computer Science";
    
    private static String projectLanguage = "English";
    
    private String projectName;
    
    private int year;
    
    private String projectCategor ;
    
    private String keyword;
    
    private String describrion;

    //constructor
    public Project()
    {
        
    }

    public Project(String projectName, int year, String projectCategor, String keywords, String describrion) {
        this.projectName = projectName;
        this.year = year;
        this.projectCategor = projectCategor;
        this.keyword = keywords;
        this.describrion = describrion;
    }


    public void setProjectName(String projectName) throws InputMismatchException , NumberFormatException{
         loop:for(int i = 0 ; i <projectName.length() ; i++)
         {  
             switch(projectName.charAt(i))
             {
                case '0':
                case '1':    
                case '2':
                case '3':
                case '4':
                case '5':
                case '6':
                case '7':
                case '8':
                case '9':
                    this.projectName="";
                  throw new NumberFormatException("invalid name , you have to insert only alphapet letters");
     
                 default:
                          this.projectName = projectName;
  
           
           }
      
      }
    }//end method

    public void setYear(int year) {
      if(year==2019||year==2021 || year==2022)  
          this.year = year;
      else
         throw new NumberFormatException("we just have projects under this years (2019,2020,2022), you can insert just under one of this years ");
    }
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    public void setDepartment(String Department) {
        this.Department = Department;
    }

     public void setProjectLanguage(String projectLanguage) {
        this.projectLanguage = projectLanguage;
    }
     
    /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////// 
    public void setProjectCategor(String projectCategor) {
        this.projectCategor = projectCategor;
    }

/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    public void setKeywords(String keywords) {
        loop:for(int i = 0 ; i <keywords.length() ; i++)
         {  
             switch(keywords.charAt(i))
             {
                case '0':
                case '1':    
                case '2':
                case '3':
                case '4':
                case '5':
                case '6':
                case '7':
                case '8':
                case '9':
                    this.keyword="";
                  throw new NumberFormatException("invalid name , you have to insert only alphapet letters");
     
                 default:
                        this.keyword = keywords;
  
           
           }
       
    }

    
    }
    //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    public void setDescribrion(String describrion) {
       
        this.describrion = describrion;
    }
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    // get methods
    public String getProjectName() {
        return projectName;
    }

    public int getYear() {
        return year;
    }

    public String getDepartment() {
        return Department;
    }

    public String getProjectCategor() {
        return projectCategor;
    }

    public String getProjectLanguage() {
        return projectLanguage;
    }

    public String getKeywords() {
        return keyword;
    }

    public String getDescribrion() {
        return describrion;
    }

   
//    @Override
//    public boolean equals(Object obj) {
//       Project p = (Project)obj;
//        return p.getProjectCategor()==this.projectCategor;
//    }
//    
    
   // projects //
 /** Project Littlefarmer = new Project ("Little farmer",2019 , "Internet of Things","Arduino , thingspeak","In this research project, "
          + "we focus on the obstacles that encounter farmers in Saudi Arabia. "
          + "Due to the desert-based environment of Saudi Arabia, high summer temperatures and limited irrigation resources are a key factor that shapes the face of this sector"
          + ". We have designed a robot prototype that will collect the information from the farmland and reflect them on Thingspeakplatform. The collected data will be air temperature,"
          + " air humidity, and soil humidity. Those parameters will be measured and logged by an Arduino microcontroller mounted on the robot. The collected data will be analyzed to be used on the long and short term."
          + " In the short term, this collected data will help to irrigate the areas that need to be irrigated, this will increase irrigation efficiency and help saving water.Also, the temperature will help in rectifying our outputs, "
          + "because irrigation amounts relay on the corps type and which " ) ; 
    
    
 Project ProtectYourChildren = new Project("Protect Your Children",2019,"Information Security","Parental Control, Monitoring, Tracking, PYC, Remotely, Technology Addiction, Internet Safety","There are a lot of children who use their phones for long periods and may use malicious applications and sites because;"
         + " it does not have control. And there are some parents who wants to control and monitor their children's devices but finding that it is so difficult to use control applications because;"
         + " its available in English language. Therefore, the main objective in the project to develop an application for parental control in an easy and simple way with support for the Arabic language. "
         + "Subsequently, parents can view applications used by children and can block applications, and can set intervals for use of applications and monitor child's location.")  ; 
    
  Project YourTour = new Project ("YourTour",2021,"multimedia","     ","Travel invites people to spend their time in different places from their countries, as travel offers tours,"
          + " cultural and entertainment places of a new character than what they usually see. However, it is usually limited in what it has to offer,"
          + " so it is not possible to travel and wander most of the time. Since a big part has to do with free time and financial budget as well as flight reservation availability. "
          + "One way to substitute traveling to a tourist destination is to have that place with you. An idea, design, programming and testing of such a solution is reported in the following report. "
          + "Our graduation project application is a direct stream of global tourism, cultural, historical and natural areas. It works by choosing the place by the user and shows him the live stream of the place with the ability to add a comment and view the user's comments as well as comment with seeing the weather and information about the place and nearby places. All these requirements are basic and subsidiary in the project. And we finished it completely and perfectly .") ; 
   
   Project ArabicNaturalLanguage = new Project ("Arabic Natural Language Processing and Voice Recognition Suggestions Application for Restaurants and Café",2021,"Artificial Intelligence","    ","There are many restaurants and cafés in the Middle East. They are growing every day, which makes searching for a place difficult and time-consuming task to find particular food or drink."
           + " To make it easier to search, this project will focus on using Arabic Natural Language Processing and Machine Learning to build a search software "
           + "that can utilize and analyze the written and spoken Arabic language to find a particular restaurant or café which serve a specific food and drinks. Moreover, it will"
           + " provide personal recommendations and suggestions based on weather and occasions using Machine Learning techniques.") ; 
   
    Project TiryaaqApplication = new Project ("Tiryaaq Application",2022,"Medicine, pharmacist, patient, Tiryaaq, Medical","Artificial Intelligence","This project provides an application that helps patients to get medicines information by several ways and patients also could consult a reliable pharmacist through this app."
            + " On the other hand, the application also helps unemployed pharmacist to volunteer by providing consultations to the patients.") ; 
    
     Project Maham = new Project ("Maham",2022,"Maham, Tasks, Rewards, Family app, Educational","Software Engineering","Motivating children to complete chores and homework without rewarding them can make them hate doing tasks. If a kid lacks motivation, "
             + "they may stop doing what is expected of them, resulting in conflicts between the child and their parents. With our app, "
             + "we want to maintain that motivation by rewarding the child with completion points for each task they complete. The child would then be able to redeem these points for a gift determined by the parents."
             + " We hope that by doing so, children will enjoy their tasks rather than treating them as a") ; 
     */
      
    

    public String toString() {//i have to make sure that the array keywords is gona print the right value not the address of the array
        return ("Project name: " + projectName + "\nProject year: " + year + "\nProject category: " + projectCategor + "\nProject department: " + Department + "\nProject language: " + projectLanguage + "\nProject describrion: " + describrion + "\nProject keywords: " + keyword);
    }
}