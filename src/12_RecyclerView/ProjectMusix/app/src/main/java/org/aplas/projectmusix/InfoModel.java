package org.aplas.projectmusix;

import android.database.Observable;

import androidx.databinding.ObservableField;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class InfoModel extends ViewModel {

    public MutableLiveData<Info> info = new MutableLiveData<>();

    public void setInfo(Info info){
        this.info.setValue(info);
    }
}
