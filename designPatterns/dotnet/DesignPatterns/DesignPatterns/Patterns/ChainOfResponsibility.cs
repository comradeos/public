namespace DesignPatterns.Patterns;

public static class ChainOfResponsibility
{
    public static void Demo()
    {
        //створив об'єкт мови та вказав можливость їх вивчення (false, true, false)
        Language language = new Language(false, true, false);

        //створив обробники для кожної мови
        IHandler englishHandler = new EnglishHandler();
        IHandler spanishHandler = new SpanishHandler();
        IHandler deutschHandler = new DeutschHandler();

        //встановив послідовність обробників в ланцюгу
        // Тут можна використати інтерфейс
        ((LanguageHandler)englishHandler).Successor = (LanguageHandler)deutschHandler;
        ((LanguageHandler)deutschHandler).Successor = (LanguageHandler)spanishHandler;

        //запустив обробник мови, що починається з першого (englishHandler) обробника в ланцюгу
        englishHandler.Handle(language);
    }
}

public interface IHandler
{
    void Handle(Language language);
}

//створив клас для мов з трьома різними параметрами (мовами) типу bool та проініціалізував їх в конструкторі
public class Language
{
    public bool English { get; set; }
    public bool Spanish { get; set; }
    public bool Deutsch { get; set; }
    public Language(bool english, bool spanish, bool deutsch)
    {
        English = english;
        Spanish = spanish;
        Deutsch = deutsch;
    }
}

//створив абстрактний клас-обробник з властивістю Successor що вказуватиме на наступний обробник у ланцюгу
//створив абстрактний метод Handle для обробки запитів на конкретну мову, метод реалізований в обробниках кожної мови
abstract class LanguageHandler : IHandler
{
    public LanguageHandler? Successor { get; set; }
    public abstract void Handle(Language language);
}

//створив клас обробник для англ мови, де реалізований метод Handle з логікою: якщо English (english==true), то вивчається англ
//якщо ні, то йде перехід на обробник іншої мови 
class EnglishHandler : LanguageHandler
{
    public override void Handle(Language language)
    {
        if (language.English)
        {
            Console.WriteLine("Learning English");
        }
        else if (Successor != null)
        {
            Console.WriteLine($"Passing to {Successor.GetType().Name}");
            Successor.Handle(language);
        }
    }
}

//створив клас обробник для іспанської мови, де реалізований метод Handle з логікою: якщо Spanish (spanish==true), то вивчається іспанська
//якщо ні, то йде перехід на обробник іншої мови 
class SpanishHandler : LanguageHandler
{
    public override void Handle(Language language)
    {
        if (language.Spanish)
        {
            Console.WriteLine("Learning Spanish");
        }
        else if (Successor != null)
        {
            Console.WriteLine($"Passing to {Successor.GetType().Name}");
            Successor.Handle(language);
        }
    }
}

//створив клас обробник для іспанської мови, де реалізований метод Handle з логікою: якщо Deutsch (deutsch==true), то вивчається німецька
//якщо ні, то йде перехід на обробник іншої мови 
class DeutschHandler : LanguageHandler
{
    public override void Handle(Language language)
    {
        if (language.Deutsch)
        {
            Console.WriteLine("Learning Deutsch");
        }
        else if (Successor != null)
        {
            Console.WriteLine($"Passing to {Successor.GetType().Name}");
            Successor.Handle(language);
        }
    }
}

