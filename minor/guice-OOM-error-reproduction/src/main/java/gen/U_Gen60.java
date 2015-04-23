
  package gen;
  public class U_Gen60 {
  		@com.google.inject.Inject
  		public U_Gen60(U_Gen61 u_gen61){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + u_gen61 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  