package com.example.transferapp

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class QuestionsActivity : AppCompatActivity() {

    private val questions = listOf(
        "What is your GPA?",
        "What is your SAT score?",
        "What is your location?",
        "What is your tuition?"
    )
    private var currentQuestionIndex = 0
    private val answers = mutableListOf<String>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_questions)

        val questionTextView: TextView = findViewById(R.id.questionTextView)
        val answerEditText: EditText = findViewById(R.id.answerEditText)
        val nextButton: Button = findViewById(R.id.nextButton)

        questionTextView.text = questions[currentQuestionIndex]

        nextButton.setOnClickListener {
            answers.add(answerEditText.text.toString())
            answerEditText.text.clear()
            currentQuestionIndex++
            if (currentQuestionIndex < questions.size) {
                questionTextView.text = questions[currentQuestionIndex]
            } else {
                // Process the collected answers (e.g., save to SharedPreferences, database, etc.)
                finish()
            }
        }
    }
}
