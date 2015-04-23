
  package gen;
  public class I_Gen93 {
  		@com.google.inject.Inject
  		public I_Gen93(I_Gen94 i_gen94){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + i_gen94 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  