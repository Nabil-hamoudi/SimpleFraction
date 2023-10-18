public class Fraction extends Number {
  // Declaration des attributs
  private int numerateur;
  private int denominateur;

  // Constants
  public static final Fraction ZERO = new Fraction(0, 1);
  public static final Fraction UN = new Fraction(1, 1);

  // Constructeurs
  public Fraction (int numerateur) {
    this.numerateur = numerateur;
    this.denominateur = 1;
  }

  public Fraction (int numerateur, int denominateur) {
    if (denominateur == 0) {
      throw new ArithmeticException("Division by zero is not allowed.");
    };
    this.numerateur = numerateur % 128;
    this.denominateur = denominateur % 128;
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

  // methode
  public byte byteValue () {
    throw new ArithmeticException("int conversion in byte cant work");
  }

  public int intValue () {
    return numerateur / denominateur;
  }

  public short shortValue () {
    throw new ArithmeticException("int conversion in short cant work");
  }

  public long longValue () {
    long numerateurlong = numerateur;
    long denominateurlong = denominateur;
    return numerateurlong / denominateurlong;
  }

  public double doubleValue () {
    double numerateurdouble = numerateur;
    double denominateurdouble = denominateur;
    return numerateurdouble / denominateurdouble;
  }

  public float floatValue () {
    float numerateurfloat = numerateur;
    float denominateurfloat = denominateur;
    return numerateurfloat / denominateurfloat;
  }

  public Fraction addition (Fraction fraction2) {
    int numerateur2 = fraction2.GetNumerateur();
    int denominateur2 = fraction2.GetDenominateur();
    return new Fraction((numerateur * denominateur2) + (numerateur2 * denominateur), denominateur * denominateur2);
  }

  public boolean Egalite (Fraction fraction2) {
    if  (denominateur % fraction2.GetDenominateur() == 0) {
      int multiple = fraction2.GetDenominateur() / denominateur;
      if (numerateur == fraction2.GetNumerateur() * multiple) {
        return true;
      };
    }
    else if (fraction2.GetDenominateur() % denominateur == 0) {
      int multiple = denominateur / fraction2.GetDenominateur();
      if (numerateur * multiple == fraction2.GetNumerateur()) {
        return true;
      };
    };
    return false;
  }

  public double compareTo (Fraction fraction2) {
    return doubleValue() - fraction2.doubleValue();
  }

  // Get String with attributs
  @Override
  public String toString() {
    return String.format("numerateur = %d, denominateur = %d", GetNumerateur(), GetDenominateur());
  }
}
