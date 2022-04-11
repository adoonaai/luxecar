CREATE TABLE car
(
    vin             varchar(30) PRIMARY KEY,
    firm            varchar(30),
    model           varchar(30),
    year_issue      date,
    driver_unit     varchar(30),
    power           double precision,
    engine_capacity double precision,
    transmission    varchar(30),
    rank            varchar(30),
    price_per_day   numeric
);

CREATE TABLE driverLicense
(
    id              uuid primary key,
    firstname       varchar(30),
    lastname        varchar(30),
    patronymic      varchar(30),
    date_birth      date,
    date_receipt    date,
    date_expiration date,
    division_code   varchar(30),
    city            varchar(30)
);

CREATE TABLE "order"
(
    id          uuid primary key,
    car_id      uuid,
    user_id     uuid,
    start_order date,
    end_order   date,
    state       varchar(30)
);

CREATE TABLE passport
(
    id                uuid primary key,
    firstname         varchar(30),
    lastname          varchar(30),
    patronymic        varchar(30),
    sex               varchar(30),
    date_birth        date,
    place_birth       varchar(30),
    passport_issued   varchar(30),
    date_issue        date,
    division_code     varchar(30),
    series_and_number integer
);

CREATE TABLE review
(
    id      uuid primary key,
    car_id  uuid,
    user_id uuid,
    texts   varchar(255),
    grade   double precision
);

CREATE TABLE users
(
    id                uuid primary key,
    email             varchar(255),
    password          varchar(255),
    passport_id       uuid,
    driver_license_id uuid
);