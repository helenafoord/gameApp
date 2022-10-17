package com.example.quiz

class Quiz (var questions: List<Question>){
    var questionNum = 0
    var points = 0

    fun shuffle(){
        questions.shuffled()
        questions[0].answer.shuffled()
    }


    fun getNextQuestion(): Question {
        return questions[++questionNum]
    }
    fun getCurrentQuestion():Question{
        return questions[questionNum]
    }

    fun hasNextQuestion(): Boolean{
        return questionNum <= questions.size

    }

    fun checkAnswer(choice:String):Boolean{
        if(choice.equals(questions[questionNum].correct)) {
            ++points
            return true
        } else {
            return false
        }
    }

}