
  package gen;
  public class S_Gen172 {
  		@com.google.inject.Inject
  		public S_Gen172(S_Gen173 s_gen173){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + s_gen173 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  