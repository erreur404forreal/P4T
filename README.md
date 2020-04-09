# MyERP
[![Build Status](https://travis-ci.com/erreur404forreal/P4T.svg?branch=master)](https://travis-ci.com/erreur404forreal/P4T)

[![Coverage Status](https://coveralls.io/repos/github/erreur404forreal/P4T/badge.svg?branch=master)](https://coveralls.io/github/erreur404forreal/P4T?branch=master)

## Organisation du répertoire

*   `doc` : documentation
*   `docker` : répertoire relatifs aux conteneurs _docker_ utiles pour le projet
    *   `dev` : environnement de développement
*   `src` : code source de l'application


## Environnement de développement

Les composants nécessaires lors du développement sont disponibles via des conteneurs _docker_.
L'environnement de développement est assemblé grâce à _docker-compose_
(cf docker/dev/docker-compose.yml).

Il comporte :

*   une base de données _PostgreSQL_ contenant un jeu de données de démo (`postgresql://127.0.0.1:9032/db_myerp`)



### Lancement

    cd docker/dev
    docker-compose up


### Arrêt

    cd docker/dev
    docker-compose stop


### Remise à zero

    cd docker/dev
    docker-compose stop
    docker-compose rm -v
    docker-compose up


## Travis CI
Le fichier de configuration `.travis.yml` de l'environnement d'intégration continue Travis CI.

### Erreurs
La mise en place des tests unitaires et d’intégration a permis de mettre en évidence plusieurs erreurs dans le code :
-	Classe `EcritureComptable` :`getTotalCredit()` appel vEcritureComptable.getDebit() au lieu de vEcritureComptable.getCredit().
-	Classe `EcritureComptable` :  `equals` remplace `compareTo()` .
-	Classe `EcritureComptable` : Il y avait une erreur dans l’expression régulière servant à valider le format de la référence d’une écriture comptable.
-	Fichier `sqlContext.xml` : Erreur dans la requete `SQLinsertListLigneEcritureComptable`.

