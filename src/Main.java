

import model.entity.Billing;
import model.entity.Entities;

import model.entity.Image;
import model.entity.person.Customer;
import model.entity.person.Person;

import model.entity.products.Product;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        EntityManagerFactory factory = Persistence.createEntityManagerFactory("TehranUniversity");
        EntityManager entityManager = factory.createEntityManager();
        EntityTransaction entityTransaction = entityManager.getTransaction();
        entityTransaction.begin();

        Customer customer = new Customer();
        customer.setName("elahe");
        customer.setLastName("yarahmadi");
        customer.setPhone("9102298352");
        customer.setPayMoney(7000L);


        Product product =new Product();
        product.setNumberOfProduct(5);
        product.setPrice(45000L);
        product.setProductDescription("tea");

        List<Product> products = new ArrayList<>();
        products.add(product);


        Billing billing =new Billing();
        billing.setTotalPrice(product.getPrice());
        billing.setProducts(products);

        customer.setBilling(billing);

        Image image =new Image();
        image.setAddress("C://test.jpg");

        customer.setImage(image);
        product.setImage(image);
        
        entityManager.persist(customer);
        entityManager.persist(billing);
        entityManager.persist(image);

        entityTransaction.commit();
        entityManager.close();

    }
}
