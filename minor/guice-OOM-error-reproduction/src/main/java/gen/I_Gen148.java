
  package gen;
  public class I_Gen148 {
  		@com.google.inject.Inject
  		public I_Gen148(I_Gen149 i_gen149){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + i_gen149 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  