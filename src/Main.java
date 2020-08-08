

import model.entity.Image;
import model.entity.person.Customer;

import model.entity.products.Product;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        EntityManagerFactory factory = Persistence.createEntityManagerFactory("TehranUniversity");
        EntityManager entityManager = factory.createEntityManager();
        EntityTransaction entityTransaction = entityManager.getTransaction();
        entityTransaction.begin();

        //sakhtan img baraye pass dadan be product
        Image image = new Image();
        image.setAddress("C://img.jpg");

        //in product add kardam va farz mikonim az qabl bode moshtari mikhad entekhab kone
        Product product =new Product();
        product.setNumberOfProduct(5);
        product.setPrice(9000L);
        product.setProductDescription("chai albalo");
        product.setName("tea");
        product.setType("drink");

        Product product2 =new Product();
        product2.setNumberOfProduct(7);
        product2.setPrice(8000L);
        product2.setProductDescription("ba kerem karamel");
        product2.setName("cake shokolati");
        product2.setType("cake");


        entityManager.persist(product);
        entityManager.persist(product2);
        entityManager.persist(image);

        // ta khat bala qabln to database bode . alan add kardam ke betonam estefade konam

        List<Product> products = new ArrayList<>();

        products.add(product);
        products.add(product2);

        Customer customer = new Customer();
        customer.setName("elahe");
        customer.setPhone("9102298352");
        customer.setProducts(products);
        customer.setPayMoney(product.getPrice()+product2.getPrice());




        entityManager.persist(customer);


        entityTransaction.commit();
        entityManager.close();

    }
}
