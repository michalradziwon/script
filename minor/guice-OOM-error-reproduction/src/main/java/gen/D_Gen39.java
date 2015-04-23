
  package gen;
  public class D_Gen39 {
  		@com.google.inject.Inject
  		public D_Gen39(D_Gen40 d_gen40){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + d_gen40 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  