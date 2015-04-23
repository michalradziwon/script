
  package gen;
  public class I_Gen17 {
  		@com.google.inject.Inject
  		public I_Gen17(I_Gen18 i_gen18){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + i_gen18 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  