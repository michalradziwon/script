
  package gen;
  public class I_Gen146 {
  		@com.google.inject.Inject
  		public I_Gen146(I_Gen147 i_gen147){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + i_gen147 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  