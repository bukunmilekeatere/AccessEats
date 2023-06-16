@file:Suppress("DEPRECATION")

package com.example.accesseats_project

import android.content.Intent
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val button1: Button = findViewById(R.id.button1)
        val button2: Button = findViewById(R.id.button2)
        val button3: Button = findViewById(R.id.button3)
        val button4: Button = findViewById(R.id.button4)
        val button5: Button = findViewById(R.id.button5)
        val button6: Button = findViewById(R.id.button6)
        val button7: Button = findViewById(R.id.button7)
        val button8: Button = findViewById(R.id.button8)
        val button9: Button = findViewById(R.id.button9)
        val button10: Button = findViewById(R.id.button10)
        val button11: Button = findViewById(R.id.button11)
        val button12: Button = findViewById(R.id.button12)

        button1.setOnClickListener {
            val intent = Intent(this@MainActivity, RestaurantOneActivity::class.java)
            startActivity(intent)
        }

        button2.setOnClickListener {
            val intent = Intent(this@MainActivity, RestaurantTwoActivity::class.java)
            startActivity(intent)
        }

        button3.setOnClickListener {
            val intent = Intent(this@MainActivity, RestaurantThreeActivity::class.java)
            startActivity(intent)
        }

        button4.setOnClickListener {
            val intent = Intent(this@MainActivity, RestaurantFiveActivity::class.java)
            startActivity(intent)
        }

        button5.setOnClickListener {
            val intent = Intent(this@MainActivity, RestaurantSixActivity::class.java)
            startActivity(intent)
        }

        button6.setOnClickListener {
            val intent = Intent(this@MainActivity, RestaurantSevenActivity::class.java)
            startActivity(intent)
        }

        button7.setOnClickListener {
            val intent = Intent(this@MainActivity, RestaurantEightActivity::class.java)
            startActivity(intent)
        }

        button8.setOnClickListener {
            val intent = Intent(this@MainActivity, RestaurantNineActivity::class.java)
            startActivity(intent)
        }


        button9.setOnClickListener {
            val intent = Intent(this@MainActivity, RestaurantTenActivity::class.java)
            startActivity(intent)
        }

        button10.setOnClickListener {
            val intent = Intent(this@MainActivity, RestaurantElevenActivity::class.java)
            startActivity(intent)
        }

        button11.setOnClickListener {
            val intent = Intent(this@MainActivity, RestaurantTwelveActivity::class.java)
            startActivity(intent)
        }

        button12.setOnClickListener {
            val intent = Intent(this@MainActivity, RestaurantFourActivity::class.java)
            startActivity(intent)
        }
    }


    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.main_menu, menu)
        return true


    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when (item.itemId) {
            R.id.action_new_activity -> {
                val intent = Intent(this, AboutUs::class.java)
                startActivity(intent)
                true
            }
            else -> super.onOptionsItemSelected(item)

        }

    }
}






