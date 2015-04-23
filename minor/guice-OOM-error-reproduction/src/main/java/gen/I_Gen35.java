
  package gen;
  public class I_Gen35 {
  		@com.google.inject.Inject
  		public I_Gen35(I_Gen36 i_gen36){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + i_gen36 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  