package com.commonsware.empublite;

import retrofit.http.GET;

public interface BookUpdatedInterface {
    @GET("/misc/empublite-update.json")
    BookUpdateInfo update();
}
