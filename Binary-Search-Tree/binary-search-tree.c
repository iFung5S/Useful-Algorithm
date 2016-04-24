#include "binary-search-tree.h"

Node* insert(DataType data, Node* currentNode)
{
  if (currentNode == NULL)
  {
    Node* newNode = malloc(sizeof(Node));
    newNode->data = data;
    newNode->left = NULL;
    newNode->right = NULL;
    return newNode;
  } // if
  else
  {
    if (data < currentNode->data)
      currentNode->left = insert(data, currentNode->left);
    else
      currentNode->right = insert(data, currentNode->right);
    return currentNode;
  } // else
} // insert

bool find(DataType data, Node* currentNode)
{
  if (currentNode == NULL)
    return false;
  if (data == currentNode->data)
    return true;
  else if (data < currentNode->data)
    return find(data, currentNode->left);
  else if (data > currentNode->data)
    return find(data, currentNode->right);
  else
    return false;
} // find

void print(Node* currentNode)
{
  if (currentNode->left != NULL)
    print(currentNode->left);
  if (currentNode != NULL)
    printf("%d\n", currentNode->data);
  if (currentNode->right != NULL)
    print(currentNode->right);
} // print
