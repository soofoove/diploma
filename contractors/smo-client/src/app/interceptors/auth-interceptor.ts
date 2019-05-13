import { HttpInterceptor, HttpRequest, HttpHandler, HttpEvent, HttpErrorResponse, HttpResponse, HttpHeaders } from '@angular/common/http';
import { Observable, throwError } from 'rxjs';
import { Injectable } from '@angular/core';
import { Router } from '@angular/router';
import { tap, finalize, catchError } from 'rxjs/operators';
import { AuthService } from '../services/auth.service';
import { LocalStorageService } from '../services/local-storage.service';

@Injectable()
export class AuthInterceptor implements HttpInterceptor {
    constructor(private router: Router, private authService: AuthService, private localStorageService: LocalStorageService) {}

    intercept(req: HttpRequest<any>, next: HttpHandler): Observable<HttpEvent<any>>{
        const user = this.localStorageService.getUser();
        const cloneReq = req.clone({
            headers: req.headers.set('Authorization', `Bearer ${user !== null ? user.token : ''}`),
        })

        return next.handle(cloneReq).pipe(
            catchError((error: HttpErrorResponse) => {
                if (error.status === 400 || error.status === 401) {
                    this.authService.isLoggedIn = false;

                    this.router.navigate(['/login']);
                }
                return throwError(error);
            })
        )
    }
}