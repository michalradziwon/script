
  package gen;
  public class U_Gen52 {
  		@com.google.inject.Inject
  		public U_Gen52(U_Gen53 u_gen53){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + u_gen53 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  