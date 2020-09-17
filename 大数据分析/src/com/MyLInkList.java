package com;

import java.util.LinkedList;

public class MyLInkList {

    //创建一个头节点
    Note head = null;


    /**
     * --添加链表节点
     * 找到链表末尾后添加
     */
    public  <E> void addEndNote(E item){
        Note newNode = new Note(item);
        if(head == null){
            head = newNode;
            return;
        }
        Note temp = head;
        while (temp.next != null){
            temp = temp.next;
        }

        temp.next = newNode;
        temp.prev = temp;
    }

    /**
     * --在链表头部添加元素
     */
    public <E> void addHeadNote(E item){
        Note note = new Note(item);
        if (head == null){
            head = note;
            return;
        }

        head = note;
        head.next = head;

    }
    
    /**
     * --打印到最后一个元素
     */
    public void printNode(){
        Note temp = head;
        while (temp.next != null){
            System.out.println(temp.item);
            temp = temp.next;
        }
        System.out.println(temp.item);
    }
}
