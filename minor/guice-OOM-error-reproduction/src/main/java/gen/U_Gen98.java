
  package gen;
  public class U_Gen98 {
  		@com.google.inject.Inject
  		public U_Gen98(U_Gen99 u_gen99){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + u_gen99 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  