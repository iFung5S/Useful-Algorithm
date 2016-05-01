public class BinarySearchTree<Type extends Comparable<Type>>
                             implements Comparable<BinarySearchTree<Type>>
{
  private boolean empty;

  private Type value;
  private BinarySearchTree<Type> left;
  private BinarySearchTree<Type> right;

  public BinarySearchTree()
  {
    setEmpty();
  } // BinarySearchTree

  private void setEmpty()
  {
    empty = true;
    left = null;
    right = null;
  } // setEmpty

  public boolean isEmpty()
  {
    return empty;
  } // isEmpty

  public Type getValue()
  {
    return value;
  } // getValue

  public BinarySearchTree<Type> getLeft()
  {
    return left;
  } // getLeft

  public BinarySearchTree<Type> getRight()
  {
    return right;
  } // getRight

  private void setValue(Type requiredValue)
  {
    if (empty)
    {
      empty = false;
      left  = new BinarySearchTree<Type>();
      right = new BinarySearchTree<Type>();
    }
    value = requiredValue;
  } // setValue

  public void insert(Type insertValue)
  {
    if (empty)
      setValue(insertValue);
    else if (insertValue.compareTo(value) < 0)
      left.insert(insertValue);
    else
      right.insert(insertValue);
  } // insert

  public boolean find(Type findValue)
  {
    if (empty)
      return false;
    else if (findValue == value)
      return true;
    else if (findValue.compareTo(value) < 0)
      return left.find(findValue);
    else
      return right.find(findValue);
  } // find

  public void print()
  {
    if (!left.isEmpty())
      left.print();
    if (!empty)
      System.out.println(value.toString());
    if (!right.isEmpty())
      right.print();
  } // print

  public int getSize()
  {
    if (empty)
      return 0;
    else
      return (left.getSize() + 1 + right.getSize());
  } // getSize

  public int getDepth()
  {
    if (empty)
      return 0;
    else
    {
      int leftDepth = left.getDepth();
      int rightDepth = right.getDepth();
      if (leftDepth > rightDepth)
        return leftDepth + 1;
      else
        return rightDepth + 1;
    }
  } // getDepth

  @Override
  public int compareTo(BinarySearchTree<Type> other)
  {
    return this.getValue().compareTo(other.getValue());
  } // compareTo

  public boolean equals(BinarySearchTree<Type> other)
  {
    return this.getValue().equals(other.getValue());
  } // equals

} // class BinarySearchTree