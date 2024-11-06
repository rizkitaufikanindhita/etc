<?php

use App\Http\Controllers\UsersController;
use App\Http\Controllers\TodoController;

use Illuminate\Support\Facades\Route;

/*
|--------------------------------------------------------------------------
| Web Routes
|--------------------------------------------------------------------------
|
| Here is where you can register web routes for your application. These
| routes are loaded by the RouteServiceProvider and all of them will
| be assigned to the "web" middleware group. Make something great!
|
*/
Route::controller(UsersController::class)->group(function(){
    Route::get('/', 'home')->name('home');
    Route::get('/login', 'login_form')->name('login_form');
    Route::post('/login', 'login_action')->name('login_action');
    Route::post('/logout', 'logout_action')->name('logout_action');
});

Route::controller(TodoController::class)->group(function(){
    Route::get('/todoapp', 'todo_index')->name('todo_index');
    Route::post('/todoapp', 'todo_delete')->name('todo_delete');
    Route::post('/todoapp/add', 'todo_add')->name('todo_add');
    Route::get('/todoapp/edit/{id}', 'todo_edit')->name('todo_edit');
    Route::post('/todoapp/edit/{id}', 'todo_edit_action')->name('todo_edit_action');
});