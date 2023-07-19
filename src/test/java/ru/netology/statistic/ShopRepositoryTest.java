
package ru.netology.statistic;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ShopRepositoryTest {
    Product product = new Product(12, "Хлеб", 200);
    Product product1 = new Product(112, "Молоко", 500);
    Product product2 = new Product(44, "Чай", 300);

    @Test
    public void removeId() {
        ShopRepository shop = new ShopRepository();

        shop.add(product);
        shop.add(product1);
        shop.add(product2);
        shop.remove(112);
        Product[] actual = shop.findAll();
        Product[] expected = {product, product2};
    }

    @Test
    public void notFindElement() {
        ShopRepository shop = new ShopRepository();

        shop.add(product);
        shop.add(product1);
        shop.add(product2);


        Assertions.assertThrows(NotFoundException.class,
                () -> shop.remove(23)
        );
    }
}
