
  package gen;
  public class U_Gen43 {
  		@com.google.inject.Inject
  		public U_Gen43(U_Gen44 u_gen44){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + u_gen44 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  