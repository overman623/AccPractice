package com.makestorming.accpractice;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class CounterViewModel extends ViewModel {

    private MutableLiveData<Integer> counter = new MutableLiveData<>();

    public CounterViewModel(){
        counter.setValue(0);
    }

    public MutableLiveData<Integer> getCounter() {
        return counter;
    }

    public void increase() {
        counter.setValue(counter.getValue() + 1);
    }

    public void decrease() {
        counter.setValue(counter.getValue() - 1);
    }
}
