include <stdlib.h>
#include <stdio.h>
#include <stdbool.h>

typedef int DataType;

typedef struct
{
  DataType data;
  struct Node* left;
  struct Node* right;
} Node;

extern Node* insert(DataType data, Node* currentNode);
extern bool find(DataType data, Node* currentNode);
extern void print(Node* currentNode);
