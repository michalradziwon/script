
  package gen;
  public class I_Gen162 {
  		@com.google.inject.Inject
  		public I_Gen162(I_Gen163 i_gen163){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + i_gen163 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  