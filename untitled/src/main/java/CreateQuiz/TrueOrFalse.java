package CreateQuiz;

public class TrueOrFalse {

    private boolean correct = true;
    private boolean incorrect = false;
    public boolean isCorrect() {
        return correct;
    }

    public void setCorrect(boolean correct) {
        this.correct = correct;
    }
    public boolean isIncorrect() {
        return incorrect;
    }

    public void setIncorrect(boolean incorrect) {
        this.incorrect = incorrect;
    }
    public static void TrueOrFalse(boolean isCorrect, boolean isIncorrect){
        String question = "";
        for(int i=0; i<question.length(); i++) {
            if (isCorrect) {
                System.out.println("Correct!");
                i++;
            } else if (isIncorrect) {
                System.out.println("Incorrect");
                i--;
            }
        }
    }


}
