import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-pipe-demo',
  templateUrl: './pipe-demo.component.html',
  styleUrls: ['./pipe-demo.component.css']
})
export class PipeDemoComponent implements OnInit {
  employee = {
    "name": "Lewis Hamilton",
    "BaseSalary" : "100000",
    "JoinedOn" : Date.now(),
    "Qualification" : "Btech",
    "About" : "Sir Lewis Carl Davidson Hamilton MBE HonFREng (born 7 January 1985) is a British racing driver currently competing in Formula One for Mercedes. In Formula One, Hamilton has won a joint-record seven World Drivers' Championship titles (tied with Michael Schumacher), and holds the records for the most wins",
    "WinningPercentage" : 34.45/100
  }

  constructor() { }

  ngOnInit(): void {
  }

}
