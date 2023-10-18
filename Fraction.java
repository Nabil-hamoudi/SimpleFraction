public class Fraction {
  // Declaration des attributs
  private int numerateur;
  private int denominateur;

  // Constants
  public static final Fraction ZERO = new Fraction(0, 1);
  public static final Fraction UN = new Fraction(0, 1);

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
