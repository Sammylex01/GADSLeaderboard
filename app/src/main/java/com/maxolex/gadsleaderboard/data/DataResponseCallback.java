package com.maxolex.gadsleaderboard.data;

public interface DataResponseCallback<T> {
    void onResponse(T response);
    void onError(Throwable error);
}
