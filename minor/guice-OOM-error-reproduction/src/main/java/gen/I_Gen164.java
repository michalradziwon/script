
  package gen;
  public class I_Gen164 {
  		@com.google.inject.Inject
  		public I_Gen164(I_Gen165 i_gen165){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + i_gen165 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  