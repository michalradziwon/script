
  package gen;
  public class U_Gen3 {
  		@com.google.inject.Inject
  		public U_Gen3(U_Gen4 u_gen4){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + u_gen4 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  