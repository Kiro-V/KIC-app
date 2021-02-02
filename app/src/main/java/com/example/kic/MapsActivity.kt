package com.example.kic

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

import com.google.android.gms.maps.CameraUpdateFactory
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.OnMapReadyCallback
import com.google.android.gms.maps.SupportMapFragment
import com.google.android.gms.maps.model.LatLng
import com.google.android.gms.maps.model.MarkerOptions

class MapsActivity : AppCompatActivity(), OnMapReadyCallback {

    private lateinit var mMap: GoogleMap

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_maps)
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        val mapFragment = supportFragmentManager
            .findFragmentById(R.id.map) as SupportMapFragment

        mapFragment.getMapAsync(this)
        findViewById<ImageView>(R.id.btnback).setOnClickListener{
            onBackPressed()
        }
    }

    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */
    override fun onMapReady(googleMap: GoogleMap) {
        mMap = googleMap

        // Add a marker in Sydney and move the camera
        val cathedral = LatLng(10.780083679140876, 106.69949078994685)

        val location1 = LatLng(10.77448097335788, 106.69712049465241)
        val location2 = LatLng(10.774968385915827, 106.66718608392844)
        val location3 = LatLng(10.710330808550616, 106.57405309741804)
        val location4 = LatLng(16.462704258229245, 107.58795997138081)
        val location5 = LatLng(16.072573921914092, 108.21570956863985)
        val location6 = LatLng(21.004945945897095, 105.84108763643326)
        val location7 = LatLng(21.040081150504843, 105.81284429038726)
        val location8 = LatLng(21.018774582629163, 105.86158482388842)

        mMap.addMarker(MarkerOptions().position(location1).title("Trung tâm y tế dự phòng HCM"))
        mMap.addMarker(MarkerOptions().position(location2).title("Bệnh viện Nhân dân 115"))
        mMap.addMarker(MarkerOptions().position(location3).title("Bệnh viện Nhi đồng Thành phố"))
        mMap.addMarker(MarkerOptions().position(location4).title("Bệnh viện Trung Ương Huế"))
        mMap.addMarker(MarkerOptions().position(location5).title("Bệnh viện Đà Nẵng"))
        mMap.addMarker(MarkerOptions().position(location6).title("Bệnh viện Việt Pháp"))
        mMap.addMarker(MarkerOptions().position(location7).title("Bệnh viện Quân Y 354"))
        mMap.addMarker(MarkerOptions().position(location8).title("Viện 108"))

        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(cathedral,13f))
    }
}