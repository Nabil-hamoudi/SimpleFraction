public class Fraction {
  // Declaration des attributs
  private int numerateur;
  private int denominateur;
	
  // Constructeurs
  public Fraction (int numerateur) {
    this.numerateur = numerateur;
    this.denominateur = 1;
  }

  public Fraction (int numerateur, int denominateur) {
    this.numerateur = numerateur;
    this.denominateur = denominateur;
  }

  public Fraction () {
    this.numerateur = 1;
    this.denominateur = 1;
  }

  // Fonction recuperation attributs
  public int GetNumerateur () {
    return numerateur;
  }
 
  public int GetDenominateur () {
    return denominateur;
  }
  
  // Get String with attributs
  @Override
  public String toString() {
    return String.format("numerateur = %d, denominateur = %d", GetNumerateur(), GetDenominateur());
  }
}
