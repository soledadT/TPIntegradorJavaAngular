import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { LoginComponent } from './login/login.component';
import { RegisterComponent } from './register/register.component';
import { ListUsersComponent } from './list-users/list-users.component';
import { EditUserComponent } from './edit-user/edit-user.component';
import { EditDayComponent } from './edit-day/edit-day.component';
import { EditRolComponent } from './edit-rol/edit-rol.component';
import { EditLevelComponent } from './edit-level/edit-level.component';
import { EditCostComponent } from './edit-cost/edit-cost.component';
import { EditCategoryComponent } from './edit-category/edit-category.component';


const routes: Routes = [
  {path: 'login', component: LoginComponent},
  {path: 'register', component: RegisterComponent},
  {path: 'listUser', component: ListUsersComponent},
  {path: 'editUser', component: EditUserComponent},
  {path: 'editDay', component: EditDayComponent},
  {path: 'editRol', component: EditRolComponent},
  {path: 'editLevel', component: EditLevelComponent},
  {path: 'editCost', component: EditCostComponent},
  {path: 'editCategory', component: EditCategoryComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
