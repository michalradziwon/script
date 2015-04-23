
  package gen;
  public class U_Gen84 {
  		@com.google.inject.Inject
  		public U_Gen84(U_Gen85 u_gen85){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + u_gen85 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  