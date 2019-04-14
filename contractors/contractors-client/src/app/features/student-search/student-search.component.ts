import { Component, OnInit } from '@angular/core';
import { NgForm } from '@angular/forms';

//                   ФИО    контракт страна  курс  форма об  факульт об.прог уровень 
type studRecTuple = [string, string, string, number, string, string, string, string ];

@Component({
  selector: 'app-student-search',
  templateUrl: './student-search.component.html',
  styleUrls: ['./student-search.component.css']
})

export class StudentSearchComponent implements OnInit {
    countryList: string[] = [''];
    facultyList: string[] = [''];
    educProgList: string[] = [''];
    progList: string[] = [''];
    nacionalityList: string[] = [''];
    levelList: string[] = [''];
    edFormList: string[] = [''];
    arrLineList: string[] = [''];
    gradeList: string[] = [''];
    langList: string[] = [''];

    resultsArray: studRecTuple[] = [];

    ngOnInit() {
        // TODO: get lists from queries
        this.countryList = this.countryList.concat( ['Украина', 'Великобритания', 'США'] );
        this.facultyList = this.facultyList.concat( ['МехМат', 'ИнЯз', 'МедФак'] );
        this.educProgList = this.educProgList.concat( ['Образ. Программа 1', 'Образ. Программа 2'] );
        this.progList = this.progList.concat( ['Программа 1', 'Программа 2'] );
        this.nacionalityList = this.nacionalityList.concat( ['Украина', 'Не Украина'] );
        this.levelList = this.levelList.concat( ['Уровень 1', 'Уровень 2'] );
        this.edFormList = this.edFormList.concat( ['Дневная', 'Заочная'] );
        this.arrLineList = this.arrLineList.concat( ['Линия 1', 'Линия 2'] );
        this.gradeList = this.gradeList.concat( ['1', '2', 'больше'] );
        this.arrLineList = this.arrLineList.concat( ['Украинский', 'Английский'] );
    }

    submitSearch( searchForm: NgForm ) {
//                   ФИО    контракт страна  курс  форма об  факульт об.прог уровень
        this.resultsArray = this.resultsArray.concat
        (
            [
                ['Ivanov', '131313', 'UA', 3, 'ed form', 'faculty', 'ed progr', 'level'],
                ['Livanov', '131313', 'UA', 3, 'ed form', 'faculty', 'ed progr', 'level'],
                ['Pivanov', '131313', 'UA', 3, 'ed form', 'faculty', 'ed progr', 'level'],
                ['Duvanov', '131313', 'UA', 3, 'ed form', 'faculty', 'ed progr', 'level']
            ]
        );
        console.log( searchForm );
    }
}

