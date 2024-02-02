namespace DesignPatterns.Patterns;

public static class Bridge
{
    public static void Demo()
    {
        //створив приватного викладача англ мови за допомогою абстракції Teacher та викликав два методи
        Teacher privatTeacher = new PrivatTeacher(new English());
        privatTeacher.DoWork();
        privatTeacher.EarnMoney();

        //присвоїв нову мову даному викладачу та викликав два методи які пов'язані вже з цією мовою
        privatTeacher.Language = new Deutsch();
        privatTeacher.DoWork();
        privatTeacher.EarnMoney();

        //створив викладача німецької з університету та викликав методи
        Teacher universityTeacher = new UniversityTeacher(new Deutsch());
        universityTeacher.DoWork();
        universityTeacher.EarnMoney();

        //присвоїв нову мову даному викладачу та викликав два методи які пов'язані з іншою мовою
        universityTeacher.Language = new English();
        universityTeacher.DoWork();
        universityTeacher.EarnMoney();
    }
}

//створив інтерфейс(імплементор) який представляє мови та має два методи
interface ILanguage
{
    void Learn();
    void Translate();
}

//створив два класи English та Deutsch, що наслідують інтерфейс ILanguage і реалізують його методи
class English : ILanguage
{
    public void Learn()
    {
        Console.WriteLine("Learning English");
    }

    public void Translate()
    {
        Console.WriteLine("Translate English words");
    }
}

class Deutsch : ILanguage
{
    public void Learn()
    {
        Console.WriteLine("Learning Deutsch");
    }

    public void Translate()
    {
        Console.WriteLine("Translate Deutsch words");
    }
}

//створив абстрактний клас в якому ініціалізував зміну language та створив два методи: 
//віртуальний (в якому викликається два методи Learn та Translate інтерфейсу ILanguage, в залежності від потрібної мови)
//та абстрактний, який буде реалізовний в залеженості від викладача
abstract class Teacher
{
    protected ILanguage language;
    public ILanguage Language
    {
        set { language = value; }
    }
    public Teacher(ILanguage lang)
    {
        language = lang;
    }
    public virtual void DoWork()
    {
        language.Learn();
        language.Translate();
    }
    public abstract void EarnMoney();
}

//створив приватного викладача та викладача університету з конструктором, де lang проініціалізований за допомогою базового конструктору класу Teacher
//і реалізація методу EarnMoney для конкретного викладача
class PrivatTeacher : Teacher
{
    public PrivatTeacher(ILanguage lang):base(lang){}
    public override void EarnMoney()
    {
        Console.WriteLine("Get money for privat lesson \n");
    }
}
class UniversityTeacher : Teacher
{
    public UniversityTeacher(ILanguage lang):base(lang){}
    public override void EarnMoney()
    {
        Console.WriteLine("Get money for lesson in University \n");
    }
}