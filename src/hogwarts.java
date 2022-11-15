public class hogwarts {
   private String name;
   private  int power;
   private int generationOfPower;

    public hogwarts(String name, int power, int generationOfPower) {
        this.name = name;
        this.power = power;
        this.generationOfPower = generationOfPower;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public int getGenerationOfPower() {
        return generationOfPower;
    }

    public void setGenerationOfPower(int generationOfPower) {
        this.generationOfPower = generationOfPower;
    }

    public int printHogwartsSkills(){
       return getPower() + getGenerationOfPower();
   }

    public void compareAllStudents(hogwarts allStudents){
        int skills = printHogwartsSkills();
        int skills1 = allStudents.printHogwartsSkills();
        if (skills > skills1){
            System.out.println(allStudents + " " + " слабее чем студент " + getName() + printHogwartsSkills());
        } else if (skills1 > skills){
            System.out.println(allStudents+ " " + " сильнее чем студент " + getName() + printHogwartsSkills());
        } else {
            System.out.println(" у этих ребят силы равны ");
        }
    }


}
