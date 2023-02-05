package com.abhishek.quizapp

object Constants {
    const val USER_NAME: String = "User_name"
    const val CORRECT_ANSWER:String= "Correct_answer"
    const val TOTAL_QUESTIONS:String= "Total_questions"

    fun getQuestions():ArrayList<Questions>{
        val questionList = ArrayList<Questions>()

        val ques1 = Questions(
            1,
            "Which country does this flag belongs to?",
            R.drawable.ic_flag_of_argentina,
            "Argentina","Denmark","Jordan", "Costa Rica",
            1
            )
        questionList.add(ques1)

        val ques2 = Questions(
            2,
            "Which country does this flag belongs to?",
            R.drawable.ic_flag_of_australia,
            "Argentina","Australia","Austria", "Britain",
            2
        )
        questionList.add(ques2)

        val ques3 = Questions(
            3,
            "Which country does this flag belongs to?",
            R.drawable.ic_flag_of_india,
            "France","UK","India", "Bangladesh",
            3
        )
        questionList.add(ques3)

        val ques4 = Questions(
            4,
            "Which country does this flag belongs to?",
            R.drawable.ic_flag_of_belgium,
            "Belgium","Scotland","Pakistan", "Ireland",
            1
        )
        questionList.add(ques4)

        val ques5 = Questions(
            5,
            "Which country does this flag belongs to?",
            R.drawable.ic_flag_of_germany,
            "Egypt","Austria","Africa", "Germany",
            4
        )
        questionList.add(ques5)


        return questionList
    }
}