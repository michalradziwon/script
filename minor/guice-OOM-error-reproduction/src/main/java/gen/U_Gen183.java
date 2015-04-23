
  package gen;
  public class U_Gen183 {
  		@com.google.inject.Inject
  		public U_Gen183(U_Gen184 u_gen184){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + u_gen184 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  