import {NgModule} from '@angular/core';
import {RouterModule, Routes} from '@angular/router';
import {HomeComponent} from "./home/home.component";


const appRoutes: Routes = [
  {
    path: '', redirectTo: 'manage', pathMatch: 'full'
  },
  {
    path: 'home',component: HomeComponent,
    data: {
      title: 'home',
      description: 'home',
    }
  },
  {
    path: 'manage',
    loadChildren: './manage/manage.module#ManageModule'
  },
];

@NgModule({
  imports: [
    RouterModule.forRoot(appRoutes)
  ],
  exports: [
    RouterModule
  ]
})
export class AppRoutingModule {
}
