package hackyang.com.common

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val transaction =  supportFragmentManager.beginTransaction()
        transaction.add(R.id.container_fragment, GalleryFragment.newInstance("a", "b"))
        transaction.commit()
    }
}