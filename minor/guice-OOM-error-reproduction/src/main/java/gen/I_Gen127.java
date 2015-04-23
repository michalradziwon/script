
  package gen;
  public class I_Gen127 {
  		@com.google.inject.Inject
  		public I_Gen127(I_Gen128 i_gen128){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + i_gen128 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  