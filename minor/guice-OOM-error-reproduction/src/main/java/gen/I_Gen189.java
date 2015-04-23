
  package gen;
  public class I_Gen189 {
  		@com.google.inject.Inject
  		public I_Gen189(I_Gen190 i_gen190){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + i_gen190 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  