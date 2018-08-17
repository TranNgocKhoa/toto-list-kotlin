package khoa.android.com.todolist

import android.os.Bundle
import android.support.design.widget.Snackbar
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.view.Menu
import android.view.MenuItem
import khoa.android.com.todolist.adapters.TodoListDadapter
import khoa.android.com.todolist.models.Category

import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {

    private lateinit var listTodo: RecyclerView;
    override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            setContentView(R.layout.activity_main)
    setSupportActionBar(toolbar)

    fab.setOnClickListener { view ->
        Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                .setAction("Action", null).show()
    }
    listTodo = findViewById(R.id.recylerViewToDo);
    val horizontalLayoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
    listTodo.layoutManager = horizontalLayoutManager;
    var arrayItem = ArrayList<Category>();
    arrayItem.add(Category("Làm bài tập về nhà", true))
    arrayItem.add(Category("Cho chó ăn", true))
    arrayItem.add(Category("Cho mèo ăn", true))
    arrayItem.add(Category("Cắt móng tay", true))
    val adapter = TodoListDadapter(arrayItem)
    listTodo.adapter = adapter

}

        override fun onCreateOptionsMenu(menu: Menu): Boolean {
            // Inflate the menu; this adds items to the action bar if it is present.
            menuInflater.inflate(R.menu.menu_main, menu)
            return true
        }

        override fun onOptionsItemSelected(item: MenuItem): Boolean {
            // Handle action bar item clicks here. The action bar will
            // automatically handle clicks on the Home/Up button, so long
            // as you specify a parent activity in AndroidManifest.xml.
            return when (item.itemId) {
                R.id.action_settings -> true
                else -> super.onOptionsItemSelected(item)
            }
    }
}
