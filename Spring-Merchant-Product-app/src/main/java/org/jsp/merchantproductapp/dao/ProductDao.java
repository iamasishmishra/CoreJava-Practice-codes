package org.jsp.merchantproductapp.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;

import org.jsp.merchantproductapp.dto.Merchant;
import org.jsp.merchantproductapp.dto.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
@SuppressWarnings(value = { "unchecked" })
public class ProductDao {

	@Autowired
	EntityManager entityManager;

	public Product saveProduct(Product product, int merchant_id) {
		EntityTransaction transaction = entityManager.getTransaction();
		Merchant merchant = entityManager.find(Merchant.class, merchant_id);
		if (merchant != null) {
			product.setMerchant(merchant); // Assigning merchant to products
			List<Product> products = merchant.getProducts();
			products.add(product);
			merchant.setProducts(products);
			// merchant.getProducts().add(product);
			entityManager.persist(product);
			transaction.begin();
			transaction.commit();
			return product;
		}
		return null;
	}

	public Product updateProduct(Product product) {
		EntityTransaction transaction = entityManager.getTransaction();
		Product dbProduct = entityManager.find(Product.class, product.getId());
		if (dbProduct != null) {
			dbProduct.setBrand(product.getBrand());
			dbProduct.setCategory(product.getCategory());
			dbProduct.setName(product.getName());
			dbProduct.setDescription(product.getDescription());
			dbProduct.setCost(product.getCost());
			dbProduct.setImage_url(product.getImage_url());
			transaction.begin();
			transaction.commit();
			return dbProduct;
		}
		return null;
	}
	
	public List<Product> findProductsByMerchantId(int merchant_id) {
		Query q = entityManager.createQuery("select m.products from Merchant m where m.id=?1");
		q.setParameter(1, merchant_id);
		return q.getResultList();
	}
	
	public List<Product> findByCategory(String category) {
		Query q = entityManager.createQuery("select p from Product p where p.category=?1");
		q.setParameter(1, category);
		return q.getResultList();
	}

	public List<Product> findByBrand(String brand) {
		Query q = entityManager.createQuery("select p from Product p where p.brand=?1");
		q.setParameter(1, brand);
		return q.getResultList();
	}
}
