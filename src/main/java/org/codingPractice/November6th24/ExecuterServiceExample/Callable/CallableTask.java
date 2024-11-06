package org.codingPractice.November6th24.ExecuterServiceExample.Callable;

import java.util.concurrent.Callable;

public class CallableTask implements Callable<Integer> {
    @Override
    public Integer call() throws Exception {
        return 20; //simulating values
    }
}
