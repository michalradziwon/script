
  package gen;
  public class U_Gen174 {
  		@com.google.inject.Inject
  		public U_Gen174(U_Gen175 u_gen175){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + u_gen175 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  