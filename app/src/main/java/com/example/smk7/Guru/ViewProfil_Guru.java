package com.example.smk7.Guru;

import android.content.Context;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.smk7.BottomNavigationHandler;
import com.example.smk7.R;


public class ViewProfil_Guru extends Fragment {
    private Button BackButton ;
    private BottomNavigationHandler navigationHandler;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_view_profil__guru, container, false);

        BackButton = view.findViewById(R.id.btn_kembali);




        BackButton.setOnClickListener(v -> {
            if (getActivity() instanceof DashboardGuru) {
                ((DashboardGuru) getActivity()).viewPager2.setCurrentItem(6);
            }
        });
        return view;

    }

    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
        try {
            navigationHandler = (BottomNavigationHandler) context;
        } catch (ClassCastException e) {
            throw new ClassCastException(context.toString()
                    + " must implement BottomNavigationHandler");
        }
    }

    @Override
    public void onResume() {
        super.onResume();
        if (navigationHandler != null) {
            navigationHandler.hideBottomNav();
        }
    }

    @Override
    public void onPause() {
        super.onPause();
        if (navigationHandler != null) {
            navigationHandler.showBottomNav();
        }
    }

    @Override
    public void onDetach() {
        super.onDetach();
        navigationHandler = null;
    }
}