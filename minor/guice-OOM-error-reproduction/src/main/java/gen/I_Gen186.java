
  package gen;
  public class I_Gen186 {
  		@com.google.inject.Inject
  		public I_Gen186(I_Gen187 i_gen187){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + i_gen187 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  