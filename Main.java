public class Main {
  public static void main(String[] args) {
    Fraction fractionNumerateur = new Fraction(5);
    Fraction fractionNumerateurDenominateur = new Fraction(2, 7);
    Fraction fractionEmpty = new Fraction();

    assert fractionNumerateur.toString().equals("numerateur = 5, denominateur = 1") : "TestNumerateurSeulement échouer";
    assert fractionNumerateurDenominateur.toString().equals("numerateur = 2, denominateur = 7") : "TestNumerateurEtDenominateur échouer";
    assert fractionEmpty.toString().equals("numerateur = 1, denominateur = 1") : "TestVide échouer";
  }
}

