
  package gen;
  public class U_Gen179 {
  		@com.google.inject.Inject
  		public U_Gen179(U_Gen180 u_gen180){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + u_gen180 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  