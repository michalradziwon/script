
  package gen;
  public class T_Gen65 {
  		@com.google.inject.Inject
  		public T_Gen65(T_Gen66 t_gen66){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + t_gen66 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  