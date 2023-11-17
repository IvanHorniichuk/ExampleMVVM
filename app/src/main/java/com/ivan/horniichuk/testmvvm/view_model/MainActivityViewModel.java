package com.ivan.horniichuk.testmvvm.view_model;

import android.view.View;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.ivan.horniichuk.testmvvm.model.Model;
import com.ivan.horniichuk.testmvvm.model.ModelImpl;

public class MainActivityViewModel extends ViewModel {

    private final MutableLiveData<BookModel> bookModelMutableLiveData;

    private final Model model;

    public MainActivityViewModel() {
        this.model = new ModelImpl();

        BookModel initialValue = new BookModel(model.getNextBook());
        this.bookModelMutableLiveData = new MutableLiveData<>(initialValue);
    }

    public void onNextButtonClicked(View v) {
        BookModel tmpVal = new BookModel(model.getNextBook());
        bookModelMutableLiveData.postValue(tmpVal);
    }

    public MutableLiveData<BookModel> getBookModelMutableLiveData() {
        return bookModelMutableLiveData;
    }


}
