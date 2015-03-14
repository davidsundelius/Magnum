package com.magnum;

public class stackoverflowerror {

  //Denna kod ska minimeras
  public String runCode(String i) {
    return "hej" + i;
  }

  public stackoverflowerror() {
    System.out.println(runCode("Hello"));
  }

  public static void main(String[] args) {
    new stackoverflowerror();
  }
}