package com.productop.dao;

import javax.transaction.Transactional;
import com.productop.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ProductDao {
    @Autowired
    private HibernateTemplate hibernateTemplate;

    @Transactional
    public void createProduct(Product product) {
        this.hibernateTemplate.save(product);
    }
    public List<Product> getProducts(){
        List<Product> products = this.hibernateTemplate.loadAll(Product.class);
        return products;
    }

    public HibernateTemplate getHibernateTemplate() {
        return hibernateTemplate;
    }

    public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
        this.hibernateTemplate = hibernateTemplate;
    }

    @Transactional
    public void deleteProduct(int pid){
       Product p = this.hibernateTemplate.load(Product.class, pid);
       this.hibernateTemplate.delete(p);
    }
    public Product getProduct(int pid){
        return this.hibernateTemplate.get(Product.class, pid);
    }
}
