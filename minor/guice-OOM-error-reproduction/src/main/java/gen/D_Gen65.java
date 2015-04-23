
  package gen;
  public class D_Gen65 {
  		@com.google.inject.Inject
  		public D_Gen65(D_Gen66 d_gen66){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + d_gen66 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  