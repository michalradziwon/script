
  package gen;
  public class D_Gen71 {
  		@com.google.inject.Inject
  		public D_Gen71(D_Gen72 d_gen72){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + d_gen72 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  