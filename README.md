# TP_MongoDB

##Quelles sont les limites d’une base données orientée documents ?

###Definition :
C'est un type de base de données destinée à stocker des documents. Assez proche du modèle des bases SQL, les bases de documents n'en offrent pas moins une souplesse bien plus grande. Certains documents d'une collection peuvent avoir des champs supplémentaires.
En outre, le contenu d'un document ne se limite pas à des attributs simples, on peut également avoir des tableaux, voire inclure un autre document dans celui-ci. Par exemple, il est possible de stocker les commentaires liés à un article directement dans celui-ci, sous forme d'un tableau d'objets dépendants.

###Limites :

* Les bases NoSQL manquent de standardisation et de normalisation.

* Les bases NoSQL sont généralement assez limitées au niveau du support des transactions. Si l'édition d'un objet se fait en principe de manière atomique, dès qu'il s'agit de modifier plusieurs objets dépendant les uns des autres, la base n'offre plus les garanties qu'on retrouve avec le relationnel.

* Les contraintes d'intégrité ne sont généralement pas implémentées par les bases de données NoSQL, cela délègue cette gestion à la partie applicative.

* Les bases SQL sont souvent plus performantes sur les requêtes complexes qui nécessiteraient de rapatrier plus de données que nécessaire pour les traiter en NoSQL.