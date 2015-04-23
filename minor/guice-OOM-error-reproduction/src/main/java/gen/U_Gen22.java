
  package gen;
  public class U_Gen22 {
  		@com.google.inject.Inject
  		public U_Gen22(U_Gen23 u_gen23){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + u_gen23 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  