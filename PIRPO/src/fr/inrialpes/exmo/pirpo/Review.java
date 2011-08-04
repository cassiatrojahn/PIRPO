package fr.inrialpes.exmo.pirpo;

import java.util.Vector;

public class Review {
	
	   Vector<Sentence> sentences;
	   
	   public Review() {
		   
	   }
	   
	   public Vector<Sentence> getSentences() {
		      return this.sentences;
	   }
	   
	   public void setSentences(Vector<Sentence> sentences) {
		      this.sentences = sentences;
	   }

}
