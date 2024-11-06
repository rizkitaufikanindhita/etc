<?php

namespace App\Models;

use Illuminate\Database\Eloquent\Factories\HasFactory;
use Illuminate\Database\Eloquent\Model;

class Todo extends Model
{
    protected $fillable = ['todo'];
    use HasFactory;
    public function users(){
        return $this->belongsTo(Users::class,'users_id');
    }
}
