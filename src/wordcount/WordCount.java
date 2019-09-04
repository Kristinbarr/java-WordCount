//CONSTRUCTOR where we send text to the field?

package wordcount;

public class WordCount {
  //instantiating a variable for future string, private to this class
  private String declaration;

  // creating a class and instantiating fields/state
  public WordCount(String declaration) {
    this.declaration = declaration;
  }
  // creating a getter method to access declaration
  public String getDeclaration() {
    return declaration;
  }
  // setter method to update or add to the class? void since it doesn't return anything
  public void setDeclaration(String declaration) {
    this.declaration = declaration;
  }

  //
  @Override
    public String toString() {
      return "Words{" + "declaration=''" + declaration + '\'' + '}';
    }
}
