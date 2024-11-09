package Exceptionprg;
//Custom exception for age requirement
class AgeRequirementException extends Exception {
 public AgeRequirementException(String message) {
     super(message);
 }
}

//Custom exception for stream requirement
class StreamRequirementException extends Exception {
 public StreamRequirementException(String message) {
     super(message);
 }
}

//Custom exception for marks requirement
class MarksRequirementException extends Exception {
 public MarksRequirementException(String message) {
     super(message);
 }
}

public class CollegeEligibilityCheck {

 public static void main(String[] args) {
     try {
         int age = 19; // Applicant's age
         String stream = "Computer Science"; // Applicant's stream
         int marks = 550; // Applicant's marks out of 600

         checkEligibility(age, stream, marks);
         System.out.println("The applicant is eligible for college admission.");
     } catch (AgeRequirementException | StreamRequirementException | MarksRequirementException e) {
         System.out.println("Eligibility Check Failed: " + e.getMessage());
     }
 }

 // Method to check eligibility
 static void checkEligibility(int age, String stream, int marks) 
     throws AgeRequirementException, StreamRequirementException, MarksRequirementException {
     
     // Check if the applicant is over 18 years old
     if (age <= 18) 
     {
         throw new AgeRequirementException("Applicant must be over 18 years old.");
     }

     // Check if the applicant has studied in the computer stream
     if (!stream.equalsIgnoreCase("Computer Science")) 
     {
         throw new StreamRequirementException("Applicant must have studied in the computer stream.");
     }

     // Check if the applicant has more than 500 marks out of 600
     if (marks <= 500) 
     {
         throw new MarksRequirementException("Applicant must have more than 500 marks out of 600.");
     }
 }
}

