package edu.eci.arsw.blueprints.config;

public record ApiResponse<T>(int code, String message, T data) {
    public String getMessage (){
        return message;
    }
    public int getCode(){
        return code;
    }
    public T getData(){
        return data;
    }
}

