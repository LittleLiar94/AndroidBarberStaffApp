package com.example.androidbarberstaffapp.Interface;

import com.example.androidbarberstaffapp.Model.Saloon;

import java.util.List;

public interface IBranchLoadListener {
    void onBranchLoadSuccess(List<Saloon> saloonList);
    void onBranchLoadFailed(String message);

}
