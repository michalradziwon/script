
  package gen;
  public class I_Gen118 {
  		@com.google.inject.Inject
  		public I_Gen118(I_Gen119 i_gen119){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + i_gen119 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  