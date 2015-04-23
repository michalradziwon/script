
  package gen;
  public class U_Gen91 {
  		@com.google.inject.Inject
  		public U_Gen91(U_Gen92 u_gen92){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + u_gen92 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  