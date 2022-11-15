public class Kogtervan extends hogwarts {
    private int smart;
    private  int wise;
    private int wittyAndFullOfCreativity;


    public Kogtervan(String name, int power, int generationOfPower, int smart, int wise, int wittyAndFullOfCreativity) {
        super(name, power, generationOfPower);
        this.smart = smart;
        this.wise = wise;
        this.wittyAndFullOfCreativity = wittyAndFullOfCreativity;
    }

    public int getSmart() {
        return smart;
    }

    public void setSmart(int smart) {
        this.smart = smart;
    }

    public int getWise() {
        return wise;
    }

    public void setWise(int wise) {
        this.wise = wise;
    }

    public int getWittyAndFullOfCreativity() {
        return wittyAndFullOfCreativity;
    }

    public void setWittyAndFullOfCreativity(int wittyAndFullOfCreativity) {
        this.wittyAndFullOfCreativity = wittyAndFullOfCreativity;
    }

    public void printDescribeForKogtervan(){
        System.out.println(
                "smart" + smart
                        + " wise" + wise
                        + " hwittyAndFullOfCreativity " + wittyAndFullOfCreativity

        );
    }

    public int printSkillsForKogtervan(){
        return getSmart() + getWise() + getWittyAndFullOfCreativity() + getPower() + getGenerationOfPower();

    }


    public void compareForKogtervan(Kogtervan studentsOfKogtervan){
        int skills = printSkillsForKogtervan();
        int skills1 = studentsOfKogtervan.printSkillsForKogtervan();

        if (skills > skills1){
            System.out.println(studentsOfKogtervan + " слабее чем студент " + getName() + printSkillsForKogtervan());
        } else if (skills1 > skills){
            System.out.println(studentsOfKogtervan + " " + " сильнее чем студент " + getName() + printSkillsForKogtervan());
        } else {
            System.out.println(" силы равны ");
        }

    }

    @Override
    public String toString() {
        return new String(getName() + printSkillsForKogtervan());
    }



}
