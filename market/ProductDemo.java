package market;

public class ProductDemo {
    Product product1 = new Product("Nokia", 543.5, 30);
    Product product2 = new Product("Samsung", 700.4, 40);
    Product product3 = new Product("kia", 900.5, 70);
    Product product4 = new Product("masda", 232, 12);
    Product[] products1 = {product1, product2};
    Product[] products2 = {product3, product4};

    Cotegori categori1 = new Cotegori("Elektronika", products1);
    Cotegori categori2 = new Cotegori("Avto", products2);
    Cotegori[] categoris = {categori1, categori2};

    {
        System.out.println(categoris);
    }

    Basket basket1 = new Basket("categori1", products1);
    Basket basket2 = new Basket("categori2", products2);
    Basket[] baskets = {basket1, basket2};
//for(    Basket basket:baskets)

    {
        System.out.println(baskets);
    }

    User user = new User("kukr", "erw", basket1);

    {
        System.out.println(user);
    }

}
