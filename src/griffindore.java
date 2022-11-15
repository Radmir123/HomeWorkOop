public class griffindore extends hogwarts {
    private int nobility;
    private int honor;
    private int brave;


//конструктор


    public griffindore(String name, int power, int generationOfPower, int nobility, int honor, int brave) {
        super(name, power, generationOfPower);
        this.nobility = nobility;
        this.honor = honor;
        this.brave = brave;
    }

    public int getNobility() {
        return nobility;
    }

    public void setNobility(int nobility) {
        this.nobility = nobility;
    }

    public int getHonor() {
        return honor;
    }

    public void setHonor(int honor) {
        this.honor = honor;
    }

    public int getBrave() {
        return brave;
    }

    public void setBrave(int brave) {
        this.brave = brave;
    }

    // метод описания студента
    public void printDescribe(){
        System.out.println(
                "nobility " + nobility
                + " honor " + honor
                + " brave " + brave


        );
    }

    public int printSkills(){
        return getNobility() + getHonor() + getBrave() + getPower() + getGenerationOfPower();

    }



public void compare(griffindore student){
       int skills = printSkills();
       int skills1 = student.printSkills();

        if (skills > skills1){
            System.out.println(student + " " + " слабее чем студент " + getName() + printSkills());
        } else if (skills1 > skills){
            System.out.println(student + " " + " сильнее чем студент " + getName() + printSkills());
        } else {
            System.out.println(" силы равны ");
        }

}

    @Override
    public String toString() {
        return new String(getName() + printSkills());
    }





// это кавычка класса griffindore
}

