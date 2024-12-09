package com.example.smk7.ApiDatabase;

public class Db_Contract {

    public static String ip = "192.168.100.48";
    public static final String BASE_URL = "http://" + ip + "/api-mobile-php/";
    public static final String urlLogin = BASE_URL + "api-login.php";
    public static final String urlLupaPassword = BASE_URL + "api-check_email.php";
    public static final String urlGantiPassword = BASE_URL + "api-reset_password.php";
    public static final String urlApiDashboard = BASE_URL + "api_dashboard.php";
    public static final String urlApiUploadMateri = BASE_URL + "api-uploadMateri.php";
    public static final String urlApiCrudMateri = BASE_URL + "api-crud.php";
    public static final String urlApiSiswa = BASE_URL + "api_siswa.php";


    public static ApiService getApiService() {
        return ApiClient.getRetrofitInstance().create(ApiService.class);
    }


//    // Method ini akan mengembalikan instance ApiServiceInterface
//    public static ApiServiceInterface getApiService() {
//        return ApiClient.getRetrofitInstance().create(ApiServiceInterface.class);
//    }
}
