
  package gen;
  public class U_Gen59 {
  		@com.google.inject.Inject
  		public U_Gen59(U_Gen60 u_gen60){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + u_gen60 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  