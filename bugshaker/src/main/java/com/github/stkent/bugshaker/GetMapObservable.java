package com.github.stkent.bugshaker;

import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.MapView;
import com.google.android.gms.maps.OnMapReadyCallback;

import rx.Observable;
import rx.Subscriber;

/**
 * TODO: Add a class header comment!
 */
public class GetMapObservable {

    static Observable<GoogleMap> getMapObservable(final MapView mapView) {

        return Observable.create(new Observable.OnSubscribe<GoogleMap>() {
            @Override
            public void call(final Subscriber<? super GoogleMap> subscriber) {

                mapView.getMapAsync(new OnMapReadyCallback() {
                    @Override
                    public void onMapReady(GoogleMap googleMap) {

                        if (googleMap != null) {
                            subscriber.onNext(googleMap);
                            subscriber.onCompleted();
                        } else {
                            subscriber.onError(new NullPointerException());
                        }
                    }
                });
            }
        });
    }

}
