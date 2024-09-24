package com.company;

/**
 * This java doc is created by Nipun just for experimentation purpose
 * @author NIPUN
 * @version 0.1
 * @see <a href="https://docs.oracle.com/en/java/javase/19/docs/api/index.html" target="_blank">Java Docs</a>
 * @since 2005
 */

/**
 * this is a class description
 */
    class javadocs_1 {

    /**
     *
     * @param a this is the first variable
     * @param b this is the second variable
     */

    public void add(int a, int b) {
        System.out.println("the sum is " + (a+b));
    }

    /**
     * this is method description
     * @param x this is the 1st variable
     * @param y this is the 2nd variable
     * @return returns the sum
     * @throws Exception if x is 0
     * @deprecated this method is deprecated please use + operator
     */

    public int add1(int x , int y) throws Exception {
        if (x==0){
            throw new Exception();
        }
        int z = x+y;
        return z;
    }

    public static void main(String[] args) {
        System.out.println("this is main method ");

        /**
         * @param i value is 5
         * @param j value is 10
         * @param k gives product of i and j
         */
        int i = 5;
        int j = 10;
        int k = i*j;
        System.out.println(k);


    }

}
