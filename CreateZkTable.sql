CREATE TABLE [dbo].[backupsync](
    [DeptNo] [varchar](32) NULL,
    [DeptName] [varchar](64) NULL,
    [empno] [varchar](32) NULL,
    [empname] [varchar](30) NULL,
    [card_id] [bigint] NULL,
    [issue_date] [datetime] NULL,
    [CheckinDt] [datetime] NULL,
    [UpdTime] [datetime] NULL,
    [isvalid] [bit] NULL,
    [card_sequ] [int] NULL,
    [card_status] [int] NULL,
    [Valid_date] [datetime] NULL,
    [SyncTime] [datetime] NULL,
    [remarks] [varchar](1000) NULL
);

INSERT INTO zktime606_ID.dbo.backupsync (DeptNo, DeptName, empno, empname, card_id, issue_date, CheckinDt, UpdTime,
                                         isvalid, card_sequ, card_status, Valid_date, SyncTime, remarks)
VALUES (N'-', N'-', N'-', N'-', null, null, null, null, null, null, null, null, N'2022-03-21 01:54:49.000', N'初始数据');
