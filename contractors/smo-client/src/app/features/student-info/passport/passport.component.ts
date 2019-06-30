import { Component, OnInit } from '@angular/core';
import { StudentService } from 'src/app/services/student/student.service';
import { DopStudentInterface } from 'src/app/interfaces/dop-student.interface';
import { Observable } from 'rxjs';
import { EntityCrudService } from 'src/app/services/entity-crud/entity-crud.service';

@Component({
  selector: 'app-passport',
  templateUrl: './passport.component.html',
  styleUrls: ['./passport.component.css']
})
export class PassportComponent implements OnInit {
  public showNotes = false;
  public dopStudent$: Observable<DopStudentInterface>;
  constructor(
    private studentService: StudentService,
    private entityService: EntityCrudService) { }

  ngOnInit() {
    this.dopStudent$ = this.entityService.getDopStudentByContractId(this.studentService.currentStudent.contract.id);
    this.dopStudent$.subscribe(dop => console.log(dop));
  }

  toggleNotes(){
    this.showNotes = !this.showNotes;
  }
}
