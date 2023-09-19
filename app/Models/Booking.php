<?php

namespace App\Models;

use Illuminate\Database\Eloquent\Factories\HasFactory;
use Illuminate\Database\Eloquent\Model;
use Illuminate\Database\Eloquent\SoftDeletes;

class Booking extends Model
{
    use HasFactory, SoftDeletes;

    protected $fillable = [
        'name',
        'start_date',
        'end_date',
        'address',
        'city',
        'zip',
        'status',
        'payment_method',
        'payment_status',
        'payment_url',
        'total_price',
        'items_id',
        'users_id',
    ];

    // ngasih tau laravel kalau ini nanti bentuknya datetime
    protected $casts = [
        'start_date'=>'datetime',
        'end_date'=>'datetime',
    ];

    public function item()
    {
        return $this->belongsTo(Item::class);
    }

    public function user()
    {
        return $this->belongsTo(User::class);
    }
}
