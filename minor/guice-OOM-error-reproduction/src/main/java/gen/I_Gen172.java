
  package gen;
  public class I_Gen172 {
  		@com.google.inject.Inject
  		public I_Gen172(I_Gen173 i_gen173){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + i_gen173 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  