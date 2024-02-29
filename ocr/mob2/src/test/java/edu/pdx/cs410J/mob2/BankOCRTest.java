package edu.pdx.cs410J.mob2;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class BankOCRTest
{

  @Test
  void canInstantiateKataClass() {
    new BankOCR();
  }

  @Test
  void characterIsZeroReturnsZero() {
    BankOCR bankOCR = new BankOCR();
    String zero = " _ \n" +
            "| |\n" +
            "|_|\n";
    assertThat(bankOCR.firstString(zero), equalTo("0"));
  }

  @Test
  void characterIsOneReturnsOne() {
    BankOCR bankOCR = new BankOCR();
    String one = "   \n" +
            "  |\n" +
            "  |\n";
    assertThat(bankOCR.firstString(one), equalTo("1"));
  }
  @Test
  void characterIsTwoReturnsTwo() {
    BankOCR bankOCR = new BankOCR();
    String two = " _ \n" +
            " _|\n" +
            "|_ \n";
    assertThat(bankOCR.firstString(two), equalTo("2"));
  }
  @Test
  void characterIsThreeReturnsThree() {
    BankOCR bankOCR = new BankOCR();
    String three = " _ \n" +
            " _|\n" +
            " _|\n";
    assertThat(bankOCR.firstString(three), equalTo("3"));
  }

  @Test
  void characterIs4Returns4() {
    BankOCR bankOCR = new BankOCR();
    String four = "   \n" +
            "|_|\n" +
            "  |\n";
    assertThat(bankOCR.firstString(four), equalTo("4"));
  }
  @Test
  void characterIs5Returns5() {
    BankOCR bankOCR = new BankOCR();
    String five = " _ \n" +
            "|_ \n" +
            " _|\n";
    assertThat(bankOCR.firstString(five), equalTo("5"));
  }

  @Test
  void characterIs6Returns6() {
    BankOCR bankOCR = new BankOCR();
    String num = " _ \n" +
            "|_ \n" +
            "|_|\n";
    assertThat(bankOCR.firstString(num), equalTo("6"));
  }

  @Test
  void characterIs7Returns7() {
    BankOCR bankOCR = new BankOCR();
    String num = " _ \n" +
            "  |\n" +
            "  |\n";
    assertThat(bankOCR.firstString(num), equalTo("7"));
  }

  @Test
  void characterIs8Returns8() {
    BankOCR bankOCR = new BankOCR();
    String num = " _ \n" +
            "|_|\n" +
            "|_|\n";
    assertThat(bankOCR.firstString(num), equalTo("8"));
  }

  @Test
  void characterIs9Returns9() {
    BankOCR bankOCR = new BankOCR();
    String num = " _ \n" +
            "|_|\n" +
            " _|\n";
    assertThat(bankOCR.firstString(num), equalTo("9"));
  }
  @Test
  void characterIsbadReturnsnull() {
    BankOCR bankOCR = new BankOCR();
    String num = "   \n" +
            "   \n" +
            "   \n";
    assertThat(bankOCR.firstString(num), equalTo(null));
  }
@Test
  void allzerostringreturns000000000(){
    BankOCR bankOCR = new BankOCR();
    String whole = " _  _  _  _  _  _  _  _  _ \n" +
            "| || || || || || || || || |\n" +
            "|_||_||_||_||_||_||_||_||_|\n";
    assertThat(bankOCR.parseString(whole), equalTo("000000000"));
  }
  @Test
  void variedstringreturnsrightstring(){
    BankOCR bankOCR = new BankOCR();
    String whole = "    _  _     _  _  _  _  _ \n" +
                   "  | _| _||_||_ |_   ||_||_|\n" +
                   "  ||_  _|  | _||_|  ||_| _|\n";
    assertThat(bankOCR.parseString(whole), equalTo("123456789"));
  }

}
