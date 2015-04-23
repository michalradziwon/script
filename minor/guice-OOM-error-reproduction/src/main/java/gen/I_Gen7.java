
  package gen;
  public class I_Gen7 {
  		@com.google.inject.Inject
  		public I_Gen7(I_Gen8 i_gen8){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + i_gen8 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  