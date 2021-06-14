/****** Object:  Database [QLyDatXe4]    Script Date: 6/14/2021 5:33:02 PM ******/
CREATE DATABASE [QLyDatXe]
GO
USE [QLyDatXe]
GO
/****** Object:  Table [dbo].[Account]    Script Date: 6/14/2021 5:33:02 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Account](
	[Account] [varchar](50) NOT NULL,
	[Password] [varchar](50) NOT NULL,
	[Kind] [nvarchar](50) NOT NULL,
 CONSTRAINT [PK_Account] PRIMARY KEY CLUSTERED 
(
	[Account] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[Car]    Script Date: 6/14/2021 5:33:02 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Car](
	[Car_License_Plates] [varchar](50) NOT NULL,
	[Car_Seat_Amount] [int] NOT NULL,
	[Gar_Name] [nvarchar](50) NOT NULL,
 CONSTRAINT [PK_Car] PRIMARY KEY CLUSTERED 
(
	[Car_License_Plates] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[Driver]    Script Date: 6/14/2021 5:33:02 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Driver](
	[Driver_CMND] [varchar](50) NOT NULL,
	[Driver_License] [varchar](50) NOT NULL,
 CONSTRAINT [PK_Driver] PRIMARY KEY CLUSTERED 
(
	[Driver_CMND] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[Gara]    Script Date: 6/14/2021 5:33:02 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Gara](
	[Gara_Name] [nvarchar](50) NOT NULL,
	[Gara_Picture] [ntext] NULL,
	[Gara_Review] [nvarchar](50) NULL,
	[Bus_Res_number] [nvarchar](50) NULL,
	[Active] [bit] NULL,
	[Account] [varchar](50) NULL,
 CONSTRAINT [PK_Gara] PRIMARY KEY CLUSTERED 
(
	[Gara_Name] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY] TEXTIMAGE_ON [PRIMARY]
GO
/****** Object:  Table [dbo].[Manage_Passenger_Care]    Script Date: 6/14/2021 5:33:02 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Manage_Passenger_Care](
	[Staff_CMND] [varchar](50) NOT NULL,
	[Passenger_SDT] [varchar](50) NOT NULL,
	[Passenger_Care_Time] [datetime] NOT NULL,
 CONSTRAINT [PK_Manage_Passenger_Care] PRIMARY KEY CLUSTERED 
(
	[Staff_CMND] ASC,
	[Passenger_SDT] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[ManageDrive]    Script Date: 6/14/2021 5:33:02 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[ManageDrive](
	[Drive_CMND] [varchar](50) NOT NULL,
	[Trip_No] [varchar](50) NOT NULL,
	[Car_License_Plates] [varchar](50) NOT NULL,
	[Drive_Date] [date] NOT NULL,
	[Drive_Hour] [time](7) NOT NULL,
 CONSTRAINT [PK_ManageDrive] PRIMARY KEY CLUSTERED 
(
	[Drive_CMND] ASC,
	[Trip_No] ASC,
	[Car_License_Plates] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[ManageReview]    Script Date: 6/14/2021 5:33:02 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[ManageReview](
	[Passenger_SDT] [varchar](50) NOT NULL,
	[Trip_No] [varchar](50) NOT NULL,
	[Staff_Attitude] [int] NOT NULL,
	[Service_Quality] [int] NOT NULL,
	[Safe] [int] NOT NULL,
	[Information] [int] NOT NULL,
	[Convenient] [int] NOT NULL,
	[Comment] [ntext] NULL,
	[Review_Time] [datetime] NOT NULL,
 CONSTRAINT [PK_ManageReview] PRIMARY KEY CLUSTERED 
(
	[Passenger_SDT] ASC,
	[Trip_No] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY] TEXTIMAGE_ON [PRIMARY]
GO
/****** Object:  Table [dbo].[Passenger]    Script Date: 6/14/2021 5:33:02 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Passenger](
	[Passenger_SDT] [varchar](50) NOT NULL,
	[Passenger_First_Name] [nvarchar](50) NOT NULL,
	[Passenger_Last_Name] [nvarchar](50) NOT NULL,
	[Passenger_Email] [varbinary](50) NULL,
	[Account] [varchar](50) NULL,
 CONSTRAINT [PK_Passenger] PRIMARY KEY CLUSTERED 
(
	[Passenger_SDT] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[Passenger_Care]    Script Date: 6/14/2021 5:33:02 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Passenger_Care](
	[Staff_CMND] [varchar](50) NOT NULL,
 CONSTRAINT [PK_Passenger_Care] PRIMARY KEY CLUSTERED 
(
	[Staff_CMND] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[ScheduleOfGara]    Script Date: 6/14/2021 5:33:02 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[ScheduleOfGara](
	[TripOfGara_no] [nchar](10) NOT NULL,
	[Gara_Name] [nvarchar](50) NOT NULL,
	[Schedule_no] [nchar](10) NOT NULL,
	[DayInWeek] [int] NOT NULL,
	[DepartTime] [time](7) NOT NULL,
	[TicketPrice] [money] NOT NULL,
	[AdminChecked] [bit] NULL,
 CONSTRAINT [PK_ScheduelOfGara] PRIMARY KEY CLUSTERED 
(
	[TripOfGara_no] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[Staff]    Script Date: 6/14/2021 5:33:02 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Staff](
	[Staff_CMND] [varchar](50) NOT NULL,
	[Staff_First_Name] [nvarchar](50) NOT NULL,
	[Staff_Last_Name] [nvarchar](50) NOT NULL,
	[Staff_SDT] [varchar](50) NOT NULL,
	[Staff_Gender] [nvarchar](50) NULL,
	[Staff_Account] [varchar](50) NULL,
	[Active] [bit] NULL,
 CONSTRAINT [PK_Staff] PRIMARY KEY CLUSTERED 
(
	[Staff_CMND] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[Station]    Script Date: 6/14/2021 5:33:02 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Station](
	[station_No] [nchar](10) NOT NULL,
	[station_Name] [nchar](30) NOT NULL,
 CONSTRAINT [PK_Station] PRIMARY KEY CLUSTERED 
(
	[station_No] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[Ticket]    Script Date: 6/14/2021 5:33:02 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Ticket](
	[Ticket_No] [varchar](50) NOT NULL,
	[Seat_Position] [int] NOT NULL,
	[Seat_Kind] [nvarchar](50) NOT NULL,
	[Is_Paid] [bit] NOT NULL,
	[Passenger_Note] [ntext] NULL,
	[Book_Time] [smalldatetime] NOT NULL,
	[Staff_CMND] [varchar](50) NULL,
	[Passenger_SDT] [varchar](50) NOT NULL,
	[Trip_No] [varchar](50) NOT NULL,
 CONSTRAINT [PK_Ticket] PRIMARY KEY CLUSTERED 
(
	[Ticket_No] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY] TEXTIMAGE_ON [PRIMARY]
GO
/****** Object:  Table [dbo].[TotalScheduels]    Script Date: 6/14/2021 5:33:02 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[TotalScheduels](
	[SChedule_no] [nchar](10) NOT NULL,
	[BeginStation] [nchar](10) NOT NULL,
	[EndStation] [nchar](10) NOT NULL,
 CONSTRAINT [PK_TotalScheduels] PRIMARY KEY CLUSTERED 
(
	[SChedule_no] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[Trip]    Script Date: 6/14/2021 5:33:02 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Trip](
	[Trip_No] [varchar](50) NOT NULL,
	[TripOfGara_no] [nchar](10) NOT NULL,
 CONSTRAINT [PK_Trip] PRIMARY KEY CLUSTERED 
(
	[Trip_No] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
INSERT [dbo].[Account] ([Account], [Password], [Kind]) VALUES (N'AnhPham', N'006', N'driver')
INSERT [dbo].[Account] ([Account], [Password], [Kind]) VALUES (N'chi', N'chi123', N'gara')
INSERT [dbo].[Account] ([Account], [Password], [Kind]) VALUES (N'ChungNguyen', N'024', N'staff')
INSERT [dbo].[Account] ([Account], [Password], [Kind]) VALUES (N'HuyNguyen', N'081', N'staff')
INSERT [dbo].[Account] ([Account], [Password], [Kind]) VALUES (N'NamNguyen', N'129', N'staff')
INSERT [dbo].[Account] ([Account], [Password], [Kind]) VALUES (N'sangdeptrai', N'33', N'boss')
INSERT [dbo].[Account] ([Account], [Password], [Kind]) VALUES (N'SangHuynh', N'171', N'boss')
GO
INSERT [dbo].[Car] ([Car_License_Plates], [Car_Seat_Amount], [Gar_Name]) VALUES (N'48A25896', 45, N'Thư Kỳ')
INSERT [dbo].[Car] ([Car_License_Plates], [Car_Seat_Amount], [Gar_Name]) VALUES (N'50F69853', 45, N'Thư Kỳ')
INSERT [dbo].[Car] ([Car_License_Plates], [Car_Seat_Amount], [Gar_Name]) VALUES (N'51F12345', 29, N'Phương Trang')
INSERT [dbo].[Car] ([Car_License_Plates], [Car_Seat_Amount], [Gar_Name]) VALUES (N'51F26589', 45, N'Hoàng Long')
INSERT [dbo].[Car] ([Car_License_Plates], [Car_Seat_Amount], [Gar_Name]) VALUES (N'51H69857', 45, N'Mai Linh')
INSERT [dbo].[Car] ([Car_License_Plates], [Car_Seat_Amount], [Gar_Name]) VALUES (N'52F52463', 45, N'Phương Trang')
INSERT [dbo].[Car] ([Car_License_Plates], [Car_Seat_Amount], [Gar_Name]) VALUES (N'53G12543', 45, N'Phương Trang')
INSERT [dbo].[Car] ([Car_License_Plates], [Car_Seat_Amount], [Gar_Name]) VALUES (N'59G31653', 45, N'Hoàng Long')
GO
INSERT [dbo].[Driver] ([Driver_CMND], [Driver_License]) VALUES (N'245371111', N'111111111111')
INSERT [dbo].[Driver] ([Driver_CMND], [Driver_License]) VALUES (N'245372222', N'222222222222')
INSERT [dbo].[Driver] ([Driver_CMND], [Driver_License]) VALUES (N'245376263', N'123456789123')
GO
INSERT [dbo].[Gara] ([Gara_Name], [Gara_Picture], [Gara_Review], [Bus_Res_number], [Active], [Account]) VALUES (N'Hoàng Long', N'hhh', N'giá cả ổn định, chất lượng cao', N'2243421', 1, NULL)
INSERT [dbo].[Gara] ([Gara_Name], [Gara_Picture], [Gara_Review], [Bus_Res_number], [Active], [Account]) VALUES (N'Long', N'43434', N'chất lượng tốt', N'2356567', 1, NULL)
INSERT [dbo].[Gara] ([Gara_Name], [Gara_Picture], [Gara_Review], [Bus_Res_number], [Active], [Account]) VALUES (N'Mai Linh', N'mmm', N'chất lượng cao', N'785494', 1, NULL)
INSERT [dbo].[Gara] ([Gara_Name], [Gara_Picture], [Gara_Review], [Bus_Res_number], [Active], [Account]) VALUES (N'Phương Mỹ', N'34e70695e3561b084247.jpg', N'tạm ổn', N'348349834', 0, NULL)
INSERT [dbo].[Gara] ([Gara_Name], [Gara_Picture], [Gara_Review], [Bus_Res_number], [Active], [Account]) VALUES (N'Phương Mỹ Chi', N'0a0e4a84055ef800a14f.jpg', N'Tạm ổn', N'37437583', 1, N'chi')
INSERT [dbo].[Gara] ([Gara_Name], [Gara_Picture], [Gara_Review], [Bus_Res_number], [Active], [Account]) VALUES (N'Phương Trang', N'ppp', N'nhà xe lớn, chất lượng cao', N'176438445', 1, NULL)
INSERT [dbo].[Gara] ([Gara_Name], [Gara_Picture], [Gara_Review], [Bus_Res_number], [Active], [Account]) VALUES (N'Thư Kỳ', N'ttt', N'nhà xe VIP', N'98374834', 1, NULL)
GO
INSERT [dbo].[Manage_Passenger_Care] ([Staff_CMND], [Passenger_SDT], [Passenger_Care_Time]) VALUES (N'245373333', N'0123456789', CAST(N'2021-06-13T16:00:00.000' AS DateTime))
INSERT [dbo].[Manage_Passenger_Care] ([Staff_CMND], [Passenger_SDT], [Passenger_Care_Time]) VALUES (N'245376263', N'0987654321', CAST(N'2021-06-13T10:00:00.000' AS DateTime))
GO
INSERT [dbo].[ManageDrive] ([Drive_CMND], [Trip_No], [Car_License_Plates], [Drive_Date], [Drive_Hour]) VALUES (N'245371111', N'0003', N'51F12345', CAST(N'2021-06-12' AS Date), CAST(N'18:00:00' AS Time))
INSERT [dbo].[ManageDrive] ([Drive_CMND], [Trip_No], [Car_License_Plates], [Drive_Date], [Drive_Hour]) VALUES (N'245371111', N'0004', N'51F12345', CAST(N'2021-05-12' AS Date), CAST(N'05:00:00' AS Time))
INSERT [dbo].[ManageDrive] ([Drive_CMND], [Trip_No], [Car_License_Plates], [Drive_Date], [Drive_Hour]) VALUES (N'245371111', N'0005', N'51F12345', CAST(N'2021-04-30' AS Date), CAST(N'04:00:00' AS Time))
INSERT [dbo].[ManageDrive] ([Drive_CMND], [Trip_No], [Car_License_Plates], [Drive_Date], [Drive_Hour]) VALUES (N'245376263', N'0001', N'48A25896', CAST(N'2021-06-10' AS Date), CAST(N'07:30:00' AS Time))
INSERT [dbo].[ManageDrive] ([Drive_CMND], [Trip_No], [Car_License_Plates], [Drive_Date], [Drive_Hour]) VALUES (N'245376263', N'0002', N'50F69853', CAST(N'2021-06-12' AS Date), CAST(N'12:00:00' AS Time))
GO
INSERT [dbo].[ManageReview] ([Passenger_SDT], [Trip_No], [Staff_Attitude], [Service_Quality], [Safe], [Information], [Convenient], [Comment], [Review_Time]) VALUES (N'0123456789', N'0001', 1, 1, 1, 1, 1, NULL, CAST(N'2021-06-12T00:00:00.000' AS DateTime))
INSERT [dbo].[ManageReview] ([Passenger_SDT], [Trip_No], [Staff_Attitude], [Service_Quality], [Safe], [Information], [Convenient], [Comment], [Review_Time]) VALUES (N'0987654321', N'0002', 2, 2, 2, 2, 2, NULL, CAST(N'2021-06-13T00:00:00.000' AS DateTime))
GO
INSERT [dbo].[Passenger] ([Passenger_SDT], [Passenger_First_Name], [Passenger_Last_Name], [Passenger_Email], [Account]) VALUES (N'0111111111', N'Nguyễn', N'Tú', NULL, NULL)
INSERT [dbo].[Passenger] ([Passenger_SDT], [Passenger_First_Name], [Passenger_Last_Name], [Passenger_Email], [Account]) VALUES (N'0123456789', N'Tuấn', N'Pro', NULL, NULL)
INSERT [dbo].[Passenger] ([Passenger_SDT], [Passenger_First_Name], [Passenger_Last_Name], [Passenger_Email], [Account]) VALUES (N'0933545121', N'Sang', N'Huỳnh ', NULL, NULL)
INSERT [dbo].[Passenger] ([Passenger_SDT], [Passenger_First_Name], [Passenger_Last_Name], [Passenger_Email], [Account]) VALUES (N'0987654321', N'Phạm', N'Anh', NULL, NULL)
GO
INSERT [dbo].[Passenger_Care] ([Staff_CMND]) VALUES (N'245373333')
INSERT [dbo].[Passenger_Care] ([Staff_CMND]) VALUES (N'245374444')
INSERT [dbo].[Passenger_Care] ([Staff_CMND]) VALUES (N'245376263')
GO
INSERT [dbo].[ScheduleOfGara] ([TripOfGara_no], [Gara_Name], [Schedule_no], [DayInWeek], [DepartTime], [TicketPrice], [AdminChecked]) VALUES (N'HL001     ', N'Hoàng Long', N'210610001 ', 2, CAST(N'08:00:00' AS Time), 500000.0000, 1)
INSERT [dbo].[ScheduleOfGara] ([TripOfGara_no], [Gara_Name], [Schedule_no], [DayInWeek], [DepartTime], [TicketPrice], [AdminChecked]) VALUES (N'HL002     ', N'Hoàng Long', N'210610004 ', 7, CAST(N'06:00:00' AS Time), 200000.0000, 1)
INSERT [dbo].[ScheduleOfGara] ([TripOfGara_no], [Gara_Name], [Schedule_no], [DayInWeek], [DepartTime], [TicketPrice], [AdminChecked]) VALUES (N'L001      ', N'Long', N'210610004 ', 1, CAST(N'05:00:00' AS Time), 100000.0000, 1)
INSERT [dbo].[ScheduleOfGara] ([TripOfGara_no], [Gara_Name], [Schedule_no], [DayInWeek], [DepartTime], [TicketPrice], [AdminChecked]) VALUES (N'PT001     ', N'Phương Trang', N'210610001 ', 2, CAST(N'07:30:00' AS Time), 300000.0000, 1)
INSERT [dbo].[ScheduleOfGara] ([TripOfGara_no], [Gara_Name], [Schedule_no], [DayInWeek], [DepartTime], [TicketPrice], [AdminChecked]) VALUES (N'PT002     ', N'Phương Trang', N'210610001 ', 3, CAST(N'11:00:00' AS Time), 400000.0000, 1)
GO
INSERT [dbo].[Staff] ([Staff_CMND], [Staff_First_Name], [Staff_Last_Name], [Staff_SDT], [Staff_Gender], [Staff_Account], [Active]) VALUES (N'0987654321', N'Châu', N'Duyên', N'123456789', N'Nữ', NULL, 0)
INSERT [dbo].[Staff] ([Staff_CMND], [Staff_First_Name], [Staff_Last_Name], [Staff_SDT], [Staff_Gender], [Staff_Account], [Active]) VALUES (N'123456789', N'Phan', N'Tùng', N'0999999999', N'Nam', NULL, 0)
INSERT [dbo].[Staff] ([Staff_CMND], [Staff_First_Name], [Staff_Last_Name], [Staff_SDT], [Staff_Gender], [Staff_Account], [Active]) VALUES (N'245371111', N'Nguyễn Tá', N'Huy', N'01213004685', N'Nam', N'HuyNguyen', 1)
INSERT [dbo].[Staff] ([Staff_CMND], [Staff_First_Name], [Staff_Last_Name], [Staff_SDT], [Staff_Gender], [Staff_Account], [Active]) VALUES (N'245372222', N'Huỳnh Phước', N'Sang', N'0933545121', N'Nam', N'SangHuynh', 1)
INSERT [dbo].[Staff] ([Staff_CMND], [Staff_First_Name], [Staff_Last_Name], [Staff_SDT], [Staff_Gender], [Staff_Account], [Active]) VALUES (N'245373333', N'Nguyễn Hải', N'Nam', N'0772914013', N'Nam', N'NamNguyen', 1)
INSERT [dbo].[Staff] ([Staff_CMND], [Staff_First_Name], [Staff_Last_Name], [Staff_SDT], [Staff_Gender], [Staff_Account], [Active]) VALUES (N'245374444', N'Nguyễn Văn', N'Chung', N'0369811800', N'Nam', N'ChungNguyen', 1)
INSERT [dbo].[Staff] ([Staff_CMND], [Staff_First_Name], [Staff_Last_Name], [Staff_SDT], [Staff_Gender], [Staff_Account], [Active]) VALUES (N'245376263', N'Phạm Minh Tuấn', N'Anh', N'0368573782', N'Nam', N'AnhPham', 1)
INSERT [dbo].[Staff] ([Staff_CMND], [Staff_First_Name], [Staff_Last_Name], [Staff_SDT], [Staff_Gender], [Staff_Account], [Active]) VALUES (N'62172663232', N'Phan', N'Tài', N'12345654', N'Nam', NULL, 0)
GO
INSERT [dbo].[Station] ([station_No], [station_Name]) VALUES (N'029       ', N'Hà Nội                        ')
INSERT [dbo].[Station] ([station_No], [station_Name]) VALUES (N'043       ', N'Đà Nẵng                       ')
INSERT [dbo].[Station] ([station_No], [station_Name]) VALUES (N'048       ', N'Đăk Nông                      ')
INSERT [dbo].[Station] ([station_No], [station_Name]) VALUES (N'050       ', N'Hồ Chí Minh                   ')
INSERT [dbo].[Station] ([station_No], [station_Name]) VALUES (N'065       ', N'Cần Thơ                       ')
INSERT [dbo].[Station] ([station_No], [station_Name]) VALUES (N'066       ', N'Đồng Tháp                     ')
INSERT [dbo].[Station] ([station_No], [station_Name]) VALUES (N'067       ', N'AnGiang                       ')
INSERT [dbo].[Station] ([station_No], [station_Name]) VALUES (N'068       ', N'KienGiang                     ')
INSERT [dbo].[Station] ([station_No], [station_Name]) VALUES (N'076       ', N'Quảng Ngãi                    ')
GO
INSERT [dbo].[Ticket] ([Ticket_No], [Seat_Position], [Seat_Kind], [Is_Paid], [Passenger_Note], [Book_Time], [Staff_CMND], [Passenger_SDT], [Trip_No]) VALUES (N'0001', 1, N'A', 1, N'ghế đầu', CAST(N'1900-01-01T07:30:00' AS SmallDateTime), N'245376263', N'0987654321', N'0001')
INSERT [dbo].[Ticket] ([Ticket_No], [Seat_Position], [Seat_Kind], [Is_Paid], [Passenger_Note], [Book_Time], [Staff_CMND], [Passenger_SDT], [Trip_No]) VALUES (N'0002', 3, N'B', 1, N'trên', CAST(N'1900-01-01T10:00:00' AS SmallDateTime), N'245371111', N'0111111111', N'0001')
INSERT [dbo].[Ticket] ([Ticket_No], [Seat_Position], [Seat_Kind], [Is_Paid], [Passenger_Note], [Book_Time], [Staff_CMND], [Passenger_SDT], [Trip_No]) VALUES (N'0004', 6, N'loai 1', 1, N'cuối đường', CAST(N'2021-04-10T03:00:00' AS SmallDateTime), N'245372222', N'0933545121', N'0005')
INSERT [dbo].[Ticket] ([Ticket_No], [Seat_Position], [Seat_Kind], [Is_Paid], [Passenger_Note], [Book_Time], [Staff_CMND], [Passenger_SDT], [Trip_No]) VALUES (N'3', 5, N'Loai 2', 1, N'Qua cầu rồi ngừng xe lại', CAST(N'2021-06-21T05:00:00' AS SmallDateTime), N'245372222', N'0933545121', N'0005')
GO
INSERT [dbo].[TotalScheduels] ([SChedule_no], [BeginStation], [EndStation]) VALUES (N'210610001 ', N'050       ', N'048       ')
INSERT [dbo].[TotalScheduels] ([SChedule_no], [BeginStation], [EndStation]) VALUES (N'210610002 ', N'050       ', N'066       ')
INSERT [dbo].[TotalScheduels] ([SChedule_no], [BeginStation], [EndStation]) VALUES (N'210610003 ', N'029       ', N'043       ')
INSERT [dbo].[TotalScheduels] ([SChedule_no], [BeginStation], [EndStation]) VALUES (N'210610004 ', N'067       ', N'068       ')
GO
INSERT [dbo].[Trip] ([Trip_No], [TripOfGara_no]) VALUES (N'0001', N'PT001     ')
INSERT [dbo].[Trip] ([Trip_No], [TripOfGara_no]) VALUES (N'0002', N'HL001     ')
INSERT [dbo].[Trip] ([Trip_No], [TripOfGara_no]) VALUES (N'0003', N'PT001     ')
INSERT [dbo].[Trip] ([Trip_No], [TripOfGara_no]) VALUES (N'0004', N'HL002     ')
INSERT [dbo].[Trip] ([Trip_No], [TripOfGara_no]) VALUES (N'0005', N'L001      ')
GO
ALTER TABLE [dbo].[Car]  WITH CHECK ADD  CONSTRAINT [FK_Car_Gara1] FOREIGN KEY([Gar_Name])
REFERENCES [dbo].[Gara] ([Gara_Name])
ON UPDATE CASCADE
GO
ALTER TABLE [dbo].[Car] CHECK CONSTRAINT [FK_Car_Gara1]
GO
ALTER TABLE [dbo].[Driver]  WITH CHECK ADD  CONSTRAINT [FK_Driver_Staff] FOREIGN KEY([Driver_CMND])
REFERENCES [dbo].[Staff] ([Staff_CMND])
ON UPDATE CASCADE
ON DELETE CASCADE
GO
ALTER TABLE [dbo].[Driver] CHECK CONSTRAINT [FK_Driver_Staff]
GO
ALTER TABLE [dbo].[Gara]  WITH CHECK ADD  CONSTRAINT [FK_Gara_Account] FOREIGN KEY([Account])
REFERENCES [dbo].[Account] ([Account])
ON UPDATE CASCADE
GO
ALTER TABLE [dbo].[Gara] CHECK CONSTRAINT [FK_Gara_Account]
GO
ALTER TABLE [dbo].[Manage_Passenger_Care]  WITH CHECK ADD  CONSTRAINT [FK_Manage_Passenger_Care_Passenger] FOREIGN KEY([Passenger_SDT])
REFERENCES [dbo].[Passenger] ([Passenger_SDT])
ON UPDATE CASCADE
GO
ALTER TABLE [dbo].[Manage_Passenger_Care] CHECK CONSTRAINT [FK_Manage_Passenger_Care_Passenger]
GO
ALTER TABLE [dbo].[Manage_Passenger_Care]  WITH CHECK ADD  CONSTRAINT [FK_Manage_Passenger_Care_Passenger_Care] FOREIGN KEY([Staff_CMND])
REFERENCES [dbo].[Passenger_Care] ([Staff_CMND])
ON UPDATE CASCADE
ON DELETE CASCADE
GO
ALTER TABLE [dbo].[Manage_Passenger_Care] CHECK CONSTRAINT [FK_Manage_Passenger_Care_Passenger_Care]
GO
ALTER TABLE [dbo].[ManageDrive]  WITH CHECK ADD  CONSTRAINT [FK_ManageDrive_Car] FOREIGN KEY([Car_License_Plates])
REFERENCES [dbo].[Car] ([Car_License_Plates])
GO
ALTER TABLE [dbo].[ManageDrive] CHECK CONSTRAINT [FK_ManageDrive_Car]
GO
ALTER TABLE [dbo].[ManageDrive]  WITH CHECK ADD  CONSTRAINT [FK_ManageDrive_Driver] FOREIGN KEY([Drive_CMND])
REFERENCES [dbo].[Driver] ([Driver_CMND])
ON UPDATE CASCADE
GO
ALTER TABLE [dbo].[ManageDrive] CHECK CONSTRAINT [FK_ManageDrive_Driver]
GO
ALTER TABLE [dbo].[ManageDrive]  WITH CHECK ADD  CONSTRAINT [FK_ManageDrive_Trip] FOREIGN KEY([Trip_No])
REFERENCES [dbo].[Trip] ([Trip_No])
ON UPDATE CASCADE
GO
ALTER TABLE [dbo].[ManageDrive] CHECK CONSTRAINT [FK_ManageDrive_Trip]
GO
ALTER TABLE [dbo].[ManageReview]  WITH CHECK ADD  CONSTRAINT [FK_ManageReview_Passenger] FOREIGN KEY([Passenger_SDT])
REFERENCES [dbo].[Passenger] ([Passenger_SDT])
ON UPDATE CASCADE
GO
ALTER TABLE [dbo].[ManageReview] CHECK CONSTRAINT [FK_ManageReview_Passenger]
GO
ALTER TABLE [dbo].[ManageReview]  WITH CHECK ADD  CONSTRAINT [FK_ManageReview_Trip] FOREIGN KEY([Trip_No])
REFERENCES [dbo].[Trip] ([Trip_No])
ON UPDATE CASCADE
GO
ALTER TABLE [dbo].[ManageReview] CHECK CONSTRAINT [FK_ManageReview_Trip]
GO
ALTER TABLE [dbo].[Passenger]  WITH CHECK ADD  CONSTRAINT [FK_Passenger_Account] FOREIGN KEY([Account])
REFERENCES [dbo].[Account] ([Account])
GO
ALTER TABLE [dbo].[Passenger] CHECK CONSTRAINT [FK_Passenger_Account]
GO
ALTER TABLE [dbo].[Passenger_Care]  WITH CHECK ADD  CONSTRAINT [FK_Passenger_Care_Staff] FOREIGN KEY([Staff_CMND])
REFERENCES [dbo].[Staff] ([Staff_CMND])
ON UPDATE CASCADE
ON DELETE CASCADE
GO
ALTER TABLE [dbo].[Passenger_Care] CHECK CONSTRAINT [FK_Passenger_Care_Staff]
GO
ALTER TABLE [dbo].[ScheduleOfGara]  WITH CHECK ADD  CONSTRAINT [FK_ScheduelOfGara_Gara] FOREIGN KEY([Gara_Name])
REFERENCES [dbo].[Gara] ([Gara_Name])
GO
ALTER TABLE [dbo].[ScheduleOfGara] CHECK CONSTRAINT [FK_ScheduelOfGara_Gara]
GO
ALTER TABLE [dbo].[ScheduleOfGara]  WITH CHECK ADD  CONSTRAINT [FK_ScheduelOfGara_TotalScheduels1] FOREIGN KEY([Schedule_no])
REFERENCES [dbo].[TotalScheduels] ([SChedule_no])
GO
ALTER TABLE [dbo].[ScheduleOfGara] CHECK CONSTRAINT [FK_ScheduelOfGara_TotalScheduels1]
GO
ALTER TABLE [dbo].[Staff]  WITH CHECK ADD  CONSTRAINT [FK_Staff_Account] FOREIGN KEY([Staff_Account])
REFERENCES [dbo].[Account] ([Account])
ON UPDATE CASCADE
GO
ALTER TABLE [dbo].[Staff] CHECK CONSTRAINT [FK_Staff_Account]
GO
ALTER TABLE [dbo].[Ticket]  WITH CHECK ADD  CONSTRAINT [FK_Ticket_Passenger] FOREIGN KEY([Passenger_SDT])
REFERENCES [dbo].[Passenger] ([Passenger_SDT])
ON UPDATE CASCADE
GO
ALTER TABLE [dbo].[Ticket] CHECK CONSTRAINT [FK_Ticket_Passenger]
GO
ALTER TABLE [dbo].[Ticket]  WITH CHECK ADD  CONSTRAINT [FK_Ticket_Staff] FOREIGN KEY([Staff_CMND])
REFERENCES [dbo].[Staff] ([Staff_CMND])
ON UPDATE CASCADE
GO
ALTER TABLE [dbo].[Ticket] CHECK CONSTRAINT [FK_Ticket_Staff]
GO
ALTER TABLE [dbo].[Ticket]  WITH CHECK ADD  CONSTRAINT [FK_Ticket_Trip] FOREIGN KEY([Trip_No])
REFERENCES [dbo].[Trip] ([Trip_No])
ON UPDATE CASCADE
GO
ALTER TABLE [dbo].[Ticket] CHECK CONSTRAINT [FK_Ticket_Trip]
GO
ALTER TABLE [dbo].[TotalScheduels]  WITH CHECK ADD  CONSTRAINT [FK_TotalScheduels_Station] FOREIGN KEY([BeginStation])
REFERENCES [dbo].[Station] ([station_No])
GO
ALTER TABLE [dbo].[TotalScheduels] CHECK CONSTRAINT [FK_TotalScheduels_Station]
GO
ALTER TABLE [dbo].[TotalScheduels]  WITH CHECK ADD  CONSTRAINT [FK_TotalScheduels_Station1] FOREIGN KEY([EndStation])
REFERENCES [dbo].[Station] ([station_No])
GO
ALTER TABLE [dbo].[TotalScheduels] CHECK CONSTRAINT [FK_TotalScheduels_Station1]
GO
ALTER TABLE [dbo].[Trip]  WITH CHECK ADD  CONSTRAINT [FK_Trip_ScheduelOfGara] FOREIGN KEY([TripOfGara_no])
REFERENCES [dbo].[ScheduleOfGara] ([TripOfGara_no])
GO
ALTER TABLE [dbo].[Trip] CHECK CONSTRAINT [FK_Trip_ScheduelOfGara]
GO
ALTER TABLE [dbo].[ManageReview]  WITH CHECK ADD  CONSTRAINT [CK_ManageReview] CHECK  (([Staff_Attitude]>=(1) AND [Staff_Attitude]<=(3)))
GO
ALTER TABLE [dbo].[ManageReview] CHECK CONSTRAINT [CK_ManageReview]
GO
/****** Object:  StoredProcedure [dbo].[SP_LOAD_TABLE]    Script Date: 6/14/2021 5:33:02 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE PROC [dbo].[SP_LOAD_TABLE]
AS
BEGIN
SELECT SOG.Gara_Name, 
BEGN=(SELECT S.station_Name FROM  Station S
WHERE TS.BeginStation = S.station_No), 
ED=(SELECT S.station_Name FROM Station S
WHERE TS.EndStation = S.station_No), 
SOG.DayInWeek, SOG.DepartTime, 
SOG.TicketPrice 
FROM ScheduleOfGara SOG, TotalScheduels TS
WHERE SOG.Schedule_no = TS.SChedule_no
END
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'ManageReview', @level2type=N'CONSTRAINT',@level2name=N'CK_ManageReview'
GO
USE [master]
GO
ALTER DATABASE [QLyDatXe4] SET  READ_WRITE 
GO
