package BAI35;

public class MyDate {
        private int year;
        private int month;
        private int day;
    
        private static final String[] MONTHS = {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
        private static final int[] DAYS_IN_MONTH = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        private static final String[] DAYS = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
    
        public MyDate(int year, int month, int day) {
            setDate(year, month, day);
        }
    
        public void setDate(int year, int month, int day) {
            if (!isValidDate(year, month, day)) {
                throw new IllegalArgumentException("Invalid year, month, or day!");
            }
            this.year = year;
            this.month = month;
            this.day = day;
        }
    
        public static boolean isLeapYear(int year) {
            return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
        }
    
        public static boolean isValidDate(int year, int month, int day) {
            if (year < 1 || year > 9999 || month < 1 || month > 12) {
                return false;
            }
            int maxDays = DAYS_IN_MONTH[month - 1];
            if (month == 2 && isLeapYear(year)) {
                maxDays = 29;
            }
            return day >= 1 && day <= maxDays;
        }
    
        public int getYear() { return year; }
        public int getMonth() { return month; }
        public int getDay() { return day; }
    
        public void setYear(int year) {
            if (year < 1 || year > 9999) {
                throw new IllegalArgumentException("Invalid year!");
            }
            this.year = year;
        }
    
        public void setMonth(int month) {
            if (month < 1 || month > 12) {
                throw new IllegalArgumentException("Invalid month!");
            }
            this.month = month;
        }
    
        public void setDay(int day) {
            if (!isValidDate(this.year, this.month, day)) {
                throw new IllegalArgumentException("Invalid day!");
            }
            this.day = day;
        }
    
        public String toString() {
            return DAYS[getDayOfWeek(year, month, day)] + " " + day + " " + MONTHS[month - 1] + " " + year;
        }
    
        public static int getDayOfWeek(int year, int month, int day) {
            if (month < 3) {
                month += 12;
                year--;
            }
            int k = year % 100;
            int j = year / 100;
            int h = (day + (13 * (month + 1)) / 5 + k + (k / 4) + (j / 4) + (5 * j)) % 7;
            return (h + 6) % 7;  
        }
    
        public MyDate nextDay() {
            int maxDays = DAYS_IN_MONTH[month - 1];
            if (month == 2 && isLeapYear(year)) {
                maxDays = 29; 
            }
        
            if (day < maxDays) {
                day++;
            } else {
                day = 1;
                if (month == 12) {
                    year++;
                    month = 1;
                } else {
                    month++;
                }
            }
            return this;
        }
    
        public MyDate previousDay() {
            if (day > 1) {
                day--;
            } else {
                if (month == 1) {
                    year--;
                    month = 12;
                    day = 31;
                } else {
                    month--;
                    day = DAYS_IN_MONTH[month - 1];
                    if (month == 2 && isLeapYear(year)) {
                        day = 29;  // Xử lý tháng 2 năm nhuận
                    }
                }
            }
            return this;
        }
    }

