
  package gen;
  public class U_Gen116 {
  		@com.google.inject.Inject
  		public U_Gen116(U_Gen117 u_gen117){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + u_gen117 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  