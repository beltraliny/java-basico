package com.github.beltraliny.dados;

public class DesempenhoWrapperVsPrimitivo {

    public static void main(String[] args) {
        long start = System.currentTimeMillis();

        // long sum = 0L;
        Long sum = 0L;
        for (long i = 0; i< Integer.MAX_VALUE; i++) {
            sum = sum + i;
        }

        System.out.println(sum);

        double totalTime = (System.currentTimeMillis() - start) / 1000d;
        System.out.printf("Performance: %.2fs%n", totalTime);
    }
}
