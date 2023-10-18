public class Main {
  public static void main(String[] args) {
    Fraction fractionNumerateur = new InitNumerateurOnly(5);
    Fraction fractionNumerateurDenominateur = new InitNumerateurDenominateur(2, 7);
    Fraction fractionEmpty = new InitEmpty();

    assert fractionNumerateur.toString().equals("numerateur = 5, denominateur = 1");
    System.out.println("NumerateurOnly OK");
    assert fractionNumerateurDenominateur.toString().equals("numerateur = 2, denominateur = 7");
    System.out.println("NumerateurDenominateur OK");
    assert fractionEmpty.toString().equals("numerateur = 1, denominateur = 1");
    System.out.println("Empty OK");
  }
}

