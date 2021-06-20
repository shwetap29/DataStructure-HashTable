package com.bridgelabz;

public interface INode<T> {
   void setData(T data);
   T setData();
   void setNext(INode<T> next);
   INode<T> getNext();
}
