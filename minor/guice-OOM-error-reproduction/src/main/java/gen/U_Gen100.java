
  package gen;
  public class U_Gen100 {
  		@com.google.inject.Inject
  		public U_Gen100(U_Gen101 u_gen101){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + u_gen101 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  