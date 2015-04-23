
  package gen;
  public class U_Gen184 {
  		@com.google.inject.Inject
  		public U_Gen184(U_Gen185 u_gen185){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + u_gen185 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  