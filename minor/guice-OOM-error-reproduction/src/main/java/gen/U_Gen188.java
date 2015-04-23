
  package gen;
  public class U_Gen188 {
  		@com.google.inject.Inject
  		public U_Gen188(U_Gen189 u_gen189){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + u_gen189 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  