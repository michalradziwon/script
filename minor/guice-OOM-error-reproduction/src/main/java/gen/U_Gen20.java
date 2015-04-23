
  package gen;
  public class U_Gen20 {
  		@com.google.inject.Inject
  		public U_Gen20(U_Gen21 u_gen21){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + u_gen21 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  