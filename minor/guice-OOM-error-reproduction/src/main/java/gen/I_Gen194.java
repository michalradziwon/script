
  package gen;
  public class I_Gen194 {
  		@com.google.inject.Inject
  		public I_Gen194(I_Gen195 i_gen195){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + i_gen195 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  