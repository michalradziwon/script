
  package gen;
  public class I_Gen184 {
  		@com.google.inject.Inject
  		public I_Gen184(I_Gen185 i_gen185){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + i_gen185 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  