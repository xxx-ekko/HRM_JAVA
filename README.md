# HRM_JAVA
exam project


A AJOUTER DANS LA BD :

INSERT INTO employe (nom, prenom, email, telephone, adresse, date_naissance, date_embauche, salaire)
VALUES 
('Diop', 'Alassane', 'alassane.diop@example.com', '77-123-45-67', 'Dakar, Sénégal', '1990-01-01', '2022-01-01', ROUND(RAND()*(200000-100000)+100000, 2)),
('Ndiaye', 'Fatou', 'fatou.ndiaye@example.com', '77-234-56-78', 'Thiès, Sénégal', '1995-05-05', '2021-05-01', ROUND(RAND()*(300000-150000)+150000, 2)),
('Sarr', 'Mamadou', 'mamadou.sarr@example.com', '77-345-67-89', 'Saint-Louis, Sénégal', '1998-12-31', '2020-01-01', ROUND(RAND()*(400000-250000)+250000, 2)),
('Diallo', 'Aminata', 'aminata.diallo@example.com', '77-456-78-90', 'Ziguinchor, Sénégal', '1992-06-10', '2019-01-01', ROUND(RAND()*(300000-150000)+150000, 2)),
('Faye', 'Moussa', 'moussa.faye@example.com', '77-567-89-01', 'Kaolack, Sénégal', '1994-02-14', '2020-06-01', ROUND(RAND()*(400000-250000)+250000, 2)),
('Ba', 'Amin', 'amin.ba@example.com', '77-678-90-12', 'Diourbel, Sénégal', '1993-11-20', '2018-01-01', ROUND(RAND()*(300000-150000)+150000, 2)),
('Gueye', 'Mariama', 'mariama.gueye@example.com', '77-789-01-23', 'Tambacounda, Sénégal', '1996-09-15', '2022-03-01', ROUND(RAND()*(200000-100000)+100000, 2));

INSERT INTO poste (nom, salaire_min, salaire_max) 
VALUES 
("Agent administratif", 80000.0, 120000.0), 
("Caissier", 60000.0, 90000.0),
("Comptable", 100000.0, 150000.0), 
("Secrétaire", 70000.0, 100000.0),
("Informaticien", 150000.0, 250000.0);


INSERT INTO departement (nom) VALUES 
('Ressources Humaines'),
('Informatique'),
('Marketing'),
('Vente'),
('Comptabilité');
