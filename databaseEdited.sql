USE [master]
GO

/****** Object:  Database [QLyDatXe]    Script Date: 6/14/2021 12:50:32 PM ******/
CREATE DATABASE [QLyDatXe]
 CONTAINMENT = NONE
 ON  PRIMARY 
( NAME = N'QLyDatXe', FILENAME = N'C:\Program Files\Microsoft SQL Server\MSSQL15.SQLEXPRESS\MSSQL\DATA\QLyDatXe.mdf' , SIZE = 8192KB , MAXSIZE = UNLIMITED, FILEGROWTH = 65536KB )
 LOG ON 
( NAME = N'QLyDatXe_log', FILENAME = N'C:\Program Files\Microsoft SQL Server\MSSQL15.SQLEXPRESS\MSSQL\DATA\QLyDatXe_log.ldf' , SIZE = 8192KB , MAXSIZE = 2048GB , FILEGROWTH = 65536KB )
 WITH CATALOG_COLLATION = DATABASE_DEFAULT
GO

IF (1 = FULLTEXTSERVICEPROPERTY('IsFullTextInstalled'))
begin
EXEC [QLyDatXe].[dbo].[sp_fulltext_database] @action = 'enable'
end
GO

ALTER DATABASE [QLyDatXe] SET ANSI_NULL_DEFAULT OFF 
GO

ALTER DATABASE [QLyDatXe] SET ANSI_NULLS OFF 
GO

ALTER DATABASE [QLyDatXe] SET ANSI_PADDING OFF 
GO

ALTER DATABASE [QLyDatXe] SET ANSI_WARNINGS OFF 
GO

ALTER DATABASE [QLyDatXe] SET ARITHABORT OFF 
GO

ALTER DATABASE [QLyDatXe] SET AUTO_CLOSE ON 
GO

ALTER DATABASE [QLyDatXe] SET AUTO_SHRINK OFF 
GO

ALTER DATABASE [QLyDatXe] SET AUTO_UPDATE_STATISTICS ON 
GO

ALTER DATABASE [QLyDatXe] SET CURSOR_CLOSE_ON_COMMIT OFF 
GO

ALTER DATABASE [QLyDatXe] SET CURSOR_DEFAULT  GLOBAL 
GO

ALTER DATABASE [QLyDatXe] SET CONCAT_NULL_YIELDS_NULL OFF 
GO

ALTER DATABASE [QLyDatXe] SET NUMERIC_ROUNDABORT OFF 
GO

ALTER DATABASE [QLyDatXe] SET QUOTED_IDENTIFIER OFF 
GO

ALTER DATABASE [QLyDatXe] SET RECURSIVE_TRIGGERS OFF 
GO

ALTER DATABASE [QLyDatXe] SET  ENABLE_BROKER 
GO

ALTER DATABASE [QLyDatXe] SET AUTO_UPDATE_STATISTICS_ASYNC OFF 
GO

ALTER DATABASE [QLyDatXe] SET DATE_CORRELATION_OPTIMIZATION OFF 
GO

ALTER DATABASE [QLyDatXe] SET TRUSTWORTHY OFF 
GO

ALTER DATABASE [QLyDatXe] SET ALLOW_SNAPSHOT_ISOLATION OFF 
GO

ALTER DATABASE [QLyDatXe] SET PARAMETERIZATION SIMPLE 
GO

ALTER DATABASE [QLyDatXe] SET READ_COMMITTED_SNAPSHOT OFF 
GO

ALTER DATABASE [QLyDatXe] SET HONOR_BROKER_PRIORITY OFF 
GO

ALTER DATABASE [QLyDatXe] SET RECOVERY SIMPLE 
GO

ALTER DATABASE [QLyDatXe] SET  MULTI_USER 
GO

ALTER DATABASE [QLyDatXe] SET PAGE_VERIFY CHECKSUM  
GO

ALTER DATABASE [QLyDatXe] SET DB_CHAINING OFF 
GO

ALTER DATABASE [QLyDatXe] SET FILESTREAM( NON_TRANSACTED_ACCESS = OFF ) 
GO

ALTER DATABASE [QLyDatXe] SET TARGET_RECOVERY_TIME = 60 SECONDS 
GO

ALTER DATABASE [QLyDatXe] SET DELAYED_DURABILITY = DISABLED 
GO

ALTER DATABASE [QLyDatXe] SET ACCELERATED_DATABASE_RECOVERY = OFF  
GO

ALTER DATABASE [QLyDatXe] SET QUERY_STORE = OFF
GO

ALTER DATABASE [QLyDatXe] SET  READ_WRITE 
GO

