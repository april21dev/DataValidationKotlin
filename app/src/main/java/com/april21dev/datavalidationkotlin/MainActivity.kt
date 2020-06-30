package com.april21dev.datavalidationkotlin

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.april21dev.datavalidationkotlin.data.Book
import com.april21dev.datavalidationkotlin.data.Publisher
import com.datavalidation.generated.validate
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button.setOnClickListener {
            val book = Book(
                "힐링페이퍼 인재상", 0, "Thomas", "thomas@healingpaper/com",
                Publisher("높은 기준을 추구합니다. 소신있게 반대하고 헌신합니다. 틀릴 수도 있다고 생각합니다.")
            )

            val validationResult = book.validate()
            Log.v("Validation",
                StringBuilder()
                    .appendln("유효성: ${validationResult.isValid}")
                    .appendln("잘못된 필드: ${validationResult.invalidFieldNameAndTags.joinToString(", ", transform = {it.fieldName})}")
                    .appendln("메시지: ${validationResult.invalidFieldNameAndTags.joinToString(" & ", transform = { it.tag })}")
                    .toString()
            )
        }
    }
}
