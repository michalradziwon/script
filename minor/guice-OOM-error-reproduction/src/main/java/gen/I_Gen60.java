
  package gen;
  public class I_Gen60 {
  		@com.google.inject.Inject
  		public I_Gen60(I_Gen61 i_gen61){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + i_gen61 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  