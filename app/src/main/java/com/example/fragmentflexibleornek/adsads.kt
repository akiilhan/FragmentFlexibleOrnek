//import android.app.PendingIntent.getActivity
//import android.os.Bundle
//import android.view.LayoutInflater
//import android.view.View
//import android.view.ViewGroup
//import android.widget.AdapterView
//import android.widget.ArrayAdapter
//import android.widget.ListView
//import androidx.annotation.Nullable
//import androidx.fragment.app.Fragment
//import com.example.fragmentflexibleornek.R
//
//package com.example.fragmentflexibleornek
//
//class FragmentKonu : Fragment(), AdapterView.OnItemClickListener {
//
//    internal var konuListesi: ListView
//
//    @Nullable
//    fun onCreateView(
//        inflater: LayoutInflater,
//        container: ViewGroup,
//        savedInstanceState: Bundle
//    ): View {
//
//        val v = inflater.inflate(R.layout.fragment_konu, container, false)
//
//        konuListesi = v.findViewById(R.id.konuListe) as ListView
//
//        val adapter = ArrayAdapter.createFromResource(
//            getActivity(),
//            R.array.konular,
//            android.R.layout.simple_list_item_1
//        )
//        konuListesi.setAdapter(adapter)
//        konuListesi.setOnItemClickListener(this)
//
//
//        return v
//
//    }
//
//    fun onItemClick(parent: AdapterView<*>, view: View, position: Int, id: Long) {
//
//        val listener = getActivity() as MyListener
//
//        listener.sendData(position)
//
//    }
//}