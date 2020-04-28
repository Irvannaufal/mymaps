package com.example.modul5;

import androidx.fragment.app.FragmentActivity;

import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.MapFragment;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class MainActivity extends FragmentActivity implements OnMapReadyCallback {

    MapFragment mapFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mapFragment = (MapFragment) getFragmentManager().findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);

    }

    @Override
    public void onMapReady(GoogleMap googleMap) {

        LatLng school = new LatLng(-7.435079, 112.721649);
        googleMap.addMarker(new MarkerOptions().position(school).title("SMAN 1 Sidoarjo"));
        googleMap.moveCamera(CameraUpdateFactory.newLatLng(school));

        LatLng school2 = new LatLng(-7.437523, 112.723435);
        googleMap.addMarker(new MarkerOptions().position(school2).title("MAN Sidoarjo"));
        googleMap.moveCamera(CameraUpdateFactory.newLatLng(school2));

        LatLng school3 = new LatLng(-7.368437, 112.729603);
        googleMap.addMarker(new MarkerOptions().position(school3).title("SMA Hang Tuah 2 Sidoarjo"));
        googleMap.moveCamera(CameraUpdateFactory.newLatLng(school3));
    }

}