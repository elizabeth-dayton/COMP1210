/**
*Represents an online text item and keeps track of word count.
*
*Activity 10.
*Elizabeth Dayton - Fundamentals of Computing - 001.
*11/27/17.
*/
public class OnlineArticle extends OnlineTextItem { 

//variables
   private int wordCount;
   
/**
*constructs an online article.
*
*@param nameIn used.
*@param priceIn used.
*/
   public OnlineArticle(String nameIn, double priceIn) {
   
      super(nameIn, priceIn);
      wordCount = 0;
   
   }
//methods

/**
*sets the word count.
*
*@param wordCountIn used.
*/
   public void setWordCount(int wordCountIn) {
   
      wordCount = wordCountIn;
   
   }     
}
