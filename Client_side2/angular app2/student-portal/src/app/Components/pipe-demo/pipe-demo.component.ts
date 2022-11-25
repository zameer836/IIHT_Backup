import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-pipe-demo',
  templateUrl: './pipe-demo.component.html',
  styleUrls: ['./pipe-demo.component.css']
})
export class PipeDemoComponent implements OnInit {

  employee = {
    "name":"Lewis Hamilton",
    "BaseSalary" :1000000,
    "JoinedOn" :Date.now() ,
    "Qualification" :"Btech",
    "About":"Sir Lewis Carl Davidson Hamilton MBE HonFREng is a British racing driver currently competing in Formula One for Mercedes. In Formula One, Hamilton has won a joint-record seven World Drivers' Championship titles, and holds the records for the most wins, pole positions, and podium finishes, among others.",
    "winningPercent": 34.45/100
  }

  constructor() { }

  ngOnInit(): void {
  }

}
