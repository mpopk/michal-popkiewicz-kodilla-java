package foodDoor2Door;

public class OrderRequest {


        public User user;
        public String vendor;
        public String product;
        public int qty;

        public OrderRequest(User user, String vendor, String product, int qty) {
            this.user = user;
            this.vendor = vendor;
            this.product = product;
            this.qty = qty;
        }

        public User getUser() {
            return user;
        }

        public String getVendor() {
            return vendor;
        }

        public String getProduct() {
            return product;
        }

        public int getQty() {
        return qty;
    }
}

