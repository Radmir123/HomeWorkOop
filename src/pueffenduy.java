public class pueffenduy extends hogwarts{
    private int diligence;
    private  int loyalty;
    private int honesty;


    public pueffenduy(String name, int power, int generationOfPower, int diligence, int loyalty, int honesty) {
        super(name, power, generationOfPower);
        this.diligence = diligence;
        this.loyalty = loyalty;
        this.honesty = honesty;
    }

    public int getDiligence() {
        return diligence;
    }

    public void setDiligence(int diligence) {
        this.diligence = diligence;
    }

    public int getLoyalty() {
        return loyalty;
    }

    public void setLoyalty(int loyalty) {
        this.loyalty = loyalty;
    }

    public int getHonesty() {
        return honesty;
    }

    public void setHonesty(int honesty) {
        this.honesty = honesty;
    }

    @Override
    public String toString() {
        return new String(getName() + printSkillsForPueffenduy());
    }

    public void printDescribeForPueffenduy(){
        System.out.println(
                "diligence" + diligence
                        + " loyalty " + loyalty
                        + " honesty " + honesty

        );
    }

    public int printSkillsForPueffenduy(){
        return getDiligence() + getLoyalty() + getHonesty() + getPower() + getGenerationOfPower();

    }

    public void compareOfPueffenduy(pueffenduy studentsOfPueffenduy){
        int skills = printSkillsForPueffenduy();
        int skills1 = studentsOfPueffenduy.printSkillsForPueffenduy();

        if (skills > skills1){
            System.out.println(studentsOfPueffenduy + " слабее чем студент " + getName() +  printSkillsForPueffenduy());
        } else if (skills1 > skills){
            System.out.println(studentsOfPueffenduy + " " + " сильнее чем студент " + getName() + printSkillsForPueffenduy());
        } else {
            System.out.println(" силы равны ");
        }

    }






}
