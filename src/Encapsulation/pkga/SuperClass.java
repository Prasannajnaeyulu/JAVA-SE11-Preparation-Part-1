package Encapsulation.pkga;


public class SuperClass {
    String text="hello";
    SuperClass() {}
    protected SuperClass(String text) {}
    protected void setText(String text) { this.text = text; }
    public String toString() {  return text;  }
}
