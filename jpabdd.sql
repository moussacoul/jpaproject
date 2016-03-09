-- phpMyAdmin SQL Dump
-- version 4.1.14
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: Mar 09, 2016 at 06:14 PM
-- Server version: 5.6.17
-- PHP Version: 5.5.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Database: `jpabdd`
--

-- --------------------------------------------------------

--
-- Table structure for table `centreinteret`
--

CREATE TABLE IF NOT EXISTS `centreinteret` (
  `id_cinteret` int(11) NOT NULL AUTO_INCREMENT,
  `commentaire` longtext,
  `nom_ci` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id_cinteret`)
) ENGINE=InnoDB  DEFAULT CHARSET=utf8 AUTO_INCREMENT=3 ;

--
-- Dumping data for table `centreinteret`
--

INSERT INTO `centreinteret` (`id_cinteret`, `commentaire`, `nom_ci`) VALUES
(1, 'Rugby', 'Sport'),
(2, '', 'Sport');

-- --------------------------------------------------------

--
-- Table structure for table `competence`
--

CREATE TABLE IF NOT EXISTS `competence` (
  `id_comp` int(11) NOT NULL AUTO_INCREMENT,
  `commentaire` longtext,
  `domaine` varchar(255) DEFAULT NULL,
  `module` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id_comp`)
) ENGINE=InnoDB  DEFAULT CHARSET=utf8 AUTO_INCREMENT=3 ;

--
-- Dumping data for table `competence`
--

INSERT INTO `competence` (`id_comp`, `commentaire`, `domaine`, `module`) VALUES
(1, 'Java : bon niveau', 'Informatique', 'Programmation'),
(2, 'Java jee : tres  bon niveau', 'Informatique', 'Programmation');

-- --------------------------------------------------------

--
-- Table structure for table `experience`
--

CREATE TABLE IF NOT EXISTS `experience` (
  `id_experience` int(11) NOT NULL AUTO_INCREMENT,
  `annee` varchar(255) DEFAULT NULL,
  `commentaire` varchar(255) DEFAULT NULL,
  `nb_mois` int(11) DEFAULT NULL,
  `pays` varchar(255) DEFAULT NULL,
  `type` varchar(255) DEFAULT NULL,
  `ville` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id_experience`)
) ENGINE=InnoDB  DEFAULT CHARSET=utf8 AUTO_INCREMENT=3 ;

--
-- Dumping data for table `experience`
--

INSERT INTO `experience` (`id_experience`, `annee`, `commentaire`, `nb_mois`, `pays`, `type`, `ville`) VALUES
(1, '2015', 'dev c++', 6, 'France', 'stage', 'Paris'),
(2, '2015-2016', 'jbijmk', 6, 'France', 'stage', 'Paris');

-- --------------------------------------------------------

--
-- Table structure for table `formation`
--

CREATE TABLE IF NOT EXISTS `formation` (
  `id_formation` int(11) NOT NULL AUTO_INCREMENT,
  `anneeFormation` varchar(30) DEFAULT NULL,
  `commentaireFormation` longtext,
  `lieuFormation` varchar(255) DEFAULT NULL,
  `nomFormation` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id_formation`)
) ENGINE=InnoDB  DEFAULT CHARSET=utf8 AUTO_INCREMENT=16 ;

--
-- Dumping data for table `formation`
--

INSERT INTO `formation` (`id_formation`, `anneeFormation`, `commentaireFormation`, `lieuFormation`, `nomFormation`) VALUES
(1, '2015-2016', 'Logiciel', 'UPEM', 'Master 2'),
(2, '2015', 'pppp', 'Paris', 'Licence'),
(3, '2015', 'hhhhh', 'Paris', 'COULIBALY'),
(4, '2015', 'ooo', 'Paris', 'COULIBALY'),
(5, '2015-2016', 's ;,ck,x', 'UPEM', 'Master 2'),
(6, 'titi', 'tititit', 'Lyon', 'cool'),
(7, '2015-2016', '', 'Université Paris-Est-Marne-La-Vallée', 'Master 2'),
(8, '2015-2016', '', 'Université Paris-Est-Marne-La-Vallée', 'Master 2'),
(9, '2015-2016', '', 'Université Paris-Est-Marne-La-Vallée', 'Master 2 Logiciel et Big Data'),
(10, '2015-2016', 'En cour ', 'Université Paris-Est-Marne-La-Vallée', 'Master 2 Logiciel et Big Data'),
(11, '2015-2016', 'En cours', 'Université Paris-Est-Marne-La-Vallée', 'Master 2 Logiciel et Big Data'),
(12, '2015-2016', 'En cours', 'Université Paris-Est-Marne-La-Vallée', 'Master 2 Logiciel et Big Data'),
(14, '2013-2014', 'Valide', 'Université Paris-Est-Marne-La-Vallée', 'Licence'),
(15, '2014-2015', 'Valide', 'Université Paris-Est-Marne-La-Vallée', 'Master 1 Logiciel et Big Data');

-- --------------------------------------------------------

--
-- Table structure for table `linguistique`
--

CREATE TABLE IF NOT EXISTS `linguistique` (
  `idLing` int(11) NOT NULL AUTO_INCREMENT,
  `niveau` varchar(255) DEFAULT NULL,
  `nomLing` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`idLing`)
) ENGINE=InnoDB  DEFAULT CHARSET=utf8 AUTO_INCREMENT=3 ;

--
-- Dumping data for table `linguistique`
--

INSERT INTO `linguistique` (`idLing`, `niveau`, `nomLing`) VALUES
(1, 'scolaire', 'Anglais'),
(2, 'scolaire', 'Anglais');

-- --------------------------------------------------------

--
-- Table structure for table `user`
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
  `titreCV` varchar(100) NOT NULL,
  PRIMARY KEY (`id_user`)
) ENGINE=InnoDB  DEFAULT CHARSET=utf8 AUTO_INCREMENT=18 ;

--
-- Dumping data for table `user`
--

INSERT INTO `user` (`id_user`, `adresse`, `date_naissassance`, `email`, `nom`, `pass`, `prenom`, `telephone`, `titreCV`) VALUES
(9, NULL, NULL, 'moussacoul@yaho', NULL, 'toto', NULL, NULL, ''),
(10, NULL, NULL, 'mourougan@yahoo.fr', NULL, '789', NULL, NULL, ''),
(11, '13 rue lounes matoub 93380 pierrefitte', NULL, 'admin@toto', 'COULIBALY', '123', 'Moussa', '0695189320', 'STAGE MASTER 2 LOGICIEL ET BIG DATA'),
(14, NULL, NULL, 'moussacoul90@yahoo.fr', NULL, 'mc', NULL, NULL, ''),
(15, 'creteil', NULL, 'admin@titi', 'titi', '123', 'coulio', 'titi', ''),
(16, NULL, NULL, 'admin@tototttttt', NULL, '123', NULL, NULL, ''),
(17, '$$$', NULL, '%*&*@yahoo', '$', 'aaa', '$$$', '$$$', '');

-- --------------------------------------------------------

--
-- Table structure for table `usercompetence`
--

CREATE TABLE IF NOT EXISTS `usercompetence` (
  `id_comp` int(11) NOT NULL,
  `id_user` int(11) NOT NULL,
  PRIMARY KEY (`id_comp`,`id_user`),
  KEY `FK_usercompetence_id_user` (`id_user`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Table structure for table `userexperience`
--

CREATE TABLE IF NOT EXISTS `userexperience` (
  `id_experience` int(11) NOT NULL,
  `id_user` int(11) NOT NULL,
  PRIMARY KEY (`id_experience`,`id_user`),
  KEY `FK_userexperience_id_user` (`id_user`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Table structure for table `userformation`
--

CREATE TABLE IF NOT EXISTS `userformation` (
  `id_formation` int(11) NOT NULL,
  `id_user` int(11) NOT NULL,
  PRIMARY KEY (`id_formation`,`id_user`),
  KEY `FK_userformation_id_user` (`id_user`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `userformation`
--

INSERT INTO `userformation` (`id_formation`, `id_user`) VALUES
(9, 11),
(12, 11),
(15, 11);

-- --------------------------------------------------------

--
-- Table structure for table `userinteret`
--

CREATE TABLE IF NOT EXISTS `userinteret` (
  `id_cinteret` int(11) NOT NULL,
  `id_user` int(11) NOT NULL,
  PRIMARY KEY (`id_cinteret`,`id_user`),
  KEY `FK_userinteret_id_user` (`id_user`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Table structure for table `userlinguistique`
--

CREATE TABLE IF NOT EXISTS `userlinguistique` (
  `idLing` int(11) NOT NULL,
  `id_user` int(11) NOT NULL,
  PRIMARY KEY (`idLing`,`id_user`),
  KEY `FK_userlinguistique_id_user` (`id_user`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `usercompetence`
--
ALTER TABLE `usercompetence`
  ADD CONSTRAINT `FK_usercompetence_id_comp` FOREIGN KEY (`id_comp`) REFERENCES `competence` (`id_comp`),
  ADD CONSTRAINT `FK_usercompetence_id_user` FOREIGN KEY (`id_user`) REFERENCES `user` (`id_user`);

--
-- Constraints for table `userexperience`
--
ALTER TABLE `userexperience`
  ADD CONSTRAINT `FK_userexperience_id_experience` FOREIGN KEY (`id_experience`) REFERENCES `experience` (`id_experience`),
  ADD CONSTRAINT `FK_userexperience_id_user` FOREIGN KEY (`id_user`) REFERENCES `user` (`id_user`);

--
-- Constraints for table `userformation`
--
ALTER TABLE `userformation`
  ADD CONSTRAINT `FK_userformation_id_formation` FOREIGN KEY (`id_formation`) REFERENCES `formation` (`id_formation`),
  ADD CONSTRAINT `FK_userformation_id_user` FOREIGN KEY (`id_user`) REFERENCES `user` (`id_user`);

--
-- Constraints for table `userinteret`
--
ALTER TABLE `userinteret`
  ADD CONSTRAINT `FK_userinteret_id_cinteret` FOREIGN KEY (`id_cinteret`) REFERENCES `centreinteret` (`id_cinteret`),
  ADD CONSTRAINT `FK_userinteret_id_user` FOREIGN KEY (`id_user`) REFERENCES `user` (`id_user`);

--
-- Constraints for table `userlinguistique`
--
ALTER TABLE `userlinguistique`
  ADD CONSTRAINT `FK_userlinguistique_idLing` FOREIGN KEY (`idLing`) REFERENCES `linguistique` (`idLing`),
  ADD CONSTRAINT `FK_userlinguistique_id_user` FOREIGN KEY (`id_user`) REFERENCES `user` (`id_user`);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
