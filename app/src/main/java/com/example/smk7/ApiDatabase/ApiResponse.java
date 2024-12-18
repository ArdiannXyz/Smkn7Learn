package com.example.smk7.ApiDatabase;

import android.util.Log;

import com.example.smk7.Model.BankTugasModel;
import com.example.smk7.Model.KelasModel;
import com.example.smk7.Model.MapelModel;
import com.example.smk7.Model.MateriModel;
import com.example.smk7.Model.TugasModel;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class ApiResponse {
    private static final String TAG = "ApiResponse";

    // Status API
    @SerializedName("status")
    private String status;

    @SerializedName("success")
    private boolean success;

    @SerializedName("message")
    private String message;

    // Model Data
    @SerializedName("tugas_model")
    private List<TugasModel> tugasModel;

    @SerializedName("kelasModel")
    private List<KelasModel> kelasModel;

    @SerializedName("mapel_model")
    private List<MapelModel> mapelModel;

    @SerializedName("materi_model")
    private List<MateriModel> materiModel;

    @SerializedName("bank_tugas_model")
    private List<BankTugasModel> bankTugasModel;

    // Getter dan Setter status API
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    // Getter dan Setter Model Data
    public List<KelasModel> getKelasModel() {
        if (kelasModel == null) {
            Log.w(TAG, "getKelasModel: Returning null");
        }
        return kelasModel;
    }

    public void setKelasModel(List<KelasModel> kelasModel) {
        this.kelasModel = kelasModel;
        Log.d(TAG, "setKelasModel: Size = " + (kelasModel != null ? kelasModel.size() : 0));
    }

    public List<MapelModel> getMapelModel() {
        if (mapelModel == null) {
            Log.w(TAG, "getMapelModel: Returning null");
        }
        return mapelModel;
    }

    public void setMapelModel(List<MapelModel> mapelModel) {
        this.mapelModel = mapelModel;
        Log.d(TAG, "setMapelModel: Size = " + (mapelModel != null ? mapelModel.size() : 0));
    }

    public List<MateriModel> getMateriModel() {
        if (materiModel == null) {
            Log.w(TAG, "getMateriModel: Returning null");
        }
        return materiModel;
    }

    public void setMateriModel(List<MateriModel> materiModel) {
        this.materiModel = materiModel;
        Log.d(TAG, "setMateriModel: Size = " + (materiModel != null ? materiModel.size() : 0));
    }

    public List<TugasModel> getTugasModel() {
        if (tugasModel == null) {
            Log.w(TAG, "getTugasModel: Returning null");
        }
        return tugasModel;
    }

    public void setTugasModel(List<TugasModel> tugasModel) {
        this.tugasModel = tugasModel;
        Log.d(TAG, "setTugasModel: Size = " + (tugasModel != null ? tugasModel.size() : 0));
    }

    public List<BankTugasModel> getBankTugasModel() {
        if (bankTugasModel == null) {
            Log.w(TAG, "getBankTugasModel: Returning null");
        }
        return bankTugasModel;
    }

    public void setBankTugasModel(List<BankTugasModel> bankTugasModel) {
        this.bankTugasModel = bankTugasModel;
        if (bankTugasModel != null) {
            Log.d(TAG, "setBankTugasModel: Size = " + bankTugasModel.size());
            // Log detail setiap item untuk debugging
            for (int i = 0; i < bankTugasModel.size(); i++) {
                BankTugasModel model = bankTugasModel.get(i);
                Log.d(TAG, "BankTugas[" + i + "]: nama=" + model.getNama()
                        + ", status=" + model.getStatus()
                        + ", file_tugas=" + model.getFileTugas());
            }
        } else {
            Log.w(TAG, "setBankTugasModel: Received null list");
        }
    }

    // Method untuk memeriksa data kosong dengan logging
    public boolean isKelasModelEmpty() {
        boolean isEmpty = kelasModel == null || kelasModel.isEmpty();
        Log.d(TAG, "isKelasModelEmpty: " + isEmpty);
        return isEmpty;
    }

    public boolean isMapelModelEmpty() {
        boolean isEmpty = mapelModel == null || mapelModel.isEmpty();
        Log.d(TAG, "isMapelModelEmpty: " + isEmpty);
        return isEmpty;
    }

    public boolean isMateriModelEmpty() {
        boolean isEmpty = materiModel == null || materiModel.isEmpty();
        Log.d(TAG, "isMateriModelEmpty: " + isEmpty);
        return isEmpty;
    }

    public boolean isTugasModelEmpty() {
        boolean isEmpty = tugasModel == null || tugasModel.isEmpty();
        Log.d(TAG, "isTugasModelEmpty: " + isEmpty);
        return isEmpty;
    }

    public boolean isBankTugasModelEmpty() {
        boolean isEmpty = bankTugasModel == null || bankTugasModel.isEmpty();
        Log.d(TAG, "isBankTugasModelEmpty: " + isEmpty);
        return isEmpty;
    }

    // ToString override untuk debugging
    @Override
    public String toString() {
        return "ApiResponse{" +
                "status='" + status + '\'' +
                ", success=" + success +
                ", message='" + message + '\'' +
                ", bankTugasModel size=" + (bankTugasModel != null ? bankTugasModel.size() : 0) +
                '}';
    }
}