namespace DesignPatterns.Patterns;

public static class AbstractFactory
{
    public static void Demo()
    {
        IDegreeProgramFactory universityFactory = new UniversityFactory(); //створив основний universityFactory з IDegreeProgramFactory
        UniversityClient client = new UniversityClient(universityFactory);//створив клієнта
        client.StudyPrograms();//викликав метод виводу на екран інфи про програми навчання

        Console.WriteLine("\n");

        universityFactory = new AnotherUniversityFactory();//створив інший AnotherUniversityFactory
        client = new UniversityClient(universityFactory);//створив клієнта
        client.StudyPrograms();//викликав метод виводу на екран інфи про програми навчання
    }
}

public interface IBachelorsProgram //створив інтерфейс з двома методами для бакалаврів
{
    void Study();
    void AttendClasses();
}

public class ABCUniversityBachelorsProgram : IBachelorsProgram //створив університет ABC з бакалаврською програмою, який наслідує IBachelorsProgram
{
    public string? ProgramName { get; set; }
    public int DurationInYears { get; set; }
    public bool Accredited { get; set; }

    //реалізація методів з IBachelorsProgram
    public void Study()
    {
        if (Accredited)
        {
            Console.WriteLine($"Studying in the {ProgramName} Bachelor's program at ABC University {DurationInYears} years and Accredited");
        }
        //не знав, що так можна)
        {
            Console.WriteLine($"Studying in the {ProgramName} Bachelor's program at ABC University {DurationInYears} years");
        }
    }

    public void AttendClasses()
    {
        Console.WriteLine($"Attending classes in the {ProgramName} program at ABC University \n");
    }
}

public interface IMastersProgram //створив інтерфейс з двома методами для магістрів
{
    void Research();
    void AttendSeminars();
}

public class ABCUniversityMastersProgram : IMastersProgram //створив університет ABC з магістерською програмою, який наслідує IMastersProgram
{
    public string? ProgramName { get; set; }
    public int DurationInYears { get; set; }
    public bool Accredited { get; set; }

    //реалізація методів з IMastersProgram
    public void Research()
    {
        if (Accredited)
        {
            Console.WriteLine($"Conducting research in the {ProgramName} Master's program at ABC University {DurationInYears} years and Accredited");
        }
        else{
            Console.WriteLine($"Conducting research in the {ProgramName} Master's program at ABC University {DurationInYears} years");
        }
    }

    public void AttendSeminars()
    {
        Console.WriteLine($"Attending seminars in the {ProgramName} program at ABC University");
    }
}

public interface IDegreeProgramFactory //створив фекторі з двома методами для створення бакалаврської та магістерської програми
{
    //для цього викликаються IBachelorsProgram та IMastersProgram інтерфейси
    IBachelorsProgram CreateBachelorsProgram(string programName, int durationInYears, bool accredited);
    IMastersProgram CreateMastersProgram(string programName, int durationInYears, bool accredited);
}

public class UniversityFactory : IDegreeProgramFactory //створив UniversityFactory який наслідує основний інтерфейс IDegreeProgramFactory і реалізує його методи 
{
    public IBachelorsProgram CreateBachelorsProgram(string programName, int durationInYears, bool accredited)
    {
        return new ABCUniversityBachelorsProgram
        {
            ProgramName = programName,
            DurationInYears = durationInYears,
            Accredited = accredited
        };
    }

    public IMastersProgram CreateMastersProgram(string programName, int durationInYears, bool accredited)
    {
        return new ABCUniversityMastersProgram
        {
            ProgramName = programName,
            DurationInYears = durationInYears,
            Accredited = accredited
        };
    }
}

public class UniversityClient //створив клєнта університету, по суті студента (навза Student якось наче не в тему тут)
{
    private IBachelorsProgram _bachelorsProgram;
    private IMastersProgram _mastersProgram;

    //конструктор для ініціалізації полів з викликом методів з IDegreeProgramFactory
    public UniversityClient(IDegreeProgramFactory factory)
    {
        _bachelorsProgram = factory.CreateBachelorsProgram("Computer Science", 4, false);
        _mastersProgram = factory.CreateMastersProgram("Computer Science", 2, true);
    }
    //метод для виводу інформації про кожну програму
    public void StudyPrograms()
    {
        _bachelorsProgram.Study();
        _bachelorsProgram.AttendClasses();

        _mastersProgram.Research();
        _mastersProgram.AttendSeminars();
    }
}

public class DFGUniversityBachelorsProgram : IBachelorsProgram //створив інший університет з бакалаврською програмою, наслідує той самий IBachelorsProgram
{
    public string? ProgramName { get; set; }
    public int DurationInYears { get; set; }
    public bool Accredited { get; set; }

    public void Study()
    {
        if (Accredited)
        {
            Console.WriteLine($"Studying in the {ProgramName} Bachelor's program at DFG University {DurationInYears} years and Accredited");
        }
        else
        {
            Console.WriteLine($"Studying in the {ProgramName} Bachelor's program at DFG University {DurationInYears} years");
        }
    }

    public void AttendClasses()
    {
        Console.WriteLine($"Attending classes in the {ProgramName} program at DFG University \n");
    }
}

public class DFGUniversityMastersProgram : IMastersProgram //створив інший університет з магістерською програмою, наслідує той самий IMastersProgram
{
    public string? ProgramName { get; set; }
    public int DurationInYears { get; set; }
    public bool Accredited { get; set; }

    public void Research()
    {
        if (Accredited)
        {
            Console.WriteLine($"Conducting research in the {ProgramName} Master's program at DFG University {DurationInYears} years and Accredited");
        }
        else
        {
            Console.WriteLine($"Conducting research in the {ProgramName} Master's program at DFG University {DurationInYears} years");
        }
    }

    public void AttendSeminars()
    {
        Console.WriteLine($"Attending seminars in the {ProgramName} program at DFG University");
    }
}

public class AnotherUniversityFactory : IDegreeProgramFactory //створив AnotherUniversityFactory який наслідує основний інтерфейс IDegreeProgramFactory і реалізує його методи 
{
    public IBachelorsProgram CreateBachelorsProgram(string programName, int durationInYears, bool accredited)
    {
        return new DFGUniversityBachelorsProgram
        {
            ProgramName = programName,
            DurationInYears = durationInYears,
            Accredited = accredited
        };
    }

    public IMastersProgram CreateMastersProgram(string programName, int durationInYears, bool accredited)
    {
        return new DFGUniversityMastersProgram
        {
            ProgramName = programName,
            DurationInYears = durationInYears,
            Accredited = accredited
        };
    }
}

