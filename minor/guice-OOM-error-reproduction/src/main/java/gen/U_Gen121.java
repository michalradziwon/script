
  package gen;
  public class U_Gen121 {
  		@com.google.inject.Inject
  		public U_Gen121(U_Gen122 u_gen122){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + u_gen122 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  