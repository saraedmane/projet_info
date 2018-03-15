# projet_info
Pour pouvoir utiliser notre application dans le monde entier, il faut pouvoir retrouver rapidement les restaurants 
qui se trouvent dans une certaine zone géographique. Pour cela, on utilise la classe Grid qui fournit un découpage du globe
en plusieurs grilles. Ensuite, il nous faut associer à chaque restaurant la grille dans laquelle il est, et faire de même pour
le client au moment où on le localise, d où l'utilité de la méthode statique whichGrid. 
Le cheminement se fait comme suit: On commence par obtenir la grille dans laquelle se trouve le client, ensuite on cherche dans la liste de tous les restaurants du monde ceux qui sont dans la même grille que lui, d où l'utilité d avoir une Map qui prend en clé le nom d une case, et en valeur une liste de tous les restaurants qui se trouvent dans cette case. Seul problème,il n'y a pas dans java une structure de données qui permet de mettre plusieurs fois la même clé puis d'obtenir toutes les valeurs associées à celles-ci.
Pour contourner ce problème, on utilise une Map ayant comme clé Grid, et comme valeur la liste des restaurants qui se trouvent 
dans cette grille.
Dernier problème à contourner: Comment rajouter un restaurant qui se trouve dans une certaine grille? On définit une classe putvaluequi utilise la méthode get(key) de l'interface map pour retourner la liste associée à la clé puis on rajoute à celle-ci la clé.
