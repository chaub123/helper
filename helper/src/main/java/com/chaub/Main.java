package com.chaub;

import com.chaub.exception.InvalidInputException;
import com.chaub.marksix.MarkSixHelper;

public class Main {
    public static void main(String[] args) throws InvalidInputException {
        MarkSixHelper markSixHelper = new MarkSixHelper();

        System.out.println(markSixHelper.single());
        System.out.println(markSixHelper.single());
        System.out.println(markSixHelper.multiple(8));
    }
}