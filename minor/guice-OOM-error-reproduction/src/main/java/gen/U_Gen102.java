
  package gen;
  public class U_Gen102 {
  		@com.google.inject.Inject
  		public U_Gen102(U_Gen103 u_gen103){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + u_gen103 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  