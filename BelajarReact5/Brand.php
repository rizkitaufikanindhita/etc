<?php

namespace App\Models;

use Illuminate\Database\Eloquent\Factories\HasFactory;
use Illuminate\Database\Eloquent\Model;
use Illuminate\Database\Eloquent\SoftDeletes;

class Brand extends Model
{
    use HasFactory, SoftDeletes;
    
    // mana yang bisa diisi
    protected $fillable = [
        'name',
        'slug',
    ];

    // relation
    public function items()   // items ini hanya nama disesuaikan brand punya banyak item-item maka items pakai s
    {
        return $this->hasMany(Item::class);  // Item ini model
    }
}