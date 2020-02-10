package com.example.pb.ui.favourite;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class FavouriteViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public FavouriteViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("Страница, на которой будут отображаться избранные продукты/компоненты");
    }

    public LiveData<String> getText() {
        return mText;
    }
}