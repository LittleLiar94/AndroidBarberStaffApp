package com.example.androidbarberstaffapp.Interface;

import com.example.androidbarberstaffapp.Model.BarberServices;

import org.w3c.dom.Text;

import java.util.List;

public interface IBarberServiceLoadListener {
    void onBarberServicesLoadSuccess(List<BarberServices> barberServicesList);
    void onBarberServicesLoadFailed(String message);
}
