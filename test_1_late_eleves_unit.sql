-- TRUNCATE ALL TABLES 
TRUNCATE "cartes";
TRUNCATE "entree_eleve";
TRUNCATE "horaire_cours";
TRUNCATE "eleves";
TRUNCATE "classe";


-- INSERT DATA FOR TEST

INSERT INTO  classe (nom) VALUES ('SNIR 2');
INSERT INTO  classe (nom) VALUES ('STL');
INSERT INTO  classe (nom) VALUES ('SAR');


INSERT INTO  horaire_cours (jour, h_debut, h_fin, id_classe, nom_prof) VALUES ('Lundi', CAST('08:00:00' AS TIME), CAST('09:00:00' AS TIME), 1, 'Karim');
INSERT INTO  horaire_cours (jour, h_debut, h_fin, id_classe, nom_prof) VALUES ('Lundi', CAST('09:00:00' AS TIME), CAST('10:00:00' AS TIME), 1, 'Karim');
INSERT INTO  horaire_cours (jour, h_debut, h_fin, id_classe, nom_prof) VALUES ('Lundi', CAST('10:00:00' AS TIME), CAST('11:00:00' AS TIME), 1, 'Karim');
INSERT INTO  horaire_cours (jour, h_debut, h_fin, id_classe, nom_prof) VALUES ('Lundi', CAST('11:00:00' AS TIME), CAST('12:00:00' AS TIME), 1, 'Karim');
INSERT INTO  horaire_cours (jour, h_debut, h_fin, id_classe, nom_prof) VALUES ('Lundi', CAST('13:00:00' AS TIME), CAST('14:00:00' AS TIME), 1, 'Karim');
INSERT INTO  horaire_cours (jour, h_debut, h_fin, id_classe, nom_prof) VALUES ('Lundi', CAST('14:00:00' AS TIME), CAST('15:00:00' AS TIME), 1, 'Karim');
INSERT INTO  horaire_cours (jour, h_debut, h_fin, id_classe, nom_prof) VALUES ('Lundi', CAST('15:00:00' AS TIME), CAST('16:00:00' AS TIME), 1, 'Karim');
INSERT INTO  horaire_cours (jour, h_debut, h_fin, id_classe, nom_prof) VALUES ('Lundi', CAST('16:00:00' AS TIME), CAST('17:00:00' AS TIME), 1, 'Karim');

INSERT INTO  horaire_cours (jour, h_debut, h_fin, id_classe, nom_prof) VALUES ('mardi', CAST('08:00:00' AS TIME), CAST('09:00:00' AS TIME), 1, 'Elias')
INSERT INTO  horaire_cours (jour, h_debut, h_fin, id_classe, nom_prof) VALUES ('mardi', CAST('09:00:00' AS TIME), CAST('10:00:00' AS TIME), 1, 'Elias')
INSERT INTO  horaire_cours (jour, h_debut, h_fin, id_classe, nom_prof) VALUES ('mardi', CAST('10:00:00' AS TIME), CAST('11:00:00' AS TIME), 1, 'Elias')
INSERT INTO  horaire_cours (jour, h_debut, h_fin, id_classe, nom_prof) VALUES ('mardi', CAST('11:00:00' AS TIME), CAST('12:00:00' AS TIME), 1, 'Elias')
INSERT INTO  horaire_cours (jour, h_debut, h_fin, id_classe, nom_prof) VALUES ('mardi', CAST('13:00:00' AS TIME), CAST('14:00:00' AS TIME), 1, 'Elias')
INSERT INTO  horaire_cours (jour, h_debut, h_fin, id_classe, nom_prof) VALUES ('mardi', CAST('14:00:00' AS TIME), CAST('15:00:00' AS TIME), 1, 'Elias')
INSERT INTO  horaire_cours (jour, h_debut, h_fin, id_classe, nom_prof) VALUES ('mardi', CAST('15:00:00' AS TIME), CAST('16:00:00' AS TIME), 1, 'Elias')
INSERT INTO  horaire_cours (jour, h_debut, h_fin, id_classe, nom_prof) VALUES ('mardi', CAST('16:00:00' AS TIME), CAST('17:00:00' AS TIME), 1, 'Elias')

INSERT INTO  horaire_cours (jour, h_debut, h_fin, id_classe, nom_prof) VALUES ('mercredi', CAST('08:00:00' AS TIME), CAST('09:00:00' AS TIME), 1, 'Wassime');
INSERT INTO  horaire_cours (jour, h_debut, h_fin, id_classe, nom_prof) VALUES ('mercredi', CAST('09:00:00' AS TIME), CAST('10:00:00' AS TIME), 1, 'Wassime');
INSERT INTO  horaire_cours (jour, h_debut, h_fin, id_classe, nom_prof) VALUES ('mercredi', CAST('10:00:00' AS TIME), CAST('11:00:00' AS TIME), 1, 'Wassime');
INSERT INTO  horaire_cours (jour, h_debut, h_fin, id_classe, nom_prof) VALUES ('mercredi', CAST('11:00:00' AS TIME), CAST('12:00:00' AS TIME), 1, 'Wassime');
INSERT INTO  horaire_cours (jour, h_debut, h_fin, id_classe, nom_prof) VALUES ('mercredi', CAST('13:00:00' AS TIME), CAST('14:00:00' AS TIME), 1, 'Wassime');
INSERT INTO  horaire_cours (jour, h_debut, h_fin, id_classe, nom_prof) VALUES ('mercredi', CAST('14:00:00' AS TIME), CAST('15:00:00' AS TIME), 1, 'Wassime');
INSERT INTO  horaire_cours (jour, h_debut, h_fin, id_classe, nom_prof) VALUES ('mercredi', CAST('15:00:00' AS TIME), CAST('16:00:00' AS TIME), 1, 'Wassime');
INSERT INTO  horaire_cours (jour, h_debut, h_fin, id_classe, nom_prof) VALUES ('mercredi', CAST('16:00:00' AS TIME), CAST('17:00:00' AS TIME), 1, 'Wassime');


INSERT INTO  horaire_cours (jour, h_debut, h_fin, id_classe, nom_prof) VALUES ('jeudi', CAST('08:00:00' AS TIME), CAST('09:00:00' AS TIME), 1, 'Malik');
INSERT INTO  horaire_cours (jour, h_debut, h_fin, id_classe, nom_prof) VALUES ('jeudi', CAST('09:00:00' AS TIME), CAST('10:00:00' AS TIME), 1, 'Malik');
INSERT INTO  horaire_cours (jour, h_debut, h_fin, id_classe, nom_prof) VALUES ('jeudi', CAST('10:00:00' AS TIME), CAST('11:00:00' AS TIME), 1, 'Malik');
INSERT INTO  horaire_cours (jour, h_debut, h_fin, id_classe, nom_prof) VALUES ('jeudi', CAST('11:00:00' AS TIME), CAST('12:00:00' AS TIME), 1, 'Malik');
INSERT INTO  horaire_cours (jour, h_debut, h_fin, id_classe, nom_prof) VALUES ('jeudi', CAST('13:00:00' AS TIME), CAST('14:00:00' AS TIME), 1, 'Malik');
INSERT INTO  horaire_cours (jour, h_debut, h_fin, id_classe, nom_prof) VALUES ('jeudi', CAST('14:00:00' AS TIME), CAST('15:00:00' AS TIME), 1, 'Malik');
INSERT INTO  horaire_cours (jour, h_debut, h_fin, id_classe, nom_prof) VALUES ('jeudi', CAST('15:00:00' AS TIME), CAST('16:00:00' AS TIME), 1, 'Malik');
INSERT INTO  horaire_cours (jour, h_debut, h_fin, id_classe, nom_prof) VALUES ('jeudi', CAST('16:00:00' AS TIME), CAST('17:00:00' AS TIME), 1, 'Malik');

INSERT INTO  horaire_cours (jour, h_debut, h_fin, id_classe, nom_prof) VALUES ('vendredi', CAST('08:00:00' AS TIME), CAST('09:00:00' AS TIME), 1, 'Vincent');
INSERT INTO  horaire_cours (jour, h_debut, h_fin, id_classe, nom_prof) VALUES ('vendredi', CAST('09:00:00' AS TIME), CAST('10:00:00' AS TIME), 1, 'Vincent');
INSERT INTO  horaire_cours (jour, h_debut, h_fin, id_classe, nom_prof) VALUES ('vendredi', CAST('10:00:00' AS TIME), CAST('11:00:00' AS TIME), 1, 'Vincent');
INSERT INTO  horaire_cours (jour, h_debut, h_fin, id_classe, nom_prof) VALUES ('vendredi', CAST('11:00:00' AS TIME), CAST('12:00:00' AS TIME), 1, 'Vincent');
INSERT INTO  horaire_cours (jour, h_debut, h_fin, id_classe, nom_prof) VALUES ('vendredi', CAST('13:00:00' AS TIME), CAST('14:00:00' AS TIME), 1, 'Vincent');
INSERT INTO  horaire_cours (jour, h_debut, h_fin, id_classe, nom_prof) VALUES ('vendredi', CAST('14:00:00' AS TIME), CAST('15:00:00' AS TIME), 1, 'Vincent');
INSERT INTO  horaire_cours (jour, h_debut, h_fin, id_classe, nom_prof) VALUES ('vendredi', CAST('15:00:00' AS TIME), CAST('16:00:00' AS TIME), 1, 'Vincent');
INSERT INTO  horaire_cours (jour, h_debut, h_fin, id_classe, nom_prof) VALUES ('vendredi', CAST('16:00:00' AS TIME), CAST('17:00:00' AS TIME), 1, 'Vincent');


INSERT INTO  horaire_cours (jour, h_debut, h_fin, id_classe, nom_prof) VALUES ('Lundi', CAST('08:00:00' AS TIME), CAST('09:00:00' AS TIME), 2, 'Karim');
INSERT INTO  horaire_cours (jour, h_debut, h_fin, id_classe, nom_prof) VALUES ('Lundi', CAST('09:00:00' AS TIME), CAST('10:00:00' AS TIME), 2, 'Karim');
INSERT INTO  horaire_cours (jour, h_debut, h_fin, id_classe, nom_prof) VALUES ('Lundi', CAST('10:00:00' AS TIME), CAST('11:00:00' AS TIME), 2, 'Karim');
INSERT INTO  horaire_cours (jour, h_debut, h_fin, id_classe, nom_prof) VALUES ('Lundi', CAST('11:00:00' AS TIME), CAST('12:00:00' AS TIME), 2, 'Karim');
INSERT INTO  horaire_cours (jour, h_debut, h_fin, id_classe, nom_prof) VALUES ('Lundi', CAST('13:00:00' AS TIME), CAST('14:00:00' AS TIME), 2, 'Karim');
INSERT INTO  horaire_cours (jour, h_debut, h_fin, id_classe, nom_prof) VALUES ('Lundi', CAST('14:00:00' AS TIME), CAST('15:00:00' AS TIME), 2, 'Karim');
INSERT INTO  horaire_cours (jour, h_debut, h_fin, id_classe, nom_prof) VALUES ('Lundi', CAST('15:00:00' AS TIME), CAST('16:00:00' AS TIME), 2, 'Karim');
INSERT INTO  horaire_cours (jour, h_debut, h_fin, id_classe, nom_prof) VALUES ('Lundi', CAST('16:00:00' AS TIME), CAST('17:00:00' AS TIME), 2, 'Karim');

INSERT INTO  horaire_cours (jour, h_debut, h_fin, id_classe, nom_prof) VALUES ('mardi', CAST('08:00:00' AS TIME), CAST('09:00:00' AS TIME), 2, 'Elias')
INSERT INTO  horaire_cours (jour, h_debut, h_fin, id_classe, nom_prof) VALUES ('mardi', CAST('09:00:00' AS TIME), CAST('10:00:00' AS TIME), 2, 'Elias')
INSERT INTO  horaire_cours (jour, h_debut, h_fin, id_classe, nom_prof) VALUES ('mardi', CAST('10:00:00' AS TIME), CAST('11:00:00' AS TIME), 2, 'Elias')
INSERT INTO  horaire_cours (jour, h_debut, h_fin, id_classe, nom_prof) VALUES ('mardi', CAST('11:00:00' AS TIME), CAST('12:00:00' AS TIME), 2, 'Elias')
INSERT INTO  horaire_cours (jour, h_debut, h_fin, id_classe, nom_prof) VALUES ('mardi', CAST('13:00:00' AS TIME), CAST('14:00:00' AS TIME), 2, 'Elias')
INSERT INTO  horaire_cours (jour, h_debut, h_fin, id_classe, nom_prof) VALUES ('mardi', CAST('14:00:00' AS TIME), CAST('15:00:00' AS TIME), 2, 'Elias')
INSERT INTO  horaire_cours (jour, h_debut, h_fin, id_classe, nom_prof) VALUES ('mardi', CAST('15:00:00' AS TIME), CAST('16:00:00' AS TIME), 2, 'Elias')
INSERT INTO  horaire_cours (jour, h_debut, h_fin, id_classe, nom_prof) VALUES ('mardi', CAST('16:00:00' AS TIME), CAST('17:00:00' AS TIME), 2, 'Elias')

INSERT INTO  horaire_cours (jour, h_debut, h_fin, id_classe, nom_prof) VALUES ('mercredi', CAST('08:00:00' AS TIME), CAST('09:00:00' AS TIME), 2, 'Wassime');
INSERT INTO  horaire_cours (jour, h_debut, h_fin, id_classe, nom_prof) VALUES ('mercredi', CAST('09:00:00' AS TIME), CAST('10:00:00' AS TIME), 2, 'Wassime');
INSERT INTO  horaire_cours (jour, h_debut, h_fin, id_classe, nom_prof) VALUES ('mercredi', CAST('10:00:00' AS TIME), CAST('11:00:00' AS TIME), 2, 'Wassime');
INSERT INTO  horaire_cours (jour, h_debut, h_fin, id_classe, nom_prof) VALUES ('mercredi', CAST('11:00:00' AS TIME), CAST('12:00:00' AS TIME), 2, 'Wassime');
INSERT INTO  horaire_cours (jour, h_debut, h_fin, id_classe, nom_prof) VALUES ('mercredi', CAST('13:00:00' AS TIME), CAST('14:00:00' AS TIME), 2, 'Wassime');
INSERT INTO  horaire_cours (jour, h_debut, h_fin, id_classe, nom_prof) VALUES ('mercredi', CAST('14:00:00' AS TIME), CAST('15:00:00' AS TIME), 2, 'Wassime');
INSERT INTO  horaire_cours (jour, h_debut, h_fin, id_classe, nom_prof) VALUES ('mercredi', CAST('15:00:00' AS TIME), CAST('16:00:00' AS TIME), 2, 'Wassime');
INSERT INTO  horaire_cours (jour, h_debut, h_fin, id_classe, nom_prof) VALUES ('mercredi', CAST('16:00:00' AS TIME), CAST('17:00:00' AS TIME), 2, 'Wassime');


INSERT INTO  horaire_cours (jour, h_debut, h_fin, id_classe, nom_prof) VALUES ('jeudi', CAST('08:00:00' AS TIME), CAST('09:00:00' AS TIME), 2, 'Malik');
INSERT INTO  horaire_cours (jour, h_debut, h_fin, id_classe, nom_prof) VALUES ('jeudi', CAST('09:00:00' AS TIME), CAST('10:00:00' AS TIME), 2, 'Malik');
INSERT INTO  horaire_cours (jour, h_debut, h_fin, id_classe, nom_prof) VALUES ('jeudi', CAST('10:00:00' AS TIME), CAST('11:00:00' AS TIME), 2, 'Malik');
INSERT INTO  horaire_cours (jour, h_debut, h_fin, id_classe, nom_prof) VALUES ('jeudi', CAST('11:00:00' AS TIME), CAST('12:00:00' AS TIME), 2, 'Malik');
INSERT INTO  horaire_cours (jour, h_debut, h_fin, id_classe, nom_prof) VALUES ('jeudi', CAST('13:00:00' AS TIME), CAST('14:00:00' AS TIME), 2, 'Malik');
INSERT INTO  horaire_cours (jour, h_debut, h_fin, id_classe, nom_prof) VALUES ('jeudi', CAST('14:00:00' AS TIME), CAST('15:00:00' AS TIME), 2, 'Malik');
INSERT INTO  horaire_cours (jour, h_debut, h_fin, id_classe, nom_prof) VALUES ('jeudi', CAST('15:00:00' AS TIME), CAST('16:00:00' AS TIME), 2, 'Malik');
INSERT INTO  horaire_cours (jour, h_debut, h_fin, id_classe, nom_prof) VALUES ('jeudi', CAST('16:00:00' AS TIME), CAST('17:00:00' AS TIME), 2, 'Malik');

INSERT INTO  horaire_cours (jour, h_debut, h_fin, id_classe, nom_prof) VALUES ('vendredi', CAST('08:00:00' AS TIME), CAST('09:00:00' AS TIME), 2, 'Vincent');
INSERT INTO  horaire_cours (jour, h_debut, h_fin, id_classe, nom_prof) VALUES ('vendredi', CAST('09:00:00' AS TIME), CAST('10:00:00' AS TIME), 2, 'Vincent');
INSERT INTO  horaire_cours (jour, h_debut, h_fin, id_classe, nom_prof) VALUES ('vendredi', CAST('10:00:00' AS TIME), CAST('11:00:00' AS TIME), 2, 'Vincent');
INSERT INTO  horaire_cours (jour, h_debut, h_fin, id_classe, nom_prof) VALUES ('vendredi', CAST('11:00:00' AS TIME), CAST('12:00:00' AS TIME), 2, 'Vincent');
INSERT INTO  horaire_cours (jour, h_debut, h_fin, id_classe, nom_prof) VALUES ('vendredi', CAST('13:00:00' AS TIME), CAST('14:00:00' AS TIME), 2, 'Vincent');
INSERT INTO  horaire_cours (jour, h_debut, h_fin, id_classe, nom_prof) VALUES ('vendredi', CAST('14:00:00' AS TIME), CAST('15:00:00' AS TIME), 2, 'Vincent');
INSERT INTO  horaire_cours (jour, h_debut, h_fin, id_classe, nom_prof) VALUES ('vendredi', CAST('15:00:00' AS TIME), CAST('16:00:00' AS TIME), 2, 'Vincent');
INSERT INTO  horaire_cours (jour, h_debut, h_fin, id_classe, nom_prof) VALUES ('vendredi', CAST('16:00:00' AS TIME), CAST('17:00:00' AS TIME), 2, 'Vincent');


INSERT INTO  horaire_cours (jour, h_debut, h_fin, id_classe, nom_prof) VALUES ('vendredi', CAST('10:00:00' AS TIME), CAST('11:00:00' AS TIME), 3, 'Vincent');
INSERT INTO  horaire_cours (jour, h_debut, h_fin, id_classe, nom_prof) VALUES ('vendredi', CAST('14:00:00' AS TIME), CAST('15:00:00' AS TIME), 3, 'Vincent');
INSERT INTO  horaire_cours (jour, h_debut, h_fin, id_classe, nom_prof) VALUES ('vendredi', CAST('15:00:00' AS TIME), CAST('16:00:00' AS TIME), 3, 'Vincent');
INSERT INTO  horaire_cours (jour, h_debut, h_fin, id_classe, nom_prof) VALUES ('vendredi', CAST('16:00:00' AS TIME), CAST('17:00:00' AS TIME), 3, 'Vincent');



INSERT INTO eleves (nom, prenom, photo, id_classe) VALUES ('lotfi', 'elias', 'url/photo', 1);
INSERT INTO eleves (nom, prenom, photo, id_classe) VALUES ('lotfi', 'wassime', 'url/photo', 1);
INSERT INTO eleves (nom, prenom, photo, id_classe) VALUES ('leffad', 'karim', 'url/photo', 2);
INSERT INTO eleves (nom, prenom, photo, id_classe) VALUES ('lotfi', 'lemal', 'url/photo', 2);
INSERT INTO eleves (nom, prenom, photo, id_classe) VALUES ('jager', 'eren', 'url/photo', 1);
INSERT INTO eleves (nom, prenom, photo, id_classe) VALUES ('Uzumaki', 'Naruto', 'url/photo', 2);
INSERT INTO eleves (nom, prenom, photo, id_classe) VALUES ('Uchiwa', 'Sasuke', 'url/photo', 3);



INSERT INTO entree_eleve (idE, h_entree, A_envoyer) VALUES (1, CAST('08:03:49' AS TIME ), TRUE);
INSERT INTO entree_eleve (idE, h_entree, A_envoyer) VALUES (2, CAST('07:59:49' AS TIME ), FALSE);
INSERT INTO entree_eleve (idE, h_entree, A_envoyer) VALUES (3, CAST('08:00:00' AS TIME ), TRUE);
INSERT INTO entree_eleve (idE, h_entree, A_envoyer) VALUES (4, CAST('09:03:49' AS TIME ), TRUE);
INSERT INTO entree_eleve (idE, h_entree, A_envoyer) VALUES (5, CAST('15:00:00' AS TIME ), TRUE);

-- TESTS REQUEST



SELECT e.nom, e.prenom, e.id, e.photo
FROM eleves AS e, horaire_cours AS hc, classe AS c, entree_eleve AS ee
WHERE hc.jour = 'mardi'
AND ee.h_entree > hc.h_debut
AND e.id_classe = hc.id_classe
AND e.id = ee.idE
ORDER BY e.id


-- RESET CHANGES WITH TRUNCATE


TRUNCATE "cartes";
TRUNCATE "entree_eleve";
TRUNCATE "horaire_cours";
TRUNCATE "eleves";
TRUNCATE "classe";