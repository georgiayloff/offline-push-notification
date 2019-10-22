import { Component } from '@angular/core';
import { ScoresConsumerService } from '../scores-consumer.service';

@Component({
  selector: 'app-tab1',
  templateUrl: 'tab1.page.html',
  styleUrls: ['tab1.page.scss']
})
export class Tab1Page {

  messages = [];

  constructor(private scoresConsumer: ScoresConsumerService) {
    this.scoresConsumer.connectToEventSource().subscribe(message => {
      console.log('MSG RCVD', message);
      this.messages.push(message);
    });
  }

}
