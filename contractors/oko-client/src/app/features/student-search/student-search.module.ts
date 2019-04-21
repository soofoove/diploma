import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';

import { StudentSearchRoutingModule } from './student-search-routing.module';
import { StudentSearchComponent } from './student-search.component';
import { FormsModule } from '@angular/forms';

@NgModule({
  declarations: [StudentSearchComponent],
  imports: [
    CommonModule,
    FormsModule,
    StudentSearchRoutingModule
  ]
})
export class StudentSearchModule { }
