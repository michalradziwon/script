
  package gen;
  public class U_Gen114 {
  		@com.google.inject.Inject
  		public U_Gen114(U_Gen115 u_gen115){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + u_gen115 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  