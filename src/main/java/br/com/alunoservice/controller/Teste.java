package br.com.alunoservice.controller;


public class Teste {


    public static void main(String[] args) {
        System.out.println(formatDuration(62));    // Output: 1 minute and 2 seconds
        System.out.println(formatDuration(0));     // Output: now
        System.out.println(formatDuration(3600));  // Output: 1 hour
    }
        public static String formatDuration(int seconds) {
            if (seconds == 0) {
                return "now";
            }

            int years = seconds / (365 * 24 * 60 * 60);
            seconds %= (365 * 24 * 60 * 60);
            int months = seconds / (30 * 24 * 60 * 60);
            seconds %= (30 * 24 * 60 * 60);
            int days = seconds / (24 * 60 * 60);
            seconds %= (24 * 60 * 60);
            int hours = seconds / (60 * 60);
            seconds %= (60 * 60);
            int minutes = seconds / 60;
            seconds %= 60;

            StringBuilder result = new StringBuilder();

            if (years > 0) {
                result.append(years).append(years == 1 ? " year" : " years").append(" ");
            }
            if (months > 0) {
                result.append(months).append(months == 1 ? " month" : " months").append(" ");
            }
            if (days > 0) {
                result.append(days).append(days == 1 ? " day" : " days").append(" ");
            }
            if (hours > 0) {
                result.append(hours).append(hours == 1 ? " hour" : " hours").append(" ");
            }
            if (minutes > 0) {
                result.append(minutes).append(minutes == 1 ? " minute" : " minutes");
            }
            if (seconds > 0) {
                if (result.length() > 0) {
                    result.append(" and ");
                }
                result.append(seconds).append(seconds == 1 ? " second" : " seconds");
            }

            return result.toString();
        }


}







