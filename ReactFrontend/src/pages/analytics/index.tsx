import React from 'react';
import { Table, TableBody, TableCell, TableContainer, TableHead, TableRow, Paper, Button } from '@mui/material';

// Данные для таблицы, обычно это будет массив объектов, полученных из API или стейта
const productData = [
    { id: 1, name: 'Product 1', price: 100, stock: 10 },
    { id: 2, name: 'Product 2', price: 150, stock: 20 },
    // Другие товары...
];

const AnalyticsPage = () => {
    // Функция для обработки добавления товара
    const handleAddProduct = () => {
        // Логика для добавления товара
    };

    return (
        <div>
            <h1>Аналитика</h1>
            <Button variant="contained" color="primary" onClick={handleAddProduct}>
                Добавить товар
            </Button>
            <TableContainer component={Paper}>
                <Table aria-label="simple table">
                    <TableHead>
                        <TableRow>
                            <TableCell>ID</TableCell>
                            <TableCell>Название</TableCell>
                            <TableCell>Цена</TableCell>
                            <TableCell>Количество на складе</TableCell>
                        </TableRow>
                    </TableHead>
                    <TableBody>
                        {productData.map((product) => (
                            <TableRow key={product.id}>
                                <TableCell>{product.id}</TableCell>
                                <TableCell>{product.name}</TableCell>
                                <TableCell>{product.price}</TableCell>
                                <TableCell>{product.stock}</TableCell>
                            </TableRow>
                        ))}
                    </TableBody>
                </Table>
            </TableContainer>
        </div>
    );
};

export default AnalyticsPage;
