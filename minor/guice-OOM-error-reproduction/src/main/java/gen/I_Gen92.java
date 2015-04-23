
  package gen;
  public class I_Gen92 {
  		@com.google.inject.Inject
  		public I_Gen92(I_Gen93 i_gen93){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + i_gen93 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  