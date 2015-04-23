
  package gen;
  public class U_Gen173 {
  		@com.google.inject.Inject
  		public U_Gen173(U_Gen174 u_gen174){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + u_gen174 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  