package com;

import java.util.LinkedList;

public class Note<E> {
    E item ;
    Note<E> next = null;
    Note<E> prev;


    Note(E item) {
        this.item = item;

    }


    public static void main(String[] args) {

    }
}
