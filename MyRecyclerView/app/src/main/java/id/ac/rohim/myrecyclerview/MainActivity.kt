package id.ac.rohim.myrecyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.ListView
import android.widget.Toast
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    private lateinit var rvHeroes: RecyclerView
    private var list: ArrayList<Hero> = arrayListOf()
    private var title: String = "Mode list"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        rvHeroes = findViewById(R.id.rv_heroes)
        rvHeroes.setHasFixedSize(true)

        list.addAll(HeroesData.listData)
        showRecyclerList()

        setActionBarTitle(title)

    }

    private fun showRecyclerList() {
        rvHeroes.layoutManager = LinearLayoutManager(this)
        val listHeroAdapter = ListHeroAdapter(list)
        rvHeroes.adapter = listHeroAdapter

        listHeroAdapter.setOnItemClickCallback(object : ListHeroAdapter.OnItemClickCallback {
            override fun onItemClicked(data: Hero) {
                showSelectedHero(data)
            }
        })
    }
    private fun showRecyclerGrid(){
        rvHeroes.layoutManager = GridLayoutManager(this,2)
        val gridHeroAdapter = GridHeroAdapter(list)
        rvHeroes.adapter = gridHeroAdapter

        gridHeroAdapter.setOnItemClickCallback(object : GridHeroAdapter.OnItemClickCallback {
            override fun onItemClicked(data: Hero) {
                showSelectedHero(data)
            }
        })
    }
    private fun showRecyclerCardView(){
        rvHeroes.layoutManager = LinearLayoutManager(this)
        val cardViewHeroAdapter = CardViewHeroAdapter(list)
        rvHeroes.adapter = cardViewHeroAdapter
    }
    private fun showSelectedHero(hero: Hero){
        Toast.makeText(this,"Kamu Memilih "+ hero.name,Toast.LENGTH_SHORT).show()
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater.inflate(R.menu.menu_main,menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        setMode(item.itemId)
        return super.onOptionsItemSelected(item)
    }

    private fun setMode(selectedMode: Int) {
        when(selectedMode){
            R.id.action_list ->{
                title = "Mode List"
                showRecyclerList()
            }
            R.id.action_gird ->{
                title = "Mode Gird"
                showRecyclerGrid()
            }
            R.id.action_cardView ->{
                title = "Mode Card View"
                showRecyclerCardView()
            }
        }
        setActionBarTitle(title)

    }
    private fun setActionBarTitle(title: String){
        supportActionBar?.title = title
    }
}