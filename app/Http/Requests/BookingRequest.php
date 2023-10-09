<?php

namespace App\Http\Requests;

use Illuminate\Foundation\Http\FormRequest;
use Illuminate\Support\Facades\Auth;

class BookingRequest extends FormRequest
{
    /**
     * Determine if the user is authorized to make this request.
     */
    public function authorize(): bool
    {
        return Auth::check();
    }

    /**
     * Get the validation rules that apply to the request.
     *
     * @return array<string, \Illuminate\Contracts\Validation\ValidationRule|array|string>
     */
    public function rules(): array
    {
        return [
            'name' => 'required|string|max:255',
            'start_date' => 'nullable|date',
            'end_date' => 'nullable|date',
            'address' => 'nullable|string',
            'city' => 'nullable|string',
            'zip' => 'nullable|numeric',
            'status' => 'nullable|string',
            'payment_method' => 'nullable|string|default:midtrans',
            'payment_status' => 'nullable|string',
            'payment_url' => 'nullable|string',
            'total_price' => 'nullable|numeric',
            'items_id' => 'nullable|integer|exists:items,id',
            'users_id' => 'nullable|integer|exists:users,id',
        ];
    }
}
