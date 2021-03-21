package company.barnhouse.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import company.barnhouse.R
import company.barnhouse.adapters.AdapterData
import company.barnhouse.repo.Houses
import company.barnhouse.repo.Repo

class FragmentMain: Fragment() {

    private lateinit var adapter: AdapterData

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? = inflater.inflate(R.layout.fragment_main, container, false)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        val recycler: RecyclerView = view.findViewById(R.id.rv_data)
        adapter = AdapterData()
        recycler.adapter = adapter
        recycler.layoutManager = LinearLayoutManager(activity, RecyclerView.HORIZONTAL, false)

    }

    override fun onStart() {
        super.onStart()
        updateData()
    }

    private fun updateData(){
        adapter.bindData(Repo.getHouses())
        adapter.notifyDataSetChanged()
    }

}