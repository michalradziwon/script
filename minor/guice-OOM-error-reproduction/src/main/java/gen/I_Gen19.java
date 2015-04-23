
  package gen;
  public class I_Gen19 {
  		@com.google.inject.Inject
  		public I_Gen19(I_Gen20 i_gen20){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + i_gen20 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  