package org.aplas.projectmusix;

import android.database.Observable;

import androidx.databinding.ObservableField;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class InfoModel extends ViewModel {

    private final ObservableField<String> nama = new ObservableField<>();
    private final ObservableField<String> kelas = new ObservableField<>();
    private final ObservableField<String> nim = new ObservableField<>();
    private final ObservableField<String> hobi = new ObservableField<>();
    private final ObservableField<String> nomor = new ObservableField<>();
    private final ObservableField<String> umur = new ObservableField<>();
    private final ObservableField<String> jurusan = new ObservableField<>();

    public void setModel(Info info){
        nama.set(info.nama);
        kelas.set(info.kelas);
        nim.set(info.nim);
        hobi.set(info.hobi);
        nomor.set(info.nomor);
        umur.set(info.umur);
        jurusan.set(info.jurusan);
    }
}
