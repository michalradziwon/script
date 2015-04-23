
  package gen;
  public class T_Gen83 {
  		@com.google.inject.Inject
  		public T_Gen83(T_Gen84 t_gen84){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + t_gen84 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  