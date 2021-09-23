package labfiles;

class Example {
  private final String name;
  private final int[] nums;

  public Example(String name) {
    this.name = name;
    this.nums = new int[] {12, 12, 23, 23, 35};
  }

  boolean sameName(String other) {
    return other.equals(name);
  }

  public int[] getNums() {
    return nums;
  }
}  
