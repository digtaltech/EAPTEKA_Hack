package dt.prot.eapteka.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import dt.prot.eapteka.R
import kotlinx.android.synthetic.main.fragment_settings.*

class HomeFragment : Fragment(),View.OnClickListener {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment


        return inflater.inflate(R.layout.fragment_home, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {

        ivShare3i.setOnClickListener(this)
        ivTrash3i.setOnClickListener(this)

        super.onViewCreated(view, savedInstanceState)
    }

    override fun onClick(p0: View?) {
        when (p0){
            ivShare3i -> {

            }
            ivTrash3i -> {

            }
        }
    }


}
