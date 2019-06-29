import { CountryInterface } from './country.interface';

export interface StudentInterface {
    id: string;
    surname: string;
    name: string;
    middleName: string;
    dateOfBirth: number;
    country: CountryInterface;
}
