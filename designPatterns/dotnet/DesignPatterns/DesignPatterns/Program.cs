using System.Text;
using DesignPatterns.Patterns;

namespace DesignPatterns;

public static class Program
{
    public static void Main()
    {
        Console.OutputEncoding = Encoding.UTF8;
        // FactoryMethod.Demo();
        //AbstractFactory.Demo();
        Bridge.Demo();
    }
}