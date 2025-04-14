package BAI22;
public class BOOK {
public static class Author {
        private String name;
        private String email;
        private char gender;

        public Author(String name, String email, char gender) {
            this.name = name;
            this.email = email;
            this.gender = gender;
        }

        public String getName() {
            return name;
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public char getGender() {
            return gender;
        }

        @Override
        public String toString() {
            return "Author[name=" + name + ", email=" + email + ", gender=" + gender + "]";
        }
    }

    // Lớp Book (Sách)
    public static class Book {
        private String name;
        private Author[] authors;
        private double price;
        private int qty = 0;

        public Book(String name, Author[] authors, double price) {
            this.name = name;
            this.authors = authors;
            this.price = price;
        }

        public Book(String name, Author[] authors, double price, int qty) {
            this.name = name;
            this.authors = authors;
            this.price = price;
            this.qty = qty;
        }

        public String getName() {
            return name;
        }

        public Author[] getAuthors() {
            return authors;
        }

        public double getPrice() {
            return price;
        }

        public void setPrice(double price) {
            this.price = price;
        }

        public int getQty() {
            return qty;
        }

        public void setQty(int qty) {
            this.qty = qty;
        }

        public String getAuthorNames() {
            StringBuilder authorNames = new StringBuilder();
            for (int i = 0; i < authors.length; i++) {
                authorNames.append(authors[i].getName());
                if (i != authors.length - 1) {
                    authorNames.append(", ");
                }
            }
            return authorNames.toString();
        }

        @Override
        public String toString() {
            StringBuilder authorsString = new StringBuilder("{");
            for (int i = 0; i < authors.length; i++) {
                authorsString.append(authors[i].toString());
                if (i != authors.length - 1) {
                    authorsString.append(", ");
                }
            }
            authorsString.append("}");
            return "Book[name=" + name + ", authors=" + authorsString + ", price=" + price + ", qty=" + qty + "]";
        }
    }
}

