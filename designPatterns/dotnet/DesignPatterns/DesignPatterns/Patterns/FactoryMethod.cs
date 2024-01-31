namespace DesignPatterns.Patterns;

public static class FactoryMethod
{
    public static void Demo()
    {
        ICarFactory sedanFactory = new SedanFactory();//створюється завод для седанів за допомогою інтерфейсу для заводу автомобілів
        ICar sedanCar = sedanFactory.CreateCar();//створюється седан за допомогою інтерфейсу для автомобілів і присвоюється sedanFactory з викликом методу для створення автомобілю
        sedanCar.Drive();//виводить "седан"

        ICarFactory crossoverFactory = new CrossoverFactory();//створюється завод для кросоверів за допомогою інтерфейсу для заводу автомобілів
        ICar crossoverCar = crossoverFactory.CreateCar();//створюється кросовер за допомогою інтерфейсу для автомобілів і присвоюється crossoverFactory з викликом методу для створення автомобілю
        crossoverCar.Drive();//виводить "кросовер"
    }
}

//інтерфейс для автомобілів
public interface ICar
{
    void Drive();//метод для їзди на автомобілі
}

//реалізація для седана
public class Sedan : ICar
{
    public void Drive()
    {
        Console.WriteLine("Седан");//реалізація методу для седана
    }
}

//реалізація для кросовера
public class Crossover : ICar
{
    public void Drive()
    {
        Console.WriteLine("Кросовер");//реалізація методу для кросовера
    }
}

//інтерфейс для заводу
public interface ICarFactory
{
    ICar CreateCar();//метод для створення автомобілю
}

//завод для створення седана
public class SedanFactory : ICarFactory
{
    public ICar CreateCar()//реалізація методу для створення седану
    {
        return new Sedan();
    }
}

//завод для створення кросовера
public class CrossoverFactory : ICarFactory
{
    public ICar CreateCar()//реалізація методу для створення кросоверу
    {
        return new Crossover();
    }
}
