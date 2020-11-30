-- MySQL dump 10.13  Distrib 8.0.22, for Win64 (x86_64)
--
-- Host: localhost    Database: sales_stock
-- ------------------------------------------------------
-- Server version	8.0.22

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `car`
--

DROP TABLE IF EXISTS `car`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `car` (
  `Id` int NOT NULL AUTO_INCREMENT,
  `ListingNumber` int DEFAULT NULL,
  `Reg` text,
  `Make` text,
  `Model` text,
  `Colour` text,
  `Year` text,
  `Engine` double DEFAULT NULL,
  `Body` text,
  `Fuel` text,
  `OdometerKPH` int DEFAULT NULL,
  `Transmission` text,
  PRIMARY KEY (`Id`)
) ENGINE=InnoDB AUTO_INCREMENT=36 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `car`
--

LOCK TABLES `car` WRITE;
/*!40000 ALTER TABLE `car` DISABLE KEYS */;
INSERT INTO `car` VALUES (1,4294194,'202-CE-853','Opel','Elite 2.0D 170 Auto','Black','2020 (201)',2,'Hatchback','Diesel',25462,'Automatic'),(2,4294195,'119-L-7896','Hyundai ','i30 i30N 2.0 T-GDi','Grey','2019 (191)',2,'Hatchback','Petrol',19855,'Manual'),(3,4294196,'161-T-365','Toyota','Rav4 Luna 2.0D-4D','Slate','2016 (161)',2,'SUV','Diesel',85411,'Manual'),(4,4294197,'181-L-368','Hyundai ','i30 Deluxe 1.6TD','Sky Blue','2018 (181)',1.6,'Hatchback','Diesel',875471,'Automatic'),(5,4294198,'141-G-642','Volvo','S60 D2 SE 1.6TD','Dark Grey','2014 (141)',1.6,'Saloon','Diesel',124004,'Manual'),(6,4294199,'131-L-974','Peugeot','1.6 HDI ACTIVE 113BHP','Charcoal','2013 (131)',1.6,'MPV','Diesel',240000,'Manual'),(7,4294200,'191-D-87452','Volkswagen ','Up!','White','2019 (191)',1,'Hatchback','Petrol',8900,'Manual'),(8,4294201,'15-L-15','Ford','Focus TITANIUM 1.6TDCI 115PS','Silver','2015 (151)',1.6,'Saloon','Diesel',119875,'Manual'),(9,4294202,'171-L-2753','Nissan ','NOTE 1.5 SV','Cherry','2017 (171)',1.5,'MPV','Diesel',39452,'Manual'),(10,4294204,'152-LK-754','Dacia ','Duster ALTERNATIVE 1.5 DCI110','Black','2015 (152)',1.1,'Hatchback','Petrol',180000,'Manual'),(11,4294205,'171-L-774','Audo','A4 3.0 TDI 218 S Tronic SE','Silver','2017 (171)',1.5,'SUV','Diesel',108009,'Manual'),(12,4294206,'171-D-63547','BMW','X3 AUTOMATIC SPORT','Black','2017 (171)',3,'Saloon','Diesel',79254,'Automatic'),(13,4294207,'181-L-554','Ford','EcoSport TITANIUM 1.0T 140PS 6','Brown','2018 (181)',2,'SUV','Diesel',97854,'Automatic'),(14,4294208,'182-KK-1024','Mercedes-Benz','CLA-Class CLA 180 AMG SPORT 4DR AUTO','Black','2018 (182)',1,'SUV','Petrol',57895,'Manual'),(15,4294209,'181-OY-114','Mercedes-Benz','-Class CLA 180 D URBAN 4DR','Grey','2018 (181)',1.6,'Saloon','Petrol',37512,'Automatic'),(16,4294210,'182-L-4781','Jaguar','E-PACE 2.0 D150PS AWD S AUTO','Black','2018 (182)',1.5,'Saloon','Diesel',85497,'Manual'),(17,4294211,'202-D-24730','Jaguar','F-PACE Chequered Flag 2.0 Auto RWD 180PS','Metallic Eiger Grey','2020 (202)',2,'Saloon','Diesel',107566,'Automatic'),(18,4294212,'162-LS-115','Mazda','CX-5 2WD 2.2D (150PS) EXEC SE','Grey','2016 (162)',2,'Saloon','Diesel',5,'Automatic'),(19,4294213,'172-D-96347','Land Rover','Discovery 2.0 SD4 SE 240PS','Black','2017 (172)',2.2,'SUV','Diesel',63574,'Manual'),(20,4294214,'171-D-78412','Renault ','Captur','Red','2017 (171)',2,'SUV','Diesel',105102,'Automatic'),(21,4294215,'161-D-105785','Audi','A4 1.4 TFSI SPORT 150PS 4DR','Black','2016 (161)',1.5,'SUV','Diesel',19005,'Manual'),(22,4294216,'152-L-1425','Hyundai ','i20 ','Bronze','2015 (152)',1.4,'Saloon','Petrol',88954,'Manual'),(23,4294217,'172-L-3470','Ford','Fiesta TITANIUM 1.25 60PS M5 5','Blue','2017 (172)',1.2,'SUV','Petrol',754010,'Manual'),(24,4294218,'171-KK-445','Mazda','Mazda 6','Brown','2017 (171)',1.2,'Hatchback','Petrol',654020,'Manual'),(25,4294219,'202-D-3614','Mercedes-Benz','A-Class A160 AMG 1.3','Black','2020 (202)',2.2,'Saloon','Diesel',67520,'Manual'),(26,4294220,'181-KK-364','Skoda','Citigo AMBITION','Red','2018 (181)',1.3,'Hatchback','Petrol',3,'Manual'),(27,4294221,'171-L-158','SEAT','Ateca','Blue','2017 (171)',1,'Hatchback','Petrol',11957,'Manual'),(28,4294222,'191-L-9710','Toyota','Camry','Pearl Red','2019 (191)',1,'SUV','Petrol',50475,'Manual'),(29,4294223,'151-L-625','Toyota','Avensis','Grey','2015 (151)',1.6,'Saloon','Hybrid',24874,'Automatic'),(30,4294224,'172-WW-674','Toyota','C-HR SOL','White','2017 (172)',1.6,'Saloon','Diesel',74257,'Manual'),(31,4294225,'202-D-47520','Ford','Puma ST-LINE 5D 1.0T 125 MHEV','White','2020 (202)',1.8,'Hatchback','Hybrid',79457,'Automatic'),(32,4294228,'191-L-686','Kia','Soul','Brown','2019 (191)',1.6,'Coupe','Hybrid',24,'Automatic'),(33,4294229,'191-L-980','Renault','KADJAR','Red','2019 (191)',3,'Saloon','Petrol',287541,'Automatic'),(34,4294230,'162-L-1020','SEAT','Alhambra','Red','2016 (162)',4.2,'Convertible','Diesel',75457,'Automatic'),(35,4294231,'141-L-6651','Nissan ','Leaf','White','2014 (141)',1.3,'Hatchback','Electric',7899,'Automatic');
/*!40000 ALTER TABLE `car` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `carprice`
--

DROP TABLE IF EXISTS `carprice`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `carprice` (
  `PriceId` int NOT NULL AUTO_INCREMENT,
  `BuyPrice` int DEFAULT NULL,
  `ListPrice` int DEFAULT NULL,
  PRIMARY KEY (`PriceId`)
) ENGINE=InnoDB AUTO_INCREMENT=39 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `carprice`
--

LOCK TABLES `carprice` WRITE;
/*!40000 ALTER TABLE `carprice` DISABLE KEYS */;
INSERT INTO `carprice` VALUES (1,36799,39999),(2,32200,35000),(3,18308,19900),(4,18400,20000),(5,11960,13000),(6,8280,9000),(7,11040,12000),(8,11684,12700),(9,13064,14200),(10,4600,5000),(11,9292,10100),(12,25024,27200),(13,31740,34500),(14,17434,18950),(15,29439,31999),(16,25709,27945),(17,34132,37100),(18,60168,65400),(19,17020,18500),(20,47794,51950),(21,16100,17500),(22,19500,19500),(23,10074,10950),(24,12144,13200),(25,17388,18900),(26,37030,40250),(27,8298,9020),(28,18308,19900),(29,325772,354100),(30,14260,15500),(31,20700,22500),(32,23915,25995),(33,2500,2600),(34,45908,49900),(35,23919,25999),(36,23919,25999),(37,22995,24995),(38,10115,10995);
/*!40000 ALTER TABLE `carprice` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `favouritelist`
--

DROP TABLE IF EXISTS `favouritelist`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `favouritelist` (
  `Id` int NOT NULL AUTO_INCREMENT,
  `Car` int NOT NULL,
  `User` int NOT NULL,
  PRIMARY KEY (`User`,`Car`),
  UNIQUE KEY `id_UNIQUE` (`Id`)
) ENGINE=InnoDB AUTO_INCREMENT=39 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `favouritelist`
--

LOCK TABLES `favouritelist` WRITE;
/*!40000 ALTER TABLE `favouritelist` DISABLE KEYS */;
INSERT INTO `favouritelist` VALUES (1,4294194,0),(2,4294195,0),(3,4294196,0),(4,4294197,0),(5,4294198,0),(6,4294199,0),(7,4294200,0),(8,4294201,0),(9,4294202,0),(10,4294203,0),(11,4294204,0),(12,4294205,0),(13,4294206,0),(14,4294207,0),(15,4294208,0),(16,4294209,0),(17,4294210,0),(18,4294211,0),(19,4294212,0),(20,4294213,0),(21,4294214,0),(22,4294215,0),(23,4294216,0),(24,4294217,0),(25,4294218,0),(26,4294219,0),(27,4294220,0),(28,4294221,0),(29,4294222,0),(30,4294223,0),(31,4294224,0),(32,4294225,0),(33,4294226,0),(34,4294227,0),(35,4294228,0),(36,4294229,0),(37,4294230,0),(38,4294231,0);
/*!40000 ALTER TABLE `favouritelist` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `fuel`
--

DROP TABLE IF EXISTS `fuel`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `fuel` (
  `Fuel` varchar(50) DEFAULT NULL,
  `Id` int NOT NULL AUTO_INCREMENT,
  PRIMARY KEY (`Id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `fuel`
--

LOCK TABLES `fuel` WRITE;
/*!40000 ALTER TABLE `fuel` DISABLE KEYS */;
INSERT INTO `fuel` VALUES ('Petrol',1),('Diesel',2),('Electric',3);
/*!40000 ALTER TABLE `fuel` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `lastpreviousowners`
--

DROP TABLE IF EXISTS `lastpreviousowners`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `lastpreviousowners` (
  `ListingNumber` int NOT NULL,
  `LastPreviousOwnersName` text,
  `LastPreviousOwnerAddress` text,
  `LastPreviousOwnerPhone` text,
  `FullServiceHistory` text,
  PRIMARY KEY (`ListingNumber`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `lastpreviousowners`
--

LOCK TABLES `lastpreviousowners` WRITE;
/*!40000 ALTER TABLE `lastpreviousowners` DISABLE KEYS */;
INSERT INTO `lastpreviousowners` VALUES (4294194,'Barry O\'Brien','St Barts, O\'Connell Avenue, Limerick','087 6645257','N'),(4294195,'Fergal Keegan','34 Ferndale, Ennis Road, Limerick','086 5547874','Y'),(4294196,'Dorota Kowalski ','1 Kimberley Villas, Millitary Hill, Ennis','083 6684774','Y'),(4294197,'Jaqueline Freeman','8 Ashwood, Seacrest, Shangort Road, Knocknacarra, Galway','083 4125874','N'),(4294198,'Lisa Munroe','165 Ivy Exchange, Parnell Street, Limerick','087 4578543','N'),(4294199,'Catherine Fitzgibbon','29 Riverbank Hall, Addison Park, Glasnevin, Dublin','086 6634785','N'),(4294200,'Joe Crawley','10 Bloomfield, Monaleen, Limerick','086 9987456','Y'),(4294201,'Ruth OBrien','6 Newtown Park, Annacotty, Limerick','087 1247856','N'),(4294202,'Robert Clancy','88 Lagmore Glen, Limerick','087 6235395','N'),(4294203,'Phillip Rose','26 Lawrence Hill, Caherdavin, Limerick','087 1025175','N'),(4294204,'Liam Ryan','12 Mount Rochfort Close, Adare, Limerick','086 6237936','N'),(4294205,'Nigel Fairbanks','12 Killard, Kilteragh, Dooradoyle, Limerick','086 5494017','Y'),(4294206,'Jennifer Laws','79 Hollybrook Grove, Clontarf, Dublin','083 2051611','N'),(4294207,'Martha Garcia','18 Nicholas Street, Limerick','087 3450025','Y'),(4294208,'Doireann Sheehan','31 Francis Terrace, Kilkenny','868 7774281','Y'),(4294209,'Pawel Nowak ','4 Tegan Court, Screggan, Tullamore, Offaly','085 5170783','Y'),(4294210,'Annika Smirnov','33 Beaumont Road, Corbally, Limerick','086 9706749','Y'),(4294211,'Long Mile Road Motors','Long Mile Rd, Dublin','01 4578965',''),(4294212,'James Doody','The Cresent, Kilminchy, Portlaoise, Laois','086 8499065','N'),(4294213,'Seamus Haugh','31 Northumberland Road, Ballsbridge, Dublin 4','086 3231949','N'),(4294214,'Dermot Boyle','4 Portobello Road, Portobello, Dublin 8','086 9262414','Y'),(4294215,'Terry McGrath','36 Bulfin Road, Inchicore, Dublin 8','087 2456843','Y'),(4294216,'Fintan Cooper','65 Sarsfield Terrace, Richmond Hill, Limerick','083 1542867','N'),(4294217,'Shelia Noonan','6 Ashbrook Lawn, Ennis Road, Limerick','086 8276894','N'),(4294218,'Mary Barrett','10 Marian Place, Bennettsbridge, Kilkenny','086 7791561','N'),(4294219,'Long Mile Road Motors','Long Mile Rd, Dublin','01 4578965',''),(4294220,'Maude Condon','51 Seville Lawns, Margaretsfields, Callan Road, Kilkenny','087 5776948','N'),(4294221,'Rita Byrne','14 Beechwood Drive, Greystones, Ennis Road, Co. Limerick','087 7007777','N'),(4294222,'David Bourke','15 Haymarket, Cathedral Place, Limerick City,','086 1636400','N'),(4294223,'Jorge Gonzalez','15 Alandale Orchard, Ashbourne Avenue, South Circular Road, Limerick','087 5636825','N'),(4294224,'Khristina Yahontov','108 Curragh birin, Castletroy, Limerick','087 3115251','N'),(4294225,'Long Mile Road Motors','Long Mile Rd, Dublin','01 4578965','Y'),(4294226,'Diego Lopez','Apt 4 Avery House, Windmill Street, Limerick','086 2777146','N'),(4294227,'Imelda Franciosi','Apartment 3, Scots Marsh House, William Street, Waterford','086 3209255','N'),(4294228,'Aarna Ahluwalia','14 High Street, Croom, Co. Limerick','086 8812005','N'),(4294229,'Moira Broe','Kilcurly, Manister, Crecora, Co. Limerick','083 8121891','Y'),(4294230,'Katina Turgenev','Touchwood Stables, Dooneen, Crecora, Co. Limerick','087 7364930','Y'),(4294231,'Kathy Blake','6 The Beacon Courtyard, Main Street Patrickswell, Patrickswell, Co. Limerick','086 1394459','Y');
/*!40000 ALTER TABLE `lastpreviousowners` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `salespeople`
--

DROP TABLE IF EXISTS `salespeople`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `salespeople` (
  `SalesPerson` text,
  `SalesPersonPhone` text,
  `SalesPersonEmail` text,
  `SalesPersonFax` text,
  `LastPreviousOwnersName` text,
  `LastPreviousOwnerAddress` text,
  `LastPreviousOwnerPhone` text,
  `FullServiceHistory` text,
  `Note` text,
  `Id` int NOT NULL AUTO_INCREMENT,
  PRIMARY KEY (`Id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `salespeople`
--

LOCK TABLES `salespeople` WRITE;
/*!40000 ALTER TABLE `salespeople` DISABLE KEYS */;
INSERT INTO `salespeople` VALUES ('Dave Lindale','061 208209','dave.lindale@moylishmotors.ie','061 209209','Barry O\'Brien','St Barts, O\'Connell Avenue, Limerick','087 6645257','N','Reduced from €41,000',1),('Connie Jackson','061 208208','connie.jackson@moylishmotors.ie','061 209208','Fergal Keegan','34 Ferndale, Ennis Road, Limerick','086 5547874','Y','',2),('Mary McKeown','62 208208','mary.mckeown@moylishmotors.ie','061 207207','Jaqueline Freeman','8 Ashwood, Seacrest, Shangort Road, Knocknacarra, Galway','083 4125874','N','****DEPOSIT TAKEN (€1500) R Tierney (083 8454752)****',3),('Bianca Davies','63 208208','bianca.davie@moylishmotors.ie','061 209206','Catherine Fitzgibbon','29 Riverbank Hall, Addison Park, Glasnevin, Dublin','086 6634785','N','',4),('Terry Dunlee','64 208209','terry.dunlee@moylishmotors.ie','061 209205','Joe Crawley','10 Bloomfield, Monaleen, Limerick','086 9987456','Y','',5);
/*!40000 ALTER TABLE `salespeople` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `salespeoplelisting`
--

DROP TABLE IF EXISTS `salespeoplelisting`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `salespeoplelisting` (
  `ListingNumber` int NOT NULL,
  `SalesPersonEmail` text,
  PRIMARY KEY (`ListingNumber`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `salespeoplelisting`
--

LOCK TABLES `salespeoplelisting` WRITE;
/*!40000 ALTER TABLE `salespeoplelisting` DISABLE KEYS */;
INSERT INTO `salespeoplelisting` VALUES (4294194,'dave.lindale@moylishmotors.ie'),(4294195,'connie.jackson@moylishmotors.ie'),(4294196,'dave.lindale@moylishmotors.ie'),(4294197,'mary.mckeown@moylishmotors.ie'),(4294198,'dave.lindale@moylishmotors.ie'),(4294199,'bianca.davie@moylishmotors.ie'),(4294200,'terry.dunlee@moylishmotors.ie'),(4294201,'dave.lindale@moylishmotors.ie'),(4294202,'dave.lindale@moylishmotors.ie'),(4294203,'terry.dunlee@moylishmotors.ie'),(4294204,'connie.jackson@moylishmotors.ie'),(4294205,'connie.jackson@moylishmotors.ie'),(4294206,'mary.mckeown@moylishmotors.ie'),(4294207,'mary.mckeown@moylishmotors.ie'),(4294208,'bianca.davie@moylishmotors.ie'),(4294209,'terry.dunlee@moylishmotors.ie'),(4294210,'terry.dunlee@moylishmotors.ie'),(4294211,'connie.jackson@moylishmotors.ie'),(4294212,'terry.dunlee@moylishmotors.ie'),(4294213,'mary.mckeown@moylishmotors.ie'),(4294214,'connie.jackson@moylishmotors.ie'),(4294215,'connie.jackson@moylishmotors.ie'),(4294216,'terry.dunlee@moylishmotors.ie'),(4294217,'dave.lindale@moylishmotors.ie'),(4294218,'mary.mckeown@moylishmotors.ie'),(4294219,'mary.mckeown@moylishmotors.ie'),(4294220,'terry.dunlee@moylishmotors.ie'),(4294221,'dave.lindale@moylishmotors.ie'),(4294222,'dave.lindale@moylishmotors.ie'),(4294223,'bianca.davie@moylishmotors.ie'),(4294224,'terry.dunlee@moylishmotors.ie'),(4294225,'dave.lindale@moylishmotors.ie'),(4294226,'bianca.davie@moylishmotors.ie'),(4294227,'terry.dunlee@moylishmotors.ie'),(4294228,'mary.mckeown@moylishmotors.ie'),(4294229,'bianca.davie@moylishmotors.ie'),(4294230,'bianca.davie@moylishmotors.ie'),(4294231,'terry.dunlee@moylishmotors.ie');
/*!40000 ALTER TABLE `salespeoplelisting` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `salesstock`
--

DROP TABLE IF EXISTS `salesstock`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `salesstock` (
  `StockId` int NOT NULL AUTO_INCREMENT,
  `ListingNumber` int DEFAULT NULL,
  `Year` text,
  `Reg` text,
  `Make` text,
  `Model` text,
  `Colour` text,
  `Description` text,
  `BuyPrice` int DEFAULT NULL,
  `ListPrice` int DEFAULT NULL,
  `OdometerKPH` int DEFAULT NULL,
  `KPH` text,
  `Engine` double DEFAULT NULL,
  `Fuel` text,
  `Transmission` text,
  `Body` text,
  `Isofix` text,
  `MotorTax` int DEFAULT NULL,
  `PreviousOwners` int DEFAULT NULL,
  `SalesPerson` text,
  `SalesPersonPhone` text,
  `SalesPersonEmail` text,
  `SalesPersonFax` text,
  `LastPreviousOwnersName` text,
  `LastPreviousOwnerAddress` text,
  `LastPreviousOwnerPhone` text,
  `FullServiceHistory` text,
  `Note` text,
  PRIMARY KEY (`StockId`)
) ENGINE=InnoDB AUTO_INCREMENT=33 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `salesstock`
--

LOCK TABLES `salesstock` WRITE;
/*!40000 ALTER TABLE `salesstock` DISABLE KEYS */;
INSERT INTO `salesstock` VALUES (1,4294194,'2020 (201)','202-CE-853','Opel','Elite 2.0D 170 Auto','Black','Highlights includes twin-spoke alloy wheels, IntelliLux LED matrix headlights, Front fog lights, Dark-tinted rear windows, Ergonomic active front seats, Leather seat facings, Heated front seats, 8-inch colour information display, Multimedia Navi Pro infotainment system with fully integrated European sat nav system, 8-inch colour touchscreen, AM/FM/DAB digital radio, Bluetooth? audio streaming / mobile phone portal, Apple CarPlay / Android Auto, USB audio connection, Seven speakers (five front, two rear), Dual-zone electronic climate control, Illuminated vanity mirrors, Storage pockets on front seat backs, Ambient LED lighting in front doors, Twin rear USB sockets, Auto-dimming rear-view mirror and more',36799,39999,25462,'9 seconds',2,'Diesel','Automatic','Hatchback','No',270,1,'Dave Lindale','061 208209','dave.lindale@moylishmotors.ie','061 209209','Barry O\'Brien','St Barts, O\'Connell Avenue, Limerick','087 6645257','N','Reduced from ?41,000'),(2,4294195,'2019 (191)','119-L-7896','Hyundai ','i30 i30N 2.0 T-GDi','Grey','Hyundai i30N 271Bhp˙four-cylinder 2.0 T-GDi engine,˙Highlights include˙ABS, Passenger Airbag, Air Conditioning, Alarm, 19\' Alloys, Armrest, Auto Lights and Wipers, Bluetooth Phone, Child Locks, Cruise Control, Dual Climate Control, Electrically Adjustable Seats, Electric Mirrors, Electric Windows, Heated Seats, Immobilizer, ISO Fix, Lumbar Support, Multi-Function Steering Wheel, Power Steering, Satellite Navigation, Stop and Start System, USB, Rear Parking Sensors, Auto Dimming Rear View Mirror, Leather Steering Wheel, Auto Lights, Auxiliary Jack Input, Traction Control, Adjustable seats, Remote controlled alarm, Adjustable steering column/wheel, Foglights, Height adjustable drivers seat, Mirrors electric and heated, Outside temperature meter, Rain sensor, Rear headrests, Traction control, Media Connection, iPod Connection, Auto Wipers, Leather Gear Lever, Car History Checked, Finance Available, auto  stop/start, reversing camera, Apple CarPlay, Android Auto and much more ',32200,35000,19855,'9.6 seconds',2,'Petrol','Manual','Hatchback','Yes',270,1,'Connie Jackson','061 208208','connie.jackson@moylishmotors.ie','061 209208','Fergal Keegan','34 Ferndale, Ennis Road, Limerick','086 5547874','Y',''),(3,4294196,'2016 (161)','161-T-365','Toyota','Rav4 Luna 2.0D-4D','Slate','Highlights include reversing camera ,alloy wheels, abs brakes, fog lights bluetooth isofix points multiple airbags cloth trim electric windows and wing mirrors automatic headlights, immobiliser and cruise control.',18308,19900,85411,'8.5 seconds',2,'Diesel','Manual','SUV','Yes',270,1,'Dave Lindale','061 208209','dave.lindale@moylishmotors.ie','061 209209','Dorota Kowalski ','1 Kimberley Villas, Millitary Hill, Ennis','083 6684774','Y',''),(4,4294197,'2018 (181)','181-L-368','Hyundai ','i30 Deluxe 1.6TD','Sky Blue','Air Conditioning, Central Locking, Electric Windows, Cruise Control, Fog Lamps, Rear Spoiler, Multi-function steering wheel, Parking Sensors, Bluetooth, EBD, Isofix, Stop/Start Button',18400,20000,875471,'10 seconds',1.6,'Diesel','Automatic','Hatchback','Yes',190,2,'Mary McKeown','061 208207','mary.mckeown@moylishmotors.ie','061 207207','Jaqueline Freeman','8 Ashwood, Seacrest, Shangort Road, Knocknacarra, Galway','083 4125874','N','****DEPOSIT TAKEN (?1500) R Tierney (083 8454752)****'),(5,4294198,'2014 (141)','141-G-642','Volvo','S60 D2 SE 1.6TD','Dark Grey','ABS, Air Conditioning, Alloy Wheels, Armrest, Climate Control, Cruise Control, Electric Mirrors, Electric Windows, Immobilizer, ISO Fix, Metallic Paint, Multi-Function Steering Wheel, Power Steering, Side Impact Protection, Multiple Airbags, 3x3point rear seat belts, Adjustable seats, Adjustable steering wheel,',11960,13000,124004,'10.6 seconds',1.6,'Diesel','Manual','Saloon','Yes',190,3,'Dave Lindale','061 208209','dave.lindale@moylishmotors.ie','061 209209','Lisa Munroe','165 Ivy Exchange, Parnell Street, Limerick','087 4578543','N',''),(6,4294199,'2013 (131)','131-L-974','Peugeot','1.6 HDI ACTIVE 113BHP','Charcoal','Air Conditioning, Central Locking, CD Player, Electric Windows, Cruise Control, Fog Lamps, Immobiliser, Centre Armrest, Multi-function steering wheel, Traction Control Metallic Paint, Multiple Air Bags, Parking Sensors, Trade in accepted, Bluetooth, EBD, Isofix, Active Braking System',8280,9000,240000,'12 seconds',1.6,'Diesel','Manual','MPV','Yes',270,2,'Bianca Davies','061 208206','bianca.davie@moylishmotors.ie','061 209206','Catherine Fitzgibbon','29 Riverbank Hall, Addison Park, Glasnevin, Dublin','086 6634785','N',''),(7,4294200,'2019 (191)','191-D-87452','Volkswagen ','Up!','White','Daytime Running Lights, ESP, ISO Fix, Multiple Airbags, Immobilizer, Auto Lights and Wipers, Remote Central Locking, Adjustable Steering Column, Auxiliary Socket, Bluetooth Phone, Split Fold Rear Seats, USB.˙Comes fully prepared, serviced & valeted',11040,12000,8900,'Info not available',1,'Petrol','Manual','Hatchback','No',180,1,'Terry Dunlee','061 208205','terry.dunlee@moylishmotors.ie','061 209205','Joe Crawley','10 Bloomfield, Monaleen, Limerick','086 9987456','Y',''),(8,4294201,'2015 (151)','15-L-15','Ford','Focus TITANIUM 1.6TDCI 115PS','Silver','r Conditioning, Central Locking, Electric Windows, Cruise Control, Fog Lamps, Centre Armrest, Multi-function steering wheel, Traction Control, Metallic Paint, Bluetooth, EBD, Isofix, Active Braking System, Touch Button Start, Touch Screen Infotainment sysytem',11684,12700,119875,'9.1 seconds',1.6,'Diesel','Manual','Saloon','Yes',190,2,'Dave Lindale','061 208209','dave.lindale@moylishmotors.ie','061 209209','Ruth OBrien','6 Newtown Park, Annacotty, Limerick','087 1247856','N',''),(9,4294202,'2017 (171)','171-L-2753','Nissan ','NOTE 1.5 SV','Cherry','issan Note SV model 1.5dci Spec includes CD Player, Bluetooth Connectivity, Air Conditioning, Cruise Control, Speed Limiter, Idle Stop Start System, Onboard Computer, Power Steering, Multi-Function Steering Wheel, Adjustable Steering Wheel, Sliding Rear Seat, Rear Folding Seats - 40:60 Split, Rear Headrests, Front Centre Armrest, Electric Windows, Electric Mirrors, Fog Lamps ',13064,14200,39452,'Info not available',1.5,'Diesel','Manual','MPV','Yes',180,1,'Dave Lindale','061 208209','dave.lindale@moylishmotors.ie','061 209209','Robert Clancy','88 Lagmore Glen, Limerick','087 6235395','N','****DEPOSIT TAKEN (?500) A Boyle (086 3414752)****'),(10,4294203,'2010','10-L-471','Renault ','Clio 1.2 16V ROYALE ECO','Brown','Air Conditioning, Central Locking, Electric Windows, Fog Lamps, Privacy Glass, Multi-function steering wheel, EBD, Isofix',4600,5000,180000,'16 seconds',1.1,'Petrol','Manual','Hatchback','Yes',280,3,'Terry Dunlee','061 208205','terry.dunlee@moylishmotors.ie','061 209205','Phillip Rose','26 Lawrence Hill, Caherdavin, Limerick','087 1025175','N',''),(11,4294204,'2015 (152)','152-LK-754','Dacia ','Duster ALTERNATIVE 1.5 DCI110','Black','Auxiliary Jack Input, Bluetooth, 6 Speed',9292,10100,108009,'Info not available',1.5,'Diesel','Manual','SUV','Yes',200,2,'Connie Jackson','061 208208','connie.jackson@moylishmotors.ie','061 209208','Liam Ryan','12 Mount Rochfort Close, Adare, Limerick','086 6237936','N',''),(12,4294205,'2017 (171)','171-L-774','Audo','A4 3.0 TDI 218 S Tronic SE','Silver','ABS, 18 inch Alloys, Armrest, Auto Handbrake, Dual Climate Control, Immobilizer, Rear Parking Sensors, Auto Lights, Adjustable seats, Adjustable steering column/wheel, Body Coloured Bumpers, Mirrors electric and heated, Rain sensor, Finance Available, Sat Nav. ',25024,27200,79254,'7.2 seconds',3,'Diesel','Automatic','Saloon','Yes',180,1,'Connie Jackson','061 208208','connie.jackson@moylishmotors.ie','061 209208','Nigel Fairbanks','12 Killard, Kilteragh, Dooradoyle, Limerick','086 5494017','Y',''),(13,4294206,'2017 (171)','171-D-63547','BMW','X3 AUTOMATIC SPORT','Black','Jut in stock, This Beautiful BMW X3, One owner from new. Fully Loaded with extras including Power Tailgate, Navigation, Heated seats, Dynamic Driving modes Front and rear parking asistance, and loads more!',31740,34500,97854,'Info not available',2,'Diesel','Automatic','SUV','Yes',180,1,'Mary McKeown','061 208207','mary.mckeown@moylishmotors.ie','061 207207','Jennifer Laws','79 Hollybrook Grove, Clontarf, Dublin','083 2051611','N','Ex-fleet'),(14,4294207,'2018 (181)','181-L-554','Ford','EcoSport TITANIUM 1.0T 140PS 6','Brown','A one owner car with full service history',17434,18950,57895,'Info not available',1,'Petrol','Manual','SUV','Yes',180,1,'Mary McKeown','061 208207','mary.mckeown@moylishmotors.ie','061 207207','Martha Garcia','18 Nicholas Street, Limerick','087 3450025','Y',''),(15,4294208,'2018 (182)','182-KK-1024','Mercedes-Benz','CLA-Class CLA 180 AMG SPORT 4DR AUTO','Black','182 Mercedes CLA 180 Petrol AMG Sport Auto. This is a pristine example of a used Mercedes CLA 180 AMG petrol Auto with genuine low mileage. Air Conditioning, 18\' Alloys, Armrest, Auto Lights and Wipers, Bluetooth Phone, Climate Control, Cruise Control, ISO Fix, Multi-Function Steering Wheel, Radio/CD/MP3, Adjustable seats, iPhone Connection, Car History Checked, ',29439,31999,37512,'10 seconds',1.6,'Petrol','Automatic','Saloon','Yes',180,1,'Bianca Davies','061 208206','bianca.davie@moylishmotors.ie','061 209206','Doireann Sheehan','31 Francis Terrace, Kilkenny','868 7774281','Y','Reduced from ?40,500'),(16,4294209,'2018 (181)','181-OY-114','Mercedes-Benz','-Class CLA 180 D URBAN 4DR','Grey','ABS, Air Conditioning, Alloy Wheels, Bluetooth Phone, CD player, ISO Fix, Leather Interior, Metallic Paint, Multi-Function Steering Wheel, Power Steering, Radio/CD/MP3, Car History Checked,',25709,27945,85497,'Info not available',1.5,'Diesel','Manual','Saloon','Yes',180,1,'Terry Dunlee','061 208205','terry.dunlee@moylishmotors.ie','061 209205','Pawel Nowak ','4 Tegan Court, Screggan, Tullamore, Offaly','085 5170783','Y',''),(17,4294211,'2020 (202)','202-D-24730','Jaguar','F-PACE Chequered Flag 2.0 Auto RWD 180PS','Metallic Eiger Grey','equipped with extras such as: - Power-fold / Heated / Auto-Dimming Mirrors - Privacy Glass - Fog lights - Adaptive LED headlamps with Signature DRL - Powered Bootlid Packs such as: Drive Pack, Park Pack and Black Pack. ABS, Alloy Wheels, 17\' Alloys, Auto Handbrake, Auto Lights and Wipers, Bluetooth Phone, Climate Control, Electric Mirrors, Heated Seats, ISO Fix, Leather Interior, Metallic Paint, Multi-Function Steering Wheel, Onboard Computer, Satellite Navigation, Stop and Start System, Tiptronic, USB, Wooden Inlay, Front Parking Sensors, Rear Parking Sensors, Privacy Glass, Leather Steering Wheel, Front Fog Lights, Traction Control, Rain sensor, Traction control, Media Connection, Finance Available, Rear View Camera, Sat Nav, Panoramic Glass Roof, Adaptive Cruise Control, Bluetooth, Heated seats, Rear camera, Privacy glass, Apple Car Play, Android Auto. ',60168,65400,5,'8.4 seconds',2,'Diesel','Automatic','Saloon','Yes',180,1,'Connie Jackson','061 208208','connie.jackson@moylishmotors.ie','061 209208','Long Mile Road Motors','Long Mile Rd, Dublin','01 4578965','','Demo model'),(18,4294212,'2016 (162)','162-LS-115','Mazda','CX-5 2WD 2.2D (150PS) EXEC SE','Grey','The Mazda CX-5 may be a large practical SUV, but it is also a very economical stylish and SUV that is enjoyable to drive. Bluetooth, automatic headlights, automatic wipers, automatic dimming interior mirror, keyless start, parking sensors front and rear with visual display, cruise control, dual climate control, electric folding mirrors, rear privacy glass, twin exhausts, USB connection and much more. All our cars are provided with a warranty (with Manufacturers or our own), HPI clearance & are professionally valeted & detailed. We pride ourselves on customer service and our cars are prepared to the highest standards. ',17020,18500,63574,'7 seconds',2.2,'Diesel','Manual','SUV','No',190,1,'Terry Dunlee','061 208205','terry.dunlee@moylishmotors.ie','061 209205','James Doody','The Cresent, Kilminchy, Portlaoise, Laois','086 8499065','N','Needs a service. Unlikely to pass the NCT.'),(19,4294213,'2017 (172)','172-D-96347','Land Rover','Discovery 2.0 SD4 SE 240PS','Black','4 Wheel Drive, Air Conditioning, Alloy Wheels, Bluetooth Phone, Climate Control, Cruise Control, Extended Warranty, ISO Fix, Multi-Function Steering Wheel, Radio/CD/MP3, Split Fold Rear Seats, Stop and Start System, USB, Height adjustable drivers seat, Rear armrest, Roof rails, Traction control, Remote Boot Release, Car History Checked, Finance Available, Parking Sensors, Apple Car Play',47794,51950,105102,'Info not available',2,'Diesel','Automatic','SUV','Yes',280,2,'Mary McKeown','061 208207','mary.mckeown@moylishmotors.ie','061 207207','Seamus Haugh','31 Northumberland Road, Ballsbridge, Dublin 4','086 3231949','N',''),(20,4294214,'2017 (171)','171-D-78412','Renault ','Captur','Red','Stunning Renault Captur Signature 1.5D , beautiful colour combination with Black contrast roof . This Captur has only done 19,000 and is as new . It also comes with a huge level of specification as standard. For an incrediblely well specked compact, economical SUV with exceptionally low mileage it\'s hard to beat this Renault Captur. ABS, Air Conditioning, Alloy Wheels, Auto Handbrake, Bluetooth Phone, Centralised locking, Cruise Control, Electrically Adjustable Seats, Electric Mirrors, Electric Windows, Heated Seats, Immobilizer, Leather Interior, Metallic Paint, Multi-Function Steering Wheel, Onboard Computer, Power Steering, Satellite Navigation, Privacy Glass, Auto Lights, Front Fog Lights, Traction Control, Foglights, Traction control, Finance Available, Sat Nav. ',16100,17500,19005,'Info not available',1.5,'Diesel','Manual','SUV','Yes',180,1,'Connie Jackson','061 208208','connie.jackson@moylishmotors.ie','061 209208','Dermot Boyle','4 Portobello Road, Portobello, Dublin 8','086 9262414','Y',''),(21,4294215,'2016 (161)','161-D-105785','Audi','A4 1.4 TFSI SPORT 150PS 4DR','Black','Air Conditioning, 17\' Alloys, Bluetooth Phone, Heated Seats, Multi-Function Steering Wheel, Satellite Navigation, Xenon Headlights, Car History Checked, Front & Rear Parking Sensors.',19500,19500,88954,'7.9 seconds',1.4,'Petrol','Manual','Saloon','Yes',270,2,'Connie Jackson','061 208208','connie.jackson@moylishmotors.ie','061 209208','Terry McGrath','36 Bulfin Road, Inchicore, Dublin 8','087 2456843','Y','Reduced to clear'),(22,4294216,'2015 (152)','152-L-1425','Hyundai ','i20 ','Bronze','Climate Control, Cruise control, Bluetooth, CD Player, Reversing parking sensors, Multi functional steering wheel, Alloy Wheels, Remainder of Hyundai unlimited mileage warranty, Adjustable steering wheel, USB, AUX port,',10074,10950,754010,'16.2 seconds',1.2,'Petrol','Manual','SUV','Yes',270,2,'Terry Dunlee','061 208205','terry.dunlee@moylishmotors.ie','061 209205','Fintan Cooper','65 Sarsfield Terrace, Richmond Hill, Limerick','083 1542867','N',''),(23,4294217,'2017 (172)','172-L-3470','Ford','Fiesta TITANIUM 1.25 60PS M5 5','Blue','Air Conditioning, Central Locking, CD Player, Electric Windows, Cruise Control, Fog Lamps, Immobiliser, Centre Armrest, Multi-function steering wheel, Traction Control, ',12144,13200,654020,'17.0 seconds',1.2,'Petrol','Manual','Hatchback','Yes',270,1,'Dave Lindale','061 208209','dave.lindale@moylishmotors.ie','061 209209','Shelia Noonan','6 Ashbrook Lawn, Ennis Road, Limerick','086 8276894','N','****DEPOSIT TAKEN (?700) F Moroney (087 1985254)****'),(24,4294218,'2017 (171)','171-KK-445','Mazda','Mazda 6','Brown','Mazda 6 2.2 Diesel (150PS)PLATINUM ONLY 67.000KMS Leather Seats,Heated Seats,Electric Seats,Metallic Paint,Heads Up Display,Camera,Nav,Keyless Start,Parking Sensors,Upgrade Alloy Wheels',17388,18900,67520,'6.9 seconds',2.2,'Diesel','Manual','Saloon','No',190,1,'Mary McKeown','061 208207','mary.mckeown@moylishmotors.ie','061 207207','Mary Barrett','10 Marian Place, Bennettsbridge, Kilkenny','086 7791561','N',''),(25,4294220,'2018 (181)','181-KK-364','Skoda','Citigo AMBITION','Red','Lovely little Automatic cheap tax car, In great condition and great fun to drive. Long Nct and even taxed ready to go. Trade in accepted, Central Locking, CD Player, Electric Windows, Immobiliser, Luggage Cover, Traction Control, Metallic Paint, Remote Central Locking, EBD, Isofix, Active Braking System, 2 Keys',8298,9020,11957,'17 seconds',1,'Petrol','Manual','Hatchback','Yes',190,1,'Terry Dunlee','061 208205','terry.dunlee@moylishmotors.ie','061 209205','Maude Condon','51 Seville Lawns, Margaretsfields, Callan Road, Kilkenny','087 5776948','N',''),(26,4294221,'2017 (171)','171-L-158','SEAT','Ateca','Blue','One owner from new. Air Conditioning, sat nav, front and rear parking sensors, upgraded alloys.',18308,19900,50475,'14 seconds',1,'Petrol','Manual','SUV','Yes',190,1,'Dave Lindale','061 208209','dave.lindale@moylishmotors.ie','061 209209','Rita Byrne','14 Beechwood Drive, Greystones, Ennis Road, Co. Limerick','087 7007777','N','Just had a major service carried out'),(27,4294222,'2019 (191)','191-L-9710','Toyota','Camry','Pearl Red','2019 (191) Camry Hybrid in pristine condition, comes with the all new improved CVT transmission engineered to perfection for a fuel efficient drive that allows up to and over 50% in full Electric. Annual road tax of just ?190, this state of the art modern vehicle is ready to view immediately',325772,354100,24874,'Info not available',1.6,'Hybrid','Automatic','Saloon','Yes',190,1,'Dave Lindale','061 208209','dave.lindale@moylishmotors.ie','061 209209','David Bourke','15 Haymarket, Cathedral Place, Limerick City,','086 1636400','N',''),(28,4294223,'2015 (151)','151-L-625','Toyota','Avensis','Grey','Adjustable Steering Wheel / Airbags Multiple / Air Conditioning / Alloy Wheels / Bluetooth / CD Player / Cruise Control / Climate Control / Automatic Start/Stop / Electric Heated Mirrors / Electric Windows (All) / Front Fog Lights / Reversing Camera / Trip Computer / Alarm / Automatic Lights',14260,15500,74257,'Info not available',1.6,'Diesel','Manual','Saloon','Yes',190,1,'Bianca Davies','061 208206','bianca.davie@moylishmotors.ie','061 209206','Jorge Gonzalez','15 Alandale Orchard, Ashbourne Avenue, South Circular Road, Limerick','087 5636825','N','Ex-fleet'),(29,4294224,'2017 (172)','172-WW-674','Toyota','C-HR SOL','White','Climate Control / Cruise Control / Bluetooth / CD Player / Leather Part / Leather Steering Wheel / iPod / USB Port / Isofix / Electric Windows (All) / Parking Sensors (Rear) / Parking Sensors (Front) / Reversing Camera / Sat Nav System',20700,22500,79457,'9.2 seconds',1.8,'Hybrid','Automatic','Hatchback','Yes',180,2,'Terry Dunlee','061 208205','terry.dunlee@moylishmotors.ie','061 209205','Khristina Yahontov','108 Curragh birin, Castletroy, Limerick','087 3115251','N',''),(30,4294225,'2020 (202)','202-D-47520','Ford','Puma ST-LINE 5D 1.0T 125 MHEV','White','18\" Alloys / LED Headlamps with Auto Highbeam / Pre-Collission Assist / Front Fogs with Cornering / 8? Sync 3 Touchscreen with Sat Nav and B&O Play Sound System /  Ford Pass Connect / Heated Windscreen / Keyfree Entry with Handsfree Tailgate and Push Button Start / Climate Control / Ambient Lighting / Wireless Phone Charging / Intelligent Adaptive Cruise Control with Evasive Steering / Speed Limiter / Rear Spoiler / Active Park Assist incl Front & Rear Sensors / Alarm / Lane Keeping Aid / Megabox Boot / Auto Wipers / Partial Leather Sports Trim / Privacy Glass / Radar & Camera Fusion Pre-Collision Assist / BLIS with Active Braking / Rear View Camera\"',23915,25995,24,'Info not available',1.6,'Hybrid','Automatic','Coupe','Yes',180,1,'Dave Lindale','061 208209','dave.lindale@moylishmotors.ie','061 209209','Long Mile Road Motors','Long Mile Rd, Dublin','01 4578965','Y','Demo model'),(31,4294226,'2006','06-C-1847','Lexus','GS 300','Black','Air Conditioning, Central Locking, CD Player, Immaculate condition, Electric Windows, Alloy Wheels, Cruise Control, Electric Mirrors, Electric Seats, Fog Lamps, Immobiliser, Leather Upholstery, Full Leather, Automatic Wipers, Automatic Lights, Centre Armrest, Multi-function steering wheel, Climate Control, Traction Control, Metallic Paint, Multiple Air Bags, Parking Sensors, Bluetooth, Remote Central Locking, EBD, Isofix, History Checked, Finance Checked, Keyless Entry, Heated Front Seats, Wireless Smartphone Control, Touch Screen Media Control, Drive Mode Selector',2500,2600,287541,'7.2 seconds',3,'Petrol','Automatic','Saloon','No',1494,5,'Bianca Davies','061 208206','bianca.davie@moylishmotors.ie','061 209206','Diego Lopez','Apt 4 Avery House, Windmill Street, Limerick','086 2777146','N','Reduced to clear'),(32,4294229,'2019 (191)','191-L-980','Renault','KADJAR','Red','Adjustable steering column/wheel, Air Conditioning, Armrest, Auxiliary Jack Input, Dual Climate Control, Electrically Adjustable Seats, Heat preventing glass, Heated Seats, Height adjustable drivers seat, Lumbar Support, Media Connection, Mirrors electric and heated, Multi-Function Steering Wheel, Onboard Computer, Satellite Navigation, Split Fold Rear Seats, Stop and Start System, 3x3point rear seat belts, Auto Dimming Rear View Mirror, Auto Handbrake, Xenon Headlights 19\' Alloys, Alloy Wheels, Metallic Paint, Pearlescent paint, Privacy Glass, Roof rails, Sport exhaust pipe ',23919,25999,25640,'Info not available',1.3,'Petrol','Manual','SUV','Yes',180,1,'Bianca Davies','061 208206','bianca.davie@moylishmotors.ie','061 209206','Moira Broe','Kilcurly, Manister, Crecora, Co. Limerick','083 8121891','Y','');
/*!40000 ALTER TABLE `salesstock` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `user`
--

DROP TABLE IF EXISTS `user`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `user` (
  `Id` int NOT NULL AUTO_INCREMENT,
  `username` varchar(50) DEFAULT NULL,
  `Password` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`Id`),
  UNIQUE KEY `username_UNIQUE` (`username`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `user`
--

LOCK TABLES `user` WRITE;
/*!40000 ALTER TABLE `user` DISABLE KEYS */;
INSERT INTO `user` VALUES (1,'Connie','letmein'),(2,'tomc','tompass'),(3,'admin','adminpass');
/*!40000 ALTER TABLE `user` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `userroles`
--

DROP TABLE IF EXISTS `userroles`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `userroles` (
  `userID` int NOT NULL AUTO_INCREMENT,
  `role` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`userID`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `userroles`
--

LOCK TABLES `userroles` WRITE;
/*!40000 ALTER TABLE `userroles` DISABLE KEYS */;
INSERT INTO `userroles` VALUES (1,'admin'),(2,'salesperson'),(3,'customers');
/*!40000 ALTER TABLE `userroles` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2020-11-30 20:26:20
