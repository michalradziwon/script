
  package gen;
  public class I_Gen95 {
  		@com.google.inject.Inject
  		public I_Gen95(I_Gen96 i_gen96){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + i_gen96 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  