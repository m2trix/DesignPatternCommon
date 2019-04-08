package com.example.lenovo;

import android.app.Notification;

import com.example.lenovo.adapter.Duck;
import com.example.lenovo.adapter.MallardDuck;
import com.example.lenovo.adapter.Turkey;
import com.example.lenovo.adapter.TurkeyAdapter;
import com.example.lenovo.adapter.WildTurkey;
import com.example.lenovo.command.Broker;
import com.example.lenovo.command.BuyStockOrder;
import com.example.lenovo.command.Order;
import com.example.lenovo.command.SellStockOrder;
import com.example.lenovo.command.Stock;
import com.example.lenovo.composite.Employee;
import com.example.lenovo.decorator.Car;
import com.example.lenovo.decorator.CarDecorator;
import com.example.lenovo.decorator.FlyCarDecorator;
import com.example.lenovo.decorator.RunCar;
import com.example.lenovo.decorator.SwimCarDecorator;
import com.example.lenovo.factory_method.AppleFactory;
import com.example.lenovo.factory_method.BananaFactory;
import com.example.lenovo.factory_method.Fruit;
import com.example.lenovo.factory_method.FruitFactory;
import com.example.lenovo.iterator.Iterator;
import com.example.lenovo.iterator.NameRepository;
import com.example.lenovo.simple_factory.SimpleFactory;
import com.example.lenovo.template.Cricket;
import com.example.lenovo.template.Football;
import com.example.lenovo.template.Game;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    @Test
    public void addition_isCorrect() throws Exception {
        assertEquals(4, 2 + 2);
    }

    @Test
    public void factoryMethodTest() {
        FruitFactory ff = new AppleFactory();
        Fruit apple = ff.getFruit();
        apple.get();

        FruitFactory ff2 = new BananaFactory();
        Fruit banana = ff2.getFruit();
        banana.get();
    }

    @Test
    public void simpleFactoryTest() {
        Fruit apple = SimpleFactory.getFruit("com.example.lenovo.factory_method.Apple");
        apple.get();

        Fruit banana = SimpleFactory.getFruit("com.example.lenovo.factory_method.Banana");
        banana.get();
    }

    @Test
    public void decoratorTest() {
        Car car = new RunCar();
        CarDecorator flyCar = new FlyCarDecorator(car);
        flyCar.show();
        System.out.println("-----");

        CarDecorator swimCar = new SwimCarDecorator(car);
        swimCar.show();
        System.out.println("-----");

        CarDecorator flySwimCar = new SwimCarDecorator(flyCar);
        flySwimCar.show();
    }

    @Test
    public void commandTest() {
        Stock stock = new Stock();

        Order buyStock = new BuyStockOrder(stock);
        Order sellStock = new SellStockOrder(stock);

        Broker broker = new Broker();
        broker.takeOrder(buyStock);
        broker.takeOrder(sellStock);
        broker.removeOrder(buyStock);

        broker.placeOrders();
    }

    @Test
    public void adapterTest() {
        MallardDuck duck = new MallardDuck();
        duck.quack();
        duck.fly();
        System.out.println("-----");

        Turkey turkey = new WildTurkey();
        turkey.gobble();
        turkey.fly();
        System.out.println("-----");

        Duck turkeyAdapter = new TurkeyAdapter(turkey);
        turkeyAdapter.quack();
        turkeyAdapter.fly();
    }

    @Test
    public void templateTest() {
        Game cricket = new Cricket();
        cricket.play();
        System.out.println("-----");

        Game football = new Football();
        football.play();
    }

    @Test
    public void iteratorTest() {
        NameRepository nameRepository = new NameRepository();
        for (Iterator iter = nameRepository.getIterator(); iter.hasNext();) {
            String name = (String) iter.next();
            System.out.println("name: " + name);
        }
    }

    @Test
    public void compositeTest() {
        Employee CEO = new Employee("John", "CEO", 30000);
        Employee headSales = new Employee("Robert", "Head Sales", 20000);
        Employee headMarketing = new Employee("Michel", "Head Marketing", 20000);

        Employee clerk1 = new Employee("Laura", "Marketing", 10000);
        Employee clerk2 = new Employee("Bob", "Marketing", 10000);

        Employee salesExecutive1 = new Employee("Richard", "Sales", 10000);
        Employee salesExecutive2 = new Employee("Rob", "Sales", 10000);

        CEO.add(headSales);
        CEO.add(headMarketing);

        headSales.add(salesExecutive1);
        headSales.add(salesExecutive2);

        headSales.add(clerk1);
        headSales.add(clerk2);

        System.out.println(CEO);
        for (Employee headEmployee : CEO.getSubordinates()) {
            System.out.println(headEmployee);
            for (Employee employee : headEmployee.getSubordinates()) {
                System.out.println(employee);
            }
        }
    }

}