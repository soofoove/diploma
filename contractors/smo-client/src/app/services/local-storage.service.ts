import { Injectable } from '@angular/core';
import { User } from '../interfaces/user.interface';

@Injectable({
  providedIn: 'root'
})
export class LocalStorageService {

  constructor() { }

  setUser(user: User) {
    localStorage['user'] = JSON.stringify(user);
  }

  getUser(): User {
    if (localStorage['user'] === undefined) {
      return null;
    }
    return JSON.parse(localStorage['user']);
  }

  userExists(): boolean {
    return !!localStorage['user'];
  }
}
