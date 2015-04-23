
  package gen;
  public class D_Gen185 {
  		@com.google.inject.Inject
  		public D_Gen185(D_Gen186 d_gen186){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + d_gen186 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  