
  package gen;
  public class I_Gen123 {
  		@com.google.inject.Inject
  		public I_Gen123(I_Gen124 i_gen124){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + i_gen124 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  