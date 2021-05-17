package com.java21days.ch4;

class WordNumber {
    public static void main(String[] args) {
        String word = "one";
        if (args.length > 0) {
            word = args[0];
        }
        
        long num = 0;
        char firstChar = word.charAt(0);
        char secondChar = word.charAt(1);
        switch (firstChar) {
            case 'o':
                num = 1L;
                break;
            case 't':
                if (secondChar == 'w') {
                    num = 2L;
                }
                if (secondChar == 'h') {
                    num = 3L;
                }
                if (secondChar == 'e') {
                    num = 10L;
                }
                break;
            case 'f':
                if (secondChar == 'o') {
                    num = 4L;
                }
                if (secondChar == 'i') {
                    num = 5L;
                }
                break;
            case 's':
                if (secondChar == 'i') {
                    num = 6L;
                }
                if (secondChar == 'e') {
                    num = 7L;
                }
                break;
            case 'e':
                num = 8L;
                break;
            case 'n':
                num = 9L;
                break;
        }
        
        System.out.println(num);
    }
}
