
  package gen;
  public class U_Gen11 {
  		@com.google.inject.Inject
  		public U_Gen11(U_Gen12 u_gen12){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + u_gen12 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  