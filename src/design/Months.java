package design;


    public enum Months {
        January, February, March, April, May, June, July, August, September, October, November, December
    }

    public static void main(String[] args) {

        Months [] mo = Months.values();
        for  (Months month_name : mo)
            System.out.println("Name of the months are: " +month_name);

    }
}
