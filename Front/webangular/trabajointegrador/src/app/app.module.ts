import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { DatePipe } from '@angular/common'
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { LoginComponent } from './login/login.component';
import { RegisterComponent } from './register/register.component';
import { HttpClientModule } from '@angular/common/http';
import { ListUsersComponent } from './list-users/list-users.component';
import { EditUserComponent } from './edit-user/edit-user.component';
import { EditCategoryComponent} from './edit-category/edit-category.component';
import { EditCostComponent} from './edit-cost/edit-cost.component';
import { EditDayComponent} from './edit-day/edit-day.component';
import { EditRolComponent} from './edit-rol/edit-rol.component';
import { EditLevelComponent } from './edit-level/edit-level.component';

@NgModule({
  declarations: [
    AppComponent,
    LoginComponent,
    RegisterComponent,
    ListUsersComponent,
    EditUserComponent,
    EditCategoryComponent,
    EditCostComponent,
    EditDayComponent,
    EditRolComponent,
    EditLevelComponent
],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,
    HttpClientModule
  ],
  providers: [DatePipe],
  bootstrap: [AppComponent]
})
export class AppModule { }
