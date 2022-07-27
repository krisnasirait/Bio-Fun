package com.krisna.biofun

object Constants {
    fun getQuestions(): ArrayList<Question> {
        val questionList = ArrayList<Question>()


        val question1 = Question(
            id = 1,
            question = "Istilah sel pertama kali dinyatakan oleh …",
            optionOne = "Johannes Purkinje",
            optionTwo = "Robert Hooke",
            optionThree = "Theodor Schawnn",
            optionFour = "Rudolf Virchow",
            correctOption = 2
        )
        questionList.add(question1)
        return questionList
    }
}