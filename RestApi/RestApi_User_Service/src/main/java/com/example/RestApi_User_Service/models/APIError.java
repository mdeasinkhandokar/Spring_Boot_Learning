package com.example.RestApi_User_Service.models;

import java.io.Serializable;
import java.time.LocalDate;

public record APIError (LocalDate timestamp, int status, String errorMessage, String message,String path) {




}
