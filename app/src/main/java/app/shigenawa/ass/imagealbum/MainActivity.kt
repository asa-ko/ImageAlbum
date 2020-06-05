package app.shigenawa.ass.imagealbum

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    val ImageData:List<ImageData> = listOf(
            ImageData(R.drawable.sekaifuuke123,R.drawable.sekaifuuke123),
            ImageData(R.drawable.sekaifuuke123,R.drawable.sekaifuuke123)
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val adapter=RecyclerViewAdapter(this)
        recyclerView.layoutManager=LinearLayoutManager(this)
        recyclerView.adapter=adapter

        adapter.addAll(ImageData)

    }
}
