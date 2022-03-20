CREATE TABLE [dbo].[backupsync](
    [DeptNo] [varchar](32) NULL,
    [DeptName] [varchar](64) NULL,
    [empno] [varchar](32) NOT NULL,
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
    [remarks] [varchar](1000)
)
