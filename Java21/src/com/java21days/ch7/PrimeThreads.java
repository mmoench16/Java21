package com.java21days.ch7;

public class PrimeThreads {
    public static void main(String[] args) {
        PrimeThreads pt = new PrimeThreads(args);
    }
    
    public PrimeThreads(String[] arguments) {
        try {
            PrimeFinder[] finder = new PrimeFinder[arguments.length];
            for (int i = 0; i < arguments.length; i++) {
                long count = Long.parseLong(arguments[i]);
                finder[i] = new PrimeFinder(count);
                System.out.println("Looking for prime " + count);
            }
            boolean complete = false;
            while (!complete) {
                complete = true;
                for (int j = 0; j < finder.length; j++) {
                    if (finder[j] == null) continue;
                    if (!finder[j].finished) {
                        complete = false;
                    } else {
                        displayResult(finder[j]);
                        finder[j] = null;
                    }
                }
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException ie) {
                    // Do nothing
                }
            }
        } catch (NumberFormatException nfe) {
            System.out.println("Error: " + nfe.getMessage());
        } catch (NegativeNumberException nne) {
            System.out.println("Error: " + nne.getMessage());
        }
    }
    
    private void displayResult(PrimeFinder finder) {
        System.out.println("Prime " + finder.target + " is " + finder.prime);
    }
}
