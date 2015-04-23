
  package gen;
  public class I_Gen84 {
  		@com.google.inject.Inject
  		public I_Gen84(I_Gen85 i_gen85){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + i_gen85 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  