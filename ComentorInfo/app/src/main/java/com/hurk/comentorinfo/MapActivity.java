package com.hurk.comentorinfo;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.MarkerOptions;

public class MapActivity extends FragmentActivity
        implements OnMapReadyCallback {

    private GoogleMap map;

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_map);

        SupportMapFragment mapFragment =
                (SupportMapFragment) getSupportFragmentManager().findFragmentById(R.id.map_activity_fragment);
        mapFragment.getMapAsync(this);
    }

    @Override
    public void onMapReady(GoogleMap map) {
        map.addMarker(new MarkerOptions().position(WebsiteListActivity.OFFICE).title("Comentor AB\nLindholmspiren 5A"));
        map.moveCamera(CameraUpdateFactory.newLatLngZoom(WebsiteListActivity.OFFICE, 17));
    }
}