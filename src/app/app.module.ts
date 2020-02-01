import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import {HttpClientModule} from '@angular/common/http';

import {FormsModule, ReactiveFormsModule} from '@angular/forms';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';

import { MediaListComponent } from './media/media-list/media-list.component';
import { MediaAddComponent } from './media/media-add/media-add.component';
import { MediaUpdateComponent } from './media/media-update/media-update.component';
import { LoginComponent } from './authentication/login/login.component';
import { RegisterComponent } from './authentication/register/register.component';
import { ProfileUpdateComponent } from './account/profile-update/profile-update.component';
import { SearchComponent } from './account/search/search.component';
import { BlockedUserComponent } from './account/blocked-user/blocked-user.component';
import { SingleMediaComponent } from './upload-media/single-media/single-media.component';
import { MultiMediaComponent } from './upload-media/multi-media/multi-media.component';
import { FollowersComponent } from './follow/followers/followers.component';
import { FollowingComponent } from './follow/following/following.component';
import { FollowListComponent } from './follow/follow-list/follow-list.component';
import { PixogramHeadderComponent } from './Headder/pixogram-headder/pixogram-headder.component';
import { MediaDetailsComponent } from './media/media-details/media-details.component';
import { LogoutComponent } from './logout/logout.component';
import { AccountComponent } from './Account/account/account.component';



@NgModule({
  declarations: [
    AppComponent,
    PixogramHeadderComponent,
    MediaListComponent,
    MediaAddComponent,
    MediaUpdateComponent,
    LoginComponent,
    RegisterComponent,
    ProfileUpdateComponent,
    SearchComponent,
    BlockedUserComponent,
    SingleMediaComponent,
    MultiMediaComponent,
    FollowersComponent,
    FollowingComponent,
    FollowListComponent,
    MediaDetailsComponent,
    LogoutComponent,
    AccountComponent,
    
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule ,
    FormsModule,
    ReactiveFormsModule,
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
