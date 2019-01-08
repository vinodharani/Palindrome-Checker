package com.vino;

import java.util.Queue;
import java.util.Arrays;
import java.util.LinkedList;

/**
 * This was asked in Kroger interview
 * Find the output of the following
 */
class PrettyPrint {

    public void doAction(Queue q) {
        if (q.isEmpty()) {
            return;
        }

        Object first = q.remove();
        doAction(q);
        System.out.println(first.toString());
    }

    public static void main (String[] args) {
        LinkedList<String> starterList = new LinkedList<>(Arrays.asList("A", "B", "C", "D", "E"));

        PrettyPrint pp = new PrettyPrint();
        pp.doAction(starterList);
    }
}
