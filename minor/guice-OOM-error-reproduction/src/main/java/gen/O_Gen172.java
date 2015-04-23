
  package gen;
  public class O_Gen172 {
  		@com.google.inject.Inject
  		public O_Gen172(O_Gen173 o_gen173){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + o_gen173 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  