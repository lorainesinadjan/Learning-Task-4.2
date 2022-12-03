package com.example.quizapplication;

import java.util.ArrayList;
import java.util.List;

public class QuestionsBank {

    private static List<QuestionsList> mathQuestions() {
        final List<QuestionsList> questionsList = new ArrayList<>();

        final QuestionsList question1 = new QuestionsList("What number does not have its own roman numeral?", "One", "Two", "Three", "Zero", "Zero", "");
        final QuestionsList question2 = new QuestionsList("What is the perimeter of a circle called?", "Radius", "Circumference", "Angle", "Degrees", "Circumference", "");
        final QuestionsList question3 = new QuestionsList("What is the value of pi?", "3.14", "13.4", "22.7", "3.1", "3.14", "");
        final QuestionsList question4 = new QuestionsList("How many sides are there in a decagon?", "7", "10", "8", "9", "10", "");
        final QuestionsList question5 = new QuestionsList("What is the top number of a fraction called?", "Sum", "Difference", "Denominator", "Numerator", "Numerator", "");

        questionsList.add(question1);
        questionsList.add(question2);
        questionsList.add(question3);
        questionsList.add(question4);
        questionsList.add(question5);

        return questionsList;
    }

    private static List<QuestionsList> scienceQuestions() {
        final List<QuestionsList> questionsList = new ArrayList<>();

        final QuestionsList question1 = new QuestionsList("What is the hottest planet in the solar system?", "Earth", "Jupiter", "Venus", "Saturn", "Venus", "");
        final QuestionsList question2 = new QuestionsList("What is the boiling point of water?", "37 degrees celsius", "100 degrees celsius", "500 degrees celsius", "1000 degrees celsius", "100 degrees celsius", "");
        final QuestionsList question3 = new QuestionsList("How many elements are there in the periodic table?", "115", "116", "117", "118", "118", "");
        final QuestionsList question4 = new QuestionsList("What gas is important so that we can breathe?", "Carbon dioxide", "Helium", "Oxygen", "Air", "Oxygen", "");
        final QuestionsList question5 = new QuestionsList("What part of the plant conducts photosynthesis?", "Leaf", "Stem", "Roots", "Branch", "Leaf", "");

        questionsList.add(question1);
        questionsList.add(question2);
        questionsList.add(question3);
        questionsList.add(question4);
        questionsList.add(question5);

        return questionsList;
    }

    private static List<QuestionsList> technologyQuestions() {
        final List<QuestionsList> questionsList = new ArrayList<>();

        final QuestionsList question1 = new QuestionsList("Which is the operating system?", "Open office", "Microsoft windows", "Microsoft word", "Processor", "Processor", "");
        final QuestionsList question2 = new QuestionsList("What is the function of a computer mouse?", "Move a cursor", "Keep computer safe", "Make a sound", "Show an output", "Move a cursor", "");
        final QuestionsList question3 = new QuestionsList("Who is known as the father of computers?", "Albert Einstein", "Charles Babbage", "Konrad Zuse", "Mark Zuckerberg", "Charles Babbage", "");
        final QuestionsList question4 = new QuestionsList("What is the computer’s main circuit board called?", "Operating system", "CPU", "RAM", "Motherboard", "Motherboard", "");
        final QuestionsList question5 = new QuestionsList("Does monitor display information in visual pictorial form?", "Yes", "No", "Maybe", "None of the above", "Yes", "");

        questionsList.add(question1);
        questionsList.add(question2);
        questionsList.add(question3);
        questionsList.add(question4);
        questionsList.add(question5);

        return questionsList;
    }

    private static List<QuestionsList> historyQuestions() {
        final List<QuestionsList> questionsList = new ArrayList<>();

        final QuestionsList question1 = new QuestionsList("Who is the first president of the Philippines?", "Apolinario Mabini", "Emilio Aguinaldo", "Andres Bonifacio", "Jose Rizal", "Emilio Aguinaldo", "");
        final QuestionsList question2 = new QuestionsList("What is considered the earliest form of writing in the Philippines?", "Indus script", "Cuneiform", "Baybayin", "Filipino", "Baybayin", "");
        final QuestionsList question3 = new QuestionsList("Name of the oldest Philippine city?", "Cebu", "Manila", "Davao", "Dumaguete", "Cebu", "");
        final QuestionsList question4 = new QuestionsList("Where is the highest peak in the Philippines?", "Mt. Ararat", "Mt. Zion", "Mt. Apo", "Mt. Mayon", "Mt. Apo", "");
        final QuestionsList question5 = new QuestionsList("What is the longest mountain range in the country?", "Mt. Mayon", "Sierra Madre", "Mt. Kanlaon", "Mt. Apo", "Sierra Madre", "");

        questionsList.add(question1);
        questionsList.add(question2);
        questionsList.add(question3);
        questionsList.add(question4);
        questionsList.add(question5);

        return questionsList;
    }

    public static List<QuestionsList> getQuestions(String selectedTopicName){
        switch (selectedTopicName){
            case "math":
                return mathQuestions();
            case "science":
                return scienceQuestions();
            case "technology":
                return technologyQuestions();
            default:
                return historyQuestions();
        }
    }


}
