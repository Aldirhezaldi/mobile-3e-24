package org.aplas.projectmusix;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import android.app.Application;

import org.aplas.projectmusix.databinding.InfoBinding;

public class InfoPage extends Fragment {
    private InfoModel modelInfo;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        InfoBinding bindingInfo = DataBindingUtil.inflate(inflater, R.layout.info, container, false);
        modelInfo = new ViewModelProvider(requireActivity()).get(InfoModel.class);
        bindingInfo.setInfoVM(modelInfo);
        Info info = new Info("Rhezaldi Irnantyo Irawan", "TI-3E", "1841720164", "Menonton Film", "085850336940", "20 Tahun","Teknologi Informasi");
        modelInfo.setInfo(info);
        return bindingInfo.getRoot();
    }
}
