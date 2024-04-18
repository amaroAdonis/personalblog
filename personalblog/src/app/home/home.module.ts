import { HeaderModule } from '../header-template/header-template.module';
import { NgModule } from "@angular/core";
import { HomeComponent } from "./home.component";
import { CommonModule } from "@angular/common";
import { HomeRoutingModule } from "./home-routing.module";
import { RouterModule } from "@angular/router";

@NgModule({
    declarations: [
        HomeComponent,
    ],
    imports: [
        CommonModule,
        HomeRoutingModule,
    ],
    exports: [HomeComponent]
})
export class HomeModule{}