
  package gen;
  public class I_Gen183 {
  		@com.google.inject.Inject
  		public I_Gen183(I_Gen184 i_gen184){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + i_gen184 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  