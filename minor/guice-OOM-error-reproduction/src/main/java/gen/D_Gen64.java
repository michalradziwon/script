
  package gen;
  public class D_Gen64 {
  		@com.google.inject.Inject
  		public D_Gen64(D_Gen65 d_gen65){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + d_gen65 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  