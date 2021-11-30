public class Shop {
        public int productCode;
        public String productName;
        public String description;
        public int quantity;
        public double price;
        public String species;

        public Shop(int productCode, String productName, String description, int quantity, double price, String species) {
            this.productCode = productCode;
            this.productName = productName;
            this.description = description;
            this.quantity = quantity;
            this.price = price;
            this.species = species;
        }

        @Override
        public String toString() {
            return productCode+ " - "+productName+ " - "+description+ " - "+quantity+ " - "+price+" - "+species;
        }
    }
