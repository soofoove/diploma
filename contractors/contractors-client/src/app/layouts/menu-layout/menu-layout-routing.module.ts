import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { MenuLayoutComponent } from './menu-layout.component';
import { AuthGuard } from 'src/app/guards/auth.guard';

const routes: Routes = [
  {
    path: '',
    component: MenuLayoutComponent,
    canActivate: [AuthGuard],
    children: [
      {
        path: '',
        pathMatch: 'full',
        redirectTo: 'studentSearch',
      },
      {
        path: 'studentSearch',
        loadChildren: '../../features/student-search/student-search.module#StudentSearchModule',
      }
    ]
  }
];

@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule]
})
export class MenuLayoutRoutingModule { }
