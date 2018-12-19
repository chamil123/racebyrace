-- MySQL dump 10.9
--
-- Host: localhost    Database: racebyrace
-- ------------------------------------------------------
-- Server version	4.1.10-nt

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;

--
-- Table structure for table `account`
--

DROP TABLE IF EXISTS `account`;
CREATE TABLE `account` (
  `a_id` varchar(100) NOT NULL default '',
  `a_name` varchar(100) NOT NULL default '',
  PRIMARY KEY  (`a_id`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Dumping data for table `account`
--


/*!40000 ALTER TABLE `account` DISABLE KEYS */;
LOCK TABLES `account` WRITE;
INSERT INTO `account` VALUES ('R001','RAGAMA'),('R002','Kochchikade');
UNLOCK TABLES;
/*!40000 ALTER TABLE `account` ENABLE KEYS */;

--
-- Table structure for table `center`
--

DROP TABLE IF EXISTS `center`;
CREATE TABLE `center` (
  `c_number` double NOT NULL default '0',
  `c_name` varchar(100) NOT NULL default '',
  `c_com` varchar(100) NOT NULL default '',
  `c_paperCash` double NOT NULL default '0',
  `c_loan` double NOT NULL default '0',
  `c_noCom` varchar(100) NOT NULL default '',
  `c_lessCom` varchar(100) NOT NULL default '',
  `c_exp` double NOT NULL default '0'
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Dumping data for table `center`
--


/*!40000 ALTER TABLE `center` DISABLE KEYS */;
LOCK TABLES `center` WRITE;
INSERT INTO `center` VALUES (1,'ASHWAYA','21',25.5,200,'21','8',250);
UNLOCK TABLES;
/*!40000 ALTER TABLE `center` ENABLE KEYS */;

--
-- Table structure for table `chit_registration`
--

DROP TABLE IF EXISTS `chit_registration`;
CREATE TABLE `chit_registration` (
  `Chit_ID` int(11) NOT NULL auto_increment,
  `Packet_NO` varchar(100) NOT NULL default '',
  `Chit_NO` varchar(100) NOT NULL default '',
  PRIMARY KEY  (`Chit_ID`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Dumping data for table `chit_registration`
--


/*!40000 ALTER TABLE `chit_registration` DISABLE KEYS */;
LOCK TABLES `chit_registration` WRITE;
INSERT INTO `chit_registration` VALUES (1,'01','36');
UNLOCK TABLES;
/*!40000 ALTER TABLE `chit_registration` ENABLE KEYS */;

--
-- Table structure for table `country`
--

DROP TABLE IF EXISTS `country`;
CREATE TABLE `country` (
  `id` int(11) NOT NULL default '0',
  `country` varchar(100) NOT NULL default '',
  PRIMARY KEY  (`id`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Dumping data for table `country`
--


/*!40000 ALTER TABLE `country` DISABLE KEYS */;
LOCK TABLES `country` WRITE;
INSERT INTO `country` VALUES (1,'BALLINROBE'),(2,'BEVERLEY'),(3,'CARLISLE'),(4,'LINGFIELD'),(5,'NEWTON ABBOT');
UNLOCK TABLES;
/*!40000 ALTER TABLE `country` ENABLE KEYS */;

--
-- Table structure for table `doubles`
--

DROP TABLE IF EXISTS `doubles`;
CREATE TABLE `doubles` (
  `Chit_ID` varchar(100) NOT NULL default '',
  `Item_ID` varchar(100) NOT NULL default '',
  `To` varchar(100) NOT NULL default '',
  `For` varchar(100) NOT NULL default '',
  `Amount` varchar(100) NOT NULL default ''
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Dumping data for table `doubles`
--


/*!40000 ALTER TABLE `doubles` DISABLE KEYS */;
LOCK TABLES `doubles` WRITE;
INSERT INTO `doubles` VALUES ('1','1','1','5','10'),('1','2','2','4','10');
UNLOCK TABLES;
/*!40000 ALTER TABLE `doubles` ENABLE KEYS */;

--
-- Table structure for table `horse`
--

DROP TABLE IF EXISTS `horse`;
CREATE TABLE `horse` (
  `c_id` int(11) NOT NULL default '0',
  `pora` varchar(100) NOT NULL default '',
  `name` varchar(100) NOT NULL default ''
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Dumping data for table `horse`
--


/*!40000 ALTER TABLE `horse` DISABLE KEYS */;
LOCK TABLES `horse` WRITE;
INSERT INTO `horse` VALUES (1,'BA/1','BRADYâ??S HILL(IRE)(P,T)'),(1,'BA/1','CLARCAM(FR)(T) 3-10'),(1,'BA/1','DESIDERATA(IRE)(H,T) 3-10'),(1,'BA/1','DON FRANCO(IRE)'),(1,'BA/1','HAVERSTOCK 3-10'),(1,'BA/1','JAN VAN'),(1,'BA/1','MARVELOUS JAMES(IRE)'),(1,'BA/1','MONAMINTRA(IRE) 3-10'),(1,'BA/1','MOSS STREET'),(1,'BA/1','HERECOMESTHEWOLF(IRE)(P)3-10 5'),(1,'BA/2','IS HERSELF'),(1,'BA/2','ANCIENT SANDS(IRE)(T)'),(1,'BA/2','ALL OR'),(1,'BA/2','FAIR DILEMMA(IRE)(P,T) 8-11'),(1,'BA/2','THE HAMPTONS(IRE)'),(1,'BA/2','SECOND GLANCE(IRE)(P)'),(1,'BA/2','LUIMNEACH ABU(IRE)'),(1,'BA/2','LAUGHING BOY(IRE)'),(1,'BA/2','PENNYS TUNE(IRE)(P)'),(1,'BA/2','BACKINYOURBOX(IRE)(T) 6-10 10'),(1,'BA/2','ITTIMETOGO(IRE) 5-10'),(1,'BA/2','TWO EURO'),(1,'BA/2','WILDCATTED(GER) 4-10'),(1,'BA/2','SURFâ??S UP(IRE)'),(1,'BA/2','SWEETHEART SUSAN(IRE)'),(1,'BA/2','PIVOT BRIDGE'),(1,'BA/2','DESERT ROE(IRE)'),(1,'BA/2','WHAT ABOUT'),(1,'BA/2','MON CARLOS(IRE)(T)'),(1,'BA/3','CHEYENNE GIRL(IRE)'),(1,'BA/3','MYBLUEEYEDGIRL(IRE)(T) 5-11'),(1,'BA/3','ROYAL MOLL(IRE)'),(1,'BA/3','DIVINE STEPS(IRE)(P)'),(1,'BA/3','GIRLIEâ??SDREAM(IRE)(T) 9-10'),(1,'BA/3','I HAD'),(1,'BA/3','LOST BOOK(IRE)(T)'),(1,'BA/3','MAY DULLEA(IRE)(T)'),(1,'BA/3','NIFTY LASS(IRE)'),(1,'BA/3','OUR MAIMIE(IRE)'),(1,'BA/3','ROISINS RUBY(IRE) 6-10'),(1,'BA/3','SALTEE MIST(IRE)(B)'),(1,'BA/3','SENSING(IRE) 6-10'),(1,'BA/3','TEXAS ROSE(IRE)(T) 6-10'),(1,'BA/3','TULLYDONNELL FLYER(IRE)(P,T) 7-10'),(1,'BA/3','MABBITSTOWN QUEEN(IRE)'),(1,'BA/3','SENDYâ??S GOLD(IRE)'),(1,'BA/3','RUBI H(IRE)'),(1,'BA/4','HOLD EM'),(1,'BA/4','MIRADOR DEL'),(1,'BA/4','GO PADDY'),(1,'BA/4','POCKETFULLAPENNIES(IRE)(T) 7-11'),(1,'BA/4','THE FLYING'),(1,'BA/4','SPLIT EAR(IRE)(P)'),(1,'BA/4','WORLD CITIZEN(IRE)'),(1,'BA/4','CAITLIN BROOK(IRE)'),(1,'BA/4','FLYING BELLA'),(1,'BA/4','FOILDEARG(IRE)(B,T) 7-10'),(1,'BA/4','GORTMORE EXPRESS(IRE)'),(1,'BA/4','MOON PRINCE(IRE)'),(1,'BA/4','TIP FOR'),(1,'BA/4','BALLYBAY HODSON(IRE)(B)'),(1,'BA/4','DONT ENGAGE EM(IRE)(B)'),(1,'BA/4','SIDI IFNI(FR) 7-10'),(1,'BA/4','Mrs Jacqueline'),(1,'BA/4','JOEY(IRE)(P) 8-11 1'),(1,'BA/4','THATS THE'),(1,'BA/5','AFATCAT(T) 5-11'),(1,'BA/5','SIR LOUJAY(IRE)'),(1,'BA/5','BENEFITTHEWEST(IRE)(B,T) 7-11'),(1,'BA/5','CLONLENEY(IRE)(T) 7-11 8'),(1,'BA/5','CARRIGâ??N MAY(IRE)(P)'),(1,'BA/5','SPOT THE'),(1,'BA/5','AMBUSH ANGEL(IRE)'),(1,'BA/5','COUNTESS SALOME(IRE)(P)'),(1,'BA/5','VICALUS(IRE) 8-11 5'),(1,'BA/5','KINNEAGH CROSS(IRE)(P)'),(1,'BA/5','BLUEGRASS BID(USA)(P,T)'),(1,'BA/5','ASITHAPPENS(IRE) 6-10'),(1,'BA/5','GALBOYSTOWN LADY(IRE)'),(1,'BA/5','QUANTUM REACH(IRE)(P)'),(1,'BA/5','CARHEENLEA(IRE) 11-10'),(1,'BA/5','SUPREME VIC(IRE)'),(1,'BA/5','BACK TO'),(1,'BA/5','PORTHAW(IRE) 7-10'),(1,'BA/5','ALDERIMLI(IRE)(P) 6-11'),(1,'BA/6','TOMMY(IRE)(T) 6-11 12'),(1,'BA/6','END ZONE(IRE)(T) 9-11'),(1,'BA/6','HELLOFADO(IRE)(T) 6-11 12'),(1,'BA/6','NEAREST THE'),(1,'BA/6','PASSAGE VENDOME(FR) 7-11'),(1,'BA/6','USA(IRE) 6-11'),(1,'BA/6','ART OF'),(1,'BA/6','CONEY CHOICE(IRE)'),(1,'BA/6','MUSAWAMA(IRE)(T) 5-11'),(1,'BA/6','OF THE'),(1,'BA/6','LILLY THE'),(1,'BA/6','SITCOM(IRE)(H) 5-11'),(1,'BA/6','BE POSITIVE(IRE)(T) 4-10'),(1,'BA/7','GIMLIâ??S ROCK(IRE)(B)'),(1,'BA/7','JAKROS(IRE)(B) 8-11 10Donagh'),(1,'BA/7','THEMOONANDSIXPENCE(IRE)(T)10-11 10'),(1,'BA/7','BLACK BENNY(IRE)(T)'),(1,'BA/7','GOLDEN WONDER(IRE)'),(1,'BA/7','MINELLA FOR'),(1,'BA/7','ROCKSHANDY(IRE) 7-11 5Miss'),(1,'BA/7','TOM HORN(IRE)'),(1,'BA/7','FANTASTIC GOLD(P,T)'),(1,'BA/7','GUDNIS GRACIOUS'),(1,'BA/7','OUR GIRL'),(1,'BA/7','MICHAEL VALENTINE(IRE)(T)7-10'),(1,'BA/7','KALICO KIM(IRE)(T)'),(1,'BA/7','MONROEâ??S LIVE(IRE)'),(1,'BA/8','LIMERICK LANE(IRE)(T)'),(1,'BA/8','MOUNT SION(IRE)(P)'),(1,'BA/8','A DECENT EXCUSE(IRE)'),(1,'BA/8','LORD LIR(IRE) 7-11'),(1,'BA/8','HIGH TALK(IRE)(T)'),(1,'BA/8','Exors of'),(1,'BA/8','CLOSE REVIEW(IRE)(T)'),(1,'BA/8','WHAT A ISLAND(IRE)(T)'),(1,'BA/8','DEBT TO'),(1,'BA/8','PAT GARRETT(IRE)(B)'),(1,'BA/8','SHANTALLA(IRE)(T) 9-10'),(1,'BA/8','NIVEKâ??S DREAM(IRE) 10-10'),(1,'BA/8','PERSONAL SHOPPER'),(2,'BE/1','BLAZERS ROCK(IRE)'),(2,'BE/1','FILAMENT OF'),(2,'BE/1','Sheikh Hamdan'),(2,'BE/1','NATIVE FALLS(IRE)'),(2,'BE/1','OUR CHANNEL(USA)'),(2,'BE/1','VICTORY DANZ(IRE)'),(2,'BE/1','MODIFY(V) 2-9'),(2,'BE/1','RAWOOF(IRE) 2-9'),(2,'BE/2','GRAMMAR(E) 4-9'),(2,'BE/2','ASSIZES 4-9'),(2,'BE/2','BOLD AND'),(2,'BE/2','HALFWAYTOCOOTEHILL(IRE)(P,T) 3-8'),(2,'BE/2','JD ROCKEFELLER(B)'),(2,'BE/2','THREEPENCE(P) 3-8'),(2,'BE/2','INKA EXPRESS(T)'),(2,'BE/2','LIKELIKELIKELIKEIT(B) 3-8'),(2,'BE/3','TOO ELUSIVE'),(2,'BE/3','CHUCKAMENTAL(T) 2-8'),(2,'BE/3','GOLD CLUB'),(2,'BE/3','SPINNER LANE'),(2,'BE/3','FREDRICKA 2-8'),(2,'BE/3','PENNY PURSUITS'),(2,'BE/3','STELLARTA 2-8'),(2,'BE/4','ADDICTIVE DREAM(IRE)'),(2,'BE/4','BORDERLESCOTT 11-8'),(2,'BE/4','DOC HAY(USA)'),(2,'BE/4','MONSIEUR JOE(IRE)'),(2,'BE/4','SWENDAB(IRE)(V) 5-8'),(2,'BE/4','TIDDLIWINKS 7-8'),(2,'BE/4','VALBCHEK(IRE)(P) 4-8'),(2,'BE/4','ROCKY GROUND(IRE)(H)'),(2,'BE/4','EXCELETTE(IRE) 4-8'),(2,'BE/4','HOYAM 3-8'),(2,'BE/5','DESERT CREEK(IRE)'),(2,'BE/5','PEAK STORM(P)'),(2,'BE/5','MY SINGLE'),(2,'BE/5','RELIGHT MY'),(2,'BE/5','EVERVESCENT(IRE)(B) 4-9'),(2,'BE/5','MAJESTIC DREAM(IRE)'),(2,'BE/5','SARDANAPALUS(P) 4-9'),(2,'BE/5','PILATES(IRE) 3-9'),(2,'BE/5','Sheikh Hamdan'),(2,'BE/5','POLISH WORLD(USA)'),(2,'BE/5','RUNNING REEF(IRE)'),(2,'BE/5','SPACE WAR'),(2,'BE/5','REX ROMANORUM(IRE)'),(2,'BE/5','RICH FOREVER(IRE)(V)'),(2,'BE/5','MUJAADEL(USA)(P) 8-8'),(2,'BE/6','SHADOWTIME 8-9'),(2,'BE/6','SILVERWARE(USA) 5-9'),(2,'BE/6','NIGHTSTER(IRE) 3-9'),(2,'BE/6','Sheikh Hamdan'),(2,'BE/6','KING OF'),(2,'BE/6','TY GWR(H)'),(2,'BE/6','MY GUARDIAN'),(2,'BE/6','SUMMER DANCER(IRE)'),(2,'BE/6','BORDER BANDIT(USA)(P)'),(2,'BE/6','HERNANDO TORRES(P)'),(2,'BE/7','HAYMARKET 4-11'),(2,'BE/7','BARTON BOUNTY'),(2,'BE/7','AL FURAT(USA)(H)'),(2,'BE/7','AY TAY'),(2,'BE/7','ROCKWEILLER(V) 6-10'),(2,'BE/7','POLITBUREAU 6-10'),(2,'BE/7','YOURHOLIDAYISOVER(IRE) 6-10'),(2,'BE/7','VALENTINEâ??S GIFT(H)'),(2,'BE/7','XENOPHON 5-10'),(2,'BE/8','COAX 5-11'),(2,'BE/8','RUB OF'),(2,'BE/8','NEZAMI(IRE) 8-10'),(2,'BE/8','HAIL BOLD'),(2,'BE/8','SINATRAMANIA 6-10'),(2,'BE/8','TAXIFORMISSBYRON 3-10'),(2,'BE/8','WALTER DE'),(2,'BE/8','MARINO PRINCE(FR)'),(2,'BE/8','KHESKIANTO(IRE)(T) 7-10'),(3,'CL/1','Dâ??ARCY INDIANA'),(3,'CL/1','RUNNING WOLF(IRE)'),(3,'CL/1','SCURR MIST(IRE)'),(3,'CL/1','ISLAND KINGDOM(IRE)'),(3,'CL/1','CHRISTMAS WISH'),(3,'CL/1','MESTIZO 2-8'),(3,'CL/1','SUPA U(E,H)'),(3,'CL/2','ROVING BUNNY'),(3,'CL/2','CASPER LEE(IRE)(V)'),(3,'CL/2','PADDYâ??S BAY(B)'),(3,'CL/2','DING DING'),(3,'CL/2','SHERRY FOR'),(3,'CL/2','NOBLE REACH'),(3,'CL/2','IBECKE 2-8'),(3,'CL/2','MORNIN MR'),(3,'CL/2','ROMANTIC BLISS(IRE)'),(3,'CL/2','SUNI DANCER'),(3,'CL/3','MIMBLEBERRY(P) 2-9'),(3,'CL/3','ANGEL ROSA'),(3,'CL/3','EMERAHLDZ(IRE) 2-9'),(3,'CL/3','BAJAN REBEL'),(3,'CL/3','Julian Rooney'),(3,'CL/3','SECRET OCEAN(IRE)(B)'),(3,'CL/3','MISTER UNO(IRE)(P)'),(3,'CL/3','LEADERENE 2-8'),(3,'CL/3','ROCKIE ROAD(IRE)'),(3,'CL/3','MAIDANA(IRE) 2-8'),(3,'CL/4','TALENT SCOUT(IRE)'),(3,'CL/4','DUBAI DYNAMO'),(3,'CL/4','SKYTRAIN 3-9'),(3,'CL/4','AL FREEJ(IRE)'),(3,'CL/4','DAY OF'),(3,'CL/4','GREEN PARK(IRE)(B)'),(3,'CL/4','CHISWICK BEY(IRE)(P)'),(3,'CL/5','ROKER PARK(IRE)(V)'),(3,'CL/5','SILKELLY(T) 3-9'),(3,'CL/5','JUST THE'),(3,'CL/5','LOTHAIR(IRE) 4-9'),(3,'CL/5','BEAU AMADEUS(IRE)(B)'),(3,'CL/5','DARK OPAL(IRE)'),(3,'CL/5','SALVATORE FURY(IRE)(P)'),(3,'CL/5','PERFECT PASTURE(V)'),(3,'CL/5','RUST(IRE) 3-8'),(3,'CL/5','SEE CLEARLY(B)'),(3,'CL/6','EASY TERMS'),(3,'CL/6','KIWAYU(P) 4-9'),(3,'CL/6','OPEN EAGLE(IRE)'),(3,'CL/6','RIOâ??S ROSANNA(IRE)'),(3,'CL/6','LAST SHADOW(T)'),(3,'CL/6','HUNTING GROUND(USA)'),(3,'CL/6','Sheikh Hamdan'),(3,'CL/6','ENTIHAA 5-9'),(3,'CL/6','TAPIS LIBRE'),(3,'CL/6','NOW MY'),(3,'CL/7','TECTONIC(IRE)(P) 4-9'),(3,'CL/7','DAY OF'),(3,'CL/7','ABSENT AMY(IRE)'),(3,'CL/7','Iâ??M SUPER'),(3,'CL/7','JUDICIOUS 6-9'),(3,'CL/7','FRASERBURGH(IRE) 3-9'),(3,'CL/7','Sheikh Hamdan'),(3,'CL/7','BUSTER BROWN(IRE)'),(3,'CL/7','INDIAN GIVER'),(3,'CL/7','LANDAHO 4-8'),(3,'CL/7','SIXTIES QUEEN'),(4,'LI/1','BAYTOWN KESTREL'),(4,'LI/1','ICE SLICE(IRE)'),(4,'LI/1','TRINITY RIVER'),(4,'LI/1','Mâ??SELLE(IRE) 2-9'),(4,'LI/1','WEISSE SOCKEN(IRE)(B)'),(4,'LI/1','FINE ART'),(4,'LI/1','BASIL BERRY'),(4,'LI/1','ORLANDO STAR(CAN)'),(4,'LI/1','LADY IN'),(4,'LI/1','SKINNY LOVE'),(4,'LI/2','CHARMING(IRE)(B) 4-9'),(4,'LI/2','IRISH BOY(IRE)(P,T)'),(4,'LI/2','GREEN MILLIONAIRE(P)'),(4,'LI/2','WELEASE BWIAN(IRE)'),(4,'LI/2','JOHNNY SPLASH(IRE)(V)'),(4,'LI/2','MOSSGO(IRE)(T) 3-9'),(4,'LI/2','PHAROH JAKE'),(4,'LI/2','OUTBID 3-9'),(4,'LI/2','MULTITASK 3-9'),(4,'LI/2','DIAMOND VINE(IRE)(V)'),(4,'LI/3','ALEX VINO(IRE)'),(4,'LI/3','ALPINE RETREAT(USA)'),(4,'LI/3','CAPE CASTER(IRE)'),(4,'LI/3','DURSEY ISLAND(USA)'),(4,'LI/3','GIMME FIVE'),(4,'LI/3','IANâ??S MEMORY(USA)'),(4,'LI/3','MONTALY 2-9'),(4,'LI/3','ONE MAN'),(4,'LI/3','PALACE DRAGON(IRE)'),(4,'LI/3','SON OF'),(4,'LI/4','SUMMER DREAM(IRE)(B)'),(4,'LI/4','CANADIAN RUN(IRE)(H)'),(4,'LI/4','MR FITZROY(IRE)'),(4,'LI/4','AINT GOT'),(4,'LI/4','ABSOLUTELY RIGHT(IRE)'),(4,'LI/4','TILSTARR(IRE) 3-9'),(4,'LI/4','MANDYâ??S BOY(IRE)(P)'),(4,'LI/4','CANDY KITTEN'),(4,'LI/4','KEEP THE'),(4,'LI/4','MAGICAL ROSE(IRE)(P)'),(4,'LI/4','BURSLEDON(IRE)(V) 3-8'),(4,'LI/4','OLYMPIC JULE'),(4,'LI/5','BIG WHISKEY(IRE)'),(4,'LI/5','RAINBOW BEAUTY(P)'),(4,'LI/5','CANON LAW(IRE)'),(4,'LI/5','LAURA SECORD(CAN)'),(4,'LI/5','NOT RIGG(USA)(H,T)'),(4,'LI/5','POOR DUKE(IRE)(P)'),(4,'LI/5','FUNKY COLD'),(4,'LI/5','WELSH SUNRISE'),(4,'LI/5','ECHO BRAVA(H)'),(4,'LI/5','MOSMAN 3-8'),(4,'LI/5','AMULET 3-8'),(4,'LI/5','LANDAU(IRE) 3-8'),(4,'LI/6','GINGER FIZZ(H)'),(4,'LI/6','PROUD TIMES(USA)(P)'),(4,'LI/6','NORFOLK SKY'),(4,'LI/6','SINBAD THE'),(4,'LI/6','MISTER CARTER(IRE)(T,V)'),(4,'LI/6','DR FINLEY(IRE)(V)'),(4,'LI/6','STEELY 5-9'),(4,'LI/6','DIVEA 4-9'),(4,'LI/6','JOE THE'),(4,'LI/6','PONTE DI'),(4,'LI/6','MAN FROM'),(4,'LI/6','NOVEL DANCER(T)'),(4,'LI/6','GLOBAL RECOVERY(IRE)'),(4,'LI/6','LUCKSTER 3-8'),(4,'LI/7','SANTADELACRUZE(B) 4-9'),(4,'LI/7','MOHAIR(H) 4-9'),(4,'LI/7','ANGINOLA(IRE) 4-9'),(4,'LI/7','CANE CAT(IRE)(T)'),(4,'LI/7','CATCHANOVA(IRE)(P) 6-9'),(4,'LI/7','WHOâ??S THAT'),(4,'LI/7','ARCHELAO(IRE)(T) 5-9'),(4,'LI/7','SALIENT 9-9'),(4,'LI/7','SOLVANNA 3-9'),(4,'LI/7','BAJAN STORY(P)'),(4,'LI/7','KEENE 3-9'),(4,'LI/7','CHERRY TIGER'),(4,'LI/7','LADY LUNCHALOT(USA)(P)'),(4,'LI/7','EL LIBERTADOR(USA)(H)'),(4,'LI/8','ASIAN PRINCE(IRE)(T)'),(4,'LI/8','SPRING TONIC'),(4,'LI/8','ZAMINATE 4-9'),(4,'LI/8','DALGIG 3-9'),(4,'LI/8','HAWKER 3-9'),(4,'LI/8','MARKTTAG 3-9'),(4,'LI/8','MAWJ TAMY(USA)'),(4,'LI/8','MUSADDAS 3-9'),(4,'LI/8','SQUIRE OSBALDESTON(IRE)3-9'),(5,'NA/1','NESTON GRACE'),(5,'NA/1','TOP TOTTI'),(5,'NA/1','DIDDYPURPTOON 7-10'),(5,'NA/1','PAGHAM BELLE(T) 5-10'),(5,'NA/1','PANDORICA 5-10'),(5,'NA/1','PRESENTING ME(IRE)'),(5,'NA/1','SEA ISLAND'),(5,'NA/2','DE FAOITHESDREAM(IRE)'),(5,'NA/2','MR WATSON(IRE)(H) 6-11'),(5,'NA/2','TINY TENOR(IRE)'),(5,'NA/2','IF I'),(5,'NA/3','KOULTAS KING(IRE)(T)'),(5,'NA/3','ANGLES HILL(IRE)'),(5,'NA/3','COTTAGE ACRE(IRE) 10-10'),(5,'NA/3','IBIZA SUNSET(IRE)(T)'),(5,'NA/3','QUADRATO(GER)(T) 6-10'),(5,'NA/4','QULINTON(FR)(B,T) 9-11'),(5,'NA/4','CAPTAIN KELLY(IRE)(T)'),(5,'NA/4','LIFE OF A'),(5,'NA/4','LEADER(IRE) 9-11 7'),(5,'NA/4','INSIDE DEALER(IRE)(P,T) 9-11'),(5,'NA/4','STRUMBLE HEAD(IRE)(V)'),(5,'NA/4','WESTERN KING(IRE)(P,T) 6-10'),(5,'NA/4','LORD LESCRIBAA(FR)(P,T)'),(5,'NA/5','CASH INJECTION(T)'),(5,'NA/5','DANEHILL DANTE(IRE) 5-11'),(5,'NA/5','SUPERNOVERRE(IRE)(P) 7-11'),(5,'NA/5','ARGAUM(IRE)(T,V) 6-11'),(5,'NA/5','NOVIKOV(B,T) 9-11'),(5,'NA/5','CHANKILLO 4-11'),(5,'NA/5','NO WOMAN'),(5,'NA/5','BAZART(P,T) 11-11'),(5,'NA/5','WICKLEWOOD 7-11'),(5,'NA/5','NO NO CARDINAL(IRE)(H)'),(5,'NA/5','HOLDEN CAULFIELD(IRE) 8-11'),(5,'NA/5','PINDAR(GER)(P) 9-10'),(5,'NA/5','LOMBOK(V) 7-10'),(5,'NA/5','NOTHING PERSONAL(H,T)'),(5,'NA/5','COOL FANTASY(IRE)(P) 4-10'),(5,'NA/6','MAGICAL TREASURE(B,T) 9-11'),(5,'NA/6','SADLERâ??S STAR(GER)(P)'),(5,'NA/6','ROC DE'),(5,'NA/6','NOTHINGBUTTHETRUTH(IRE)(P,T) 9-11'),(5,'NA/6','RUSTY NAIL(IRE)'),(5,'NA/6','10-10 0 Joshua'),(5,'NA/7','THE TRACEY'),(5,'NA/7','BUCKHORN TOM'),(5,'NA/7','LISTEN AND LEARN(IRE)(P)'),(5,'NA/7','PRIME LOCATION(P,T)'),(5,'NA/7','TONY DINOZZO(FR)(P) 6-11'),(5,'NA/7','7-10 11 N'),(5,'NA/7','MARIE DEJA'),(5,'NA/7','LANDENSTOWN STAR(IRE)(T) 8-10'),(5,'NA/7','EXILES RETURN(IRE)');
UNLOCK TABLES;
/*!40000 ALTER TABLE `horse` ENABLE KEYS */;

--
-- Table structure for table `horses_of_chit`
--

DROP TABLE IF EXISTS `horses_of_chit`;
CREATE TABLE `horses_of_chit` (
  `item_ID` int(11) NOT NULL default '0',
  `Chit_ID` varchar(100) NOT NULL default '',
  `Horse_Name` varchar(100) NOT NULL default '',
  `Pora` varchar(100) NOT NULL default ''
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Dumping data for table `horses_of_chit`
--


/*!40000 ALTER TABLE `horses_of_chit` DISABLE KEYS */;
LOCK TABLES `horses_of_chit` WRITE;
INSERT INTO `horses_of_chit` VALUES (1,'1','GO PADDY','null'),(2,'1','HERECOMESTHEWOLF(IRE)(P)3-10 5','null'),(3,'1','Exors of','null'),(4,'1','DON FRANCO(IRE)','null'),(5,'1','GO PADDY','null');
UNLOCK TABLES;
/*!40000 ALTER TABLE `horses_of_chit` ENABLE KEYS */;

--
-- Table structure for table `packet`
--

DROP TABLE IF EXISTS `packet`;
CREATE TABLE `packet` (
  `ID` int(11) NOT NULL auto_increment,
  `Packet_NO` varchar(100) NOT NULL default '',
  `Date` varchar(100) NOT NULL default '',
  PRIMARY KEY  (`ID`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Dumping data for table `packet`
--


/*!40000 ALTER TABLE `packet` DISABLE KEYS */;
LOCK TABLES `packet` WRITE;
UNLOCK TABLES;
/*!40000 ALTER TABLE `packet` ENABLE KEYS */;

--
-- Table structure for table `pora`
--

DROP TABLE IF EXISTS `pora`;
CREATE TABLE `pora` (
  `c_id` int(11) NOT NULL default '0',
  `pora` varchar(100) NOT NULL default ''
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Dumping data for table `pora`
--


/*!40000 ALTER TABLE `pora` DISABLE KEYS */;
LOCK TABLES `pora` WRITE;
INSERT INTO `pora` VALUES (1,'BA/1'),(1,'BA/2'),(1,'BA/3'),(1,'BA/4'),(1,'BA/5'),(1,'BA/6'),(1,'BA/7'),(1,'BA/8'),(2,'BE/1'),(2,'BE/2'),(2,'BE/3'),(2,'BE/4'),(2,'BE/5'),(2,'BE/6'),(2,'BE/7'),(2,'BE/8'),(3,'CL/1'),(3,'CL/2'),(3,'CL/3'),(3,'CL/4'),(3,'CL/5'),(3,'CL/6'),(3,'CL/7'),(4,'LI/1'),(4,'LI/2'),(4,'LI/3'),(4,'LI/4'),(4,'LI/5'),(4,'LI/6'),(4,'LI/7'),(4,'LI/8'),(5,'NA/1'),(5,'NA/2'),(5,'NA/3'),(5,'NA/4'),(5,'NA/5'),(5,'NA/6'),(5,'NA/7');
UNLOCK TABLES;
/*!40000 ALTER TABLE `pora` ENABLE KEYS */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;

