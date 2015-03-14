package com.magnum;

public class nullpointerexception {

  //Denna kod ska minimeras
  public String runCode(String i) {
    return "hej" + i;
  }

  public nullpointerexception() {
    System.out.println(runCode("Hello"));
  }

  public static void main(String[] args) {
    new nullpointerexception();
  }
}