
  package gen;
  public class I_Gen85 {
  		@com.google.inject.Inject
  		public I_Gen85(I_Gen86 i_gen86){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + i_gen86 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  