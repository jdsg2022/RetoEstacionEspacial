-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 18-06-2022 a las 15:22:18
-- Versión del servidor: 10.4.24-MariaDB
-- Versión de PHP: 8.1.6

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `estacionespacial`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `naveespacial`
--

CREATE TABLE `naveespacial` (
  `ID` int(11) NOT NULL,
  `NOMBRE` varchar(200) NOT NULL,
  `PESO` float NOT NULL,
  `CONBUSTIBLE` float NOT NULL,
  `POTENCIA` float NOT NULL,
  `TIPO_NAVE` varchar(200) NOT NULL,
  `TIPO_CARGA` varchar(200) DEFAULT NULL,
  `CANTIDAD_TRIPULANTES` int(11) DEFAULT NULL,
  `NRO_MOTORES` int(11) DEFAULT NULL,
  `TIPO_PROPULSION` varchar(200) DEFAULT NULL,
  `LINEA_COMBUSTIBLE` varchar(200) DEFAULT NULL,
  `TIPO_CATALIZADOR` varchar(200) DEFAULT NULL,
  `TIPO_MOTOR` varchar(200) DEFAULT NULL,
  `TIPO_COHETE_QUIMICO` varchar(200) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `naveespacial`
--

INSERT INTO `naveespacial` (`ID`, `NOMBRE`, `PESO`, `CONBUSTIBLE`, `POTENCIA`, `TIPO_NAVE`, `TIPO_CARGA`, `CANTIDAD_TRIPULANTES`, `NRO_MOTORES`, `TIPO_PROPULSION`, `LINEA_COMBUSTIBLE`, `TIPO_CATALIZADOR`, `TIPO_MOTOR`, `TIPO_COHETE_QUIMICO`) VALUES
(1, 'lanzadora1', 120, 4590, 1234, 'Lanzadora', 'Carros', 50, 5, NULL, NULL, NULL, NULL, NULL),
(14, 'Lanza1', 45, 12, 50, 'Lanzadora', 'Satelite', 23, 5, NULL, NULL, NULL, NULL, NULL),
(15, 'Bot1', 1, 1, 50, 'Lanzadora', 'ww', 1, 1, NULL, NULL, NULL, NULL, NULL),
(16, 'Bot2', 1, 1, 10, 'Lanzadora', 'ww', 1, 1, NULL, NULL, NULL, NULL, NULL),
(17, 'Bot3', 1, 1, 30, 'Lanzadora', 'ww', 1, 1, NULL, NULL, NULL, NULL, NULL),
(18, 'Robot1', 34, 23, 56, 'Robotica', NULL, NULL, NULL, 'Iones', 'Piones', 'Compuesto', NULL, NULL),
(19, 'Tripulante1', 45, 44, 67, 'Tripulada', NULL, NULL, NULL, NULL, NULL, NULL, '5', 'Propulsado'),
(20, 'Monin', 23, 54, 34, 'Lanzadora', 'dfgdfv', 5, 4, NULL, NULL, NULL, NULL, NULL),
(33, 'Lanza3', 4578, 2344, 12384, 'Lanzadora', 'Pesada', 20, 5, NULL, NULL, NULL, NULL, NULL);

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `naveespacial`
--
ALTER TABLE `naveespacial`
  ADD PRIMARY KEY (`ID`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `naveespacial`
--
ALTER TABLE `naveespacial`
  MODIFY `ID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=34;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
