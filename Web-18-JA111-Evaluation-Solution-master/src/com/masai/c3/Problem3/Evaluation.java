package com.masai.c3.Problem3;

public abstract class Evaluation {

    private final int numberOfQuestions;

    public Evaluation(int i) {
        this.numberOfQuestions = i;
    }

    abstract void evaluationTiming();

    public void printNoOfQuestions() {
        System.out.println("No. of Questions in Evaluation is :" +numberOfQuestions);
    }

}

class CodingEvaluation extends Evaluation{

    public CodingEvaluation(int i) {
        super(i);
    }

    @Override
    void evaluationTiming() {
        System.out.println("Evaluation timing is 2:00 to 3:30");
    }
}

class DsaEvaluation extends Evaluation{

    public DsaEvaluation(int i) {
        super(i);
    }

    @Override
    void evaluationTiming() {
        System.out.println("Evaluation timing is 9:30 to 11:00");
    }
}

class Main {

    public void messageToStudents(Evaluation evaluation){

        if(evaluation instanceof DsaEvaluation){
            System.out.println("Its a Dsa Evaluation");
        }
        else{
            System.out.println("Its  a Coding Evaluation");
        }

        evaluation.printNoOfQuestions();
        evaluation.evaluationTiming();

        System.out.println("========================================================");
        System.out.println();

    }

    public static void main(String[] args) {

        Main mainObj=new Main();

        //You can also make this messageToStudents method as static so that you can call it directly
        mainObj.messageToStudents(new DsaEvaluation(5));
        mainObj.messageToStudents(new CodingEvaluation(4));

    }


}

