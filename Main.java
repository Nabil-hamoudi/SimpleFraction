public class Main {
  public static void main(String[] args) {
    Fraction fractionNumerateur = new Fraction(5);
    Fraction fractionNumerateurDenominateur = new Fraction(2, 7);
    Fraction fractionEmpty = new Fraction();
    
    // Assert Test constructeur
    assert fractionNumerateur.toString().equals("numerateur = 5, denominateur = 1") : "TestNumerateurSeulement échouer";
    assert fractionNumerateurDenominateur.toString().equals("numerateur = 2, denominateur = 7") : "TestNumerateurEtDenominateur échouer";
    assert fractionEmpty.toString().equals("numerateur = 1, denominateur = 1") : "TestVide échouer";

    // Assert Test getValue
    assert fractionNumerateurDenominateur.GetNumerateur() == 2 : "testGetNumerateur échouer";
    assert fractionNumerateurDenominateur.GetDenominateur() == 7 : "testGetDenominateur échouer";

    // Assert Test conversion en nombre flottant
    assert fractionNumerateurDenominateur.FloatConversion() == 2.0f / 7.0f : "testGetfloatnumber échouer";

    // Assert Test addition fraction
    Fraction fractionAddition = fractionNumerateur.Addition(fractionNumerateurDenominateur);
    assert fractionAddition.GetNumerateur() == 47 : "testAddition échouer";
    assert fractionAddition.GetDenominateur() == 7 : "testAddition échouer";
  }
}

