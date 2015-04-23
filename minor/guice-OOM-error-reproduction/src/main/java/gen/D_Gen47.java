
  package gen;
  public class D_Gen47 {
  		@com.google.inject.Inject
  		public D_Gen47(D_Gen48 d_gen48){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + d_gen48 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  