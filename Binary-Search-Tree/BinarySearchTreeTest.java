public class BinarySearchTreeTest
{
  public static void main(String[] args)
  {
    BinarySearchTree<String> tree = new BinarySearchTree <String>();

    String[] insertStrings
      = new String[] {"Hello", "world",
                      "This", "is", "a", "Java", "program", "for",
                      "testing", "BinarySearchTree"};

    for (String string : insertStrings)
      tree.insert(string);

    tree.print();
    System.out.println("Size:  " + tree.getSize());
    System.out.println("Depth: " + tree.getDepth());

  } // main
} // class BinarySearchTreeTest
