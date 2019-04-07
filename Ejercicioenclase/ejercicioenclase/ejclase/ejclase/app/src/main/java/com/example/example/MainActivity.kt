package com.example.example

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.DataBinding
import android.view.View
import android.view.inputmethod.InputMethodManager


class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    val MyName: MyName = MyName("name1","nickname1")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        binding = DataBiningUtil.setContentView(this, R.layout.activity_main)
        binding.myName = myName

        binding.doneButton.setOnClickListener{
            addNickname(it)
        }
    }
    private fun addNickname(view: View){
        binding.apply{
            myName?.nickname = name_editor.text.toString()
            invalidateAll()
            name_edittext.visibility= View.GONE
            name_button.visibility = View.GONE
            name_edittext.visibiliry= View.VISIBLE
        }
        val im = getSystemSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
        im.hideSoftInputFromWindow(view.windowToken, 0)
    }
}
