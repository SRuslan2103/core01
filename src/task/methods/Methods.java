package task.methods;


public class Methods {

  public String stringToLowerCase(String str) {
    return str.toLowerCase();
  }

  public int sumOfTwoNumbers(int a, int b) {
    return a + b;
  }

  public String sumOfTwoStrings(String a, String b) {
    return a + b;
  }

  public String sumOfStringAndNumber(String str, int num) {
      int num1 = Integer.valueOf(str);
      int q = num1 + num;
      String answer = Integer.toString(q);
      return answer ;
  }

  public boolean compareStringNumberWithInt(String str, int num) {
    int input = Integer.parseInt(str);
    return input < num;
  }

  public boolean checkBooleans(boolean a, boolean b) {

    return a || b;
  }

  public boolean isEven(int num) {

    return num%2==0;
  }

  public String checkArrayEvenOdd(int[] arr) {
    int even = 0, odd = 0;
    for (int i = 0; i < arr.length; i++) {
      if (arr[i]%2==0) { even++; }
      else if (arr[i]%2!=0) { odd++;}
    }
    //if (even == arr.length) {System.out.print("все четные");}
    //else if (odd == arr.length) {System.out.print("все нечетные");}
    //else {System.out.print("и те и другие");}

    return even==arr.length ? "Массив четных чисел" : odd == arr.length ? "Массив нечетных чисел" : "Массив четных и нечетных чисел";
  }

  public int[] sumArrayElements(int[] arr) {
    for (int i = 1; i < arr.length; i++) {
      arr [i] = arr [i] + arr [i-1];
    }
    //(Arrays.toString(arr));
    return arr;
  }

  public int sumArray(int[] arr) {
    int sum = 0;
    for (int i = 0; i < arr.length; i++) { sum = sum + arr [i];}
    return sum;
  }

  public int ageInMonths(int years) {

    return years*12;
  }

  public int ageInMinutes(int years) {

    return years*365*24*60;
  }

  public int ageInHours(int years) {

    return years*365*24;
  }

  public boolean areNamesEqual(String name1, String name2) {
    //String name01=name1.toLowerCase(), name02 = name2.toLowerCase();
    return name1.toLowerCase().equals(name2.toLowerCase());
  }

  public int getLastElement(int[] arr) {
    return arr[arr.length-1];
  }

  public int countLetterA(String str) {
    String strLC = str.toLowerCase();
    String [] letter = strLC.split("");
    int q = 0;
    for (int i=0; i<letter.length; i++) {
      if (letter[i].contains("a")) {q = q +1;}
    }
    return q;
  }

  private int wallet = 1000;

  public String withdraw(int amount) {
      int withdraw=0;
      if (amount <= wallet) { withdraw= wallet-amount;}
      return "Остаток в кошельке: " + withdraw;
    }

  public String deposit(int amount) {
      if (amount > wallet) {};
    return null;
  }
}