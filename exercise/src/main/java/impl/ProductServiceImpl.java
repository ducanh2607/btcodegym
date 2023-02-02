package impl;

import model.Product;
import service.IProductService;

import java.util.ArrayList;

import java.util.List;

public class ProductServiceImpl implements IProductService {
    private static ArrayList<Product> products;
    private static Long INDEX;
    static {
        products = new ArrayList<>();
        products.add(new Product(1L, "Civic", 1234567D, 20));
        products.add(new Product(2L, "City", 1034567D, 30));
        INDEX = products.get(products.size()-1).getId();
    }

    @Override
    public List<Product> findAll() {
        return products;
    }

    @Override
    public Product findById(Long id) {
        for (Product p : products){
            if (p.getId().equals(id)){
                return p;
            }
        }
        return null;
    }

    @Override
    public void save(Product product) {
        if (product.getId() == null){
            product.setId(++INDEX);
        }
        products.add(product);

    }

    @Override
    public List<Product> deleteById(Long id) {
        Product product = new Product();
        for (Product p :products){
            if (p.getId().equals(id)){
                product = p;
            }
        }
        products.remove(product);
        return products;

    }

    @Override
    public List<Product> findByNameContaining(String name) {
        List<Product> productList = new ArrayList<>();
        for (Product p : products){
            if (p.getName().contains(name)){
              productList.add(p);
            }
        }
        return productList;
    }
}
