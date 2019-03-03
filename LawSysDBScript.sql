-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='TRADITIONAL,ALLOW_INVALID_DATES';

-- -----------------------------------------------------
-- Schema mydb
-- -----------------------------------------------------
SHOW WARNINGS;
-- -----------------------------------------------------
-- Schema law_system
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema law_system
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `law_system` DEFAULT CHARACTER SET utf8 ;
SHOW WARNINGS;
USE `law_system` ;

-- -----------------------------------------------------
-- Table `law_system`.`court_master`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `law_system`.`court_master` ;

SHOW WARNINGS;
CREATE TABLE IF NOT EXISTS `law_system`.`court_master` (
  `id` INT(11) NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(45) NULL DEFAULT NULL,
  `type` VARCHAR(45) NULL DEFAULT NULL,
  `address` VARCHAR(45) NULL DEFAULT NULL,
  PRIMARY KEY (`id`))
ENGINE = InnoDB
AUTO_INCREMENT = 3
DEFAULT CHARACTER SET = utf8;

SHOW WARNINGS;

-- -----------------------------------------------------
-- Table `law_system`.`criminal_master`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `law_system`.`criminal_master` ;

SHOW WARNINGS;
CREATE TABLE IF NOT EXISTS `law_system`.`criminal_master` (
  `id` INT(11) NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(45) NULL DEFAULT NULL,
  `address` VARCHAR(45) NULL DEFAULT NULL,
  PRIMARY KEY (`id`))
ENGINE = InnoDB
AUTO_INCREMENT = 2
DEFAULT CHARACTER SET = utf8;

SHOW WARNINGS;

-- -----------------------------------------------------
-- Table `law_system`.`law_master`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `law_system`.`law_master` ;

SHOW WARNINGS;
CREATE TABLE IF NOT EXISTS `law_system`.`law_master` (
  `id` INT(11) NOT NULL AUTO_INCREMENT,
  `section` VARCHAR(5000) NULL DEFAULT NULL,
  `rule` VARCHAR(5000) NULL DEFAULT NULL,
  PRIMARY KEY (`id`))
ENGINE = InnoDB
AUTO_INCREMENT = 6
DEFAULT CHARACTER SET = utf8;

SHOW WARNINGS;

-- -----------------------------------------------------
-- Table `law_system`.`lawyer_master`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `law_system`.`lawyer_master` ;

SHOW WARNINGS;
CREATE TABLE IF NOT EXISTS `law_system`.`lawyer_master` (
  `id` INT(11) NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(45) NULL DEFAULT NULL,
  `age` INT(11) NULL DEFAULT NULL,
  `qualification` VARCHAR(45) NULL DEFAULT NULL,
  `expertise` VARCHAR(45) NULL DEFAULT NULL,
  `court_id` INT(11) NULL DEFAULT NULL,
  PRIMARY KEY (`id`),
  INDEX `id_idx` (`court_id` ASC),
  CONSTRAINT `Lawyer_Court_FK`
    FOREIGN KEY (`court_id`)
    REFERENCES `law_system`.`court_master` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB
AUTO_INCREMENT = 8
DEFAULT CHARACTER SET = utf8;

SHOW WARNINGS;

-- -----------------------------------------------------
-- Table `law_system`.`user_master`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `law_system`.`user_master` ;

SHOW WARNINGS;
CREATE TABLE IF NOT EXISTS `law_system`.`user_master` (
  `id` INT(11) NOT NULL AUTO_INCREMENT,
  `firstname` VARCHAR(45) NULL DEFAULT NULL,
  `lastname` VARCHAR(45) NULL DEFAULT NULL,
  `gender` VARCHAR(45) NULL DEFAULT NULL,
  `email` VARCHAR(45) NULL DEFAULT NULL,
  `contactno` BIGINT(15) NULL DEFAULT NULL,
  `city` VARCHAR(45) NULL DEFAULT NULL,
  `address` VARCHAR(100) NULL DEFAULT NULL,
  `username` VARCHAR(45) NULL DEFAULT NULL,
  `password` VARCHAR(45) NULL DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE INDEX `username_UNIQUE` (`username` ASC))
ENGINE = InnoDB
AUTO_INCREMENT = 4
DEFAULT CHARACTER SET = utf8;

SHOW WARNINGS;

INSERT INTO `law_system`.`user_master`
(`id`,
`firstname`,
`lastname`,
`gender`,
`email`,
`contactno`,
`city`,
`address`,
`username`,
`password`)
VALUES
(1,
"admin",
"admin",
"male",
"admin@gmail.com",
7653787465,
"Ahmedabad",
"Naroda, Ahmedabad",
"admin",
"admin");


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
