
  package gen;
  public class U_Gen90 {
  		@com.google.inject.Inject
  		public U_Gen90(U_Gen91 u_gen91){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + u_gen91 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  