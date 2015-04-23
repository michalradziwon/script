
  package gen;
  public class I_Gen79 {
  		@com.google.inject.Inject
  		public I_Gen79(I_Gen80 i_gen80){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + i_gen80 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  