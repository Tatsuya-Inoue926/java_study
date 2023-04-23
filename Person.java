public class Person {
    private String name;
    /*thisの検証用 */
  
  public Person(String name) {
    this.name = name;
    System.out.println(this.name);
  }
  
  public void setName(String name) {
    this.name = name;
  }
  
  public String getName() {
    return this.name;
  } 
} 
