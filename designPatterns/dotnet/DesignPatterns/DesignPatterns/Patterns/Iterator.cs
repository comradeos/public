namespace DesignPatterns.Patterns;

public static class Iterator
{
    public static void Demo()
    {
        //створив університет та рідер, за допомогою методу SeeCourses продивився доступні курси в університеті
        University university = new University();
        Reader reader = new Reader();
        reader.SeeCourses(university);
    }
}

//створив курс з власивістю Name
class Course
{
    public string? Name { get; set; }
}

//створив інтерфейс для курсів, де метод HasNext перевіряє чи є наступний курс, а Next отримує наступний курс
interface ICourseIterator
{
    bool HasNext();
    Course Next();
}

//створив інтерфейс для об'єктів перелічених в курсах
//CreateNumerator - створений  ітератор для курсів, Count - отримує кількість курсів
interface ICourseNumerable
{
    ICourseIterator CreateNumerator();
    int Count { get; }
    Course this[int index] { get; }//доступ до курсів за індексом(індексатор)
}

//створив клас університет з конструктором в якому заповнюється масив курсів та реалізуються методи інтерфейсу ICourseNumerable
class University : ICourseNumerable
{
    private Course[] courses;
    public University()
    {
        courses = new Course[]
        {
            new Course{Name="Networks"},
            new Course {Name="C++ Essentials"},
            new Course {Name="Computer Architecture"},
            new Course {Name="Math"},
            new Course {Name="English"},
            new Course {Name="IoT Essentials"}
        };
    }
    public int Count
    {
        get { return courses.Length; }
    }

    public Course this[int index]
    {
        get { return courses[index]; }
    }
    public ICourseIterator CreateNumerator()
    {
        return new UniversityNumerator(this);
    }
}

//створив клас рідер з методом для перегляду всіх курсів
class Reader
{
    public void SeeCourses(University university)
    {
        ICourseIterator iterator = university.CreateNumerator();//створив ітератор
        while (iterator.HasNext())//перевірка поки є наступний курс
        {
            Course course = iterator.Next();//отримується наступний курс 
            Console.WriteLine(course.Name);//виводиться назва курсу
        }
    }
}

//створив ітератор для курсів університету з конструктором, в якому проініціалізоване посилання на об'єкт який перелічується
//HasNext перевіряє чи є наступний курс
//Next отримує наступний курс
class UniversityNumerator : ICourseIterator
{
    ICourseNumerable aggregate;
    int index = 0;
    public UniversityNumerator(ICourseNumerable a)
    {
        aggregate = a;
    }
    public bool HasNext()
    {
        return index < aggregate.Count;//перевірка чи індекс курсу менший ніж кількість всих курсів
    }

    public Course Next()
    {
        return aggregate[index++];
    }
}