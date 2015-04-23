
  package gen;
  public class T_Gen156 {
  		@com.google.inject.Inject
  		public T_Gen156(T_Gen157 t_gen157){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + t_gen157 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  