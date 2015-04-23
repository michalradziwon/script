
  package gen;
  public class I_Gen171 {
  		@com.google.inject.Inject
  		public I_Gen171(I_Gen172 i_gen172){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + i_gen172 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  