package labfiles;

class Driver {
  public static void main(String[] args) {
    Example ex = new Example("Eraser");
    int total = 0;

    while (total < 50) {
      int num = ex.getNums()[0];
      total += num;
    }

    System.out.println(total);
    System.out.println(ex.sameName(args[0]));

  }
}

