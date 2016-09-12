package org.egov.bootcamp;

import org.egov.bootcamp.model.Node;

public class LinkedList<T> {
    private Node<T> head;
    private Node<T> tail;

    public void add(T element) {
        if(element==null)
            throw new NullPointerException();
        Node<T> newNode = new Node<>(element);
      if(tail==null)
        tail=newNode;
      if(head==null)  
          head=newNode;
      else
      {
        tail.setNext(newNode);
        tail=newNode;
      }
    }

    public boolean prune(Node<T> n, Node<T> lP) {
        if (lP == null) {
            return false;
        } else if (n.equals(lP)) {
            head = lP.getNext();
            return true;
        } else if (n.equals(lP.getNext())) {
            lP.setNext(lP.getNext().getNext());
            return true;
        }
        return prune(n, lP.getNext());
    }

    public boolean remove(T e) {
        Node<T> n = new Node<>(e);
        return prune(n, head);
    }

    public int length(Node<T> listPointer, int totalLength) {
        if (listPointer == null) {
            return totalLength;
        }
        return length(listPointer.getNext(), ++totalLength);
    }

    public int length() {
        return length(head, 0);
    }

    public T[] toArray() {
        int listLength = this.length();
        T[] array = (T[]) new Object[listLength];
        Node listPointer = head;
        for (int i = 0; i < listLength; i++) {
            array[i] = (T) listPointer.getValue();
            listPointer = listPointer.getNext();
        }
        return array;
    }

    public void insert(T element, int position) {
        if (position > this.length()) return;
        Node lP = head;
        for (int i = 0; i < position - 1; i++) {
            lP = lP.getNext();
        }
        if (position == 0) {
            Node<T> newNode = new Node<>(element);
            newNode.setNext(lP);
            head = newNode;
        } else {
            Node<T> newNode = new Node<>(element);
            newNode.setNext(lP.getNext());
            lP.setNext(newNode);
        }
    }

}
