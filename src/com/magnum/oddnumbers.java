package com.magnum;

//Zorek

public class oddnumbers {

  //Denna kod ska minimeras
  public String runCodeLong(String i) {
    int j=0,k=0,l=i.length(),m;
    String s,c="";
    while(j!=l) {
      s="";
      while(j!=l) {
        c=i.charAt(j)+"";
        j++;
        if(c.equals(","))break;
        s+=c;
      }
      if(Integer.valueOf(s)%2==1)k++;
    }
    return k+"";
  }

  public String runCode(String i){int j=0,k=0,l=i.length(),m;String s,c="";while(j!=l){s="";while(j!=l){c=i.charAt(j)+"";j++;if(c.equals(","))break;s+=c;}if(Integer.valueOf(s)%2==1)k++;}return k+"";}

  public oddnumbers() {
    System.out.println(runCode("1,2,3,45,5,6,555"));
  }

  public static void main(String[] args) {
    new oddnumbers();
  }
}
