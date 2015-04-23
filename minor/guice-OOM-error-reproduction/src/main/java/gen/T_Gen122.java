
  package gen;
  public class T_Gen122 {
  		@com.google.inject.Inject
  		public T_Gen122(T_Gen123 t_gen123){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + t_gen123 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  