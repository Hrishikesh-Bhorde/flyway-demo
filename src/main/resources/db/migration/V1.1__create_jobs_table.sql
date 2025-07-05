CREATE TABLE jobs (
    job_id BIGSERIAL PRIMARY KEY,
    job_title VARCHAR(255),
    location VARCHAR(255),
    description VARCHAR(255),
    experience DOUBLE PRECISION,
    salary DOUBLE PRECISION,
    notice_period REAL,
    contact_email VARCHAR(255),
    status VARCHAR(50),
    skills VARCHAR(255),
    emp_id BIGINT,
    CONSTRAINT fk_employer
      FOREIGN KEY (emp_id)
      REFERENCES employer(empid)
      ON DELETE SET NULL
);