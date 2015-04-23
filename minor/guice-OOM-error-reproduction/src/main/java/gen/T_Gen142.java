
  package gen;
  public class T_Gen142 {
  		@com.google.inject.Inject
  		public T_Gen142(T_Gen143 t_gen143){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + t_gen143 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  