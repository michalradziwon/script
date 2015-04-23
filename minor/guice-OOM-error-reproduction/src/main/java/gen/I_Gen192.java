
  package gen;
  public class I_Gen192 {
  		@com.google.inject.Inject
  		public I_Gen192(I_Gen193 i_gen193){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + i_gen193 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  