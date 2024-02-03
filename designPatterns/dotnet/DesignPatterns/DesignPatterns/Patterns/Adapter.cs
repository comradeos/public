using System.Reflection.Emit;

namespace DesignPatterns.Patterns;

public static class Adapter
{
    public static void Demo()
    {
        //створив студента
        Student student = new Student();
        //створив урок математики
        Math math = new Math();
        //викликав метод "навчання" для математики
        student.Studying(math);

        //створив інший урок
        French french = new French();
        //використав адаптер для переходу студента з університету до мовних курсів
        IUni langSchool = new UniToLangSchoolAdapter(french);
        //викликав метод "навчання" для мовних курсів
        student.Studying(langSchool);
    }
}

//створив інтерфейс університету з методом Lesson, який реалізований в класі Math та в адаптері
interface IUni
{
    void Lesson();
}
//створив клас для уроку математики, який наслідує інтерфейс IUni
class Math : IUni
{
    public void Lesson()
    {
        Console.WriteLine("Studying Math");
    }
}

//створив клас студент(клієнт) з методом Studying де викликається метод інтерфейсу IUni - Lesson
class Student
{
    public void Studying(IUni uni)
    {
        uni.Lesson();
    }
}
//створив інтерфейс для мовної школи з методом, який реалізовний в "адаптованому" класі
interface ILanguageSchool
{
    void Learning();
}
//адаптований клас
class French : ILanguageSchool
{
    public void Learning()
    {
        Console.WriteLine("Learning French");
    }
}
//створив адаптер з конструктором (проініціалізував змінну адаптованого класу French) та з методом Lesson інтерфейсу IUni
//де викликається метод для вивчення мови Learning
class UniToLangSchoolAdapter : IUni
{
    French french;
    public UniToLangSchoolAdapter(French f)
    {
        french = f;
    }
 
    public void Lesson()
    {
        french.Learning();
    }
}

