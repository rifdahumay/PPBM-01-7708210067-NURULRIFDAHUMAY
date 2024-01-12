package com.example.cineswift;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.SearchView;
import android.widget.Toast;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link BioskopFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class BioskopFragment extends Fragment {
    ListView lv;
    SearchView searchView;
    ArrayAdapter<String> adapter;

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public BioskopFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment BioskopFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static BioskopFragment newInstance(String param1, String param2) {
        BioskopFragment fragment = new BioskopFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_bioskop2, container, false);

        String[] listBioskop = {"CGV BEC", "CGV 23 Paskal", "CGV The Kings Shopping Centre", "XXI Theematic Mall", "XXI Cihampelas Walk", "XXI BTC", "XXI Ubertos", "XXI Braga", "XXI Trans Studio Mall Bandung", "XXI Transmart buah batu", "Empire XXI Bandung Indah Plaza", "CGV Paris van Java", "CGV Metro Indah Mall", "Cineapolis Istana Plaza", "CGV Miko Mall", "XXI Festival Citylink"};

        lv = view.findViewById(R.id.id_listView);

        // Initialize the ArrayAdapter with the data
        adapter = new ArrayAdapter<>(requireContext(), android.R.layout.simple_list_item_1, listBioskop);
        lv.setAdapter(adapter);

        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                // Handle item click if needed
                Toast.makeText(requireContext(), "You Clicked " + listBioskop[position], Toast.LENGTH_SHORT).show();
            }
        });

        return view;
    }

}