package com.example.image_slider

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*

class MainActivity : AppCompatActivity() {

    lateinit var imageView: ImageView
    lateinit var previous:Button
    lateinit var next:Button
    var i:Int = 1

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        imageView = findViewById(R.id.imgsw)
        previous = findViewById(R.id.buttonPrev)
        next = findViewById(R.id.buttonNext)

        val images = intArrayOf(R.drawable.abd,R.drawable.bth,R.drawable.jos,R.drawable.msd,R.drawable.rohit,R.drawable.root,R.drawable.jos)

        previous.setOnClickListener(View.OnClickListener {

            imageView.setImageResource(images[i])
            if (i>1)
            {
                i--

            }
//            else{
//                    Toast.makeText(applicationContext,"FirstImage",Toast.LENGTH_SHORT).show()
//                    i=0
//            }
        })

        next.setOnClickListener(View.OnClickListener {
            imageView.setImageResource(images[i])
            if (i<6)
            {
                i++

            }
            //else{
//
//                Toast.makeText(applicationContext,"LastImage",Toast.LENGTH_SHORT).show()
//                i=2
//            }
        })
    }
}

//private val images = intArrayOf(android.R.drawable.alert_dark_frame, android.R.drawable.)
//private ImageSwitcher imgsw;
//private int[] images = {R.drawable.bangkok,R.drawable.bangkok2};
//private int position = 0;



//
//private lateinit var previousbtn : Button
//private lateinit var nextbutton : Button
//private val images = intArrayOf(R.drawable.ic_launcher_background,R.drawable.ic_launcher_foreground,R.drawable.abd)
//private lateinit var imgsww : ImageSwitcher
//private var position : Int = 0
//    override fun onCreate(savedInstanceState: Bundle?) {
//    super.onCreate(savedInstanceState)
//    setContentView(R.layout.activity_main)
//    previousbtn = (Button(findViewById(R.id.buttonPrev)))
//    nextbutton = (Button(findViewById(R.id.buttonNext)))
//    imgsww = (ImageSwitcher(findViewById(R.id.imgsw)))
//    imgsww.setFactory(ViewSwitcher.ViewFactory() {
//    })
//
//
//}
//}
