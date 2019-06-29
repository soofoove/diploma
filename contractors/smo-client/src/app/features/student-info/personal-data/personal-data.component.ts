import { Component, OnInit, ViewChild, Input } from '@angular/core';
import { NgForm } from '@angular/forms';
import { Router } from '@angular/router';
import { SearchStudentResultInterface } from 'src/app/interfaces/models/search-student-result.interface';
import { OrderInterface } from 'src/app/interfaces/models/order.interface';

@Component({
  selector: 'app-personal-data',
  templateUrl: './personal-data.component.html',
  styleUrls: ['./personal-data.component.css']
})
export class PersonalDataComponent implements OnInit {

  @Input() public student: SearchStudentResultInterface;

  public enrollmentOrder: OrderInterface;

  @ViewChild("DataForm") form: NgForm;
  public showContracts = false;
  public showOrders = false;
  constructor(private router: Router) { }

  ngOnInit() {
    this.enrollmentOrder = this.student.contract.orders.find(order => order.orderType.typeOrderName === 'Зарахування');
  }

  onSubmit() {
    console.log(this.form.value);
    this.form.reset();
  }
  close() {
    this.router.navigate(['']);
  }
  toggleContracts() {
    this.showContracts = !this.showContracts;
  }
  toggleOrders(){
    this.showOrders = !this.showOrders;
  }

  unixTimeToString(time: number) {
    const date = new Date(time);

    const year = date.getFullYear();
    const month = date.getMonth() + 1;
    const day = date.getDate();

    let yyyy = `${year}`;
    let mm = `${month}`;
    let dd = `${day}`;

    if (month < 10) {
      mm = `0${mm}`;
    }

    if (day < 10) {
      dd = `${dd}`;
    }

    return `${yyyy}-${mm}-${dd}`;
  }

  stringToUnixTime(date: string) {
    return new Date(date).setHours(0).valueOf();
  }
}
