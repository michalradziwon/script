
  package gen;
  public class I_Gen48 {
  		@com.google.inject.Inject
  		public I_Gen48(I_Gen49 i_gen49){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + i_gen49 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  