function varargout = to_base_n(varargin)
gui_Singleton = 1;
gui_State = struct('gui_Name',       mfilename, ...
                   'gui_Singleton',  gui_Singleton, ...
                   'gui_OpeningFcn', @to_base_n_OpeningFcn, ...
                   'gui_OutputFcn',  @to_base_n_OutputFcn, ...
                   'gui_LayoutFcn',  [] , ...
                   'gui_Callback',   []);
if nargin && ischar(varargin{1})
    gui_State.gui_Callback = str2func(varargin{1});
end
if nargout
    [varargout{1:nargout}] = gui_mainfcn(gui_State, varargin{:});
else
    gui_mainfcn(gui_State, varargin{:});
end

function to_base_n_OpeningFcn(hObject, eventdata, handles, varargin)
handles.output = hObject;
guidata(hObject, handles);

function varargout = to_base_n_OutputFcn(hObject, eventdata, handles) 
varargout{1} = handles.output;

function edit1_Callback(hObject, eventdata, handles)

function edit1_CreateFcn(hObject, eventdata, handles)
if ispc && isequal(get(hObject,'BackgroundColor'), get(0,'defaultUicontrolBackgroundColor'))
    set(hObject,'BackgroundColor','white');
end



function edit2_Callback(hObject, eventdata, handles)

function edit2_CreateFcn(hObject, eventdata, handles)
if ispc && isequal(get(hObject,'BackgroundColor'), get(0,'defaultUicontrolBackgroundColor'))
    set(hObject,'BackgroundColor','white');
end

function pushbutton1_Callback(hObject, eventdata, handles)
global str;
x=get(handles.edit1,'String');
y=get(handles.edit2,'String');
x=str2double(x);
x=floor(x);
y=str2double(y);
y=floor(y);
str=[];
go(x,y,handles);
print temp;
xt=set(handles.edit3,'String',str);

function go(base,n,handles)
global str;
temp=0;
if base<0||n<=0||n>=36
    str='You have input the wrong number!!!';
    return;
end
temp=mod(base,n);
if base >= n
    base = fix(base/n); 
    go(base,n,handles);
end
if temp < 10
    str=[str,num2str(temp)];
else
    str=[str,char(temp+'7')];
end
return;

function edit3_Callback(hObject, eventdata, handles)

function edit3_CreateFcn(hObject, eventdata, handles)
if ispc && isequal(get(hObject,'BackgroundColor'), get(0,'defaultUicontrolBackgroundColor'))
    set(hObject,'BackgroundColor','white');
end
