package dt.prot.eapteka

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import dt.prot.eapteka.fragment.*
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), View.OnClickListener {

    private var aboutFragment: AboutFragment? = null
    private var homeFragment: HomeFragment? = null
    private var settingsFragment: SettingsFragment? = null
    private var fourFragment: FourFragment? = null
    private var fiveFragment: FiveFragment? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        ivAbout.setOnClickListener(this)
        ivHome.setOnClickListener(this)
        ivSettings.setOnClickListener(this)
        ivFourItem.setOnClickListener(this)
        ivFiveItem.setOnClickListener(this)

        onClick(ivAbout)
    }

    override fun onClick(v: View?) {
        when(v) {
            ivAbout -> {
                onClickSrc(booleanArrayOf(true, false, false, false, false))
                if (aboutFragment == null) aboutFragment = AboutFragment()
                supportFragmentManager.beginTransaction().replace(R.id.fragment_container, aboutFragment!!).commit()
            }
            ivHome -> {
                onClickSrc(booleanArrayOf(false, true, false, false, false))
                if (homeFragment == null) homeFragment = HomeFragment()
                supportFragmentManager.beginTransaction().replace(R.id.fragment_container, homeFragment!!).commit()
            }
            ivSettings -> {
                onClickSrc(booleanArrayOf(false, false, true, false, false))
                if (settingsFragment == null) settingsFragment = SettingsFragment()
                supportFragmentManager.beginTransaction().replace(R.id.fragment_container, settingsFragment!!).commit()
            }
            ivFourItem -> {
                onClickSrc(booleanArrayOf(false, false, false, true, false))
                if (fourFragment == null) fourFragment = FourFragment()
                supportFragmentManager.beginTransaction().replace(R.id.fragment_container, fourFragment!!).commit()
            }
            ivFiveItem -> {
                onClickSrc(booleanArrayOf(false, false, false, false, true))
                if (fiveFragment == null) fiveFragment = FiveFragment()
                supportFragmentManager.beginTransaction().replace(R.id.fragment_container, fiveFragment!!).commit()
            }
            else -> {
                Log.d("bottom navigation", "else part of bottom navigation")
            }
        }
    }

    private fun onClickSrc(boolArr: BooleanArray){
        if (boolArr[0]) ivAbout.setImageResource(R.drawable.ic_plus_on/* on */) else ivAbout.setImageResource(R.drawable.ic_plus_off/* off */)
        if (boolArr[1]) ivHome.setImageResource(R.drawable.ic_catalog_on) else ivHome.setImageResource(R.drawable.ic_catalog_off)
        if (boolArr[2]) ivSettings.setImageResource(R.drawable.ic_cart_on) else ivSettings.setImageResource(R.drawable.ic_cart_off)
        if (boolArr[3]) ivFourItem.setImageResource(R.drawable.ic_like_on) else ivFourItem.setImageResource(R.drawable.ic_like_off)
        if (boolArr[4]) ivFiveItem.setImageResource(R.drawable.ic_profile_on) else ivFiveItem.setImageResource(R.drawable.ic_profile_off)
    }
}