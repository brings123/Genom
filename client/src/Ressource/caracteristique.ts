import { Categorie } from './categorie';

export class Caracteristique {
    id : number;
    name :string;
    description :string;
    degSecurite :number;
    categorie : Categorie;
}