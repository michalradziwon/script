
  package gen;
  public class I_Gen181 {
  		@com.google.inject.Inject
  		public I_Gen181(I_Gen182 i_gen182){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + i_gen182 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  