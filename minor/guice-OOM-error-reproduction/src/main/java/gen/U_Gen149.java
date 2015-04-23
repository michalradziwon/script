
  package gen;
  public class U_Gen149 {
  		@com.google.inject.Inject
  		public U_Gen149(U_Gen150 u_gen150){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + u_gen150 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  