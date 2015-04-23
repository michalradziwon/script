
  package gen;
  public class I_Gen115 {
  		@com.google.inject.Inject
  		public I_Gen115(I_Gen116 i_gen116){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + i_gen116 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  