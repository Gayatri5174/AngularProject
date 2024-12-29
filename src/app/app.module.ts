import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { HeaderComponent } from './header/header.component';
import { ProgramDetailsComponent } from './program-details/program-details.component';
import { ContactInfoComponent } from './contact-info/contact-info.component';
import { FooterComponent } from './footer/footer.component';
import { AppComponent } from './app.component';



@NgModule({
  declarations: [
    AppComponent,
    HeaderComponent,
    ProgramDetailsComponent,
    ContactInfoComponent,
    FooterComponent
  ],
  imports: [BrowserModule],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule {}
