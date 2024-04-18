import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { PagenotfoundComponent } from './templates/pagenotfound/pagenotfound.component';
import { HeaderTemplateComponent } from './header-template/header-template.component';

const routes: Routes = [
  {
    path:"",
    component: HeaderTemplateComponent,
    children: [
      {
        path:"",
        pathMatch:'full',
        redirectTo:""
      },
      {
        path:"",
        loadChildren: () => import("./home/home.module").then(m => m.HomeModule)
      },
      {
        path:"login",
        loadChildren: () => import("./login/login.module").then(m => m.LoginModule)
      },
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
