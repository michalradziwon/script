
  package gen;
  public class I_Gen165 {
  		@com.google.inject.Inject
  		public I_Gen165(I_Gen166 i_gen166){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + i_gen166 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  