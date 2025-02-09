package com.chaub.marksix;

import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import com.chaub.exception.InvalidInputException;

public class MarkSixHelper{
    private static final int MIN_NUM = 1;
    private static final int MAX_NUM = 49;
    private static final int NUM_COUNT = 6;
    private static final Random random = new Random();

    public List<Integer> single(){
        return generate(NUM_COUNT);
    }

    public List<Integer> multiple(int count) throws InvalidInputException {

        if(count < NUM_COUNT || count > MAX_NUM){
            throw new InvalidInputException(String.format("The count is out of bound, should be between %d to %d", NUM_COUNT, MAX_NUM));
        }
        
        return generate(count);
    }

    private List<Integer> generate(int count){
        return IntStream.generate(() -> random.nextInt(MAX_NUM) + 1)
                        .distinct()
                        .limit(count)
                        .boxed()
                        .sorted()
                        .collect(Collectors.toList());
    }
}
