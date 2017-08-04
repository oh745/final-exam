import java.util.ArrayList;
import java.util.List;

/**
 * Created by preedaphong.r on 04/08/2560.
 */
public class Exam02 {

    List<Product> productList = new ArrayList<Product>();

    public Exam02() {
        productList.add(new Product('A',100));
        productList.add(new Product('B',100));
        productList.add(new Product('C',100));
        productList.add(new Product('D',100));
        productList.add(new Product('E',100));
    }

    public int findCheap(){






        return 100;
    }

    public class Order{

        List<Product> order = new ArrayList<Product>();

        public void addOrder(Product product){
            order.add(product);
        }

        public List<Product> getOrder() {
            return order;
        }

        public void setOrder(List<Product> order) {
            this.order = order;
        }
    }


    public class Product{
        private int price;
        private char productName;

        public Product(char productName ,int price) {
            this.price = price;
            this.productName = productName;
        }

        public int getPrice() {
            return price;
        }

        public void setPrice(int price) {
            this.price = price;
        }

        public char getProductName() {
            return productName;
        }

        public void setProductName(char productName) {
            this.productName = productName;
        }
    }
}
