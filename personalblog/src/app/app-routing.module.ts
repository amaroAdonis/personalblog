import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { HeaderComponent } from './header/header.component';
import { PagenotfoundComponent } from './pagenotfound/pagenotfound.component';

const routes: Routes = [
  {
    path:"",
    component: HeaderComponent,
    children: [
      {
        path:"",
        pathMatch:'full',
        redirectTo:""
      },
      {
        path:"",
        loadChildren: () => import("./home/home.module").then(m => m.HomeModule)
      }
    ]
  },
  { path: "404", component: PagenotfoundComponent},
  { path: "**", redirectTo: "/404" },
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
