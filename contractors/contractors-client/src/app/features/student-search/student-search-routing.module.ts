import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { StudentSearchComponent } from './student-search.component';

const routes: Routes = [
  {
    path: '',
    component: StudentSearchComponent,
  }
];

@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule]
})
export class StudentSearchRoutingModule { }
