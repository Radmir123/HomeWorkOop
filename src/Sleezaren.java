public class Sleezaren extends hogwarts {
    private int trick;
    private  int determination;
    private int ambition;
    private int resourcefulnessAndThirstForPower;


    public Sleezaren(String name, int power, int generationOfPower, int trick, int determination, int ambition, int resourcefulnessAndThirstForPower) {
        super(name, power, generationOfPower);
        this.trick = trick;
        this.determination = determination;
        this.ambition = ambition;
        this.resourcefulnessAndThirstForPower = resourcefulnessAndThirstForPower;
    }

    public int getTrick() {
        return trick;
    }

    public void setTrick(int trick) {
        this.trick = trick;
    }

    public int getDetermination() {
        return determination;
    }

    public void setDetermination(int determination) {
        this.determination = determination;
    }

    public int getAmbition() {
        return ambition;
    }

    public void setAmbition(int ambition) {
        this.ambition = ambition;
    }

    public int getResourcefulnessAndThirstForPower() {
        return resourcefulnessAndThirstForPower;
    }

    public void setResourcefulnessAndThirstForPower(int resourcefulnessAndThirstForPower) {
        this.resourcefulnessAndThirstForPower = resourcefulnessAndThirstForPower;
    }

    public void printDescribeForSleezaren (){
        System.out.println(
                "trick" + trick
                        + " determination" + determination
                        + " ambition " + ambition
                        + " resourcefulnessAndThirstForPower " + resourcefulnessAndThirstForPower

        );
    }


    public int printSkillsForSleezaren(){
        return getTrick() + getDetermination() + getAmbition() + getResourcefulnessAndThirstForPower() + getPower() + getGenerationOfPower();

    }


    public void compareForSleezaren(Sleezaren studentsOfSleezaren){
        int skills = printSkillsForSleezaren();
        int skills1 = studentsOfSleezaren.printSkillsForSleezaren();

        if (skills > skills1){
            System.out.println(studentsOfSleezaren + " слабее чем студент " + getName() + printSkillsForSleezaren());
        } else if (skills1 > skills){
            System.out.println(studentsOfSleezaren+ " " + " сильнее чем студент " + getName() + printSkillsForSleezaren());
        } else {
            System.out.println(" силы равны ");
        }

    }

    @Override
    public String toString() {
        return new String(getName() + printSkillsForSleezaren());
    }

}
