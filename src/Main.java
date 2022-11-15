

public class Main {
    public static void main(String[] args) {
        griffindore[] students = {
                new griffindore(" Гарри Поттер ", 65, 67, 56,55, 23),
                new griffindore(" Гермиона Грейнджер ", 69, 34, 46,46, 89),
                new griffindore(" Рон Уизли ", 12, 97, 35, 78, 43)

        };

//students[0].printDescribe();
students[0].printSkills();
students[0].compare(students[1]);

        pueffenduy[] studentsOfPueffenduy = {
                new pueffenduy(" Захария Смит " ,67, 23, 53,56,56),
                new pueffenduy(" Седрик Диггори ",20, 78, 34,67,65),
                new pueffenduy(" Джастин Финч-Флетчли ",97, 47, 67,13,86),
        };
        studentsOfPueffenduy[2].compareOfPueffenduy(studentsOfPueffenduy[1]);

        Kogtervan [] studentsOfKogtervan  = {
                new Kogtervan(" Чжоу Чанг " ,34, 57,  66,45,45),
                new Kogtervan(" Падма Патил " ,23, 67, 78,23,56),
                new Kogtervan (" Маркус Белби " ,45, 89, 23,54,75),
        };
        studentsOfKogtervan[1].compareForKogtervan(studentsOfKogtervan[0]);

        Sleezaren [] studentsOfSleezaren  = {
                new Sleezaren(" Грегори Гойл " ,34, 57,  44, 46,76,35),
                new Sleezaren(" Грэхэм Монтегю " ,23, 67, 32, 68,35,45),
                new Sleezaren (" Драко Малфой " ,45, 89, 87,34,67,57),
        };
        studentsOfSleezaren[2].compareForSleezaren(studentsOfSleezaren[1]);
 studentsOfSleezaren[1].compareAllStudents(studentsOfKogtervan[0]);
    //studentsOfSleezaren[0].compareForSleezaren(studentsOfSleezaren[1]);
studentsOfKogtervan[0].compareForKogtervan(studentsOfKogtervan[2]);




    }
}