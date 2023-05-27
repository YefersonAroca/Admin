/*==============================================================*/
/* DBMS name:      PostgreSQL 8                                 */
/* Created on:     12/05/2023 9:27:35 a. m.                     */
/*==============================================================*/


/*==============================================================*/
/* Table: CONCEPTO                                              */
/*==============================================================*/
create table CONCEPTO (
   IDTIPOTRAN           VARCHAR(3)           not null,
   IDCONCEPTO           VARCHAR(3)           not null,
   IDUNIDAD             VARCHAR(2)           not null,
   NOMCONCEPTO          VARCHAR(50)          not null,
   constraint PK_CONCEPTO primary key (IDTIPOTRAN, IDCONCEPTO)
);

/*==============================================================*/
/* Index: CONCEPTO_PK                                           */
/*==============================================================*/
create unique index CONCEPTO_PK on CONCEPTO (
IDTIPOTRAN,
IDCONCEPTO
);

/*==============================================================*/
/* Index: RELATIONSHIP_11_FK                                    */
/*==============================================================*/
create  index RELATIONSHIP_11_FK on CONCEPTO (
IDTIPOTRAN
);

/*==============================================================*/
/* Index: RELATIONSHIP_14_FK                                    */
/*==============================================================*/
create  index RELATIONSHIP_14_FK on CONCEPTO (
IDUNIDAD
);

/*==============================================================*/
/* Table: CONCEPTOTIPOPERSONA                                   */
/*==============================================================*/
create table CONCEPTOTIPOPERSONA (
   IDTIPOPERSONA        VARCHAR(4)           not null,
   IDTIPOTRAN           VARCHAR(3)           not null,
   IDCONCEPTO           VARCHAR(3)           not null,
   IDCONCEPTIPOPER      VARCHAR(4)           not null,
   FECHAREGISTRO        DATE                 not null,
   constraint PK_CONCEPTOTIPOPERSONA primary key (IDCONCEPTIPOPER)
);

/*==============================================================*/
/* Index: RELATIONSHIP_9_PK                                     */
/*==============================================================*/
create unique index RELATIONSHIP_9_PK on CONCEPTOTIPOPERSONA (
IDCONCEPTIPOPER
);

/*==============================================================*/
/* Index: RELATIONSHIP_9_FK                                     */
/*==============================================================*/
create  index RELATIONSHIP_9_FK on CONCEPTOTIPOPERSONA (
IDTIPOPERSONA
);

/*==============================================================*/
/* Index: RELATIONSHIP_10_FK                                    */
/*==============================================================*/
create  index RELATIONSHIP_10_FK on CONCEPTOTIPOPERSONA (
IDTIPOTRAN,
IDCONCEPTO
);

/*==============================================================*/
/* Table: DETALLEFACTURA                                        */
/*==============================================================*/
create table DETALLEFACTURA (
   NFACTURA             VARCHAR(6)           not null,
   ITEM                 INT4                 not null,
   IDTIPOTRAN           VARCHAR(3)           not null,
   IDCONCEPTO           VARCHAR(3)           not null,
   VALORITEM            NUMERIC(9,2)         not null,
   SOPORTE              VARCHAR(15)          null,
   constraint PK_DETALLEFACTURA primary key (NFACTURA, ITEM)
);

/*==============================================================*/
/* Index: DETALLEFACTURA_PK                                     */
/*==============================================================*/
create unique index DETALLEFACTURA_PK on DETALLEFACTURA (
NFACTURA,
ITEM
);

/*==============================================================*/
/* Index: RELATIONSHIP_6_FK                                     */
/*==============================================================*/
create  index RELATIONSHIP_6_FK on DETALLEFACTURA (
IDTIPOTRAN,
IDCONCEPTO
);

/*==============================================================*/
/* Index: RELATIONSHIP_8_FK                                     */
/*==============================================================*/
create  index RELATIONSHIP_8_FK on DETALLEFACTURA (
NFACTURA
);

/*==============================================================*/
/* Table: EMPLEADO                                              */
/*==============================================================*/
create table EMPLEADO (
   CODEMPLEADO          VARCHAR(8)           not null,
   CODIGO               VARCHAR(4)           not null,
   NOMBRE               VARCHAR(20)          not null,
   APELLIDO             VARCHAR(20)          not null,
   CELULAR              INT4                 not null,
   CEDULA               INT4                 not null,
   constraint PK_EMPLEADO primary key (CODEMPLEADO)
);

/*==============================================================*/
/* Index: EMPLEADO_PK                                           */
/*==============================================================*/
create unique index EMPLEADO_PK on EMPLEADO (
CODEMPLEADO
);

/*==============================================================*/
/* Index: RELATIONSHIP_13_FK                                    */
/*==============================================================*/
create  index RELATIONSHIP_13_FK on EMPLEADO (
CODIGO
);

/*==============================================================*/
/* Table: ESTRUCTURA                                            */
/*==============================================================*/
create table ESTRUCTURA (
   NESTRUCTURA          VARCHAR(5)           not null,
   EST_NESTRUCTURA      VARCHAR(5)           null,
   IDTIPOESTRUCTURA     VARCHAR(5)           not null,
   AREA                 NUMERIC(7,2)         not null,
   constraint PK_ESTRUCTURA primary key (NESTRUCTURA)
);

/*==============================================================*/
/* Index: ESTRUCTURA_PK                                         */
/*==============================================================*/
create unique index ESTRUCTURA_PK on ESTRUCTURA (
NESTRUCTURA
);

/*==============================================================*/
/* Index: RELATIONSHIP_3_FK                                     */
/*==============================================================*/
create  index RELATIONSHIP_3_FK on ESTRUCTURA (
EST_NESTRUCTURA
);

/*==============================================================*/
/* Index: RELATIONSHIP_5_FK                                     */
/*==============================================================*/
create  index RELATIONSHIP_5_FK on ESTRUCTURA (
IDTIPOESTRUCTURA
);

/*==============================================================*/
/* Table: FACTURA                                               */
/*==============================================================*/
create table FACTURA (
   NFACTURA             VARCHAR(6)           not null,
   CODIGO               VARCHAR(4)           not null,
   CODEMPLEADO          VARCHAR(8)           not null,
   FECHAFAC             DATE                 not null,
   TOTALFACTURA         FLOAT  (5)           not null,
   constraint PK_FACTURA primary key (NFACTURA)
);

/*==============================================================*/
/* Index: FACTURA_PK                                            */
/*==============================================================*/
create unique index FACTURA_PK on FACTURA (
NFACTURA
);

/*==============================================================*/
/* Index: RELATIONSHIP_7_FK                                     */
/*==============================================================*/
create  index RELATIONSHIP_7_FK on FACTURA (
CODIGO
);

/*==============================================================*/
/* Index: RELATIONSHIP_12_FK                                    */
/*==============================================================*/
create  index RELATIONSHIP_12_FK on FACTURA (
CODEMPLEADO
);

/*==============================================================*/
/* Table: HISTORICOVALORCONCEPTO                                */
/*==============================================================*/
create table HISTORICOVALORCONCEPTO (
   CONSECUTIVO          NUMERIC(4,0)         not null,
   IDUNIDAD             VARCHAR(2)           null,
   IDTIPOTRAN           VARCHAR(3)           not null,
   IDCONCEPTO           VARCHAR(3)           not null,
   CODEMPLEADO          VARCHAR(8)           null,
   FECHA                DATE                 not null,
   VALOR                NUMERIC(9,2)         null,
   ESTADO               BOOL                 not null,
   constraint PK_HISTORICOVALORCONCEPTO primary key (CONSECUTIVO)
);

/*==============================================================*/
/* Index: HISTORICOVALORCONCEPTO_PK                             */
/*==============================================================*/
create unique index HISTORICOVALORCONCEPTO_PK on HISTORICOVALORCONCEPTO (
CONSECUTIVO
);

/*==============================================================*/
/* Index: RELATIONSHIP_15_FK                                    */
/*==============================================================*/
create  index RELATIONSHIP_15_FK on HISTORICOVALORCONCEPTO (
IDUNIDAD
);

/*==============================================================*/
/* Index: RELATIONSHIP_16_FK                                    */
/*==============================================================*/
create  index RELATIONSHIP_16_FK on HISTORICOVALORCONCEPTO (
CODEMPLEADO
);

/*==============================================================*/
/* Index: RELATIONSHIP_17_FK                                    */
/*==============================================================*/
create  index RELATIONSHIP_17_FK on HISTORICOVALORCONCEPTO (
IDTIPOTRAN,
IDCONCEPTO
);

/*==============================================================*/
/* Table: PERSONA                                               */
/*==============================================================*/
create table PERSONA (
   CODIGO               VARCHAR(4)           not null,
   NOMBREPERSONA        VARCHAR(50)          not null,
   constraint PK_PERSONA primary key (CODIGO)
);

/*==============================================================*/
/* Index: PERSONA_PK                                            */
/*==============================================================*/
create unique index PERSONA_PK on PERSONA (
CODIGO
);

/*==============================================================*/
/* Table: TENENCIA                                              */
/*==============================================================*/
create table TENENCIA (
   CONSECTENENCIA       INT4                 not null,
   IDTIPOPERSONA        VARCHAR(4)           null,
   CODIGO               VARCHAR(4)           null,
   NESTRUCTURA          VARCHAR(5)           null,
   ESTADOTENENCIA       BOOL                 not null,
   constraint PK_TENENCIA primary key (CONSECTENENCIA)
);

/*==============================================================*/
/* Index: TENENCIA_PK                                           */
/*==============================================================*/
create unique index TENENCIA_PK on TENENCIA (
CONSECTENENCIA
);

/*==============================================================*/
/* Index: RELATIONSHIP_1_FK                                     */
/*==============================================================*/
create  index RELATIONSHIP_1_FK on TENENCIA (
IDTIPOPERSONA
);

/*==============================================================*/
/* Index: RELATIONSHIP_2_FK                                     */
/*==============================================================*/
create  index RELATIONSHIP_2_FK on TENENCIA (
CODIGO
);

/*==============================================================*/
/* Index: RELATIONSHIP_4_FK                                     */
/*==============================================================*/
create  index RELATIONSHIP_4_FK on TENENCIA (
NESTRUCTURA
);

/*==============================================================*/
/* Table: TIPOESTRUCTURA                                        */
/*==============================================================*/
create table TIPOESTRUCTURA (
   IDTIPOESTRUCTURA     VARCHAR(5)           not null,
   DESCTIPOESTRUCTURA   VARCHAR(30)          not null,
   constraint PK_TIPOESTRUCTURA primary key (IDTIPOESTRUCTURA)
);

/*==============================================================*/
/* Index: TIPOESTRUCTURA_PK                                     */
/*==============================================================*/
create unique index TIPOESTRUCTURA_PK on TIPOESTRUCTURA (
IDTIPOESTRUCTURA
);

/*==============================================================*/
/* Table: TIPOPERSONA                                           */
/*==============================================================*/
create table TIPOPERSONA (
   IDTIPOPERSONA        VARCHAR(4)           not null,
   DESCTIPOPER          VARCHAR(30)          not null,
   constraint PK_TIPOPERSONA primary key (IDTIPOPERSONA)
);

/*==============================================================*/
/* Index: TIPOPERSONA_PK                                        */
/*==============================================================*/
create unique index TIPOPERSONA_PK on TIPOPERSONA (
IDTIPOPERSONA
);

/*==============================================================*/
/* Table: TIPOTRANSACCION                                       */
/*==============================================================*/
create table TIPOTRANSACCION (
   IDTIPOTRAN           VARCHAR(3)           not null,
   DESCTIPOTRAN         VARCHAR(20)          not null,
   constraint PK_TIPOTRANSACCION primary key (IDTIPOTRAN)
);

/*==============================================================*/
/* Index: TIPOTRANSACCION_PK                                    */
/*==============================================================*/
create unique index TIPOTRANSACCION_PK on TIPOTRANSACCION (
IDTIPOTRAN
);

/*==============================================================*/
/* Table: UNIDADMEDIDA                                          */
/*==============================================================*/
create table UNIDADMEDIDA (
   IDUNIDAD             VARCHAR(2)           not null,
   NOMUNIDAD            VARCHAR(15)          not null,
   constraint PK_UNIDADMEDIDA primary key (IDUNIDAD)
);

/*==============================================================*/
/* Index: UNIDADMEDIDA_PK                                       */
/*==============================================================*/
create unique index UNIDADMEDIDA_PK on UNIDADMEDIDA (
IDUNIDAD
);

alter table CONCEPTO
   add constraint FK_CONCEPTO_RELATIONS_TIPOTRAN foreign key (IDTIPOTRAN)
      references TIPOTRANSACCION (IDTIPOTRAN)
      on delete restrict on update restrict;

alter table CONCEPTO
   add constraint FK_CONCEPTO_RELATIONS_UNIDADME foreign key (IDUNIDAD)
      references UNIDADMEDIDA (IDUNIDAD)
      on delete restrict on update restrict;

alter table CONCEPTOTIPOPERSONA
   add constraint FK_CONCEPTO_RELATIONS_CONCEPTO foreign key (IDTIPOTRAN, IDCONCEPTO)
      references CONCEPTO (IDTIPOTRAN, IDCONCEPTO)
      on delete restrict on update restrict;

alter table CONCEPTOTIPOPERSONA
   add constraint FK_CONCEPTO_RELATIONS_TIPOPERS foreign key (IDTIPOPERSONA)
      references TIPOPERSONA (IDTIPOPERSONA)
      on delete restrict on update restrict;

alter table DETALLEFACTURA
   add constraint FK_DETALLEF_RELATIONS_CONCEPTO foreign key (IDTIPOTRAN, IDCONCEPTO)
      references CONCEPTO (IDTIPOTRAN, IDCONCEPTO)
      on delete restrict on update restrict;

alter table DETALLEFACTURA
   add constraint FK_DETALLEF_RELATIONS_FACTURA foreign key (NFACTURA)
      references FACTURA (NFACTURA)
      on delete restrict on update restrict;

alter table EMPLEADO
   add constraint FK_EMPLEADO_RELATIONS_PERSONA foreign key (CODIGO)
      references PERSONA (CODIGO)
      on delete restrict on update restrict;

alter table ESTRUCTURA
   add constraint FK_ESTRUCTU_RELATIONS_ESTRUCTU foreign key (EST_NESTRUCTURA)
      references ESTRUCTURA (NESTRUCTURA)
      on delete restrict on update restrict;

alter table ESTRUCTURA
   add constraint FK_ESTRUCTU_RELATIONS_TIPOESTR foreign key (IDTIPOESTRUCTURA)
      references TIPOESTRUCTURA (IDTIPOESTRUCTURA)
      on delete restrict on update restrict;

alter table FACTURA
   add constraint FK_FACTURA_RELATIONS_EMPLEADO foreign key (CODEMPLEADO)
      references EMPLEADO (CODEMPLEADO)
      on delete restrict on update restrict;

alter table FACTURA
   add constraint FK_FACTURA_RELATIONS_PERSONA foreign key (CODIGO)
      references PERSONA (CODIGO)
      on delete restrict on update restrict;

alter table HISTORICOVALORCONCEPTO
   add constraint FK_HISTORIC_RELATIONS_UNIDADME foreign key (IDUNIDAD)
      references UNIDADMEDIDA (IDUNIDAD)
      on delete restrict on update restrict;

alter table HISTORICOVALORCONCEPTO
   add constraint FK_HISTORIC_RELATIONS_EMPLEADO foreign key (CODEMPLEADO)
      references EMPLEADO (CODEMPLEADO)
      on delete restrict on update restrict;

alter table HISTORICOVALORCONCEPTO
   add constraint FK_HISTORIC_RELATIONS_CONCEPTO foreign key (IDTIPOTRAN, IDCONCEPTO)
      references CONCEPTO (IDTIPOTRAN, IDCONCEPTO)
      on delete restrict on update restrict;

alter table TENENCIA
   add constraint FK_TENENCIA_RELATIONS_TIPOPERS foreign key (IDTIPOPERSONA)
      references TIPOPERSONA (IDTIPOPERSONA)
      on delete restrict on update restrict;

alter table TENENCIA
   add constraint FK_TENENCIA_RELATIONS_PERSONA foreign key (CODIGO)
      references PERSONA (CODIGO)
      on delete restrict on update restrict;

alter table TENENCIA
   add constraint FK_TENENCIA_RELATIONS_ESTRUCTU foreign key (NESTRUCTURA)
      references ESTRUCTURA (NESTRUCTURA)
      on delete restrict on update restrict;

