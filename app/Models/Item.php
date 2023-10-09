<?php

namespace App\Models;

use Illuminate\Database\Eloquent\Model;
use Illuminate\Support\Facades\Storage;
use Illuminate\Database\Eloquent\SoftDeletes;
use Illuminate\Database\Eloquent\Factories\HasFactory;

class Item extends Model
{
    use HasFactory,SoftDeletes;

    protected $fillable = [
        'name',
        'slug',
        'brands_id',
        'types_id',
        'photos',
        'features',
        'price',
        'stars',
        'review',
    ];

    // photo ini nanti bentuknya array
    protected $casts = [
        'photos' => 'array',
    ];

    public function getThumbnailAttribute()
    {
        // jika photos tidak kosong
        if($this->photos){
            // ambil photo pertama
            return Storage::url(json_decode($this->photos)[0]);
        }

        return 'https://via.placeholder.com/800x600?text=No+Image';
    }

    public function brand() // brand ini hanya nama disesuaikan item ini dimiliki oleh satu brand maka brand tidak pakai s
    {
        return $this->belongsTo(Brand::class, 'brands_id');
    }

    public function type() 
    {
        return $this->belongsTo(Type::class, 'types_id');
    }

    public function bookings()
    {
        return $this->hasMany(Booking::class);
    }
}
