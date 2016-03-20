-- phpMyAdmin SQL Dump
-- version 4.1.14
-- http://www.phpmyadmin.net
--
-- Client :  127.0.0.1
-- Généré le :  Dim 20 Mars 2016 à 16:11
-- Version du serveur :  5.6.17
-- Version de PHP :  5.5.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Base de données :  `jpabdd`
--

-- --------------------------------------------------------

--
-- Structure de la table `centreinteret`
--

CREATE TABLE IF NOT EXISTS `centreinteret` (
  `id_cinteret` int(11) NOT NULL AUTO_INCREMENT,
  `commentaire` longtext,
  `status` tinyint(1) DEFAULT NULL,
  `nom_ci` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id_cinteret`)
) ENGINE=InnoDB  DEFAULT CHARSET=utf8 AUTO_INCREMENT=2 ;

--
-- Contenu de la table `centreinteret`
--

INSERT INTO `centreinteret` (`id_cinteret`, `commentaire`, `status`, `nom_ci`) VALUES
(1, 'test', NULL, 'Sport');

-- --------------------------------------------------------

--
-- Structure de la table `competence`
--

CREATE TABLE IF NOT EXISTS `competence` (
  `id_comp` int(11) NOT NULL AUTO_INCREMENT,
  `commentaire` longtext,
  `domaine` varchar(255) DEFAULT NULL,
  `module` varchar(255) DEFAULT NULL,
  `status` tinyint(1) DEFAULT NULL,
  PRIMARY KEY (`id_comp`)
) ENGINE=InnoDB  DEFAULT CHARSET=utf8 AUTO_INCREMENT=13 ;

--
-- Contenu de la table `competence`
--

INSERT INTO `competence` (`id_comp`, `commentaire`, `domaine`, `module`, `status`) VALUES
(5, '', 'Informatique', 'Programmation', NULL),
(6, '', 'Informatique', 'Programmation', NULL),
(7, 'uuuuuuu', 'stage', 'Programmation', NULL),
(8, 'uuuuuuu', 'stage', 'Programmation', NULL),
(9, 'tttttttttttttttttt', 'Informatique', 'Programmation', NULL),
(10, 'http : tttttttttttttttttttttttt', 'Apprentissage', 'reseau', NULL),
(11, '', '', '', NULL),
(12, 'tesss', 'Informatique', 'Programmation', NULL);

-- --------------------------------------------------------

--
-- Structure de la table `experience`
--

CREATE TABLE IF NOT EXISTS `experience` (
  `id_experience` int(11) NOT NULL AUTO_INCREMENT,
  `annee` varchar(255) DEFAULT NULL,
  `commentaire` varchar(255) DEFAULT NULL,
  `nb_mois` int(11) DEFAULT NULL,
  `pays` varchar(255) DEFAULT NULL,
  `type` varchar(255) DEFAULT NULL,
  `ville` varchar(255) DEFAULT NULL,
  `status` tinyint(1) DEFAULT NULL,
  PRIMARY KEY (`id_experience`)
) ENGINE=InnoDB  DEFAULT CHARSET=utf8 AUTO_INCREMENT=231 ;

--
-- Contenu de la table `experience`
--

INSERT INTO `experience` (`id_experience`, `annee`, `commentaire`, `nb_mois`, `pays`, `type`, `ville`, `status`) VALUES
(198, NULL, NULL, 0, NULL, NULL, NULL, NULL),
(199, NULL, NULL, 0, NULL, NULL, NULL, NULL),
(200, NULL, NULL, 0, NULL, NULL, NULL, NULL),
(201, NULL, NULL, 0, NULL, NULL, NULL, NULL),
(202, NULL, NULL, 0, NULL, NULL, NULL, NULL),
(203, NULL, NULL, 0, NULL, NULL, NULL, NULL),
(204, NULL, NULL, 0, NULL, NULL, NULL, NULL),
(205, NULL, NULL, 0, NULL, NULL, NULL, NULL),
(206, NULL, NULL, 0, NULL, NULL, NULL, NULL),
(207, NULL, NULL, 0, NULL, NULL, NULL, NULL),
(208, NULL, NULL, 0, NULL, NULL, NULL, NULL),
(209, NULL, NULL, 0, NULL, NULL, NULL, NULL),
(210, NULL, NULL, 0, NULL, NULL, NULL, NULL),
(211, NULL, NULL, 0, NULL, NULL, NULL, NULL),
(212, NULL, NULL, 0, NULL, NULL, NULL, NULL),
(213, NULL, NULL, 0, NULL, NULL, NULL, NULL),
(214, NULL, NULL, 0, NULL, NULL, NULL, NULL),
(215, NULL, NULL, 0, NULL, NULL, NULL, NULL),
(216, NULL, NULL, 0, NULL, NULL, NULL, NULL),
(217, NULL, NULL, 0, NULL, NULL, NULL, NULL),
(218, NULL, NULL, 0, NULL, NULL, NULL, NULL),
(219, NULL, NULL, 0, NULL, NULL, NULL, NULL),
(220, NULL, NULL, 0, NULL, NULL, NULL, NULL),
(221, NULL, NULL, 0, NULL, NULL, NULL, NULL),
(225, '2015-2016', 'fffffffffff', 10, 'France', 'Apprentissage', 'Paris', NULL),
(226, '2015-2016', 'test', 5, 'France', 'stage', 'Paris', NULL),
(227, '2015-2016', 'test', 5, 'France', 'stage', 'Paris', NULL),
(228, '1233', '', 0, '', 'test status', '', NULL),
(229, '1233', '', 0, '', 'test status okkkkkkk', '', 1),
(230, '1233', '', 0, '', 'test ', '', 0);

-- --------------------------------------------------------

--
-- Structure de la table `formation`
--

CREATE TABLE IF NOT EXISTS `formation` (
  `id_formation` int(11) NOT NULL AUTO_INCREMENT,
  `anneeFormation` varchar(30) DEFAULT NULL,
  `commentaireFormation` longtext,
  `lieuFormation` varchar(255) DEFAULT NULL,
  `nomFormation` varchar(255) DEFAULT NULL,
  `status` tinyint(1) DEFAULT NULL,
  PRIMARY KEY (`id_formation`)
) ENGINE=InnoDB  DEFAULT CHARSET=utf8 AUTO_INCREMENT=390 ;

--
-- Contenu de la table `formation`
--

INSERT INTO `formation` (`id_formation`, `anneeFormation`, `commentaireFormation`, `lieuFormation`, `nomFormation`, `status`) VALUES
(368, '2014-2015', 'tttt', 'UPEM', 'Licence', NULL),
(369, '2014-2015', 'tttt', 'UPEM', 'm33333333', NULL),
(370, '2014-2015', 'tttt', 'UPEM_', 'yyyyy', NULL),
(371, '2015-2016', 'en cours', 'Université Paris-Est-Marne-La-Vallée', 'Master 2 Logiciel et Big Data', NULL),
(372, '2015', 'tttttttttt', 'Université Paris-Est-Marne-La-Vallée', 'Master 2 Logiciel et Big Data', NULL),
(373, '2015-2016', 'eeeeeee', 'Université Paris-Est-Marne-La-Vallée', 'Master 2 Logiciel et Big Data', NULL),
(374, '2015-2016', 'eeeeeeeyyyy', 'Université Paris-Est-Marne-La-Vallée', 'Master 2 Logiciel et Big Data', NULL),
(380, '', 'okkkkkkkkkkkkkk', 'Université Paris-Est-Marne-La-Vallée', 'Master 2', NULL),
(381, '', 'nnnnnnnnnnnnnnnnnnnnnn', 'Université Paris-Est-Marne-La-Vallée', 'Master 2', NULL),
(382, '', '', 'Université Paris-Est-Marne-La-Vallée', 'Master 2 Logiciel et Big Data', NULL),
(383, '2015-2016', '', 'Paris', 'Master 2 Logiciel et Big Data', NULL),
(384, '2014-2015', '', 'UPEM', 'Master 1 Logiciel et Big Data', NULL),
(385, '1233', 'test', NULL, 'test', NULL),
(386, '1233', 'test', NULL, 'test', NULL),
(387, '1233', 'test888888888', NULL, 'test4444444', NULL),
(389, '1233', 'test888888888', NULL, 'Test status', 1);

-- --------------------------------------------------------

--
-- Structure de la table `linguistique`
--

CREATE TABLE IF NOT EXISTS `linguistique` (
  `idLing` int(11) NOT NULL AUTO_INCREMENT,
  `niveau` varchar(255) DEFAULT NULL,
  `nomLing` varchar(255) DEFAULT NULL,
  `status` tinyint(1) DEFAULT NULL,
  PRIMARY KEY (`idLing`)
) ENGINE=InnoDB  DEFAULT CHARSET=utf8 AUTO_INCREMENT=5 ;

--
-- Contenu de la table `linguistique`
--

INSERT INTO `linguistique` (`idLing`, `niveau`, `nomLing`, `status`) VALUES
(1, 'test', 'Anglais', NULL),
(2, 'cool', 'test', 1),
(3, 'cool', 'test', 1),
(4, 'cool', 'test', 1);

-- --------------------------------------------------------

--
-- Structure de la table `user`
--

CREATE TABLE IF NOT EXISTS `user` (
  `id_user` int(11) NOT NULL AUTO_INCREMENT,
  `adresse` varchar(255) DEFAULT NULL,
  `date_naissassance` date DEFAULT NULL,
  `email` varchar(255) DEFAULT NULL,
  `nom` varchar(255) DEFAULT NULL,
  `pass` varchar(255) DEFAULT NULL,
  `prenom` varchar(255) DEFAULT NULL,
  `telephone` varchar(10) DEFAULT NULL,
  `titreCV` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`id_user`)
) ENGINE=InnoDB  DEFAULT CHARSET=utf8 AUTO_INCREMENT=22 ;

--
-- Contenu de la table `user`
--

INSERT INTO `user` (`id_user`, `adresse`, `date_naissassance`, `email`, `nom`, `pass`, `prenom`, `telephone`, `titreCV`) VALUES
(11, '13 rue lounes matoub 93380 pierrefitte', NULL, 'admin@toto', 'COULIBALY', '123', 'Moussa', '0695189320', 'STAGE MASTER 2 LOGICIEL ET BIG DATA'),
(20, '15 rue', NULL, 'admin@user', 'COULIBALY', '123', 'mOUSSA', '458976', 'master 2 info'),
(21, '', NULL, 'titi@coul', 'COULIBALY', '123', 'mOUSSA', '458976', 'master 2 info');

-- --------------------------------------------------------

--
-- Structure de la table `usercompetence`
--

CREATE TABLE IF NOT EXISTS `usercompetence` (
  `id_comp` int(11) NOT NULL,
  `id_user` int(11) NOT NULL,
  PRIMARY KEY (`id_comp`,`id_user`),
  KEY `FK_usercompetence_id_user` (`id_user`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Contenu de la table `usercompetence`
--

INSERT INTO `usercompetence` (`id_comp`, `id_user`) VALUES
(11, 11),
(12, 11);

-- --------------------------------------------------------

--
-- Structure de la table `userexperience`
--

CREATE TABLE IF NOT EXISTS `userexperience` (
  `id_experience` int(11) NOT NULL,
  `id_user` int(11) NOT NULL,
  PRIMARY KEY (`id_experience`,`id_user`),
  KEY `FK_userexperience_id_user` (`id_user`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Contenu de la table `userexperience`
--

INSERT INTO `userexperience` (`id_experience`, `id_user`) VALUES
(226, 11),
(227, 11),
(228, 11),
(229, 11),
(230, 11),
(225, 20);

-- --------------------------------------------------------

--
-- Structure de la table `userformation`
--

CREATE TABLE IF NOT EXISTS `userformation` (
  `id_formation` int(11) NOT NULL,
  `id_user` int(11) NOT NULL,
  PRIMARY KEY (`id_formation`,`id_user`),
  KEY `FK_userformation_id_user` (`id_user`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Contenu de la table `userformation`
--

INSERT INTO `userformation` (`id_formation`, `id_user`) VALUES
(382, 11),
(383, 11),
(384, 11),
(385, 11),
(389, 11),
(374, 20),
(380, 20),
(381, 20),
(386, 21),
(387, 21);

-- --------------------------------------------------------

--
-- Structure de la table `userinteret`
--

CREATE TABLE IF NOT EXISTS `userinteret` (
  `id_cinteret` int(11) NOT NULL,
  `id_user` int(11) NOT NULL,
  PRIMARY KEY (`id_cinteret`,`id_user`),
  KEY `FK_userinteret_id_user` (`id_user`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Contenu de la table `userinteret`
--

INSERT INTO `userinteret` (`id_cinteret`, `id_user`) VALUES
(1, 11);

-- --------------------------------------------------------

--
-- Structure de la table `userlinguistique`
--

CREATE TABLE IF NOT EXISTS `userlinguistique` (
  `idLing` int(11) NOT NULL,
  `id_user` int(11) NOT NULL,
  PRIMARY KEY (`idLing`,`id_user`),
  KEY `FK_userlinguistique_id_user` (`id_user`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Contenu de la table `userlinguistique`
--

INSERT INTO `userlinguistique` (`idLing`, `id_user`) VALUES
(1, 11),
(2, 11),
(3, 11),
(4, 11);

--
-- Contraintes pour les tables exportées
--

--
-- Contraintes pour la table `usercompetence`
--
ALTER TABLE `usercompetence`
  ADD CONSTRAINT `FK_usercompetence_id_comp` FOREIGN KEY (`id_comp`) REFERENCES `competence` (`id_comp`),
  ADD CONSTRAINT `FK_usercompetence_id_user` FOREIGN KEY (`id_user`) REFERENCES `user` (`id_user`);

--
-- Contraintes pour la table `userexperience`
--
ALTER TABLE `userexperience`
  ADD CONSTRAINT `FK_userexperience_id_experience` FOREIGN KEY (`id_experience`) REFERENCES `experience` (`id_experience`),
  ADD CONSTRAINT `FK_userexperience_id_user` FOREIGN KEY (`id_user`) REFERENCES `user` (`id_user`);

--
-- Contraintes pour la table `userformation`
--
ALTER TABLE `userformation`
  ADD CONSTRAINT `FK_userformation_id_formation` FOREIGN KEY (`id_formation`) REFERENCES `formation` (`id_formation`),
  ADD CONSTRAINT `FK_userformation_id_user` FOREIGN KEY (`id_user`) REFERENCES `user` (`id_user`);

--
-- Contraintes pour la table `userinteret`
--
ALTER TABLE `userinteret`
  ADD CONSTRAINT `FK_userinteret_id_cinteret` FOREIGN KEY (`id_cinteret`) REFERENCES `centreinteret` (`id_cinteret`),
  ADD CONSTRAINT `FK_userinteret_id_user` FOREIGN KEY (`id_user`) REFERENCES `user` (`id_user`);

--
-- Contraintes pour la table `userlinguistique`
--
ALTER TABLE `userlinguistique`
  ADD CONSTRAINT `FK_userlinguistique_idLing` FOREIGN KEY (`idLing`) REFERENCES `linguistique` (`idLing`),
  ADD CONSTRAINT `FK_userlinguistique_id_user` FOREIGN KEY (`id_user`) REFERENCES `user` (`id_user`);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
