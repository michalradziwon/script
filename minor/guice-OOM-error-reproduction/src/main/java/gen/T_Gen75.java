
  package gen;
  public class T_Gen75 {
  		@com.google.inject.Inject
  		public T_Gen75(T_Gen76 t_gen76){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + t_gen76 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  