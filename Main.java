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
    double nombre1 = 2.0;
    double nombre2 = 7.0;
    assert fractionNumerateurDenominateur.DoubleConversion() == nombre1 / nombre2 : "testGetdoublenumber échouer";

    // Assert Test addition fraction
    Fraction fractionAddition = fractionNumerateur.Addition(fractionNumerateurDenominateur);
    assert fractionAddition.GetNumerateur() == 37 : "testAddition échouer";
    assert fractionAddition.GetDenominateur() == 7 : "testAddition échouer";
    
    // Assert Test égalité
    Fraction fractionNumerateurDenominateur2 = new Fraction(4, 14);
    assert fractionNumerateurDenominateur2.Egalite(fractionNumerateurDenominateur2) == true : "testEgalite échouer";
    assert fractionNumerateurDenominateur2.Egalite(fractionEmpty) == false : "testEgalite échouer";

    // Assert comparaison
    Fraction fractionzero = new Fraction(0, 1);
    Fraction fractionone = new Fraction(1, 1);
    assert fractionNumerateurDenominateur.compareTo(fractionzero) > 0 : "testCompare echouer";
    assert fractionNumerateurDenominateur.compareTo(fractionNumerateurDenominateur2) == 0 : "testCompare echouer";
    assert fractionNumerateurDenominateur.compareTo(fractionone) < 0 : "testCompare echouer";
  }
}

