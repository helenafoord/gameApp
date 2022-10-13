package com.example.quiz

class Quiz (var questions: List<Question>){
    var questionNum = 0
    fun shuffle(){
        questions.shuffled()
        questions[0].answer.shuffled()
    }


    fun getNextQuestion(): Question {
        return questions[questionNum++]
    }
    fun getCurrentQuestion():Question{
        return questions[questionNum]
    }

    fun hasNextQuestion(): Boolean{
        return questionNum <= questions.size

    }

    fun isCorrect(choice:String):Boolean{
        return choice.equals(questions[questionNum].answer)
    }

}