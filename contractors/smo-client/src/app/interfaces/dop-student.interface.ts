import { ContractInterface } from './models/contract.interface';

export interface DopStudentInterface {
    id: number;
    contract: ContractInterface;
    englishName: string;
    sex: string;
    pasportNum: string;
    datePasport: string;
    agePasport: string;
    registryNum: string;
    dateRegistry: string;
    placeRegistry: string;
    visaNum: string;
    whereRegVisa: string;
    dateOfVisa: number;
    ageOfVisa: number;
    borderPlace: string;
    adress: string;
    room: string;
    dateOfArive: number;
    invitation: string;
    passport: string;
    otherInfo: string;
    healthInsuranceNum: string;
    ageHealthInsurance: number;
    migrationInsuranceNum: string;
    ageMigrationInsurance: number;
    kodPoLisenzii: string;
}