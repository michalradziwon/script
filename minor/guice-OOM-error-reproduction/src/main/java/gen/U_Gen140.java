
  package gen;
  public class U_Gen140 {
  		@com.google.inject.Inject
  		public U_Gen140(U_Gen141 u_gen141){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + u_gen141 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  