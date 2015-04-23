
  package gen;
  public class U_Gen30 {
  		@com.google.inject.Inject
  		public U_Gen30(U_Gen31 u_gen31){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + u_gen31 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  