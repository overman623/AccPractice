package com.makestorming.accpractice;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.ViewModelProviders;

import android.os.Bundle;

import com.makestorming.accpractice.databinding.ActivityCounterBinding;

public class CounterActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityCounterBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_counter);
        binding.setLifecycleOwner(this);

        CounterViewModel viewModel = ViewModelProviders.of(this).get(CounterViewModel.class);
        binding.setViewModel(viewModel);

    }


}
