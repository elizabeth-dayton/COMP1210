/**
*Grade.
*
*Project 4B.
*Elizabeth Dayton - Fundamentals of Computing - 001.
*10/2/17.
*/
public class Grade {
//instance variabes
   private double exam1;
   private double exam2;
   private double finalExam;
   private double activityAvg;
   private double quizAvg;
   private double projectAvg;
   private String studentName;
   /**
  *constants.
   */
   public static final int EXAM_1 = 1, EXAM_2 = 2, FINAL = 3;
   private static final double EXAM_WEIGHT = 0.15,
      FINAL_WEIGHT = 0.30, ACT_WEIGHT = 0.05,
      QUIZ_WEIGHT = 0.10, PROJ_WEIGHT = 0.25;
   /**
   *constructor.
   *
   *@param studentNameIn used.
   */
   public Grade(String studentNameIn) {
      studentName = studentNameIn;
   }
   //methods
   /**
   *Sets lab average.
   *
   *@param activityAvgIn used.
   *@param quizAvgIn used.
   */
   public void setLabAverages(double activityAvgIn, double quizAvgIn) {
      activityAvg = activityAvgIn;
      quizAvg = quizAvgIn;
   }
   /**
   *Sets project average.
   *
   *@param projectAvgIn used.
   */
   public void setProjectAvg(double projectAvgIn) {
      projectAvg = projectAvgIn;
   }
  /**
   *Sets exam score.
   *
   *@param examType used.
   *@param examScoreIn used.
   */
   public void setExamScore(int examType, double examScoreIn) {
      if (examType == EXAM_1) {
         exam1 = examScoreIn;
      }
      else if (examType == EXAM_2) {
         exam2 = examScoreIn;
      }
      else if (examType == FINAL) {
         finalExam = examScoreIn;
      }
   }
   /**
   *Calculates grade.
   *
   *@return double.
   */
   public double calculateGrade() {
      double grade = exam1 * EXAM_WEIGHT + exam2 * EXAM_WEIGHT
         + finalExam * FINAL_WEIGHT
         + activityAvg * ACT_WEIGHT
         + quizAvg * QUIZ_WEIGHT
         + projectAvg * PROJ_WEIGHT;
      return grade;
   }
   /**
*creates a string from all the info.
*
*@return String.
*/
   public String toString() {
      return  "Name: " + studentName + "\n"
         + "Course Grade: " + calculateGrade();
   }
}
