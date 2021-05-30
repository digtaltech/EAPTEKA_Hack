package dt.prot.bottom_menu

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Toast
import dt.prot.bottom_menu.fragment.AboutFragment
import dt.prot.bottom_menu.fragment.HomeFragment
import dt.prot.bottom_menu.fragment.SettingsFragment
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), View.OnClickListener {

    private var aboutFragment: AboutFragment? = null
    private var homeFragment: HomeFragment? = null
    private var settingsFragment: SettingsFragment? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        ivAbout.setOnClickListener(this)
        ivHome.setOnClickListener(this)
        ivSettings.setOnClickListener(this)

        onClick(ivAbout)
    }

    override fun onClick(v: View?) {
        when(v) {
            ivAbout -> {
                onClickSrc(booleanArrayOf(true, false, false))
                if (aboutFragment == null) aboutFragment = AboutFragment()
                supportFragmentManager.beginTransaction().replace(R.id.fragment_container, aboutFragment!!).commit()
            }
            ivHome -> {
                onClickSrc(booleanArrayOf(false,true,false))
                if (homeFragment == null) homeFragment = HomeFragment()
                supportFragmentManager.beginTransaction().replace(R.id.fragment_container, homeFragment!!).commit()
            }
            ivSettings -> {
                onClickSrc(booleanArrayOf(false,false,true))
                if (settingsFragment == null) settingsFragment = SettingsFragment()
                supportFragmentManager.beginTransaction().replace(R.id.fragment_container, settingsFragment!!).commit()
            }
            else -> {
                Log.d("bottom navigation", "else part of bottom navigation")
            }
        }
    }

    private fun onClickSrc(boolArr: BooleanArray){
        if (boolArr[0]) ivAbout.setImageResource(R.drawable.ic_about/* on */) else ivAbout.setImageResource(R.drawable.ic_about/* off */)
        if (boolArr[1]) ivHome.setImageResource(R.drawable.ic_home) else ivHome.setImageResource(R.drawable.ic_home)
        if (boolArr[2]) ivSettings.setImageResource(R.drawable.ic_settings) else ivSettings.setImageResource(R.drawable.ic_settings)
    }
}