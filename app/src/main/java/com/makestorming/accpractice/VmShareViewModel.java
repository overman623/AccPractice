package com.makestorming.accpractice;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class VmShareViewModel extends ViewModel {

    public MutableLiveData<Integer> progress = new MutableLiveData<>();

    public VmShareViewModel(){
        progress.setValue(0);
    }


}
