import { Type } from './type';
import { Categorie } from './categorie';
import { Classe } from './classe';

export class Ressource {
    id : number;
    name :string;
    description :string;
    type : Type;
    class: Classe;
    categorie:Categorie;

}