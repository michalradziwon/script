
  package gen;
  public class I_Gen134 {
  		@com.google.inject.Inject
  		public I_Gen134(I_Gen135 i_gen135){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + i_gen135 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  