
  package gen;
  public class U_Gen34 {
  		@com.google.inject.Inject
  		public U_Gen34(U_Gen35 u_gen35){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + u_gen35 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  