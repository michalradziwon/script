
  package gen;
  public class U_Gen21 {
  		@com.google.inject.Inject
  		public U_Gen21(U_Gen22 u_gen22){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + u_gen22 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  