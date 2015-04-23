
  package gen;
  public class H_Gen172 {
  		@com.google.inject.Inject
  		public H_Gen172(H_Gen173 h_gen173){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + h_gen173 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  