
  package gen;
  public class T_Gen42 {
  		@com.google.inject.Inject
  		public T_Gen42(T_Gen43 t_gen43){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + t_gen43 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  