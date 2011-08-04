package fr.inrialpes.exmo.pirpo;

import java.util.Vector;

public class Sentence {

	   String content;
	   Vector<ClassificationSentence> classifications;
	   
	   public Sentence() {
	   }
	   
	   public void setClassifications(Vector<ClassificationSentence> classifications) {
		      this.classifications = classifications;
	   }
	   
	   public void setContent(String content) {
		      this.content = content;
	   }
	   
	   public Vector<ClassificationSentence> getClassifications() {
		      return this.classifications;
	   }
	   
	   public String getContent() {
		      return this.content;
	   }
}
