
  package gen;
  public class U_Gen166 {
  		@com.google.inject.Inject
  		public U_Gen166(U_Gen167 u_gen167){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + u_gen167 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  