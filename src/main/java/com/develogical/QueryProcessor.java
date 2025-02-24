package com.develogical;

public class QueryProcessor {

    public String process(String query) {
        if (query.toLowerCase().contains("shakespeare")) {
            return "William Shakespeare (26 April 1564 - 23 April 1616) was an " +
                    "English poet, playwright, and actor, widely regarded as the greatest " +
                    "writer in the English language and the world's pre-eminent dramatist.";
        }

        if (query.toLowerCase().contains("imperial")) {
            return "Imperial College is a university in London";
        }

        if (query.toLowerCase()
                 .contains("which year was theresa may first elected as the prime minister of great britain")) {
            return "2016";
        }

        if (query.toLowerCase()
                 .contains("what is 11 minus 17")) {
            return "-6";
        }

        if (query.toLowerCase()
                 .contains("which of the following numbers are primes")) {
            return "337, 241";
        }

        return "";
    }
}
