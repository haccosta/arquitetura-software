#!/bin/bash
psql -U postgres -tc "SELECT 1 FROM pg_database WHERE datname = 'dropshipping_produto'" | grep -q 1 || psql -U postgres -c "CREATE DATABASE dropshipping_produto";
psql -U postgres -tc "SELECT 1 FROM pg_database WHERE datname = 'dropshipping_seguranca'" | grep -q 1 || psql -U postgres -c "CREATE DATABASE dropshipping_seguranca";

