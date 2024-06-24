public class Strings {
  public static void main(String[] args) {
    String st = "mmuig";

    // char[] ch = new char[10];
    // for (int i = 0; i < st.length(); i++) {
    //   ch[i] = st.charAt(i); 
    // }

    char[] ch = st.toCharArray();

    for (int i = 0; i < st.length(); i++) {
      System.out.print(ch[i]);
    }
    String substr = st.substring(0,3);
    String trimmed = "  hello  ".trim();  // "hello"



    System.out.println();
    System.out.println("String Length: "+st.length());
    System.out.println("index "+st.charAt(3));
    System.out.println("Substring: "+ substr);
    System.out.println("Triam : "+trimmed);

  }
}
