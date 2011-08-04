package fr.inrialpes.exmo.pirpro;

public class ClassificationSentence {
       
	   String concept;
       String intensity;
	   String polarity;
	   
	   public ClassificationSentence() {
		   
	   }
	   
	   public void setConcept(String concept) {
		      this.concept = concept; 
	   }
	   
	   public void setIntensity(String intensity) {
		      this.intensity = intensity; 
	   }
	   
	   public void setPolarity(String polarity) {
		      this.polarity = polarity; 
	   }
	     
	   public String getConcept() {
		      return this.concept; 
	   }
	   
	   public String getIntensity() {
		      return this.intensity; 
	   }
	   
	   public String getPolarity() {
		      return this.polarity; 
	   }
	   
	   
	   
	
}
