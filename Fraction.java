public class Fraction {
  // Declaration des attributs
  private int numerateur;
  private int denominateur;
	
  // Constructeurs
  public InitNumerateurOnly (int numerateur) {
    this.numerateur = numerateur;
    this.denominateur = 1;
  }

  public InitNumerateurDenominateur (int numerateur, int denominateur) {
    this.numerateur = numerateur;
    this.denominateur = denominateur;
  }

  public InitEmpty () {
    this.numerateur = 1;
    this.denominateur = 1;
  }

  // Fonction recuperation attributs
  public int GetNumerateur () {
    return numerateur;
  }
 
  public int GetDenominateur () {
    return numerateur;
  }
}
