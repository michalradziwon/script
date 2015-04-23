
  package gen;
  public class D_Gen172 {
  		@com.google.inject.Inject
  		public D_Gen172(D_Gen173 d_gen173){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + d_gen173 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  