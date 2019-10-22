import { Injectable, NgZone } from '@angular/core';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class ScoresConsumerService {

  constructor(private ngZone: NgZone) { }

  connectToEventSource(): Observable<string> {
    console.log('CONNECT');
    const source = new EventSource('/scores');
    source.onopen = opened => {
      console.log('OPEN');
    };
    return new Observable(observer => {
      source.onmessage = message => {
        this.ngZone.run(() => {
          console.log(message.data);
          observer.next(message.data);
        });
      };
      source.onerror = error => {
        this.ngZone.run(() => {
          observer.error(error);
        });
      };
    });
  }
}
